package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.session.common.SortHelper;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.SitePatronHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.destiny.client.common.SitePatronHelper;

public final class patronsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/patronsearch.jsp(22,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("patronSearchForm");
      // /backoffice/patronsearch.jsp(22,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(22,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm patronSearchForm = null;
      patronSearchForm = (com.follett.fsc.destiny.client.backoffice.servlet.PatronSearchForm) _jspx_page_context.findAttribute("patronSearchForm");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    PatronSearchForm form = (PatronSearchForm)request.getAttribute(PatronSearchForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();

      out.write("\r\n\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/patronsearch.jsp(31,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlepatronsearchform.do");
      // /backoffice/patronsearch.jsp(31,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(PatronSearchForm.FIELD_SEARCH_STRING);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronsearch.jsp(33,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty("sort");
          // /backoffice/patronsearch.jsp(33,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue( "" + SortHelper.SORTBYLASTNAME );
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronsearch.jsp(35,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(35,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
          // /backoffice/patronsearch.jsp(35,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("false");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <table cellpadding=\"2\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n\t\t<tr>\r\n\t\t  <td class=\"ColRowBold\" valign=\"top\" width=\"10%\" nowrap>");
              out.print(MessageHelper.formatMessage("patronsearch_FindPatron") );
              out.write("</td>\r\n\t\t  \r\n\t\t  <td valign=\"top\" class=\"ColRowBold\" >\r\n\t\t     ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronsearch.jsp(41,7) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty( PatronSearchForm.FIELD_SEARCH_STRING );
              // /backoffice/patronsearch.jsp(41,7) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("24");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("\r\n\t\t\t ");
              out.print(MessageHelper.formatMessage("patronsearch_In") );
              out.write("\r\n\t\t\t ");
              //  base:selectPatronByType
              com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag _jspx_th_base_005fselectPatronByType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag) _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag.class);
              _jspx_th_base_005fselectPatronByType_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectPatronByType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronsearch.jsp(43,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setName(PatronSearchForm.FIELD_SEARCH_TYPE);
              // /backoffice/patronsearch.jsp(43,4) name = selected type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setSelected("" + form.getSearchType());
              int _jspx_eval_base_005fselectPatronByType_005f0 = _jspx_th_base_005fselectPatronByType_005f0.doStartTag();
              if (_jspx_th_base_005fselectPatronByType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fselected_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
              out.write("\r\n\t\t\t ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronsearch.jsp(44,4) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/search.gif");
              // /backoffice/patronsearch.jsp(44,4) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("search"));
              // /backoffice/patronsearch.jsp(44,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( PatronSearchForm.BUTTON_SEARCH );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n\t      </td>\r\n    \t</tr>\t       \r\n\t\t   \r\n\t    <tr>\r\n\t      <td>&nbsp;</td>\r\n\t      <td class=\"ColRow\">");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/patronsearch.jsp(50,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty( PatronSearchForm.FIELD_ONLY_MY_SITE );
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.print(MessageHelper.formatMessage("patronsearch_OnlyMyPatrons") );
              out.write("</td>\r\n\t\t</tr>\r\n   </table>\r\n");
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

    if (request.getAttribute("patronlist") != null) {
        List patronList = (List) request.getAttribute("patronlist");

        int itemsInList = patronList.size();
        int currentPage = PageCalculator.getCurrentPage(form);
        int itemsToSkip = PageCalculator.getFirstNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );
        int itemsToPrint = PageCalculator.getOnePastLastNumberInPage( currentPage, form.gimmeMaxRowsToDisplay(), itemsInList );

      out.write("\r\n\r\n");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f1.setParent(null);
      // /backoffice/patronsearch.jsp(67,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setProperty("page");
      // /backoffice/patronsearch.jsp(67,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setValue( "" + currentPage );
      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      out.write("\r\n\r\n    <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /backoffice/patronsearch.jsp(70,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(70,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(70,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("false");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <tr>\r\n                <td class=\"ColRow\">\r\n                    ");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /backoffice/patronsearch.jsp(73,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(73,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f0.setProperty("searchSummary");
          int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
          if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
          out.write("\r\n                </td>\r\n                <td class=\"ColRow tdAlignRight\">\r\n                    ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /backoffice/patronsearch.jsp(76,20) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPage( form.getPrinterFriendlyLink() );
          // /backoffice/patronsearch.jsp(76,20) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
          // /backoffice/patronsearch.jsp(76,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setId(PatronSearchForm.ID_PRINTER_FRIENDLY );
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
              // /backoffice/patronsearch.jsp(76,148) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
              // /backoffice/patronsearch.jsp(76,148) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("printable") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
          out.write("\r\n                <td>\r\n            </tr>\r\n        ");
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
      out.write("\r\n        <tr>\r\n            <td>\r\n                ");
      out.write("\r\n                ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f0.setParent(null);
      // /backoffice/patronsearch.jsp(83,16) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setSearchType(MessageHelper.formatMessage("patronsearch_Patrons"));
      // /backoffice/patronsearch.jsp(83,16) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setStartOfSet(String.valueOf(itemsToSkip+1));
      // /backoffice/patronsearch.jsp(83,16) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setEndOfSet(String.valueOf(itemsToPrint));
      // /backoffice/patronsearch.jsp(83,16) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f0.setTotalInSet(String.valueOf(itemsInList));
      int _jspx_eval_base_005fsearchSummary_005f0 = _jspx_th_base_005fsearchSummary_005f0.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f0);
      out.write("\r\n            </td>\r\n            <td class=\"ColRow tdAlignRight\">\r\n                ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f2.setParent(null);
      // /backoffice/patronsearch.jsp(90,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(90,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(90,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setValue("false");
      int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
      if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    ");
          //  base:pageListOutput
          com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
          _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /backoffice/patronsearch.jsp(91,20) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fpageListOutput_005f0.setFormName( PatronSearchForm.FORM_NAME );
          int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
          if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
          out.write("\r\n                ");
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
      _jspx_th_logic_005fequal_005f3.setParent(null);
      // /backoffice/patronsearch.jsp(93,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(93,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(93,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f3.setValue("true");
      int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
      if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    &nbsp;\r\n                ");
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
      out.write("\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n    \r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f4.setParent(null);
      // /backoffice/patronsearch.jsp(101,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(101,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(101,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f4.setValue("false");
      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<hr>\r\n");
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
      out.write("\r\n\r\n    <table id=\"PatronFindTable\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\">\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f5.setParent(null);
      // /backoffice/patronsearch.jsp(106,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(106,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(106,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f5.setValue("true");
      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading\" colspan=\"4\">&nbsp;</td>\r\n            </tr>\r\n        ");
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
      out.write("\r\n\r\n        ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f6.setParent(null);
      // /backoffice/patronsearch.jsp(112,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(112,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(112,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setValue("false");
      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <tr>\r\n                <td class=\"SmallColHeading\">\r\n                ");

                    int strSort = form.getSort();
        
                    if (strSort == SortHelper.SORTBYFIRSTNAME) {
                
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(120,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f0.setDescription(MessageHelper.formatMessage("patronsearch_First"));
          // /backoffice/patronsearch.jsp(120,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f0.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(120,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f0.setSort( "" + SortHelper.SORTBYFIRSTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f0 = _jspx_th_base_005fsortHeaderOutput_005f0.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(121,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f1.setDescription(MessageHelper.formatMessage("patronsearch_Middle"));
          // /backoffice/patronsearch.jsp(121,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f1.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(121,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f1.setSort( "" + SortHelper.SORTBYMIDDLENAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f1 = _jspx_th_base_005fsortHeaderOutput_005f1.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(122,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f2.setDescription(MessageHelper.formatMessage("patronsearch_Last"));
          // /backoffice/patronsearch.jsp(122,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f2.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(122,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f2.setSort( "" + SortHelper.SORTBYLASTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f2 = _jspx_th_base_005fsortHeaderOutput_005f2.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
          out.write("\r\n                ");

                    } else if (strSort == SortHelper.SORTBYMIDDLENAME) {
                
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(126,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f3.setDescription(MessageHelper.formatMessage("patronsearch_Middle"));
          // /backoffice/patronsearch.jsp(126,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f3.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(126,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f3.setSort( "" + SortHelper.SORTBYMIDDLENAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f3 = _jspx_th_base_005fsortHeaderOutput_005f3.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f4 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(127,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f4.setDescription(MessageHelper.formatMessage("patronsearch_Last"));
          // /backoffice/patronsearch.jsp(127,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f4.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(127,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f4.setSort( "" + SortHelper.SORTBYLASTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f4 = _jspx_th_base_005fsortHeaderOutput_005f4.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
          out.write("\r\n                        ,\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f5 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f5.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(129,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f5.setDescription(MessageHelper.formatMessage("patronsearch_First"));
          // /backoffice/patronsearch.jsp(129,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f5.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(129,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f5.setSort( "" + SortHelper.SORTBYFIRSTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f5 = _jspx_th_base_005fsortHeaderOutput_005f5.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f5);
          out.write("\r\n                ");

                    } else {
                
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f6 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f6.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(133,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f6.setDescription(MessageHelper.formatMessage("patronsearch_Last"));
          // /backoffice/patronsearch.jsp(133,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f6.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(133,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f6.setSort( "" + SortHelper.SORTBYLASTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f6 = _jspx_th_base_005fsortHeaderOutput_005f6.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f6);
          out.write("\r\n                        ,\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f7 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(135,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f7.setDescription(MessageHelper.formatMessage("patronsearch_First"));
          // /backoffice/patronsearch.jsp(135,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f7.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(135,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f7.setSort( "" + SortHelper.SORTBYFIRSTNAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f7 = _jspx_th_base_005fsortHeaderOutput_005f7.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f7);
          out.write("\r\n                        ");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f8 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f8.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(136,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f8.setDescription(MessageHelper.formatMessage("patronsearch_Middle"));
          // /backoffice/patronsearch.jsp(136,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f8.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(136,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f8.setSort( "" + SortHelper.SORTBYMIDDLENAME );
          int _jspx_eval_base_005fsortHeaderOutput_005f8 = _jspx_th_base_005fsortHeaderOutput_005f8.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f8);
          out.write("\r\n                ");

                    }
                
          out.write("\r\n                </td>\r\n                <td class=\"SmallColHeading\">");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f9 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f9.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(141,44) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f9.setDescription(MessageHelper.formatMessage("patronsearch_Barcode"));
          // /backoffice/patronsearch.jsp(141,44) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f9.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(141,44) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f9.setSort( "" + SortHelper.SORTBYBARCODE );
          int _jspx_eval_base_005fsortHeaderOutput_005f9 = _jspx_th_base_005fsortHeaderOutput_005f9.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f9);
          out.write("</td>\r\n        \r\n                ");
 if (form.isOnlyMySite()) { 
          out.write("\r\n                    <td class=\"SmallColHeading\">&nbsp;</td>\r\n                ");
 } else { 
          out.write("\r\n                    <td class=\"SmallColHeading\">");
          //  base:sortHeaderOutput
          com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f10 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
          _jspx_th_base_005fsortHeaderOutput_005f10.setPageContext(_jspx_page_context);
          _jspx_th_base_005fsortHeaderOutput_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /backoffice/patronsearch.jsp(146,48) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f10.setDescription(MessageHelper.formatMessage("patronsearch_Site"));
          // /backoffice/patronsearch.jsp(146,48) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f10.setFormName( PatronSearchForm.FORM_NAME );
          // /backoffice/patronsearch.jsp(146,48) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fsortHeaderOutput_005f10.setSort( "" + SortHelper.SORTBYSITESHORTNAME_PATRONS);
          int _jspx_eval_base_005fsortHeaderOutput_005f10 = _jspx_th_base_005fsortHeaderOutput_005f10.doStartTag();
          if (_jspx_th_base_005fsortHeaderOutput_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f10);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f10);
          out.write("</td>\r\n                ");
 } 
          out.write("\r\n                <td class=\"SmallColHeading\">&nbsp;</td>\r\n            </tr>\r\n        ");
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
      out.write("\r\n        ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /backoffice/patronsearch.jsp(151,8) name = offset type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setOffset(""+itemsToSkip);
      // /backoffice/patronsearch.jsp(151,8) name = length type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setLength(""+(itemsToPrint - itemsToSkip));
      // /backoffice/patronsearch.jsp(151,8) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
      // /backoffice/patronsearch.jsp(151,8) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("row");
      // /backoffice/patronsearch.jsp(151,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(151,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("list");
      // /backoffice/patronsearch.jsp(151,8) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue row = null;
        java.lang.Integer flipper = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
        do {
          out.write("\r\n        \t<tr valign=\"top\" ");
          out.print(( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
          out.write(" >\r\n                ");
 // Display item here 
          out.write("\r\n                ");
          //  base:td
          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
          _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/patronsearch.jsp(154,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f0.setClazz("ColRow");
          // /backoffice/patronsearch.jsp(154,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f0.setFiltered(true);
          int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
          if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005ftd_005f0.doInitBody();
            }
            do {
              out.print( form.getPatronName(row) );
              int evalDoAfterBody = _jspx_th_base_005ftd_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005ftd_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f0);
          out.write("\r\n                ");
          //  base:td
          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
          _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/patronsearch.jsp(155,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f1.setClazz("ColRow");
          // /backoffice/patronsearch.jsp(155,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f1.setFiltered(true);
          int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
          if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005ftd_005f1.doInitBody();
            }
            do {
              out.print(SitePatronHelper.getPatronBarcode(store, row, null));
              int evalDoAfterBody = _jspx_th_base_005ftd_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005ftd_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f1);
          out.write("\r\n                ");
          //  base:td
          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
          _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/patronsearch.jsp(156,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f2.setClazz("ColRow");
          // /backoffice/patronsearch.jsp(156,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f2.setFiltered(true);
          int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
          if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005ftd_005f2.doInitBody();
            }
            do {
              out.print( SitePatronHelper.getPatronSiteName(store, row, null) );
              int evalDoAfterBody = _jspx_th_base_005ftd_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005ftd_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f2);
          out.write("\r\n                ");
          //  base:td
          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
          _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /backoffice/patronsearch.jsp(157,16) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f3.setClazz("ColRow");
          // /backoffice/patronsearch.jsp(157,16) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f3.setFiltered(false);
          int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
          if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005ftd_005f3.doInitBody();
            }
            do {
              out.print( form.getPatronLinks(row) );
              int evalDoAfterBody = _jspx_th_base_005ftd_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005ftd_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f3);
          out.write("\r\n            </tr>\r\n        ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
          flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n    </table>\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f7.setParent(null);
      // /backoffice/patronsearch.jsp(162,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setName( PatronSearchForm.FORM_NAME );
      // /backoffice/patronsearch.jsp(162,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setProperty("printerFriendly");
      // /backoffice/patronsearch.jsp(162,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f7.setValue("false");
      int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
      if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<hr>\r\n");
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td>\r\n                ");
      out.write("\r\n                ");
      //  base:searchSummary
      com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag _jspx_th_base_005fsearchSummary_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag) _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SearchCountSummaryTag.class);
      _jspx_th_base_005fsearchSummary_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fsearchSummary_005f1.setParent(null);
      // /backoffice/patronsearch.jsp(174,16) name = searchType type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setSearchType(MessageHelper.formatMessage("patronsearch_Patrons"));
      // /backoffice/patronsearch.jsp(174,16) name = startOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setStartOfSet(String.valueOf(itemsToSkip+1));
      // /backoffice/patronsearch.jsp(174,16) name = endOfSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setEndOfSet(String.valueOf(itemsToPrint));
      // /backoffice/patronsearch.jsp(174,16) name = totalInSet type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fsearchSummary_005f1.setTotalInSet(String.valueOf(itemsInList));
      int _jspx_eval_base_005fsearchSummary_005f1 = _jspx_th_base_005fsearchSummary_005f1.doStartTag();
      if (_jspx_th_base_005fsearchSummary_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fsearchSummary_005ftotalInSet_005fstartOfSet_005fsearchType_005fendOfSet_005fnobody.reuse(_jspx_th_base_005fsearchSummary_005f1);
      out.write("\r\n                                \r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    \r\n    \r\n    \r\n    \r\n");

    }

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
    // /backoffice/patronsearch.jsp(23,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }
}
