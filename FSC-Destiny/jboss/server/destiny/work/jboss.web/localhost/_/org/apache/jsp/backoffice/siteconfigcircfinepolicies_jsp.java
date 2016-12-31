package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.cataloging.ejb.AssetTemplateAEDSpecs;
import com.follett.fsc.destiny.client.backoffice.servlet.SiteConfigurationBaseForm;
import com.follett.fsc.destiny.entity.ejb3.FineSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class siteconfigcircfinepolicies_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n<tr>\r\n\r\n");

    SiteConfigurationBaseForm form = (SiteConfigurationBaseForm)request.getAttribute(SiteConfigurationBaseForm.FORM_NAME);

      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\n    function selectedAssetCreateFinesUsingAssetReplacementPrice() {\r\n        // User selected \"Create fines using replacement price from asset\". When this button is selected, the depreciated value cannot\r\n        // be used for the fine amount. Uncheck and disable the checkbox, and gray out the text for the choice.\r\n        document.");
      out.print(SiteConfigurationBaseForm.FORM_NAME);
      out.write('.');
      out.print(SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL);
      out.write(".checked = false;\r\n        document.");
      out.print(SiteConfigurationBaseForm.FORM_NAME);
      out.write('.');
      out.print(SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL);
      out.write(".disabled = true;\r\n        document.getElementById(\"");
      out.print(SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT);
      out.write("\").style.color = \"gray\";\r\n    }\r\n\r\n    function selectedAssetCreateFinesUsingItemPurchasePrice() {\r\n        // User selected \"Create fines using purchase price from item\". When this button is selected, then depreciated value\r\n        // can be used for the fine amount. Enable the checkbox and change the color back to black on the text for the choice.\r\n        document.");
      out.print(SiteConfigurationBaseForm.FORM_NAME);
      out.write('.');
      out.print(SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL);
      out.write(".disabled = false;\r\n        document.getElementById(\"");
      out.print(SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT);
      out.write("\").style.color = \"black\";\r\n    }\r\n// -->\r\n</script>\r\n\r\n\r\n<tr>\r\n    <td>\r\n    <table id=\"");
      out.print(SiteConfigurationBaseForm.TABLE_FINE_POLICIES);
      out.write("\" width=\"100%\" cellpadding=\"5\" cellspacing=\"0\"> \r\n        <tr>\r\n            <td class=\"TableHeading\" valign=\"top\">&nbsp;");
      out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_FinePolicies") );
      out.write("</td>\r\n        </tr>\r\n\r\n        <tr>\r\n            <td>");
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\">");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f0.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(50,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f0.setProperty(SiteConfigurationBaseForm.FIELD_CIRC_FINES_AUTO_CALCULATE);
      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f0.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_AutomaticallyCalculateFinesForOverdueItems") );
          if (_jspx_meth_base_005fhelpTag_005f0(_jspx_th_html_005fcheckbox_005f0, _jspx_page_context))
            return;
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>");
      if (_jspx_meth_base_005fimageLine_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\">");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f1.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(58,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f1.setProperty(SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_LIBRARY);
      int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f1.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingLibraryFine") );
          out.write("&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f1(_jspx_th_html_005fcheckbox_005f1, _jspx_page_context))
            return;
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        \r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f2.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(65,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f2.setProperty(SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_LIBRARY_FINE_NOTE);
      int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f2.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingLibraryRefunds"));
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f3.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(70,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f3.setProperty(SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_LIBRARY);
      int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f3.doInitBody();
        }
        do {
          out.write("Automatically create fine for lost library materials&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f2(_jspx_th_html_005fcheckbox_005f3, _jspx_page_context))
            return;
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f4 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f4.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(75,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f4.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_LIBRARY_CHECKBOX);
      int _jspx_eval_html_005fcheckbox_005f4 = _jspx_th_html_005fcheckbox_005f4.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f4.doInitBody();
        }
        do {
          out.write("&quot;Lost&quot; library materials must be returned in a timely fashion to generate a refund&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f3(_jspx_th_html_005fcheckbox_005f4, _jspx_page_context))
            return;
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\"> \r\n                &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid library fine becomes non-refundable:&nbsp;\r\n                ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(81,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_LIBRARY);
      // /backoffice/siteconfigcircfinepolicies.jsp(81,16) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setSize("3");
      // /backoffice/siteconfigcircfinepolicies.jsp(81,16) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f0.setMaxlength("3");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      out.write("\r\n            </td>\r\n        </tr>\r\n        \r\n        ");
 if (!UserContext.getMyContextLocaleHelper().isInternationalProduct()) { 
      out.write("\r\n        <tr>\r\n            <td>");
      if (_jspx_meth_base_005fimageLine_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\">");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f5 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f5.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f5.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(90,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f5.setProperty(SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_TEXTBOOK);
      int _jspx_eval_html_005fcheckbox_005f5 = _jspx_th_html_005fcheckbox_005f5.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f5.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingTextbookFine") );
          out.write("&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f4(_jspx_th_html_005fcheckbox_005f5, _jspx_page_context))
            return;
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f6 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f6.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f6.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(96,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f6.setProperty(SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE);
      int _jspx_eval_html_005fcheckbox_005f6 = _jspx_th_html_005fcheckbox_005f6.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f6.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingTextbookRefunds"));
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 } else { 
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(100,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_TEXTBOOK);
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f1.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(101,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setProperty(SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_TEXTBOOK_FINE_NOTE);
      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      out.write("\r\n        ");
} 
      out.write("\r\n        \r\n            <tr>\r\n                <td class=\"ColRowBold\"> \r\n                    ");
if ( !form.getStore().isStateRepositoryRunning() ) { 
      out.write(" \r\n                        ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f7 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f7.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f7.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(107,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f7.setProperty(SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK);
      int _jspx_eval_html_005fcheckbox_005f7 = _jspx_th_html_005fcheckbox_005f7.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f7.doInitBody();
        }
        do {
          out.write("Automatically create fine for lost textbook materials&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f5(_jspx_th_html_005fcheckbox_005f7, _jspx_page_context))
            return;
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
      out.write("\r\n                    ");
 } else { 
      out.write("\r\n                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f2.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(109,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f2.setProperty(SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_TEXTBOOK);
      // /backoffice/siteconfigcircfinepolicies.jsp(109,24) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f2.setValue("true");
      int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
      if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      out.write("\r\n                    ");
 }  
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\" colspan=\"2\">\r\n                    ");
      out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_CreateTextbookFinesUsing"));
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f6(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRow\" colspan=\"2\">\r\n                    &nbsp;&nbsp;&nbsp;&nbsp;\r\n                    ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f0.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(121,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setProperty(SiteConfigurationBaseForm.FIELD_CREATE_FINES_USING);
      // /backoffice/siteconfigcircfinepolicies.jsp(121,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f0.setValue(SiteConfigurationBaseForm.RADIO_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_TITLE);
      int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f0.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          out.print(MessageHelper.formatMessage("siteconfigcirc_ReplacementPriceFromTitle"));
          out.write("\r\n                    ");
          int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f0);
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRow\" colspan=\"2\">\r\n                    &nbsp;&nbsp;&nbsp;&nbsp;\r\n                    ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f1.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(129,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setProperty(SiteConfigurationBaseForm.FIELD_CREATE_FINES_USING);
      // /backoffice/siteconfigcircfinepolicies.jsp(129,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f1.setValue(SiteConfigurationBaseForm.RADIO_CREATE_FINES_USING_PURCHASE_PRICE_FROM_COPY);
      int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f1.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          out.print(MessageHelper.formatMessage("siteconfigcirc_PurchasePriceFromCopy"));
          out.write("\r\n                    ");
          int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.reuse(_jspx_th_html_005fradio_005f1);
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\" colspan=\"2\">\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f8 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f8.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f8.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(136,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f8.setProperty(SiteConfigurationBaseForm.FIELD_PRORATE_FINE_AMT_BASED_ON_CPY_COND);
      int _jspx_eval_html_005fcheckbox_005f8 = _jspx_th_html_005fcheckbox_005f8.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f8.doInitBody();
        }
        do {
          out.write("\r\n                        ");
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateTextbookFineAmountBasedOnCopyCondition"));
          out.write("\r\n                    ");
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
      out.write("\r\n                    ");
      if (_jspx_meth_base_005fhelpTag_005f7(_jspx_page_context))
        return;
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\"> \r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f9 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f9.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f9.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(144,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f9.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_TEXTBOOK_CHECKBOX);
      int _jspx_eval_html_005fcheckbox_005f9 = _jspx_th_html_005fcheckbox_005f9.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f9.doInitBody();
        }
        do {
          out.write("&quot;Lost&quot; textbook materials must be returned in a timely fashion to generate a refund&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f8(_jspx_th_html_005fcheckbox_005f9, _jspx_page_context))
            return;
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
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRow\"> \r\n                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook fine becomes non-refundable:&nbsp;\r\n                    ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f1.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(150,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_TEXTBOOK);
      // /backoffice/siteconfigcircfinepolicies.jsp(150,20) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setSize("3");
      // /backoffice/siteconfigcircfinepolicies.jsp(150,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f1.setMaxlength("3");
      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
      if (_jspx_meth_base_005fimageLine_005f3(_jspx_page_context))
        return;
      out.write("</td>\r\n            </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\">");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f10 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f10.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f10.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(157,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f10.setProperty(SiteConfigurationBaseForm.FIELD_CIRC_FINES_REQUIRE_WAIVE_ASSET);
      int _jspx_eval_html_005fcheckbox_005f10 = _jspx_th_html_005fcheckbox_005f10.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f10.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_RequireExplanationWhenWaivingAssetFine") );
          out.write("&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f9(_jspx_th_html_005fcheckbox_005f10, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f10);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f11 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f11.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f11.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(163,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f11.setProperty(SiteConfigurationBaseForm.FIELD_REQUIRE_REFUND_ASSET_FINE_NOTE);
      int _jspx_eval_html_005fcheckbox_005f11 = _jspx_th_html_005fcheckbox_005f11.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f11.doInitBody();
        }
        do {
          out.print(MessageHelper.formatMessage("siteconfigcirc_RequireExplanationWhenIssuingAssetRefunds"));
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f11);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\"> \r\n                ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f12 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f12.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f12.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(168,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f12.setProperty(SiteConfigurationBaseForm.FIELD_AUTO_CREATE_LOST_FINE_ASSET);
      int _jspx_eval_html_005fcheckbox_005f12 = _jspx_th_html_005fcheckbox_005f12.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f12.doInitBody();
        }
        do {
          out.print( MessageHelper.formatMessage("siteconfigcircfinepolicies_AutomaticallyCreateFineForLostAssets") );
          out.write("&nbsp;");
          if (_jspx_meth_base_005fhelpTag_005f10(_jspx_th_html_005fcheckbox_005f12, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f12);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\" colspan=\"2\">\r\n                ");
      out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_CreateAssetFinesUsing"));
      out.write("&nbsp;");
      if (_jspx_meth_base_005fhelpTag_005f11(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\" colspan=\"2\">\r\n                &nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f2.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(179,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setProperty(SiteConfigurationBaseForm.FIELD_ASSET_CREATE_FINES_USING);
      // /backoffice/siteconfigcircfinepolicies.jsp(179,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setValue(SiteConfigurationBaseForm.RADIO_ASSET_CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_ASSET);
      // /backoffice/siteconfigcircfinepolicies.jsp(179,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f2.setOnclick("selectedAssetCreateFinesUsingAssetReplacementPrice()");
      int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
      if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f2.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_ReplacementPriceFromAsset"));
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fradio_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f2);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\" colspan=\"2\">\r\n                &nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
      //  html:radio
      org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f3 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.get(org.apache.struts.taglib.html.RadioTag.class);
      _jspx_th_html_005fradio_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fradio_005f3.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(188,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setProperty(SiteConfigurationBaseForm.FIELD_ASSET_CREATE_FINES_USING);
      // /backoffice/siteconfigcircfinepolicies.jsp(188,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setValue(SiteConfigurationBaseForm.RADIO_ASSET_CREATE_FINES_USING_PURCHASE_PRICE_FROM_ITEM);
      // /backoffice/siteconfigcircfinepolicies.jsp(188,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fradio_005f3.setOnclick("selectedAssetCreateFinesUsingItemPurchasePrice()");
      int _jspx_eval_html_005fradio_005f3 = _jspx_th_html_005fradio_005f3.doStartTag();
      if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fradio_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fradio_005f3.doInitBody();
        }
        do {
          out.write("\r\n                    ");
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_PurchasePriceFromItem"));
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_html_005fradio_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fradio_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fradio_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty_005fonclick.reuse(_jspx_th_html_005fradio_005f3);
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRowBold\" colspan=\"2\">\r\n                ");
 if (form.getAssetCreateFinesUsing() == FineSpecs.CREATE_FINES_USING_REPLACEMENT_PRICE_FROM_RESOURCE) { 
      out.write("\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f13 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f13.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f13.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(197,20) name = disabled type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f13.setDisabled(true);
      // /backoffice/siteconfigcircfinepolicies.jsp(197,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f13.setProperty(SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL);
      int _jspx_eval_html_005fcheckbox_005f13 = _jspx_th_html_005fcheckbox_005f13.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f13.doInitBody();
        }
        do {
          out.write("\r\n                        <span id=\"");
          out.print(SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT);
          out.write("\" style=\"color:gray\">\r\n                            ");
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateAssetFineAmountBasedOnDepreciatedValue"));
          out.write("\r\n                        </span>\r\n                    ");
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled.reuse(_jspx_th_html_005fcheckbox_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty_005fdisabled.reuse(_jspx_th_html_005fcheckbox_005f13);
      out.write("\r\n                ");
 } else { 
      out.write("\r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f14 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f14.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f14.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(203,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f14.setProperty(SiteConfigurationBaseForm.FIELD_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL);
      int _jspx_eval_html_005fcheckbox_005f14 = _jspx_th_html_005fcheckbox_005f14.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f14.doInitBody();
        }
        do {
          out.write("\r\n                        <span id=\"");
          out.print(SiteConfigurationBaseForm.ID_ASSET_PRORATE_FINE_AMT_BASED_ON_DEPR_VAL_TEXT);
          out.write("\">\r\n                            ");
          out.print(MessageHelper.formatMessage("siteconfigcircfinepolicies_ProrateAssetFineAmountBasedOnDepreciatedValue"));
          out.write("\r\n                        </span>\r\n                    ");
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f14);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f14);
      out.write("\r\n                ");
 } 
      out.write("\r\n                ");
      if (_jspx_meth_base_005fhelpTag_005f12(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n        </tr>\r\n        ");
 if(AssetTemplateAEDSpecs.isAllowResourceManagerTextbooks()) { 
      out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\"> \r\n                    ");
      //  html:checkbox
      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f15 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
      _jspx_th_html_005fcheckbox_005f15.setPageContext(_jspx_page_context);
      _jspx_th_html_005fcheckbox_005f15.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(215,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fcheckbox_005f15.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX);
      int _jspx_eval_html_005fcheckbox_005f15 = _jspx_th_html_005fcheckbox_005f15.doStartTag();
      if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_005fcheckbox_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_005fcheckbox_005f15.doInitBody();
        }
        do {
          out.write("&quot;Lost&quot; textbook resources must be returned in a timely fashion to generate a refund&nbsp;\r\n                    ");
          if (_jspx_meth_base_005fhelpTag_005f13(_jspx_th_html_005fcheckbox_005f15, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_005fcheckbox_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_html_005fcheckbox_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f15);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f15);
      out.write("\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRow\"> \r\n                    &nbsp;&nbsp;&nbsp;&nbsp;Calendar days from date &quot;lost&quot; before a paid textbook resource fine becomes non-refundable:&nbsp;\r\n                    ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f2.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(222,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK);
      // /backoffice/siteconfigcircfinepolicies.jsp(222,20) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setSize("3");
      // /backoffice/siteconfigcircfinepolicies.jsp(222,20) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005ftext_005f2.setMaxlength("3");
      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      out.write("\r\n                </td>\r\n            </tr>\r\n        ");
 } else { 
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f3.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(226,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f3.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK_CHECKBOX);
      int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
      if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      out.write("\r\n            ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f4.setParent(null);
      // /backoffice/siteconfigcircfinepolicies.jsp(227,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f4.setProperty(SiteConfigurationBaseForm.FIELD_REFUND_DAYS_RESOURCE_TEXTBOOK);
      int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
      if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      out.write("\r\n        ");
 } 
      out.write("\r\n    </table>\r\n    </td>\r\n</tr>\r\n");
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
    // /backoffice/siteconfigcircfinepolicies.jsp(47,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/siteconfigcircfinepolicies.jsp(47,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f0);
    // /backoffice/siteconfigcircfinepolicies.jsp(51,196) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f0.setHelpFileName("d_calculate_overdue_fines_LM.htm");
    int _jspx_eval_base_005fhelpTag_005f0 = _jspx_th_base_005fhelpTag_005f0.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent(null);
    // /backoffice/siteconfigcircfinepolicies.jsp(55,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/siteconfigcircfinepolicies.jsp(55,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f1);
    // /backoffice/siteconfigcircfinepolicies.jsp(59,207) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f1.setHelpFileName("d_explain_waive_fine.htm");
    int _jspx_eval_base_005fhelpTag_005f1 = _jspx_th_base_005fhelpTag_005f1.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f3);
    // /backoffice/siteconfigcircfinepolicies.jsp(70,167) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f2.setHelpFileName("d_automatically_create_fine_for_lost_LM.htm");
    int _jspx_eval_base_005fhelpTag_005f2 = _jspx_th_base_005fhelpTag_005f2.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f4);
    // /backoffice/siteconfigcircfinepolicies.jsp(75,206) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f3.setHelpFileName("d_lost_library_materials_refund_LM.htm");
    int _jspx_eval_base_005fhelpTag_005f3 = _jspx_th_base_005fhelpTag_005f3.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f3);
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
    // /backoffice/siteconfigcircfinepolicies.jsp(87,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /backoffice/siteconfigcircfinepolicies.jsp(87,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f4 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f5);
    // /backoffice/siteconfigcircfinepolicies.jsp(91,209) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f4.setHelpFileName("d_explain_waive_fine.htm");
    int _jspx_eval_base_005fhelpTag_005f4 = _jspx_th_base_005fhelpTag_005f4.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f5 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f7);
    // /backoffice/siteconfigcircfinepolicies.jsp(107,177) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f5.setHelpFileName("d_automatically_create_fine_for_lost_TM.htm");
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
    // /backoffice/siteconfigcircfinepolicies.jsp(115,113) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f6.setHelpFileName("d_create_fines_TM.htm");
    int _jspx_eval_base_005fhelpTag_005f6 = _jspx_th_base_005fhelpTag_005f6.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f6);
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
    // /backoffice/siteconfigcircfinepolicies.jsp(139,20) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f7.setHelpFileName("d_prorate_fine_TM.htm");
    int _jspx_eval_base_005fhelpTag_005f7 = _jspx_th_base_005fhelpTag_005f7.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f8 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f9);
    // /backoffice/siteconfigcircfinepolicies.jsp(144,212) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f8.setHelpFileName("d_lost_library_materials_refund_TM.htm");
    int _jspx_eval_base_005fhelpTag_005f8 = _jspx_th_base_005fhelpTag_005f8.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f8);
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
    // /backoffice/siteconfigcircfinepolicies.jsp(154,20) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /backoffice/siteconfigcircfinepolicies.jsp(154,20) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f9 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f10);
    // /backoffice/siteconfigcircfinepolicies.jsp(158,203) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f9.setHelpFileName("d_explain_waive_fine.htm");
    int _jspx_eval_base_005fhelpTag_005f9 = _jspx_th_base_005fhelpTag_005f9.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f10 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f10.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f12);
    // /backoffice/siteconfigcircfinepolicies.jsp(168,214) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f10.setHelpFileName("d_automatically_create_fine_for_lost_AM.htm");
    int _jspx_eval_base_005fhelpTag_005f10 = _jspx_th_base_005fhelpTag_005f10.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f10);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f11 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f11.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f11.setParent(null);
    // /backoffice/siteconfigcircfinepolicies.jsp(173,106) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f11.setHelpFileName("d_create_fines_AM.htm");
    int _jspx_eval_base_005fhelpTag_005f11 = _jspx_th_base_005fhelpTag_005f11.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f11);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f12 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f12.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f12.setParent(null);
    // /backoffice/siteconfigcircfinepolicies.jsp(209,16) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f12.setHelpFileName("d_prorate_fine_AM.htm");
    int _jspx_eval_base_005fhelpTag_005f12 = _jspx_th_base_005fhelpTag_005f12.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f12);
    return false;
  }

  private boolean _jspx_meth_base_005fhelpTag_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fcheckbox_005f15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:helpTag
    com.follett.fsc.destiny.client.common.jsptag.HelpTag _jspx_th_base_005fhelpTag_005f13 = (com.follett.fsc.destiny.client.common.jsptag.HelpTag) _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpTag.class);
    _jspx_th_base_005fhelpTag_005f13.setPageContext(_jspx_page_context);
    _jspx_th_base_005fhelpTag_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f15);
    // /backoffice/siteconfigcircfinepolicies.jsp(216,20) name = helpFileName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fhelpTag_005f13.setHelpFileName("d_lost_library_materials_refund_rm.htm");
    int _jspx_eval_base_005fhelpTag_005f13 = _jspx_th_base_005fhelpTag_005f13.doStartTag();
    if (_jspx_th_base_005fhelpTag_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fhelpTag_005fhelpFileName_005fnobody.reuse(_jspx_th_base_005fhelpTag_005f13);
    return false;
  }
}
