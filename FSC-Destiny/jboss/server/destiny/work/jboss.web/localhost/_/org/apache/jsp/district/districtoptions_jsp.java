package org.apache.jsp.district;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.CallAASPRegistrationServlet;
import com.follett.fsc.destiny.client.district.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.DistrictTabHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.consortium.ContextManager;
import com.follett.fsc.common.LocaleHelper;

public final class districtoptions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    DistrictOptionsForm form = (DistrictOptionsForm)request.getAttribute(DistrictOptionsForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    String param ="";

      out.write("\r\n\r\n    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /district/districtoptions.jsp(27,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(DistrictOptionsForm.FORM_NAME);
      // /district/districtoptions.jsp(27,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty(GenericDistrictForm.KEY_SHOW_FOLLETT_SHELF_MESSAGE );
      // /district/districtoptions.jsp(27,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/district/fsmessagebox.jsp" + (("/district/fsmessagebox.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("districtoptionsform", request.getCharacterEncoding()), out, false);
          out.write("\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /district/districtoptions.jsp(33,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/district/servlet/handledistrictoptionsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/districtoptions.jsp(35,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(GenericDistrictForm.KEY_SHOW_AASP_MESSAGE );
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/districtoptions.jsp(36,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(DistrictOptionsForm.FORM_NAME);
          // /district/districtoptions.jsp(36,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty(GenericDistrictForm.KEY_SHOW_AASP_MESSAGE );
          // /district/districtoptions.jsp(36,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("true");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/aaspmessagebox.jsp" + (("/common/aaspmessagebox.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("formName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("districtoptionsform", request.getCharacterEncoding()), out, false);
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
          out.write("\r\n\r\n  ");
 // This table can't be less than 100% or the tabs will be misaligned 
          out.write('\r');
          out.write('\n');

    String msg = GenericForm.getSQLAndAppServerTimeOutOfSyncMsg();
    if (msg != null) {

          out.write("\r\n    <center><span class=\"ColRowBold\">");
          out.print( msg );
          out.write("</span></center><BR>\r\n");
  } 
          out.write("    \r\n<center><span class=\"ColRowBold\">");
          out.print( GenericForm.getLastBackupDisplayMsg(false) );
          out.write("</span></center><br>\r\n");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/common/msdewarning.jsp", out, true);
          out.write("\r\n  <table align=\"center\" width=\"95%\"><tr><td>\r\n");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /district/districtoptions.jsp(52,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(DistrictOptionsForm.TABLE_DISTRICT_OPTIONS);
          // /district/districtoptions.jsp(52,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(DistrictOptionsForm.TAB);
          // /district/districtoptions.jsp(52,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(DistrictTabHelper.getDisplayableTabs(store));
          // /district/districtoptions.jsp(52,0) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setAlign("center");
          // /district/districtoptions.jsp(52,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\"  >\r\n            &nbsp;<span class=\"SectionHeader\">Access Levels </span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(59,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage("/backoffice/servlet/presentviewaccesslevelsform.do?districtMode=true");
              // /district/districtoptions.jsp(59,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId(DistrictOptionsForm.ID_BUTTON_ACCESS_LEVELS );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /district/districtoptions.jsp(60,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(60,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt(DistrictOptionsForm.ALT_BUTTON_ACCESS_LEVELS );
                  // /district/districtoptions.jsp(60,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(66,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName( DistrictOptionsForm.FORM_NAME );
              // /district/districtoptions.jsp(66,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("accessLevelsMessage");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    \r\n    ");
 if(form.isCanRunFollettShelfAutoDiscover()) { 
              out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Connect to Follett Shelf</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(78,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPage("/backoffice/servlet/presentautodiscoverfollettshelfform.do?districtMode=true");
              // /district/districtoptions.jsp(78,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setId(DistrictOptionsForm.ID_BUTTON_AUTO_CONFIG_SHELF );
              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                  // /district/districtoptions.jsp(79,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(79,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt(DistrictOptionsForm.ALT_BUTTON_AUTO_CONFIG_SHELF );
                  // /district/districtoptions.jsp(79,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Connect sites to Follett Shelf based on the Follett eBooks which currently exist in your district.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n    ");
 if(form.isCanRunResourceManagerConversion()) { 
              out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Transition to Resource Manager</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(99,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setPage("/district/servlet/presentconverttoresourcemanagerform.do?districtMode=true");
              // /district/districtoptions.jsp(99,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setId(DistrictOptionsForm.ID_BUTTON_CONVERT_TO_RM );
              int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                  // /district/districtoptions.jsp(100,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(100,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt(DistrictOptionsForm.ALT_BUTTON_CONVERT_TO_RM );
                  // /district/districtoptions.jsp(100,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Perform a check to determine if the system is ready to transition from Destiny Textbook Manager to Destiny Resource Manager.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">District Calendar</span>\r\n        </td>\r\n        ");
 if(form.isCanRunDistrictCalendar()) { 
              out.write("\r\n            <td height=\"18\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(120,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f3.setPage("/backoffice/servlet/presentcalendarform.do?districtMode=true");
              // /district/districtoptions.jsp(120,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f3.setId(DistrictOptionsForm.ID_BUTTON_DISTRICT_CALENDAR );
              int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f3.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                  // /district/districtoptions.jsp(121,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f3.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(121,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f3.setAlt(DistrictOptionsForm.ALT_BUTTON_DISTRICT_CALENDAR );
                  // /district/districtoptions.jsp(121,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f3.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                  if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
              out.write("\r\n            </td>\r\n        ");
 } else {
              out.write("\r\n            <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n                &nbsp;\r\n            </td>\r\n        ");
 } 
              out.write("\r\n    </tr>\r\n    ");
 if(!form.isCanRunDistrictCalendar()) { 
              out.write("\r\n    <tr>\r\n        <td class=\"Instruction\">\r\n            The district calendar is disabled when there are no sites in the district.\r\n        </td>\r\n    </tr>\r\n    ");
 } 
              out.write("\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Calendar can be set up here for the entire district, but can be managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">District &quot;Stop&quot; Words </span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(150,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f4.setPage("/district/servlet/presentstopwordscatalogform.do?districtMode=true");
              // /district/districtoptions.jsp(150,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f4.setId(DistrictOptionsForm.ID_BUTTON_STOP_WORDS );
              int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
              if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f4.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                  // /district/districtoptions.jsp(151,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(151,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setAlt(DistrictOptionsForm.ALT_BUTTON_STOP_WORDS );
                  // /district/districtoptions.jsp(151,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                  if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Default &quot;stop&quot; words for searching by keywords are set here.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Site Configuration Settings </span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(168,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f5.setPage("/district/servlet/presentsiteconfigurationcatalogsettingsform.do?districtMode=true");
              // /district/districtoptions.jsp(168,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f5.setId(DistrictOptionsForm.ID_BUTTON_SITE_CONFIG );
              int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
              if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f5.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                  // /district/districtoptions.jsp(169,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(169,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setAlt(DistrictOptionsForm.ALT_BUTTON_SITE_CONFIG );
                  // /district/districtoptions.jsp(169,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                  if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Default Catalog and Circulation configuration options can be set and pushed from here, but are managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">One Search Database Information</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(186,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f6.setPage("/district/servlet/presentonesearchdistrictpushform.do");
              // /district/districtoptions.jsp(186,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f6.setId(DistrictOptionsForm.ID_BUTTON_ONE_SEARCH_SETUP );
              int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
              if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f6.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f6);
                  // /district/districtoptions.jsp(187,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f6.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(187,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f6.setAlt(DistrictOptionsForm.ALT_BUTTON_ONE_SEARCH_DATABASE_SETUP );
                  // /district/districtoptions.jsp(187,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f6.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
                  if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f6);
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>One Search database information can be setup here for the entire district, but can be managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Patron Types and Library Circulation Types</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(205,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f7.setPage("/backoffice/servlet/presentviewpatrontypeform.do?distMode=true&collectionType=0");
              // /district/districtoptions.jsp(205,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f7.setId(DistrictOptionsForm.ID_BUTTON_LIBRARY_POLICY_SETTINGS );
              int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
              if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f7.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f7);
                  // /district/districtoptions.jsp(206,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f7.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(206,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f7.setAlt(DistrictOptionsForm.ALT_BUTTON_LIBRARY_POLICY_SETTINGS );
                  // /district/districtoptions.jsp(206,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f7.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
                  if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f7);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Default Patron Types and Library Circulation Types can be set and pushed from here, but are managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n");
 if (!LocaleHelper.isInternationalProduct()) { 
              out.write("    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Textbook Policies</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(223,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f8.setPage("/backoffice/servlet/presentviewtextbookloanpoliciesform.do?distMode=true&collectionType=1");
              // /district/districtoptions.jsp(223,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f8.setId(DistrictOptionsForm.ID_BUTTON_TEXTBOOK_POLICY_SETTINGS );
              int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
              if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f8.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f8 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f8);
                  // /district/districtoptions.jsp(224,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f8.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(224,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f8.setAlt(DistrictOptionsForm.ALT_BUTTON_TEXTBOOK_POLICY_SETTINGS );
                  // /district/districtoptions.jsp(224,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f8.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f8 = _jspx_th_base_005fimage_005f8.doStartTag();
                  if (_jspx_th_base_005fimage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f8);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f8);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Default Loan Policies and Loan Periods can be set and pushed from here, but are managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Resource Policies</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(240,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f9.setPage("/backoffice/servlet/presentviewtextbookloanperiodsform.do?collectionType=4&distMode=true");
              // /district/districtoptions.jsp(240,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f9.setId(DistrictOptionsForm.ID_BUTTON_RESOURCE_POLICY_SETTINGS );
              int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
              if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f9.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f9 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f9);
                  // /district/districtoptions.jsp(241,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f9.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(241,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f9.setAlt(DistrictOptionsForm.ALT_BUTTON_RESOURCE_POLICY_SETTINGS );
                  // /district/districtoptions.jsp(241,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f9.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f9 = _jspx_th_base_005fimage_005f9.doStartTag();
                  if (_jspx_th_base_005fimage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f9);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f9);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Default Loan Periods can be set and pushed from here, but are managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n");
 } 
              out.write("    \r\n\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Limit Tasks </span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(259,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f10.setPage("/district/servlet/presentdistrictlimittaskform.do");
              // /district/districtoptions.jsp(259,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f10.setId(DistrictOptionsForm.ID_BUTTON_LIMIT_TASKS );
              int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
              if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f10.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f10 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f10);
                  // /district/districtoptions.jsp(260,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f10.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(260,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f10.setAlt(DistrictOptionsForm.ALT_BUTTON_LIMIT_TASKS );
                  // /district/districtoptions.jsp(260,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f10.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f10 = _jspx_th_base_005fimage_005f10.doStartTag();
                  if (_jspx_th_base_005fimage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f10);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f10);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(266,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setName( DistrictOptionsForm.FORM_NAME );
              // /district/districtoptions.jsp(266,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setProperty("limitTasksMessage");
              // /district/districtoptions.jsp(266,12) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setFilter(false);
              int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
              if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
              out.write("\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">LDAP Servers </span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(277,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f11.setPage("/district/servlet/presentldapsetupform.do");
              // /district/districtoptions.jsp(277,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f11.setId(DistrictOptionsForm.ID_BUTTON_LDAP_SERVERS );
              int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
              if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f11.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f11 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f11);
                  // /district/districtoptions.jsp(278,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f11.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(278,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f11.setAlt(DistrictOptionsForm.ALT_BUTTON_LDAP_SERVERS );
                  // /district/districtoptions.jsp(278,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f11.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f11 = _jspx_th_base_005fimage_005f11.doStartTag();
                  if (_jspx_th_base_005fimage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f11);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f11);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(284,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName( DistrictOptionsForm.FORM_NAME );
              // /district/districtoptions.jsp(284,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("LDAPMessage");
              // /district/districtoptions.jsp(284,20) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setFilter(false);
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write("</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">SMTP Settings</span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(294,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f12.setPage("/common/servlet/presenteditsmtpoptionsform.do");
              // /district/districtoptions.jsp(294,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f12.setId(DistrictOptionsForm.ID_BUTTON_SMTP_OPTIONS );
              int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
              if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f12.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f12 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f12);
                  // /district/districtoptions.jsp(295,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f12.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(295,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f12.setAlt(DistrictOptionsForm.ALT_BUTTON_SMTP_OPTIONS );
                  // /district/districtoptions.jsp(295,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f12.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f12 = _jspx_th_base_005fimage_005f12.doStartTag();
                  if (_jspx_th_base_005fimage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f12);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f12);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Manage the SMTP Settings.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    ");
 if(form.isSSOOnly()) { 
              out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Block Override Code</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(312,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f13.setPage("/common/servlet/presenteditblockoverridecodeform.do");
              // /district/districtoptions.jsp(312,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f13.setId(DistrictOptionsForm.ID_BUTTON_BLOCKOVERRIDECODE_OPTIONS );
              int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
              if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f13.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f13 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f13);
                  // /district/districtoptions.jsp(313,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f13.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(313,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f13.setAlt(DistrictOptionsForm.ALT_BUTTON_BLOCKOVERRIDECODE_OPTIONS );
                  // /district/districtoptions.jsp(313,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f13.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f13 = _jspx_th_base_005fimage_005f13.doStartTag();
                  if (_jspx_th_base_005fimage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f13);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f13.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f13);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>The default Circulation Block Override Code can be set here, but can be managed by the sites.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>    \r\n    ");
 } 
              out.write("\r\n    ");
 if(!ContextManager.getContextManager().isInConsortiumMode()) { 
              out.write("\r\n        <tr>\r\n            <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n                &nbsp;<span class=\"SectionHeader\">Destiny Discover Settings</span>\r\n            </td>\r\n            <td height=\"18\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f14.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(331,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f14.setPage("/common/servlet/presenteditaaspoptionsform.do");
              // /district/districtoptions.jsp(331,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f14.setId(DistrictOptionsForm.ID_BUTTON_AASP_OPTIONS );
              int _jspx_eval_base_005flink_005f14 = _jspx_th_base_005flink_005f14.doStartTag();
              if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f14.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f14 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f14);
                  // /district/districtoptions.jsp(332,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f14.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(332,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f14.setAlt(DistrictOptionsForm.ALT_BUTTON_AASP_OPTIONS );
                  // /district/districtoptions.jsp(332,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f14.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f14 = _jspx_th_base_005fimage_005f14.doStartTag();
                  if (_jspx_th_base_005fimage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f14);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f14);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\">\r\n                <ul><li>Manage Destiny Discover Settings.</li></ul>\r\n                <br>\r\n            </td>\r\n            <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    \r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Digital Content Access</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f15.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(350,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f15.setPage("/district/servlet/presentnetworkaccesssetupform.do");
              // /district/districtoptions.jsp(350,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f15.setId(DistrictOptionsForm.ID_BUTTON_NETWORK_ACCESS );
              int _jspx_eval_base_005flink_005f15 = _jspx_th_base_005flink_005f15.doStartTag();
              if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f15.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f15 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f15);
                  // /district/districtoptions.jsp(351,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f15.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(351,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f15.setAlt(DistrictOptionsForm.ALT_BUTTON_NETWORK_ACCESS );
                  // /district/districtoptions.jsp(351,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f15.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f15 = _jspx_th_base_005fimage_005f15.doStartTag();
                  if (_jspx_th_base_005fimage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f15);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f15.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f15);
              out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>As a default, all computers have access to digital content. Access to digital content can be granted and/or denied from here.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    <tr>\r\n\t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Password Policies</span>\r\n        </td>\r\n\t\t<td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f16.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(368,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f16.setPage("/common/servlet/presenteditpasswordpoliciesform.do");
              // /district/districtoptions.jsp(368,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f16.setId(DistrictOptionsForm.ID_BUTTON_PASSWORD_POLICIES );
              int _jspx_eval_base_005flink_005f16 = _jspx_th_base_005flink_005f16.doStartTag();
              if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f16.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f16 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f16);
                  // /district/districtoptions.jsp(369,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f16.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(369,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f16.setAlt(DistrictOptionsForm.ALT_BUTTON_PASSWORD_POLICIES );
                  // /district/districtoptions.jsp(369,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f16.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f16 = _jspx_th_base_005fimage_005f16.doStartTag();
                  if (_jspx_th_base_005fimage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f16);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f16);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f16);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Manage password policies.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    ");
              out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">OAuth Consumers</span>\r\n        </td>\r\n        <td height=\"18\">\r\n            ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f17.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(386,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f17.setPage("/district/servlet/presentoauthconsumerform.do");
              int _jspx_eval_base_005flink_005f17 = _jspx_th_base_005flink_005f17.doStartTag();
              if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f17.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f17 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f17);
                  // /district/districtoptions.jsp(387,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f17.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(387,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f17.setAlt(DistrictOptionsForm.ALT_BUTTON_OAUTH_CONSUMERS );
                  // /district/districtoptions.jsp(387,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f17.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f17 = _jspx_th_base_005fimage_005f17.doStartTag();
                  if (_jspx_th_base_005fimage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f17);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f17);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f17.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f17);
              out.write("\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Manage OAuth consumers.</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    ");
              out.write("\r\n    ");
              out.write("\r\n    \r\n    ");
              out.write("\r\n     ");
 if (!store.isConsortiumAdmin()) { 
      //connection but not US endpoint 
       if( form.isAaspConnected() && !form.isUSEndpointConfigured()) {
              out.write("\r\n        <tr>\r\n        <td colspan=\"2\" background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n             &nbsp;<span class=\"SectionHeader\">Server Identity</span>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Server Status: ");
              out.print(form.getAaspRegistrationStatus() );
              out.write(". &nbsp;&nbsp;&nbsp;Cannot determine server type due to invalid external URL/port.<br>\r\n                        Please verify your <a href=\"/common/servlet/presenteditaaspoptionsform.do\">Destiny Discover Settings</a></li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n     ");
 }
     
     else { 
         
              out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Server Identity</span>\r\n        </td>\r\n       \r\n        ");
 if( form.isAaspConnected()) {
                     // US is connected, launch registration servlet.
                      
              out.write("    \r\n                      <td height=\"18\">        \r\n                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f18.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(431,20) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f18.setTarget("_blank");
              // /district/districtoptions.jsp(431,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f18.setPage( CallAASPRegistrationServlet.buildReturnToUrl(request) );
              int _jspx_eval_base_005flink_005f18 = _jspx_th_base_005flink_005f18.doStartTag();
              if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f18.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f18 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f18);
                  // /district/districtoptions.jsp(432,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f18.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(432,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f18.setAlt(DistrictOptionsForm.ALT_BUTTON_SERVER_IDENTITY );
                  // /district/districtoptions.jsp(432,24) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f18.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f18 = _jspx_th_base_005fimage_005f18.doStartTag();
                  if (_jspx_th_base_005fimage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f18);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f18);
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f18.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage.reuse(_jspx_th_base_005flink_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage.reuse(_jspx_th_base_005flink_005f18);
              out.write("\r\n        </td>\r\n                 \r\n           ");
 } else { 
            //cant connect to AASP- 
           
                 
              out.write("\r\n                    <td height=\"18\">  \r\n               ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f19.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(441,15) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f19.setPage( "?" + DistrictOptionsForm.BUTTON_EDIT_SERVER_IDENTITY + "="+ DistrictOptionsForm.PARAM_SHOW_AASP_NOT_REACHABLE );
              // /district/districtoptions.jsp(441,15) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f19.setId(DistrictOptionsForm.BUTTON_EDIT_SERVER_IDENTITY );
              int _jspx_eval_base_005flink_005f19 = _jspx_th_base_005flink_005f19.doStartTag();
              if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f19.doInitBody();
                }
                do {
                  out.write("\r\n                ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f19 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f19.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f19);
                  // /district/districtoptions.jsp(442,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f19.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(442,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f19.setAlt(DistrictOptionsForm.ALT_BUTTON_SERVER_IDENTITY );
                  // /district/districtoptions.jsp(442,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f19.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f19 = _jspx_th_base_005fimage_005f19.doStartTag();
                  if (_jspx_th_base_005fimage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f19);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f19);
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f19.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f19);
              out.write("\r\n            \r\n            \r\n        </td>\r\n            ");
 } 
              out.write("\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul><li>Server Status: ");
              out.print(form.getAaspRegistrationStatus() );
              out.write(".</li></ul>\r\n            <br>\r\n        </td>\r\n        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n    </tr>\r\n    </tr>\r\n    \r\n         ");
 } 
              out.write("\r\n      ");
 } 
              out.write("\r\n     \r\n     \r\n\r\n    ");
 if(store.isServerAdminLoggedIn() && ((UserContext.isInConsortium() && ContextManager.getContextManager().isInConsortiumMode()) || (!ContextManager.getContextManager().isInConsortiumMode()))) { 
              out.write("\r\n        <tr>\r\n    \t\t<td background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n                &nbsp;<span class=\"SectionHeader\">Auto Update Settings</span>\r\n            </td>\r\n    \t\t<td height=\"18\">\r\n                ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f20.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(468,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f20.setPage("/common/servlet/presentscheduleautoupdateform.do");
              // /district/districtoptions.jsp(468,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f20.setId(DistrictOptionsForm.ID_BUTTON_AUTO_UPDATE_OPTIONS );
              int _jspx_eval_base_005flink_005f20 = _jspx_th_base_005flink_005f20.doStartTag();
              if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f20.doInitBody();
                }
                do {
                  out.write("\r\n                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f20 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f20);
                  // /district/districtoptions.jsp(469,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f20.setSrc("/buttons/large/edit.gif");
                  // /district/districtoptions.jsp(469,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f20.setAlt(DistrictOptionsForm.ALT_BUTTON_AUTO_UPDATE_OPTIONS );
                  // /district/districtoptions.jsp(469,20) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f20.setAlign("absbottom");
                  int _jspx_eval_base_005fimage_005f20 = _jspx_th_base_005fimage_005f20.doStartTag();
                  if (_jspx_th_base_005fimage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f20);
                  out.write("\r\n                ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f20.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f20);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\">\r\n                <ul><li>Manage the Auto Update Settings.</li></ul>\r\n                <br>\r\n            </td>\r\n            <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    <tr>\r\n\t\t<td colspan=\"2\" background=\"/images/icons/general/thickline.gif\" height=\"18\" width=\"100%\" style=\"background-repeat:repeat-x;\" >\r\n            &nbsp;<span class=\"SectionHeader\">Downloads</span>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td class=\"ColRow\">\r\n            <ul>\r\n                <li>Commandline Utilities -- includes version of AssetImportConverter.exe,\r\n                    UpdatePatrons.exe, UpdateClasses.exe, PatronImportConverter.exe,\r\n                    ClassImportConverter.exe, ImportAssets.exe, ExportAssets.exe,\r\n                    ImportFines.exe, ExportFines.exe, and TextbookTransfer.exe commandline utilities.\r\n                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f21.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /district/districtoptions.jsp(493,20) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f21.setHref("/CommandLineToolsDownloader");
              // /district/districtoptions.jsp(493,20) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f21.setTarget("_blank");
              int _jspx_eval_base_005flink_005f21 = _jspx_th_base_005flink_005f21.doStartTag();
              if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f21.doInitBody();
                }
                do {
                  out.write("\r\n                        ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f21 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f21.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f21);
                  // /district/districtoptions.jsp(494,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f21.setName(DistrictOptionsForm.ID_BUTTON_DOWNLOAD);
                  // /district/districtoptions.jsp(494,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f21.setSrc("/buttons/small/download.gif");
                  // /district/districtoptions.jsp(494,24) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f21.setAlign("bottom");
                  // /district/districtoptions.jsp(494,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f21.setAlt(DistrictOptionsForm.ALT_BUTTON_DOWNLOAD );
                  int _jspx_eval_base_005fimage_005f21 = _jspx_th_base_005fimage_005f21.doStartTag();
                  if (_jspx_th_base_005fimage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f21);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f21);
                  out.write("\r\n                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f21.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref.reuse(_jspx_th_base_005flink_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fhref.reuse(_jspx_th_base_005flink_005f21);
              out.write("\r\n                </li>\r\n            </ul>\r\n            <br>\r\n        </td>\r\n\t\t<td>&nbsp;</td>\r\n    </tr>\r\n\r\n\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005fwidth_005ftabs_005fselectedTab_005fid_005falign.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("\r\n</td></tr></table>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n\r\n");
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
    // /district/districtoptions.jsp(19,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /district/districtoptions.jsp(34,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("canRunDistrictCalendar");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }
}
