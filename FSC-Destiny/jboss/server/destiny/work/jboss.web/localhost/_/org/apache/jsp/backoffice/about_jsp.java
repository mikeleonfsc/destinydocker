package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.client.common.HTTPHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.util.DestinySystemProperties;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/destiny-base.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n                \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/about.jsp(22,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/about.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName("backoffice_servlet_AboutForm");
      // /backoffice/about.jsp(22,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("AboutForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      AboutForm form = null;
      form = (AboutForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String restartJobManager = request.getParameter(AboutForm.CONFIRM_RESTART_PROPERTY);
    if ( AboutForm.CONFIRM_RESTART_JOB_MANAGER_DOCONFIRM.equals(restartJobManager)) {

      out.write("\r\n    ");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/about.jsp(29,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/presentaboutform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n        ");

            String[] messageText = new String[]{"When restarted the Job Manager will start the first pending job in the queue.",
                 "Are you sure you want to restart the Job Manager?"};
        
          out.write("\r\n         ");
          //  base:confirmBox
          com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
          _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/about.jsp(35,9) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
          // /backoffice/about.jsp(35,9) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setFilterMessage(false);
          // /backoffice/about.jsp(35,9) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setHeader("Restarting the Job Manager will stop all running jobs. You should only do this if the Job Manager is not responding.");
          // /backoffice/about.jsp(35,9) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setMessageText(messageText);
          // /backoffice/about.jsp(35,9) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setYesName(AboutForm.PARAM_RESTART_JOB_MANAGER);
          // /backoffice/about.jsp(35,9) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setNoName(AboutForm.PARAM_RESTART_JOB_MANAGER);
          int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
          if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
          out.write("\r\n     ");
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
      out.write('\r');
      out.write('\n');

    }

      out.write("\r\n\r\n    ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /backoffice/about.jsp(46,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(46,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("helpText");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /backoffice/about.jsp(47,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(47,8) name = filter type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setFilter(false);
          // /backoffice/about.jsp(47,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setProperty("helpText");
          int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
          if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
          out.write("\r\n    ");
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
      out.write("\r\n    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /backoffice/about.jsp(49,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(49,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("showDetail");
      // /backoffice/about.jsp(49,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <table width=\"100%\">\r\n        <tr>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/about.jsp(53,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(53,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("libraryProductSupported");
          // /backoffice/about.jsp(53,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("true");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <a href=\"#LibraryStatistics\">District Library Statistics</a><br>\r\n                ");
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
          out.write("\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/about.jsp(56,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(56,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty("textbookProductSupported");
          // /backoffice/about.jsp(56,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue("true");
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <a href=\"#TextbookStatistics\">District Textbook Statistics</a><br>\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
          out.write("\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/about.jsp(59,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(59,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setProperty("assetProductSupported");
          // /backoffice/about.jsp(59,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setValue("true");
          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <a href=\"#AssetStatistics\">District Resource Statistics</a><br>\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
          out.write("\r\n                ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/about.jsp(62,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(62,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setProperty("mediaProductSupported");
          // /backoffice/about.jsp(62,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f4.setValue("true");
          int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
          if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <a href=\"#MediaStatistics\">District Media Statistics</a><br>\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
          out.write("\r\n                <a href=\"#DestinyproductInformation\">Destiny Product Information</a><br>\r\n                ");
 if (!store.isConsortiumAdminLoggedIn()){ 
          out.write("\r\n                    <a href=\"#DigitalResourceStatistics\">District Digital Resource Information</a><br>\r\n                ");
 } 
          out.write("\r\n                ");
 if (!UserContext.isInConsortium()){ 
          out.write("\r\n                    <a href=\"#aaspInfo\">AASP Information</a><br>\r\n                ");
 } 
          out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\" valign=\"top\">\r\n                <a href=\"javascript:window.close();\" class=\"detailLink\">");
          if (_jspx_meth_base_005fimage_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("</a>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <br>\r\n    ");
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
      out.write("\r\n    ");
 if (form.isShowDistrictCountsAndAdminInfo()) { 
      out.write("\r\n        <table id=\"");
      out.print(AboutForm.TABLE_DESTINY_ADMIN_CONTACT_INFO);
      out.write("\" width=\"100%\">\r\n            <tr><td align=\"center\" class=\"ColRow\"><b>Destiny Administrator:</b> ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f1.setParent(null);
      // /backoffice/about.jsp(82,80) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(82,80) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f1.setProperty("contactName");
      int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
      if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      out.write("</td></tr>\r\n            <tr><td align=\"center\" class=\"ColRow\"><b>Phone:</b> ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f2.setParent(null);
      // /backoffice/about.jsp(83,64) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(83,64) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f2.setProperty("contactPhone");
      int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
      if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      out.write("</td></tr>\r\n            <tr><td align=\"center\" class=\"ColRow\"><b>Email:</b> ");
      //  bean:write
      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
      _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fwrite_005f3.setParent(null);
      // /backoffice/about.jsp(84,64) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f3.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(84,64) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fwrite_005f3.setProperty("contactEmail");
      int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
      if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      out.write("</td></tr>\r\n        </table>\r\n        <br>\r\n        <br>\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f5.setParent(null);
      // /backoffice/about.jsp(88,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(88,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setProperty("anythingSupported");
      // /backoffice/about.jsp(88,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setValue("true");
      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <table id=\"");
          out.print(AboutForm.TABLE_DISTRICT_COUNTS);
          out.write("\" width=\"60%\" align=\"center\" border=\"0\">\r\n            <tr>\r\n                <td align=\"center\" colspan=\"3\" class=\"ColRowBold\" >District Statistics</td>\r\n            </tr>\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                <td class=\"ColRow tdAlignRight\"><b>Titles/Description</b></td>\r\n                <td class=\"ColRow tdAlignRight\"><b>Copies/Items</b></td>\r\n            </tr>            \r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /backoffice/about.jsp(98,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(98,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setProperty("libraryProductSupported");
          // /backoffice/about.jsp(98,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f6.setValue("true");
          int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
          if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow tdAlignRight\"><b>Library Manager</b></td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
              // /backoffice/about.jsp(101,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f0.setNumber(form.getLibraryBibCount());
              int _jspx_eval_base_005flocaleNumberTag_005f0 = _jspx_th_base_005flocaleNumberTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f0);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
              // /backoffice/about.jsp(102,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f1.setNumber(form.getLibraryCopyCount());
              int _jspx_eval_base_005flocaleNumberTag_005f1 = _jspx_th_base_005flocaleNumberTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f1);
              out.write("</td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
          out.write("\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /backoffice/about.jsp(105,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(105,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setProperty("textbookProductSupported");
          // /backoffice/about.jsp(105,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setValue("true");
          int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
          if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow tdAlignRight\"><b>Textbook Manager</b></td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
              // /backoffice/about.jsp(108,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f2.setNumber(form.getTextbookBibCount());
              int _jspx_eval_base_005flocaleNumberTag_005f2 = _jspx_th_base_005flocaleNumberTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f2);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
              // /backoffice/about.jsp(109,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f3.setNumber(form.getTextbookCopyCount());
              int _jspx_eval_base_005flocaleNumberTag_005f3 = _jspx_th_base_005flocaleNumberTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f3);
              out.write("</td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
          out.write("\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /backoffice/about.jsp(112,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f8.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(112,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f8.setProperty("assetProductSupported");
          // /backoffice/about.jsp(112,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f8.setValue("true");
          int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
          if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow tdAlignRight\"><b>Resource Manager</b></td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
              // /backoffice/about.jsp(115,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f4.setNumber(form.getAssetBibCount());
              int _jspx_eval_base_005flocaleNumberTag_005f4 = _jspx_th_base_005flocaleNumberTag_005f4.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f4);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
              // /backoffice/about.jsp(116,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f5.setNumber(form.getAssetCopyCount());
              int _jspx_eval_base_005flocaleNumberTag_005f5 = _jspx_th_base_005flocaleNumberTag_005f5.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f5);
              out.write("</td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
          out.write("\r\n            ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
          // /backoffice/about.jsp(119,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f9.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(119,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f9.setProperty("mediaProductSupported");
          // /backoffice/about.jsp(119,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f9.setValue("true");
          int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
          if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow tdAlignRight\"><b>Media Manager</b></td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
              // /backoffice/about.jsp(122,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f6.setNumber(form.getMediaBibCount());
              int _jspx_eval_base_005flocaleNumberTag_005f6 = _jspx_th_base_005flocaleNumberTag_005f6.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f6);
              out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\">");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f7.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
              // /backoffice/about.jsp(123,52) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f7.setNumber(form.getMediaCopyCount());
              int _jspx_eval_base_005flocaleNumberTag_005f7 = _jspx_th_base_005flocaleNumberTag_005f7.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f7);
              out.write("</td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
          out.write("\r\n        </table>\r\n        <br><br>\r\n        ");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      out.write("\r\n    ");
 } 
      out.write("\r\n    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f10.setParent(null);
      // /backoffice/about.jsp(130,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f10.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(130,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f10.setProperty("showDetail");
      // /backoffice/about.jsp(130,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f10.setValue("false");
      int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
      if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <table width=\"100%\">\r\n");
 if (HTTPHelper.isInternalToFSC() && store.getSiteID() != null && store.getSiteID().longValue() != 0 && !store.isDistrictUser() && !store.isUserLoggedIn()) { 
          out.write("\r\n    <tr>\r\n        <td align=\"center\" class=\"ColRowBold\">\r\n            <a href=\"/backoffice/servlet/presentcogniteapitestingform.do\">Cognite API Testing Form</a>\r\n        </td>\r\n    </tr>\r\n");
 } 
          out.write('\r');
          out.write('\n');
 if (HTTPHelper.isInternalToFSC() && !store.isDistrictUser() && !store.isUserLoggedIn()) { 
          out.write("\r\n    <tr>\r\n        <td align=\"center\" class=\"ColRowBold\">\r\n            <a href=\"/backoffice/servlet/presentgeneralpurposetestingform.do\">General Purpose Testing Form</a>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td align=\"center\" class=\"ColRowBold\">\r\n            <a href=\"/backoffice/servlet/destinyauthapi\">Destiny Auth API Testing Form</a>\r\n        </td>\r\n    </tr>\r\n");
 } 
          out.write("\r\n            <tr>\r\n            <td align=\"center\" class=\"ColRowBold\">\r\n            ");
          if (_jspx_meth_base_005flink_005f0(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
            return;
          out.write("\r\n            </td>\r\n            </tr>\r\n            <tr>\r\n            ");

                if (form.isCanRunServerConnectivity()) {
            
          out.write("\r\n                <td align=\"center\" class=\"ColRowBold\">\r\n                ");
          if (_jspx_meth_base_005flink_005f1(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                </tr>\r\n            ");

                }
            
          out.write("\r\n            ");

                if (store.isDestinyAdminLoggedIn()) {
            
          out.write("\r\n                <tr>\r\n                <td align=\"center\" class=\"ColRowBold\">\r\n                ");
          if (_jspx_meth_base_005fshowHideTag_005f0(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
            return;
          out.write("\r\n                </td>\r\n                </tr>\r\n            ");

                }
            
          out.write("\r\n        </table>\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
      out.write("\r\n\r\n    ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f11.setParent(null);
      // /backoffice/about.jsp(189,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f11.setName(AboutForm.FORM_NAME);
      // /backoffice/about.jsp(189,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f11.setProperty("showDetail");
      // /backoffice/about.jsp(189,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f11.setValue("true");
      int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
      if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n        ");

            if (form.isLibraryProductSupported()) {
        
          out.write("\r\n        <a name=\"LibraryStatistics\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_LIBRARY_INFO);
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr><td class=\"MainHeader\" colspan=\"15\" align=\"center\">District Library Statistics</td></tr>\r\n           <tr>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site Name\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Titles\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Copies\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Collection Value\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Patrons\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Current Checkouts\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n");
          out.write("                    Current Overdues\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Fines*\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Fines Due*\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Holds\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Ready Holds\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Checkouts\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total In Library\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Renewals\r\n                </td>\r\n            </tr>\r\n\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(245,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setId("stat");
          // /backoffice/about.jsp(245,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(245,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setProperty("libraryStatsList");
          // /backoffice/about.jsp(245,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f0.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print(stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print(stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(254,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f8.setNumber((Long)stat.get("BIBCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f8 = _jspx_th_base_005flocaleNumberTag_005f8.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f8);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(257,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f9.setNumber((Long)stat.get("COPYCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f9 = _jspx_th_base_005flocaleNumberTag_005f9.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f9);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(260,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setPrice((Long)stat.get("COLLECTIONVALUE"));
              // /backoffice/about.jsp(260,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f0.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f0 = _jspx_th_base_005flocaleCurrencyTag_005f0.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f0);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f10.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(263,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f10.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f10 = _jspx_th_base_005flocaleNumberTag_005f10.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f10);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f11.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(266,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f11.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f11 = _jspx_th_base_005flocaleNumberTag_005f11.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f11);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f12.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(269,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f12.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f12 = _jspx_th_base_005flocaleNumberTag_005f12.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f12);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f13.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(272,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f13.setNumber((Long)stat.get("CURRENTFINECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f13 = _jspx_th_base_005flocaleNumberTag_005f13.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f13);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(275,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f1.setPrice((Long)stat.get("TOTALFINESDUE"));
              // /backoffice/about.jsp(275,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f1.setCurrencyCode(lh.getFineCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f1 = _jspx_th_base_005flocaleCurrencyTag_005f1.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f1);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f14.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(278,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f14.setNumber((Long)stat.get("CURRENTHOLDS"));
              int _jspx_eval_base_005flocaleNumberTag_005f14 = _jspx_th_base_005flocaleNumberTag_005f14.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f14);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f15.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(281,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f15.setNumber((Long)stat.get("READYHOLDS"));
              int _jspx_eval_base_005flocaleNumberTag_005f15 = _jspx_th_base_005flocaleNumberTag_005f15.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f15);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f16.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(284,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f16.setNumber((Long)stat.get("OVERALLCHECKOUTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f16 = _jspx_th_base_005flocaleNumberTag_005f16.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f16);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f17.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(287,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f17.setNumber((Long)stat.get("OVERALLINLIBRARY"));
              int _jspx_eval_base_005flocaleNumberTag_005f17 = _jspx_th_base_005flocaleNumberTag_005f17.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f17);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f18.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              // /backoffice/about.jsp(290,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f18.setNumber((Long)stat.get("OVERALLRENEWALS"));
              int _jspx_eval_base_005flocaleNumberTag_005f18 = _jspx_th_base_005flocaleNumberTag_005f18.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f18);
              out.write("\r\n                    </td>\r\n\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\r\n        </table>\r\n        <p align=\"center\" class=\"BreadcrumbBold\">* Excludes patron specific fines.</p>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");

            }
        
          out.write("\r\n\r\n        ");

            if (form.isTextbookProductSupported()) {
        
          out.write("\r\n        <a name=\"TextbookStatistics\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_TEXTBOOK_INFO);
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr><td class=\"MainHeader\" colspan=\"10\" align=\"center\">District Textbook Statistics</td></tr>\r\n           <tr>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site Name\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Textbooks\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Copies\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Collection Value\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Patrons\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Current Checkouts\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n");
          out.write("                    Current Overdues\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Fines*\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Fines Due*\r\n                </td>\r\n            </tr>\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(341,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setId("stat");
          // /backoffice/about.jsp(341,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(341,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setProperty("textbookStatsList");
          // /backoffice/about.jsp(341,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f1.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f1.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print(stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print(stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f19.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(350,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f19.setNumber((Long)stat.get("BIBCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f19 = _jspx_th_base_005flocaleNumberTag_005f19.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f19);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f20.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(353,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f20.setNumber((Long)stat.get("COPYCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f20 = _jspx_th_base_005flocaleNumberTag_005f20.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f20);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(356,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setPrice((Long)stat.get("COLLECTIONVALUE"));
              // /backoffice/about.jsp(356,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f2.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f2 = _jspx_th_base_005flocaleCurrencyTag_005f2.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f2);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f21.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(359,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f21.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f21 = _jspx_th_base_005flocaleNumberTag_005f21.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f21);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f22 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f22.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(362,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f22.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f22 = _jspx_th_base_005flocaleNumberTag_005f22.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f22);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f23 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f23.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(365,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f23.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f23 = _jspx_th_base_005flocaleNumberTag_005f23.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f23);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f24 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f24.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(368,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f24.setNumber((Long)stat.get("CURRENTFINECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f24 = _jspx_th_base_005flocaleNumberTag_005f24.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f24);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f24);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
              // /backoffice/about.jsp(371,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setPrice((Long)stat.get("TOTALFINESDUE"));
              // /backoffice/about.jsp(371,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f3.setCurrencyCode(lh.getFineCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f3 = _jspx_th_base_005flocaleCurrencyTag_005f3.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f3);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
          out.write("\r\n        </table>\r\n        <p align=\"center\" class=\"BreadcrumbBold\">* Excludes patron specific fines.</p>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");

            }
        
          out.write("\r\n\r\n\r\n        ");

            if (form.isAssetProductSupported()) {
        
          out.write("\r\n        <a name=\"AssetStatistics\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_ASSET_INFO);
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr ><td class=\"MainHeader\" colspan=\"11\" align=\"center\">District Resource Statistics</td></tr>\r\n           <tr>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site Name\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Resources*\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Items*\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Software Titles\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total License Count\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Assigned\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n");
          out.write("                    Total Purchase Price\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Patrons\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Current Checkouts\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Current Overdues\r\n                </td>\r\n            </tr>\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(425,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f2.setId("stat");
          // /backoffice/about.jsp(425,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f2.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(425,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f2.setProperty("assetStatsList");
          // /backoffice/about.jsp(425,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f2.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f2.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print(stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print(stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f25 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f25.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(434,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f25.setNumber((Long)stat.get("ASSETCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f25 = _jspx_th_base_005flocaleNumberTag_005f25.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f25);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f25);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f26 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f26.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(437,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f26.setNumber((Long)stat.get("ITEMCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f26 = _jspx_th_base_005flocaleNumberTag_005f26.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f26);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f26);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f27 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f27.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(440,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f27.setNumber((Long)stat.get("TOTALSOFTWARETITLES"));
              int _jspx_eval_base_005flocaleNumberTag_005f27 = _jspx_th_base_005flocaleNumberTag_005f27.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f27);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f27);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print(stat.get("TOTALLICENSECOUNT"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f28 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f28.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(446,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f28.setNumber((Long)stat.get("TOTALLICENSESASSIGNED"));
              int _jspx_eval_base_005flocaleNumberTag_005f28 = _jspx_th_base_005flocaleNumberTag_005f28.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f28);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f28);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(449,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f4.setPrice((Long)stat.get("TOTALPURCHASEPRICE"));
              // /backoffice/about.jsp(449,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f4.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f4 = _jspx_th_base_005flocaleCurrencyTag_005f4.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f4);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f29 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f29.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(452,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f29.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f29 = _jspx_th_base_005flocaleNumberTag_005f29.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f29);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f29);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f30 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f30.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(455,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f30.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f30 = _jspx_th_base_005flocaleNumberTag_005f30.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f30);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f30);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f31 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f31.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
              // /backoffice/about.jsp(458,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f31.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f31 = _jspx_th_base_005flocaleNumberTag_005f31.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f31);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f31);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
          out.write("\r\n        </table>\r\n        <p align=\"center\" class=\"BreadcrumbBold\">* Includes Software.</p>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");
 } 
          out.write("\r\n\r\n\r\n        ");
 if (form.isMediaProductSupported()) {
          out.write("\r\n        <a name=\"MediaStatistics\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_MEDIA_INFO );
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr><td class=\"MainHeader\" colspan=\"15\" align=\"center\">District Media Statistics</td></tr>\r\n           <tr>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site Name\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Titles\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Copies\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Collection Value\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Patrons\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Current Checkouts\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n");
          out.write("                    Current Overdues\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Bookings\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Total Checkouts\r\n                </td>\r\n            </tr>\r\n\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(506,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f3.setId("stat");
          // /backoffice/about.jsp(506,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f3.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(506,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f3.setProperty("mediaStatsList");
          // /backoffice/about.jsp(506,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f3.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f3.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print( stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f32 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f32.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(515,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f32.setNumber((Long)stat.get("BIBCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f32 = _jspx_th_base_005flocaleNumberTag_005f32.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f32);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f32);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f33 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f33.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(518,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f33.setNumber((Long)stat.get("COPYCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f33 = _jspx_th_base_005flocaleNumberTag_005f33.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f33);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f33);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        &nbsp;");
              //  base:localeCurrencyTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag _jspx_th_base_005flocaleCurrencyTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag) _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleCurrencyTag.class);
              _jspx_th_base_005flocaleCurrencyTag_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleCurrencyTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(521,30) name = price type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f5.setPrice((Long)stat.get("COLLECTIONVALUE"));
              // /backoffice/about.jsp(521,30) name = currencyCode type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleCurrencyTag_005f5.setCurrencyCode(lh.getRegionFormatCurrencyCharacterCode());
              int _jspx_eval_base_005flocaleCurrencyTag_005f5 = _jspx_th_base_005flocaleCurrencyTag_005f5.doStartTag();
              if (_jspx_th_base_005flocaleCurrencyTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleCurrencyTag_005fprice_005fcurrencyCode_005fnobody.reuse(_jspx_th_base_005flocaleCurrencyTag_005f5);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f34 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f34.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(524,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f34.setNumber((Long)stat.get("PATRONCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f34 = _jspx_th_base_005flocaleNumberTag_005f34.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f34);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f34);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f35 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f35.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(527,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f35.setNumber((Long)stat.get("CURRENTCHECKOUTCOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f35 = _jspx_th_base_005flocaleNumberTag_005f35.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f35);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f35);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f36 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f36.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(530,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f36.setNumber((Long)stat.get("CURRENTOVERDUECOUNTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f36 = _jspx_th_base_005flocaleNumberTag_005f36.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f36);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f36);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f37 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f37.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(533,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f37.setNumber((Long)stat.get("PENDINGBOOKINGS"));
              int _jspx_eval_base_005flocaleNumberTag_005f37 = _jspx_th_base_005flocaleNumberTag_005f37.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f37);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f37);
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              //  base:localeNumberTag
              com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag _jspx_th_base_005flocaleNumberTag_005f38 = (com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag) _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleNumberTag.class);
              _jspx_th_base_005flocaleNumberTag_005f38.setPageContext(_jspx_page_context);
              _jspx_th_base_005flocaleNumberTag_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
              // /backoffice/about.jsp(536,24) name = number type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flocaleNumberTag_005f38.setNumber((Long)stat.get("OVERALLCHECKOUTS"));
              int _jspx_eval_base_005flocaleNumberTag_005f38 = _jspx_th_base_005flocaleNumberTag_005f38.doStartTag();
              if (_jspx_th_base_005flocaleNumberTag_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f38);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flocaleNumberTag_005fnumber_005fnobody.reuse(_jspx_th_base_005flocaleNumberTag_005f38);
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
          out.write("\r\n        </table>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");
 } 
          out.write("\r\n\r\n\r\n\r\n\r\n        <a name=\"DestinyProductInformation\"></a>\r\n        <table id=\"");
          out.print( AboutForm.TABLE_INFO );
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n          <tr>\r\n              <td class=\"MainHeader\" colspan=\"2\" align=\"center\">\r\n                Destiny Product Information\r\n              </td>\r\n          </tr>\r\n\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Destiny Version\r\n            </td>\r\n            <td>\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(561,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(561,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f4.setProperty("destinyVersion");
          int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
          if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
          out.write("\r\n                <span class=\"BreadcrumbBold\">&nbsp;&nbsp;Version Format: Release.Phase.Iteration (no longer Iteration within Phase)&nbsp;&nbsp;\r\n                </span>\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Platform Version\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(571,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f5.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(571,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f5.setProperty("platformVersion");
          int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
          if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Destiny Build Date\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(579,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f6.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(579,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f6.setProperty("destinyBuildDate");
          int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
          if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
          out.write("\r\n            </td>\r\n          </tr>\r\n           <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Application Server\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(587,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f7.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(587,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f7.setProperty("applicationServerInfo");
          int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
          if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
          out.write("\r\n            </td>\r\n          </tr>\r\n           <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Application Server Specs\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(595,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f8.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(595,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f8.setProperty("applicationServerSpecs");
          int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
          if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
          out.write("\r\n            </td>\r\n          </tr>\r\n           <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            JVM Version\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(603,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f9.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(603,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f9.setProperty("jvmVersion");
          int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
          if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            JSP/Servlet Server\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(611,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f10.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(611,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f10.setProperty("servletServerInfo");
          int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
          if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            MSSQLDS Pool\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(619,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f11.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(619,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f11.setProperty("poolInformationMSSQLDS");
          int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
          if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
          out.write("\r\n            </td>\r\n          </tr>\r\n        ");
          out.write("\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Database Version\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(637,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f12.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(637,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f12.setProperty("databaseProductVersion");
          int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
          if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
          out.write("\r\n\r\n                ");
          out.write("\r\n                ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(641,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(641,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setProperty("databaseProductVersionMessage");
          int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n                    <font color=\"#cc0000\"><b>&nbsp;\r\n                    ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              // /backoffice/about.jsp(643,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f13.setName(AboutForm.FORM_NAME);
              // /backoffice/about.jsp(643,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f13.setProperty("databaseProductVersionMessage");
              int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
              if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
              out.write("\r\n                    </b></font>\r\n                ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Database Size\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(653,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f14.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(653,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f14.setProperty("databaseSize");
          int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
          if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
          out.write("\r\n                ");

                String msdeWarning = GenericForm.getMSDEWarning();
                if(msdeWarning.length() > 0) {
                
          out.write("\r\n                    &nbsp;<span class=\"ColRowBold\"><font color=\"#cc0000\">");
          out.print(msdeWarning);
          out.write("</font></span>\r\n                ");

                }
                
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            JDBC Driver\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(669,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f15.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(669,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f15.setProperty("databaseDriverName");
          int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
          if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            JDBC Driver Version\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(677,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f16.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(677,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f16.setProperty("databaseDriverVersion");
          int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
          if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Database URL\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(685,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f17.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(685,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f17.setProperty("databaseURL");
          int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
          if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            SQL Server compatibility level\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(693,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f18.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(693,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f18.setProperty("compatibilityLevel");
          int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
          if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            SQL Server min memory\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(701,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f19.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(701,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f19.setProperty("sqlMinMemory");
          int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
          if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            SQL Server max memory\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(709,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f20.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(709,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f20.setProperty("sqlMaxMemory");
          int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
          if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Web-App Home\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(717,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f21.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(717,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f21.setProperty("webAppHome");
          int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
          if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n            Next run of Daily Maintenance Job\r\n            </td>\r\n            <td class=\"Breadcrumb\">\r\n                ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(725,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f22.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(725,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f22.setProperty("dailyMaintenanceJobRunTime");
          int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
          if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
          out.write("\r\n            </td>\r\n          </tr>\r\n          <tr>\r\n            <td class=\"BreadcrumbBold tdAlignRight\">\r\n               Technical Support Tools\r\n            </td>\r\n            <td class=\"BreadcrumbBold\" align=\"center\">\r\n                <font color=\"red\">These tools are for Follett Technical Support <strong>only</strong></font>\r\n                <br><br>\r\n                ");
          if (_jspx_meth_base_005flink_005f3(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f4(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f5(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f6(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");
 if (!store.isConsortiumAdminLoggedIn()){ 
          out.write("\r\n                    &nbsp;&nbsp;\r\n                    ");
          if (_jspx_meth_base_005flink_005f7(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                    &nbsp;&nbsp;\r\n                    ");
          if (_jspx_meth_base_005flink_005f8(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");
 } 
          out.write("\r\n                \r\n                ");

                    if(UserContext.getMyThreadUserContext().getDistrictContext().isConsortiumContext() 
                        || UserContext.getMyThreadUserContext().getDistrictContext().isDefaultContext()) {
                
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f9(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");
 } 
          out.write("\r\n                ");

                    UserContext userContext = UserContext.getMyThreadUserContext();
                    if(userContext.getDistrictContext().isStateRepository()) {
                
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f10(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");

                }
                
          out.write("\r\n                ");
 if(DestinySystemProperties.isShowFollettShelfResetLink()) { 
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f11(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");

                }
                
          out.write("\r\n                ");
 if(form.isShowIntegrateFollettShelf()) { 
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f12(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");

                }
                
          out.write("\r\n                ");

                    if(form.isShowRefreshUD()) {
                
          out.write("\r\n                &nbsp;&nbsp;\r\n                ");
          if (_jspx_meth_base_005flink_005f13(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
            return;
          out.write("\r\n                ");

                }
                
          out.write("\r\n                \r\n                <br><br>\r\n                <strong>DO NOT</strong> click these links unless Follett Technical Support instructed you to click them.\r\n            </td>\r\n          </tr>\r\n          \r\n          \r\n        </table>\r\n        <br>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");
 if (!store.isConsortiumAdminLoggedIn()){ 
          out.write("\r\n        <a name=\"DigitalResourceStatistics\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_DCPI_INFO );
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr><td class=\"MainHeader\" colspan=\"8\" align=\"center\">District Digital Resource Information</td></tr>\r\n           <tr>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Site Name\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    DCPI Access Control\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    DCPI Member\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Follett Shelf Member\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Follett Shelf ID\r\n                </td>\r\n                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Follett Shelf Name\r\n                </td>\r\n");
          out.write("                <td class=\"BreadcrumbBold\" valign=\"top\">\r\n                    Authorized?\r\n                </td>\r\n            </tr>\r\n\r\n            ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f4 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f4.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
          // /backoffice/about.jsp(860,12) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f4.setId("stat");
          // /backoffice/about.jsp(860,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f4.setName(AboutForm.FORM_NAME);
          // /backoffice/about.jsp(860,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f4.setProperty("dcpiStatsList");
          // /backoffice/about.jsp(860,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fiterate_005f4.setType("java.util.HashMap");
          int _jspx_eval_logic_005fiterate_005f4 = _jspx_th_logic_005fiterate_005f4.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.util.HashMap stat = null;
            if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f4.doInitBody();
            }
            stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
            do {
              out.write("\r\n                <tr>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("SITEID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb\">\r\n                        ");
              out.print( stat.get("SITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("DCPIACCESSCONTROLGUID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("DCPIMEMBERGUID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("FOLLETTSHELFDCPIMEMBERGUID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("FOLLETTSHELFID"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("FOLLETTSHELFSITENAME"));
              out.write("\r\n                    </td>\r\n                    <td class=\"Breadcrumb tdAlignright\">\r\n                        ");
              out.print( stat.get("AUTHORIZED"));
              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f4.doAfterBody();
              stat = (java.util.HashMap) _jspx_page_context.findAttribute("stat");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f4);
          out.write("\r\n        </table>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n        <br>\r\n        ");
 } 
          out.write("\r\n\r\n\r\n<!-- aasp info district only -->\r\n   ");
 if (!UserContext.isInConsortium()){ 
          out.write("\r\n        <a name=\"aaspInfo\"></a>\r\n        <table id=\"");
          out.print(AboutForm.TABLE_AASP_INFO );
          out.write("\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolor=\"#000000\" align=\"center\">\r\n           <tr>\r\n           <td class=\"MainHeader\" colspan=\"15\" align=\"center\">\r\n           AASP INFORMATION\r\n           </td>\r\n           </tr>\r\n           <tr><td class=\"Breadcrumb tdAlignright\">Application ID\r\n               <td class=\"Breadcrumb tdAlignright\">\r\n                 ");
          out.print(form.getAaspID());
          out.write("\r\n                </td>\r\n            </tr>\r\n       </table>\r\n        <p align=\"center\"><a class=\"DetailLink\" href=\"#TheTop\">(back to the top)</a></p>\r\n ");
 } 
          out.write("\r\n<!-- end aasp info -->\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
      out.write("\r\n    \r\n    \r\n\r\n<p align=\"center\"><a href=\"javascript:window.close();\" class=\"detailLink\">");
      if (_jspx_meth_base_005fimage_005f1(_jspx_page_context))
        return;
      out.write("</a></p>\r\n");
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
    // /backoffice/about.jsp(20,71) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/about.jsp(30,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("showDetail");
    // /backoffice/about.jsp(30,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setValue("true");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/about.jsp(74,72) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/close.gif");
    // /backoffice/about.jsp(74,72) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Close");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /backoffice/about.jsp(153,12) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setPage("/backoffice/servlet/presentaboutform.do?showLicense=true");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f0.doInitBody();
      }
      do {
        out.write("\r\n                Show License Agreement\r\n            ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /backoffice/about.jsp(163,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f1.setId("serverConnectivityLink");
    // /backoffice/about.jsp(163,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f1.setPage("/common/servlet/presentconnectivitytestform.do");
    int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f1.doInitBody();
      }
      do {
        out.write("\r\n                    Server Connectivity Test\r\n                ");
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
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fshowHideTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:showHideTag
    com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
    _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    // /backoffice/about.jsp(176,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fshowHideTag_005f0.setId("showDetails");
    int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
    if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    ");
        if (_jspx_meth_base_005flink_005f2(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /backoffice/about.jsp(177,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f2.setPage("/backoffice/servlet/presentaboutform.do?showDetail=true");
    // /backoffice/about.jsp(177,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f2.setOnclick("hideElementshowDetails()");
    int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f2.doInitBody();
      }
      do {
        out.write("\r\n                        Show Details\r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(735,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f3.setPage("/backoffice/servlet/presentaboutform.do?showDetail=true&restartJobManager=confirmRestart");
    // /backoffice/about.jsp(735,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f3.setOnclick("return confirm('Were you instructed by Follett Technical Support to Restart the Job Manager?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f3.doInitBody();
      }
      do {
        out.write("\r\n                    Restart Job Manager\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(740,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f4.setPage("/backoffice/servlet/presentaboutform.do?refreshEntityCache=true&showDetail=true");
    // /backoffice/about.jsp(740,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f4.setOnclick("return confirm('Were you instructed by Follett Technical Support to Refresh the Entity Cache?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f4.doInitBody();
      }
      do {
        out.write("\r\n                    Refresh Entity Cache\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(745,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f5.setPage("/backoffice/servlet/presentaboutform.do?flushPendingOfflineOperations=true&showDetail=true");
    // /backoffice/about.jsp(745,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f5.setOnclick("return confirm('Were you instructed by Follett Technical Support to Flush Pending Offline Operations?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
    if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f5.doInitBody();
      }
      do {
        out.write("\r\n                    Flush Pending Offline Operations\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(750,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f6.setPage("/backoffice/servlet/presentaboutform.do?refreshBarcodeFilter=true&showDetail=true");
    // /backoffice/about.jsp(750,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f6.setOnclick("return confirm('Were you instructed by Follett Technical Support to Refresh the Barcode Filters?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
    if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f6.doInitBody();
      }
      do {
        out.write("\r\n                    Refresh Barcode Filter\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(756,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f7.setPage("/backoffice/servlet/presentaboutform.do?reregisterAASP=true&showDetail=true");
    // /backoffice/about.jsp(756,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f7.setOnclick("return confirm('Were you instructed by Follett Technical Support to Reregister AASP?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
    if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f7.doInitBody();
      }
      do {
        out.write("\r\n                        Reregister AASP\r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(761,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f8.setPage("/backoffice/servlet/presentaboutform.do?rebuildKeywords=true&showDetail=true");
    // /backoffice/about.jsp(761,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f8.setOnclick("return confirm('Were you instructed by Follett Technical Support to Rebuild Keywords?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
    if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f8.doInitBody();
      }
      do {
        out.write("\r\n                        Rebuild Keywords\r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(772,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f9.setPage("/backoffice/servlet/presentaboutform.do?refreshImageCache=true&showDetail=true");
    // /backoffice/about.jsp(772,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f9.setOnclick("return confirm('Were you instructed by Follett Technical Support to Refresh the Image Cache?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
    if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f9.doInitBody();
      }
      do {
        out.write("\r\n                    Refresh Image Cache\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(782,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f10.setPage("/backoffice/servlet/presentaboutform.do?flushStateSyncQueue=true&showDetail=true");
    // /backoffice/about.jsp(782,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f10.setOnclick("return confirm('Were you instructed by Follett Technical Support to Flush Pending State Textbook Operations?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
    if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f10.doInitBody();
      }
      do {
        out.write("\r\n                    Flush Pending State Textbook Operations\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(791,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f11.setPage("/backoffice/servlet/presentaboutform.do?exportFollettEbooks=true&showDetail=true");
    // /backoffice/about.jsp(791,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f11.setOnclick("return confirm('Were you instructed by Follett Technical Support to turn off Follett Shelf?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
    if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f11.doInitBody();
      }
      do {
        out.write("\r\n                    Turn off Follett Shelf\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(800,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f12.setPage("/backoffice/servlet/presentaboutform.do?integrateFollettShelf=true&showDetail=true");
    // /backoffice/about.jsp(800,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f12.setOnclick("return confirm('Were you instructed by Follett Technical Support to upgrade all Follett eBooks to Follett Shelf?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
    if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f12.doInitBody();
      }
      do {
        out.write("\r\n                    Upgrade Follett eBooks to Follett Shelf\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    // /backoffice/about.jsp(811,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f13.setPage("/backoffice/servlet/presentaboutform.do?refreshUD=true&showDetail=true");
    // /backoffice/about.jsp(811,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f13.setOnclick("return confirm('Were you instructed by Follett Technical Support to Refresh Destiny Discover Server Information?\\n\\nPress OK to continue or Cancel.')");
    int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
    if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f13.doInitBody();
      }
      do {
        out.write("\r\n                    Refresh Destiny Discover Server Information\r\n                ");
        int evalDoAfterBody = _jspx_th_base_005flink_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fonclick.reuse(_jspx_th_base_005flink_005f13);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent(null);
    // /backoffice/about.jsp(916,74) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/close.gif");
    // /backoffice/about.jsp(916,74) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Close");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }
}
