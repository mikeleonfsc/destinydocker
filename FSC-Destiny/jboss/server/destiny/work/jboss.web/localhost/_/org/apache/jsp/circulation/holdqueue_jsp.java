package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Timestamp;
import java.util.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.session.common.ejb.LoginFacade;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.ejb.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.TimestampHelper;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.entity.ejb3.HoldSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class holdqueue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    HoldQueueForm form = (HoldQueueForm)request.getAttribute(HoldQueueForm.FORM_NAME);

      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /circulation/holdqueue.jsp(31,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("formBean");
      // /circulation/holdqueue.jsp(31,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName(HoldQueueForm.FORM_NAME);
      // /circulation/holdqueue.jsp(31,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setScope("request");
      // /circulation/holdqueue.jsp(31,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.circulation.servlet.HoldQueueForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fscope_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.circulation.servlet.HoldQueueForm formBean = null;
      formBean = (com.follett.fsc.destiny.client.circulation.servlet.HoldQueueForm) _jspx_page_context.findAttribute("formBean");
      out.write('\r');
      out.write('\n');
 String dateSelectURL = "/common/servlet/presentdateselectform.do";
   boolean hasPendingHolds = false;

      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/holdqueue.jsp(35,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handleholdqueueform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    String deleteConfirmation = formBean.getDeleteConfirmation();
    String blockMessage = formBean.getBlockMessage();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String holdPriorityStrings[] = DisplayFormatter.getHoldPriorityStrings();

    if (!StringHelper.isEmpty(deleteConfirmation)) {

          out.write("\r\n    <input type=\"hidden\" name=\"holdID\" value='");
          out.print( request.getParameter("holdID") );
          out.write("'>\r\n       ");
     
            String[] messageText = new String[]{MessageHelper.formatMessage("holdqueue_AreYouSure")};
     
          out.write("\r\n     ");
          //  base:confirmBox
          com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
          _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/holdqueue.jsp(51,5) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
          // /circulation/holdqueue.jsp(51,5) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setHeader(deleteConfirmation);
          // /circulation/holdqueue.jsp(51,5) name = messageText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setMessageText(messageText);
          // /circulation/holdqueue.jsp(51,5) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setYesName(HoldQueueForm.ID_BUTTON_YES );
          // /circulation/holdqueue.jsp(51,5) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fconfirmBox_005f0.setNoName(HoldQueueForm.ID_BUTTON_NO );
          int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
          if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fmessageText_005fheader_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
          out.write('\r');
          out.write('\n');

    } else if (!StringHelper.isEmpty(blockMessage)) {

          out.write("\r\n\r\n\r\n    <input type=\"hidden\" name=\"holdID\" value='");
          out.print( request.getParameter("holdID") );
          out.write("'>\r\n    ");
          //  base:messageBox
          com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
          _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fmessageBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/holdqueue.jsp(63,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f0.setShowWarningIcon(false);
          // /circulation/holdqueue.jsp(63,4) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fmessageBox_005f0.setShowRedBorder(true);
          int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
          if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td valign=\"top\">");
              out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
              out.write("</td>\r\n        <td valign=\"baseline\" class=\"Error\">\r\n        <center><ul>");
              out.print( ResponseUtils.filter(blockMessage) );
              out.write("</ul></center>\r\n        <p align=\"center\">");
              out.print( MessageHelper.formatMessage("holdqueue_Override") );
              out.write("</p>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td align=\"center\" class=\"ColRowBold\" colspan=\"2\">\r\n            ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
              // /circulation/holdqueue.jsp(73,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f0.setId("onOverride");
              int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /circulation/holdqueue.jsp(73,46) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f0.setProperty("overrideblocks");
                  // /circulation/holdqueue.jsp(73,46) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f0.setOnclick("hideElementonOverride()");
                  int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f0.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("holdqueue_Yes") );
                      int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty_005fonclick.reuse(_jspx_th_html_005fsubmit_005f0);
                  out.write("&nbsp;");
                  //  html:submit
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
                  _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                  // /circulation/holdqueue.jsp(73,190) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fsubmit_005f1.setProperty("cancelblock");
                  int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
                  if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fsubmit_005f1.doInitBody();
                    }
                    do {
                      out.print( MessageHelper.formatMessage("holdqueue_No") );
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
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fsubmit_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
                  int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fshowHideTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f0);
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

          out.write("\r\n\r\n    ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/holdqueue.jsp(81,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <table id=\"QueueBoxTitle\" width=\"100%\">\r\n                    <tr><!-- box header and special information -->\r\n                        <td valign=\"center\">\r\n                            <span class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("holdqueue_RequestsForTheTitle") );
              out.write("</span>\r\n                            ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                            <span class=\"ColRow\">");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</span>\r\n                            ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/holdqueue.jsp(90,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setName("circulation_servlet_HoldQueueForm");
              // /circulation/holdqueue.jsp(90,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setProperty("temporaryCopy");
              // /circulation/holdqueue.jsp(90,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setValue("true");
              // /circulation/holdqueue.jsp(90,28) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f0.setScope("request");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
                  // /circulation/holdqueue.jsp(91,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setSrc("/icons/materialtype/temp.gif");
                  // /circulation/holdqueue.jsp(91,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setWidth(19);
                  // /circulation/holdqueue.jsp(91,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setHeight(16);
                  // /circulation/holdqueue.jsp(91,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("holdqueue_TemporaryCopy") );
                  int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                  if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                  out.write("\r\n                            ");
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
              out.write("\r\n                        </td>\r\n                        <td class=\"ColRow tdAlignRight\">\r\n                            ");
              out.print(formBean.buildNewHoldLink(request, response, application));
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table id=\"");
              out.print(HoldQueueForm.TABLE_HOLDS);
              out.write("\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"1\">\r\n                    ");
 if ((formBean.getReadyHolds() != null) && (formBean.getReadyHolds().size() > 0)) { 
              out.write("\r\n                        <TR>\r\n                            <TD class=ColRowBold vAlign=bottom colspan=\"6\">");
              out.print( MessageHelper.formatMessage("holdqueue_ReadyForPatron") );
              out.write("</TD>\r\n                        </TR>\r\n\r\n                        <tr>\r\n                            <TD class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</TD>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Patron") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Holding") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Priority") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_HoldPlaced") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_HoldExpires") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">&nbsp;</td>\r\n                        </tr>\r\n\r\n                        ");
 int flipper = 0; 
              out.write("\r\n                        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/holdqueue.jsp(120,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("readyHold");
              // /circulation/holdqueue.jsp(120,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName("circulation_servlet_HoldQueueForm");
              // /circulation/holdqueue.jsp(120,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("readyHolds");
              // /circulation/holdqueue.jsp(120,24) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("java.util.HashMap");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.util.HashMap readyHold = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                readyHold = (java.util.HashMap) _jspx_page_context.findAttribute("readyHold");
                do {
                  out.write("\r\n                            ");
 if ( ( flipper & 1 ) == 0 ) { 
                  out.write("\r\n                                <tr bgcolor=\"#E8E8E8\">\r\n                            ");
 } else { 
                  out.write("\r\n                                <tr>\r\n                            ");
 } 
                  out.write("\r\n                            ");
 flipper++;
                               int priority = ((Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            
                  out.write("\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"top\">&nbsp;</TD>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( ResponseUtils.filter((String)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME)) );
                  out.write("\r\n                                    ");
 String ssn = (String)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { 
                  out.write("\r\n                                        <FONT color=\"#cc0000\">[");
                  out.print( ResponseUtils.filter(ssn) );
                  out.write("]</FONT>\r\n                                        ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">");
                  out.print( readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) );
                  out.write("</td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( holdPriorityStrings[((Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] );
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                        Timestamp datePlaced = (Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_DATEPLACED);
                                        datePlaced = TimestampHelper.setToLastSecondOfDay(datePlaced);
                                    
                  out.write("\r\n                                    ");
                  out.print( lh.formatDate(datePlaced) );
                  out.write("\r\n                                </td>\r\n                                <td  class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                        Long selectedDate = new Long( ((Timestamp)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)).getTime());
                                        String readyDateSelect = URLHelper.addHREFParam(dateSelectURL, "selectedDate",
                                            selectedDate);
                                        readyDateSelect = URLHelper.addHREFParam(readyDateSelect, "primaryKey", readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                    if (!isReserveHold) {
                                    
                  out.write("\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /circulation/holdqueue.jsp(158,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPage( readyDateSelect );
                  // /circulation/holdqueue.jsp(158,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(158,36) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f0.setShowTextAlways(true);
                  int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                  if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      out.print( lh.formatDate((Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) );
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f0);
                  out.write("\r\n                                    ");
 } else { 
                  out.write("\r\n                                        ");
                  out.print( lh.formatDate((Timestamp) readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) );
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\" valign=\"top\">\r\n                                    ");

                                        Long holdID = (Long)readyHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);
                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", holdID);
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    
                  out.write("\r\n\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /circulation/holdqueue.jsp(174,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPage( deleteLink );
                  // /circulation/holdqueue.jsp(174,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(174,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setId(HoldQueueForm.ID_PREFIX_DELETE+holdID );
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                      // /circulation/holdqueue.jsp(175,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt(MessageHelper.formatMessage("holdqueue_DeleteHold") );
                      // /circulation/holdqueue.jsp(175,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setName("deletehold");
                      // /circulation/holdqueue.jsp(175,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/icons/general/delete.gif");
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                  out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  readyHold = (java.util.HashMap) _jspx_page_context.findAttribute("readyHold");
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
              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\">&nbsp;</TD>\r\n                            <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\" colspan=\"2\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\" colspan=\"2\">&nbsp;&nbsp;&nbsp;</td>\r\n                        </tr>\r\n                    ");
 } 
              out.write("\r\n                    ");
 if ((formBean.getActiveHolds() != null) && (formBean.getActiveHolds().size() > 0)) {
                        hasPendingHolds = true;
                    
              out.write("\r\n                        <TR>\r\n                            <TD class=ColRowBold vAlign=bottom colspan=\"6\">");
              out.print( MessageHelper.formatMessage("holdqueue_PendingHolds") );
              out.write("</TD>\r\n                        </TR>\r\n                        <tr>\r\n                            <TD class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</TD>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Patron") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Requested") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Priority") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_HoldPlaced") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_HoldExpires") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">&nbsp;</td>\r\n                        </tr>\r\n                        ");
 int count = 1; 
              out.write("\r\n                        ");
 int flipper = 0; 
              out.write("\r\n                        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/holdqueue.jsp(204,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setId("activeHold");
              // /circulation/holdqueue.jsp(204,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setName("circulation_servlet_HoldQueueForm");
              // /circulation/holdqueue.jsp(204,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setProperty("activeHolds");
              // /circulation/holdqueue.jsp(204,24) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f1.setType("java.util.HashMap");
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.util.HashMap activeHold = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                activeHold = (java.util.HashMap) _jspx_page_context.findAttribute("activeHold");
                do {
                  out.write("\r\n                            ");
 if ( ( flipper & 1 ) == 0 ) { 
                  out.write("\r\n                                <tr bgcolor=\"#E8E8E8\">\r\n                            ");
 } else { 
                  out.write("\r\n                                <tr>\r\n                            ");
 } 
                  out.write("\r\n                            ");
 flipper++;
                               int priority = ((Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();
                               Long holdID = (Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            
                  out.write("\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"top\">\r\n                                    ");
 if (!isReserveHold) { 
                  out.write("\r\n                                        ");
                  out.print( count++ );
                  out.write(".\r\n                                    ");
 } 
                  out.write("\r\n                                    &nbsp;\r\n                                </TD>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( ResponseUtils.filter((String)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME)));
                  out.write("\r\n                                    ");
 String ssn = (String)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { 
                  out.write("\r\n                                        <FONT color=\"#cc0000\">[");
                  out.print( ResponseUtils.filter(ssn) );
                  out.write("]</FONT>\r\n                                        ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">");
                  out.print( activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) );
                  out.write("</td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                     if (!isReserveHold) {
                                        if (store.canView(Permission.CIRC_AED_HOLDS)) {
                                    
                  out.write("\r\n                                        ");
                  out.print( DisplayFormatter.getHoldPrioritySelectBox(priority, (Long) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID)) );
                  out.write("\r\n                                    ");
 } else { 
                  out.write("\r\n                                        ");
                  out.print( holdPriorityStrings[((Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] );
                  out.write("\r\n                                    ");
 }
                                     } else { 
                  out.print( MessageHelper.formatMessage("holdqueue_Reserved") );
 } 
                  out.write("\r\n\r\n                                    <input type=\"hidden\" name='");
                  out.print( "originalPriority_" + holdID );
                  out.write("' value='");
                  out.print(priority );
                  out.write("'>\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                        Timestamp datePlaced = (Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_DATEPLACED);
                                        datePlaced = TimestampHelper.setToLastSecondOfDay(datePlaced);
                                    
                  out.write("\r\n                                    ");
                  out.print( lh.formatDate(datePlaced) );
                  out.write("\r\n                                </td>\r\n                                <td  class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                        Long selectedDate = new Long( ((Timestamp)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)).getTime());
                                        String pendingDateSelect = URLHelper.addHREFParam(dateSelectURL, "selectedDate",
                                            selectedDate);
                                        pendingDateSelect = URLHelper.addHREFParam(pendingDateSelect, "primaryKey", activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                    if (!isReserveHold) {
                                    
                  out.write("\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                  // /circulation/holdqueue.jsp(258,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setPage( pendingDateSelect );
                  // /circulation/holdqueue.jsp(258,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(258,36) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setShowTextAlways(true);
                  int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                  if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f2.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      out.print( lh.formatDate((Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) );
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f2);
                  out.write("\r\n                                    ");
 } else { 
                  out.write("\r\n                                        ");
                  out.print( lh.formatDate((Timestamp) activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) );
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\" valign=\"top\">\r\n                                    ");

                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", (Long)activeHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID));
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    
                  out.write("\r\n\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
                  // /circulation/holdqueue.jsp(273,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setPage( deleteLink );
                  // /circulation/holdqueue.jsp(273,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(273,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setId(HoldQueueForm.ID_PREFIX_DELETE+holdID );
                  int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                  if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                      // /circulation/holdqueue.jsp(274,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("holdqueue_DeleteHold") );
                      // /circulation/holdqueue.jsp(274,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setName("deletehold");
                      // /circulation/holdqueue.jsp(274,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setSrc("/icons/general/delete.gif");
                      int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                      if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                  out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  activeHold = (java.util.HashMap) _jspx_page_context.findAttribute("activeHold");
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
              out.write("\r\n                        <tr>\r\n                            <td class=\"ColRowBold tdAlignRight\"></TD>\r\n                            <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\" colspan=\"2\">&nbsp;</td>\r\n                            <td class=\"ColRow tdAlignRight\" colspan=\"2\"><P>&nbsp;&nbsp;&nbsp;</P></td>\r\n                        </tr>\r\n                    ");
 } 
              out.write("\r\n                    ");
 if ((formBean.getExpiredHolds() != null) && (formBean.getExpiredHolds().size() > 0)) { 
              out.write("\r\n                        <TR>\r\n                            <TD class=\"ColRowBold\" vAlign=\"bottom\" colspan=\"6\">");
              out.print( MessageHelper.formatMessage("holdqueue_ExpiredHolds") );
              out.write("</TD>\r\n                        </TR>\r\n\r\n                        <tr>\r\n                            <TD class=\"SmallColHeading\" vAlign=\"bottom\">&nbsp;</TD>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Patron") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Requested") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_Priority") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">");
              out.print( MessageHelper.formatMessage("holdqueue_HoldExpired") );
              out.write("</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">&nbsp;</td>\r\n                            <td class=\"SmallColHeading\" valign=\"bottom\">&nbsp;</td>\r\n                        </tr>\r\n\r\n                        ");
 int flipper = 0; 
              out.write("\r\n                        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/holdqueue.jsp(302,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f2.setId("expiredHold");
              // /circulation/holdqueue.jsp(302,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f2.setName("circulation_servlet_HoldQueueForm");
              // /circulation/holdqueue.jsp(302,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f2.setProperty("expiredHolds");
              // /circulation/holdqueue.jsp(302,24) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f2.setType("java.util.HashMap");
              int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.util.HashMap expiredHold = null;
                if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f2.doInitBody();
                }
                expiredHold = (java.util.HashMap) _jspx_page_context.findAttribute("expiredHold");
                do {
                  out.write("\r\n                            ");
 if ( ( flipper & 1 ) == 0 ) { 
                  out.write("\r\n                                <tr bgcolor=\"#E8E8E8\">\r\n                            ");
 } else { 
                  out.write("\r\n                                <tr>\r\n                            ");
 } 
                  out.write("\r\n                            ");
 flipper++;
                               int priority = ((Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue();
                               Long holdID = (Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_HOLDID);

                               boolean isReserveHold = (priority == HoldSpecs.HOLD_PRIORITY_RESERVED);
                            
                  out.write("\r\n                                <td class=\"ColRowBold tdAlignRight\" valign=\"top\">&nbsp;</TD>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( ResponseUtils.filter((String)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PATRONNAME)) );
                  out.write("\r\n                                    ");
 String ssn = (String)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_OFFSITEPATRONSITESHORTNAME);
                                        if (ssn != null) { 
                  out.write("\r\n                                        <FONT color=\"#cc0000\">[");
                  out.print( ResponseUtils.filter(ssn) );
                  out.write("]</FONT>\r\n                                        ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">");
                  out.print( expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_TYPE) );
                  out.write("</td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( holdPriorityStrings[((Long)expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_PRIORITY)).intValue()] );
                  out.write("\r\n                                </td>\r\n                                <td  class=\"ColRow\" valign=\"top\">\r\n                                    ");
                  out.print( lh.formatDate((Timestamp) expiredHold.get(HoldFacadeSpecs.HOLD_COLUMN_EXPIREDATE)) );
                  out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"top\">\r\n                                    ");

                                        String makeActiveLink = "/circulation/servlet/handleholdqueueform.do";
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "holdID", holdID);
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "bibID", formBean.getBibID());
                                        makeActiveLink = URLHelper.addHREFParam(makeActiveLink, "action", "makeactive");
                                    if (!isReserveHold) {
                                    
                  out.write("\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                  // /circulation/holdqueue.jsp(337,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setPage( makeActiveLink);
                  // /circulation/holdqueue.jsp(337,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(337,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setId(HoldQueueForm.ID_PREFIX_MAKE_ACTIVE+holdID );
                  int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                  if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                      // /circulation/holdqueue.jsp(338,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlt( MessageHelper.formatMessage("makeActive") );
                      // /circulation/holdqueue.jsp(338,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setName("Holds");
                      // /circulation/holdqueue.jsp(338,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setSrc("/buttons/large/makeactive.gif");
                      int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                      if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                </td>\r\n                                <td class=\"tdAlignRight\" valign=\"top\">\r\n                                    ");

                                        String deleteLink = "/circulation/servlet/handleholdqueueform.do";
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "holdID", holdID);
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "bibID", formBean.getBibID());
                                        deleteLink = URLHelper.addHREFParam(deleteLink, "action", "confirmdelete");
                                    
                  out.write("\r\n\r\n                                    ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
                  // /circulation/holdqueue.jsp(350,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f5.setPage( deleteLink );
                  // /circulation/holdqueue.jsp(350,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f5.setPermission( Permission.CIRC_AED_HOLDS );
                  // /circulation/holdqueue.jsp(350,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f5.setId(HoldQueueForm.ID_PREFIX_DELETE+holdID );
                  int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                  if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f5.doInitBody();
                    }
                    do {
                      out.write("\r\n                                        ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f5);
                      // /circulation/holdqueue.jsp(351,40) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setAlt(MessageHelper.formatMessage("holdqueue_DeleteHold") );
                      // /circulation/holdqueue.jsp(351,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setName("deletehold");
                      // /circulation/holdqueue.jsp(351,40) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f4.setSrc("/icons/general/delete.gif");
                      int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                      if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                      out.write("\r\n                                    ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f5);
                  out.write("\r\n                                </td>\r\n                            </tr>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                  expiredHold = (java.util.HashMap) _jspx_page_context.findAttribute("expiredHold");
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
              out.write("\r\n                    ");
 } 
              out.write("\r\n                    <tr>\r\n                        <TD class=\"ColRowBold tdAlignRight\"></TD>\r\n                        <td class=\"ColRow tdAlignRight\">&nbsp;</td>\r\n                        <td class=\"ColRow tdAlignRight\" colspan=\"2\">&nbsp;</td>\r\n                        <td class=\"ColRowBold tdAlignRight\" colspan=\"2\">\r\n                            ");
              //  base:showHideTag
              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
              _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/holdqueue.jsp(362,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fshowHideTag_005f1.setId("onSave");
              int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
              if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                <br><P>\r\n                                    ");
if (hasPendingHolds && store.canView(Permission.CIRC_AED_HOLDS)) {
                  out.write("\r\n                                        ");
                  if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                                    ");
 } 
                  out.write("\r\n                                    &nbsp;&nbsp;&nbsp;\r\n                                    ");
                  if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n                                    </P>\r\n                           ");
                  int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n\r\n                </table><!-- end box body -->\r\n            </td>\r\n        </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write('\r');
          out.write('\n');
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

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/holdqueue.jsp(36,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("bibID");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /circulation/holdqueue.jsp(88,28) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /circulation/holdqueue.jsp(88,28) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /circulation/holdqueue.jsp(89,49) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("circulation_servlet_HoldQueueForm");
    // /circulation/holdqueue.jsp(89,49) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /circulation/holdqueue.jsp(365,40) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setOnclick("hideElementonSave()");
    // /circulation/holdqueue.jsp(365,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setName("submit");
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }
}
