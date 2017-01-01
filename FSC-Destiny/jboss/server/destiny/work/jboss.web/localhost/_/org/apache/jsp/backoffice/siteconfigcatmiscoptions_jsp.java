package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;
import com.follett.fsc.destiny.session.backoffice.remote.data.UpdateConfigSiteDefaultsJobParams;
import com.follett.fsc.destiny.util.vopac.DestinyQuestThemes;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;

public final class siteconfigcatmiscoptions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n");

    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);
    boolean isInternational = UserContext.getMyContextLocaleHelper().isInternationalProduct();

      out.write("\r\n\r\n\r\n<tr>\r\n    <td>\r\n        <table id=\"");
      out.print(SiteConfigurationBaseForm.TABLE_MISC_SETTINGS);
      out.write("\" width=\"100%\" cellpadding=\"5\" cellspacing=\"0\">\r\n            <tr>\r\n                <td class=\"TableHeading\" valign=\"top\">&nbsp;");
      out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_MiscellaneousSettings") );
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f0.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(35,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f0.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_ALLOW_READING_LEVEL_AND_INTEREST_LEVEL_SEARCHES);
      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f0.doInitBody();
        }
        do {
          out.write("\r\n                        Support Reading Level and Interest Level Searches  \r\n                   ");
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
      out.write("\r\n                   ");
      if (_jspx_meth_base_005fhelpTag_005f0(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f1.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(44,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f1.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_DEFAULT_BASIC_SEARCH_TO_SHOW_MORE);
      int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f1.doInitBody();
        }
        do {
          out.write("\r\n                        By default, show limiter options in Basic Search  \r\n                   ");
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
      out.write("\r\n                   ");
      if (_jspx_meth_base_005fhelpTag_005f1(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f2.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(52,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f2.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_CLEANUP_TITLE);
      int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f2.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_WhenTheLastCopyOfALibraryTitleIsDeletedRemoveThe") );
          out.write("\r\n                   ");
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
      out.write("\r\n                   ");
      if (_jspx_meth_base_005fhelpTag_005f2(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n\t       ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(58,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( SiteConfigurationBaseForm.FORM_NAME );
      // /backoffice/siteconfigcatmiscoptions.jsp(58,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("displayBasicSearchData");
      // /backoffice/siteconfigcatmiscoptions.jsp(58,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <tr>\r\n                    <td>");
          if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                        ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(64,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f3.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_DATA);
          int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f3.doInitBody();
            }
            do {
              out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_StoreSearchStatisticsDataFor") );
              out.write("&nbsp;");
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f3);
          out.write("\r\n                        ");
          //  html:text
          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
          _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(65,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_STORE_BASIC_SEARCH_TERM_LENGTH);
          // /backoffice/siteconfigcatmiscoptions.jsp(65,24) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setSize("4");
          // /backoffice/siteconfigcatmiscoptions.jsp(65,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005ftext_005f0.setMaxlength("2");
          int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
          if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
          out.write("\r\n                        &nbsp;");
          out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_MonthsPriorToTheCurrentMonth") );
          out.write("&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f3(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold\">\r\n                        <ul>\r\n                        ");
          //  html:checkbox
          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
          _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fcheckbox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(72,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fcheckbox_005f4.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_ENABLE_SEARCH_SUGGESTIONS_IN_QUEST);
          int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
          if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fcheckbox_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fcheckbox_005f4.doInitBody();
            }
            do {
              out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_EnableSearchSuggestionsInDestinyQuest") );
              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fcheckbox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f4);
          out.write("\r\n                         ");
          if (_jspx_meth_base_005fhelpTag_005f4(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
            return;
          out.write("                         \r\n                        </ul>\r\n                    </td>\r\n                </tr>\r\n           ");
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
      out.write("\r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f5.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(83,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f5.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_SHOW_NEW_ARRIVALS);
      int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f5.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_ShowNewArrivalsInDestinyQuest") );
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f5);
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f5(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f6.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(88,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f6.setProperty(SiteConfigurationBaseForm.FIELD_CAT_MISC_SKIP_LEADING_ARTICLES);
      int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f6.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_IgnoreLeadingArticlesInSearchTermsWhenBrowsingForO") );
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f6);
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f6(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            ");
 if (!isInternational) {
      out.write("\r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f3(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold\">");
      out.print(UpdateConfigSiteDefaultsJobParams.CONST_MISC_DEFAULT_QUEST_THEME );
      out.write(":\r\n                    &nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f7(_jspx_page_context))
        return;
      out.write("\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                   <td class=\"ColRow\">\r\n                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(102,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f0.setItems(DestinyQuestThemes.THEMES);
      // /backoffice/siteconfigcatmiscoptions.jsp(102,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fforEach_005f0.setVar("theme");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n                            &nbsp;&nbsp;");
            //  html:radio
            org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
            _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
            _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /backoffice/siteconfigcatmiscoptions.jsp(103,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
            _jspx_th_html_005fradio_005f0.setProperty(SiteConfigurationBaseForm.FIELD_DEFAULT_QUEST_THEME);
            // /backoffice/siteconfigcatmiscoptions.jsp(103,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
            _jspx_th_html_005fradio_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${theme.cssFolder}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
            if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.pushBody();
                _jspx_push_body_count_c_005fforEach_005f0[0]++;
                _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                _jspx_th_html_005fradio_005f0.doInitBody();
              }
              do {
                out.write("\r\n                            ");
                int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                out = _jspx_page_context.popBody();
                _jspx_push_body_count_c_005fforEach_005f0[0]--;
              }
            }
            if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
              return;
            }
            _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${theme.label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("<br>\r\n                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n                   </td>\r\n                </tr>\r\n            ");
} else {
      out.write("\r\n                ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(109,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(SiteConfigurationBaseForm.FIELD_DEFAULT_QUEST_THEME);
      // /backoffice/siteconfigcatmiscoptions.jsp(109,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setValue(DestinyQuestThemes.THEME_BLUEMAZE.getCssFolder() );
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("\r\n            ");
 } 
      out.write("  \r\n                <tr>\r\n                    <td class=\"ColRowBold\" colspan=\"2\">");
      out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest") );
      out.write("&nbsp;\r\n                        ");
      //  html:select
      org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
      _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fselect_005f0.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(113,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fselect_005f0.setProperty( SiteConfigurationBaseForm.FIELD_DISPLAY_MYQUEST_PATRON_PICTURES );
      int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fselect_005f0.doInitBody();
        }
        do {
          out.write("\r\n                            ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(114,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f0.setValue(String.valueOf( ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_ALWAYS) );
          int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
          if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f0.doInitBody();
            }
            do {
              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Always"));
              int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f0);
          out.write("\r\n                            ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(115,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f1.setValue(String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_FOR_FRIENDS) );
          int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
          if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f1.doInitBody();
            }
            do {
              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_OnlyForFriends"));
              int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f1);
          out.write("\r\n                            ");
          //  html:option
          org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
          _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
          // /backoffice/siteconfigcatmiscoptions.jsp(116,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005foption_005f2.setValue(String.valueOf(ConfigSiteSpecs.DISPLAY_MYQUEST_PATRON_PICTURES_NEVER) );
          int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
          if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005foption_005f2.doInitBody();
            }
            do {
              out.print(MessageHelper.formatMessage("siteconfigcatalog_ShowPatronPicturesToMyQuest_Never"));
              int evalDoAfterBody = _jspx_th_html_005foption_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f2);
          out.write("\r\n                        ");
          int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
      out.write("\r\n                    </td>\r\n                </tr>    \r\n                \r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f4(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n               <td colspan = \"2\" class = \"ColRowBold\">\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f7.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(126,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f7.setProperty( SiteConfigurationBaseForm.FIELD_CAT_MISC_SAFARI_DISPLAY_DIGITAL );
      int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f7.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithDigitalResources") );
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f7);
      out.write(' ');
      if (_jspx_meth_base_005fhelpTag_005f8(_jspx_page_context))
        return;
      out.write("<br/>\r\n                  ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f8.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(127,18) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f8.setProperty( SiteConfigurationBaseForm.FIELD_CAT_MISC_SAFARI_DISPLAY_TITLES );
      int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f8.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("siteconfigcatalog_DisplaySafariMontageResultsWithTitles") );
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f8);
      out.write("\r\n               </td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f5(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
      out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_WhereApplicableByDefaultSortSearchResultsBy", form.buildDefaultSearchSortCombobox()) );
      out.write("\r\n                    &nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f9(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n    ");
 if (!isInternational) { 
      out.write("            \r\n            <tr>\r\n                <td colspan=\"2\">");
      if (_jspx_meth_base_005fimageLine_005f6(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td colspan=\"2\" class=\"ColRowBold\">");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f9 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f9.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(144,51) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f9.setProperty(SiteConfigurationBaseForm.FIELD_ALLOW_WEB_PATH_EXPRESS_THEMES);
      int _jspx_eval_html_005fcheckbox_005f9 = _jspx_th_html_005fcheckbox_005f9.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f9.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          out.print(MessageHelper.formatMessage("siteconfigcatmiscoptions_ShowWebPathExpressMonthlyThemes") );
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f9);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f9);
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f10(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n    ");
} else {
      out.write("\r\n    ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f1.setParent(null);
      // /backoffice/siteconfigcatmiscoptions.jsp(152,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setProperty(SiteConfigurationBaseForm.FIELD_ALLOW_WEB_PATH_EXPRESS_THEMES);
      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      out.write("\r\n    ");
} 
      out.write("            \r\n            \r\n        </table>\r\n    </td>\r\n</tr>\r\n");
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

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(31,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(31,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(38,19) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_support_reading_interest_lvl_srch.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(47,19) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_limiter_options_basic_search.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(55,19) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_delete_last_copy_deletes_title.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/siteconfigcatmiscoptions.jsp(60,24) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(60,24) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/siteconfigcatmiscoptions.jsp(66,126) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_store_basicsearch_data.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/siteconfigcatmiscoptions.jsp(73,25) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f4.setHelpFileName("d_dq_search_suggestions.htm");
    int _jspx_eval_base_005fhelpTag_005f4 = _jspx_th_base_005fhelpTag_005f4.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(79,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(79,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f5.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(83,223) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f5.setHelpFileName("d_dq_show_new_arrivals.htm");
    int _jspx_eval_base_005fhelpTag_005f5 = _jspx_th_base_005fhelpTag_005f5.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f6 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f6.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(88,248) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f6.setHelpFileName("d_ignore_leading_articles.htm");
    int _jspx_eval_base_005fhelpTag_005f6 = _jspx_th_base_005fhelpTag_005f6.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(93,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(93,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f7 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f7.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(97,26) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f7.setHelpFileName("d_dq_theme.htm");
    int _jspx_eval_base_005fhelpTag_005f7 = _jspx_th_base_005fhelpTag_005f7.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(122,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(122,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f8.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(126,235) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f8.setHelpFileName("d_display_safari_montage_titles.htm");
    int _jspx_eval_base_005fhelpTag_005f8 = _jspx_th_base_005fhelpTag_005f8.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(131,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(131,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f9.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(136,26) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f9.setHelpFileName("d_sort_search_results.htm");
    int _jspx_eval_base_005fhelpTag_005f9 = _jspx_th_base_005fhelpTag_005f9.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f6.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(141,32) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setHeight("1");
    // /backoffice/siteconfigcatmiscoptions.jsp(141,32) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f6.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f6 = _jspx_th_base_005fimageLine_005f6.doStartTag();
    if (_jspx_th_base_005fimageLine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f10.setParent(null);
    // /backoffice/siteconfigcatmiscoptions.jsp(147,38) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f10.setHelpFileName("d_webpath_suggestions_themes_spotlght.htm");
    int _jspx_eval_base_005fhelpTag_005f10 = _jspx_th_base_005fhelpTag_005f10.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
    return false;
  }
}
