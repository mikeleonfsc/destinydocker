package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.common.MessageHelper;

public final class crwmeetingdays_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n");

    CRWMeetingDaysForm form = (CRWMeetingDaysForm)request.getAttribute(CRWMeetingDaysForm.FORM_NAME);

      out.write("\r\n\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/crwmeetingdays.jsp(18,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlecrwmeetingdaysform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(19,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(CRWMeetingDaysForm.CRW_MEETING_DAY_LIMITER_INDEX);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n\r\n    <table width=\"95%\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor='#c0c0c0'>\r\n        <tr>\r\n            <td bgcolor=\"#FFFFFF\" valign=\"top\" width=\"100%\">\r\n                <table id=\"");
          out.print(CRWMeetingDaysForm.TABLE_OUTER );
          out.write("\" width=\"100%\" cellpadding=\"5\" cellspacing=\"0\">\r\n                    <tr>\r\n                        <td class=\"TableHeading\" vAlign=\"top\">");
          out.print( MessageHelper.formatMessage("crwmeetingdays_MeetingDays") );
          out.write("</td>\r\n                        <td class=\"ColRowBold tdAlignRight\">&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\" vAlign=\"top\" align=\"center\" colspan=\"2\">\r\n                            <table id=\"");
          out.print( CRWMeetingDaysForm.TABLE_INNER);
          out.write("\" cellSpacing=0 cellPadding=0 border=0>\r\n                                <tr>\r\n                                    <td class=\"ColRowBold\" vAlign=\"top\" align=\"center\">\r\n                                        <TABLE id=\"");
          out.print(CRWMeetingDaysForm.TABLE_DOW_CHECKBOXES);
          out.write("\"  cellpadding=\"4\">\r\n                                            <TR>\r\n                                                <td class=\"ColRow\" valign=\"top\">\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(37,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(37,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f0.setProperty(CRWMeetingDaysForm.SUNDAY);
          int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f0.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Sunday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f0);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(38,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f1.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(38,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f1.setProperty(CRWMeetingDaysForm.MONDAY);
          int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f1.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Monday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f1);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(39,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f2.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(39,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f2.setProperty(CRWMeetingDaysForm.TUESDAY);
          int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f2.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Tuesday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f2);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(40,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f3.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(40,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f3.setProperty(CRWMeetingDaysForm.WEDNESDAY);
          int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f3.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Wednesday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f3);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(41,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f4.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(41,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f4.setProperty(CRWMeetingDaysForm.THURSDAY);
          int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f4.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Thursday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f4);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(42,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f5.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(42,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f5.setProperty(CRWMeetingDaysForm.FRIDAY);
          int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f5.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Friday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f5);
          out.write("<br>\r\n                                                    ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(43,52) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f6.setName(CRWMeetingDaysForm.FORM_NAME);
          // /backoffice/crwmeetingdays.jsp(43,52) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f6.setProperty(CRWMeetingDaysForm.SATURDAY);
          int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f6.doInitBody();
            }
            do {
              out.print( MessageHelper.formatMessage("crwmeetingdays_Saturday") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fname.reuse(_jspx_th_html_005fcheckbox_005f6);
          out.write("<br>\r\n                                                </td>\r\n                                            </TR>\r\n                                            <TR>\r\n                                                <td class=\"ColRow\">&nbsp;\r\n                                                </td>\r\n                                            </TR>\r\n                                        </TABLE>\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                       </td>\r\n                    </tr>   \r\n                    <tr>\r\n                        <td colSpan=\"2\" valign=\"top\">\r\n                            ");
          if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n                        </td>\r\n                    </tr>            \r\n                    <tr>\r\n                        <td align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                            ");
          //  base:okButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag _jspx_th_base_005fokButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag) _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.OkButtonTag.class);
          _jspx_th_base_005fokButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fokButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(63,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fokButton_005f0.setName(CRWMeetingDaysForm.BUTTON_OK );
          int _jspx_eval_base_005fokButton_005f0 = _jspx_th_base_005fokButton_005f0.doStartTag();
          if (_jspx_th_base_005fokButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fokButton_005fname_005fnobody.reuse(_jspx_th_base_005fokButton_005f0);
          out.write("&nbsp;\r\n                            ");
          //  base:cancelButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
          _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/crwmeetingdays.jsp(64,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcancelButton_005f0.setName(CRWMeetingDaysForm.BUTTON_CANCEL );
          int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
          if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
          out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /backoffice/crwmeetingdays.jsp(58,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/crwmeetingdays.jsp(58,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
