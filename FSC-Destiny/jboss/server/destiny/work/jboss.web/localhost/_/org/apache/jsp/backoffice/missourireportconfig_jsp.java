package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.data.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.session.common.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.session.backoffice.ejb.MOReportsFacadeSpecs;
import com.follett.fsc.destiny.session.backoffice.data.MOReportsPrefixClientValue;
import com.follett.fsc.destiny.util.CollectionType;

public final class missourireportconfig_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
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

    MissouriReportConfigForm form = (MissouriReportConfigForm)request.getAttribute(MissouriReportConfigForm.FORM_NAME);

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/missourireportconfig.jsp(27,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlemissourireportconfigform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/missourireportconfig.jsp(28,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(MissouriReportConfigForm.TABLE_MAIN);
          // /backoffice/missourireportconfig.jsp(28,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          // /backoffice/missourireportconfig.jsp(28,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getSelectedTab());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(29,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty(MissouriReportConfigForm.FIELD_YEAR_THRESHOLD );
              int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
              if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
              out.write("\r\n    ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(30,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setProperty(MissouriReportConfigForm.FIELD_DEWEY_CATEGORY );
              int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
              if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
              out.write("\r\n    <tr>\r\n        <td colspan=\"2\" class=\"TableHeading\">");
              out.print(MessageHelper.formatMessage("missourireportsummary_MissouriStateReport"));
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\" class=\"TableHeading2\">Configure Call Number Prefixes</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table cellspacing=\"0\" cellpadding=\"4\" width=\"100%\" id=\"");
              out.print(MissouriReportConfigForm.TABLE_PREFIX_LIST);
              out.write("\">\r\n            <tr>\r\n                <td class=\"ColRowBold\" align=\"center\">Prefixes with Dewey</td>\r\n                <td class=\"ColRowBold\" align=\"center\">");
              out.print(MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_FICTION));
              out.write("</td>\r\n                <td class=\"ColRowBold\" align=\"center\">");
              out.print(MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL));
              out.write("</td>\r\n                <td class=\"ColRowBold\" align=\"center\">");
              out.print(MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE));
              out.write("</td>\r\n                <td class=\"ColRowBold\" align=\"center\">");
              out.print(MOReportsFacadeSpecs.getReportColumnHeadingFromType(MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE));
              out.write("</td>\r\n            </tr>\r\n            ");
 for (MOReportsPrefixClientValue prefix : form.getDeweyPrefixes()) {
                   String prefixStr = ResponseUtils.filter(prefix.getPrefix());
                   String encodedStr = prefix.getTextEncodedPrefix();
                   String checkedFicStr = "";
                   String checkedVisStr = "";
                   String checkedRefStr = "";
                   String checkedDontStr = "";
                   switch (prefix.getReportType()) {
                        case MOReportsFacadeSpecs.REPORT_TYPE_FICTION:
                            checkedFicStr = "checked=\"checked\"";
                            break;
                        case MOReportsFacadeSpecs.REPORT_TYPE_VISUAL:
                            checkedVisStr = "checked=\"checked\"";
                            break;
                        case MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE:
                            checkedDontStr = "checked=\"checked\"";
                            break;
                        default:
                            checkedRefStr = "checked=\"checked\"";
                            break;
                   } 
              out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\" align=\"center\">");
              out.print(prefixStr);
              out.write("</td>\r\n                    <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_FICTION);
              out.write('"');
              out.write(' ');
              out.print(checkedFicStr);
              out.write("/></td>\r\n                    <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL);
              out.write('"');
              out.write(' ');
              out.print(checkedVisStr);
              out.write("/></td>\r\n                    <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE);
              out.write('"');
              out.write(' ');
              out.print(checkedRefStr);
              out.write("/></td>\r\n                    <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_DEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE);
              out.write('"');
              out.write(' ');
              out.print(checkedDontStr);
              out.write("/></td>\r\n                </tr>\r\n            ");
 } 
              out.write("\r\n            ");
 if (form.getNonDeweyPrefixes() != null) { 
              out.write("\r\n                <tr>\r\n                    <td colspan=\"5\">");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n                </tr>\r\n                <tr>\r\n                    <td class=\"ColRowBold\" align=\"center\">Prefixes w/o Dewey</td>\r\n                    <td class=\"ColRowBold\" align=\"center\">&nbsp;</td>\r\n                    <td class=\"ColRowBold\" align=\"center\">&nbsp;</td>\r\n                    <td class=\"ColRowBold\" align=\"center\">&nbsp;</td>\r\n                    <td class=\"ColRowBold\" align=\"center\">&nbsp;</td>\r\n                </tr>\r\n                ");
 for (MOReportsPrefixClientValue prefix : form.getNonDeweyPrefixes()) {
                        String prefixStr = ResponseUtils.filter(prefix.getPrefix());
                        String encodedStr = prefix.getTextEncodedPrefix();
                        String checkedFicStr = "";
                        String checkedVisStr = "";
                        String checkedRefStr = "";
                        String checkedDontStr = "";
                        switch (prefix.getReportType()) {
                            case MOReportsFacadeSpecs.REPORT_TYPE_FICTION:
                                checkedFicStr = "checked=\"checked\"";
                                break;
                            case MOReportsFacadeSpecs.REPORT_TYPE_VISUAL:
                                checkedVisStr = "checked=\"checked\"";
                                break;
                            case MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE:
                                checkedRefStr = "checked=\"checked\"";
                                break;
                            default:
                                checkedDontStr = "checked=\"checked\"";
                                break;
                        } 
              out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print(prefixStr);
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_FICTION);
              out.write('"');
              out.write(' ');
              out.print(checkedFicStr);
              out.write("/></td>\r\n                        <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_VISUAL);
              out.write('"');
              out.write(' ');
              out.print(checkedVisStr);
              out.write("/></td>\r\n                        <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_REFERENCE);
              out.write('"');
              out.write(' ');
              out.print(checkedRefStr);
              out.write("/></td>\r\n                        <td class=\"ColRow\" align=\"center\"><input type=\"radio\" name=\"");
              out.print(MissouriReportConfigForm.FIELD_NONDEWEY_PREFIX + encodedStr);
              out.write("\" value=\"");
              out.print(MOReportsFacadeSpecs.REPORT_TYPE_DONOTUSE);
              out.write('"');
              out.write(' ');
              out.print(checkedDontStr);
              out.write("/></td>\r\n                    </tr>\r\n                ");
 } 
              out.write("\r\n            ");
 } // if nonDeweyPrefixes != null 
              out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n    </tr>\r\n    ");
 if (form.getStore().isDistrictUser()) { 
              out.write("\r\n        <tr>\r\n            <td class=\"ColRow\" align=\"center\" colspan=\"2\">These settings will only be applied to new sites.*</td>\r\n        </tr>\r\n    ");
 } 
              out.write("\r\n    <tr>\r\n        <td class=\"ColRow\" align=\"center\" colspan=\"2\">");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(132,54) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(MissouriReportConfigForm.BUTTON_SAVE_SETUP );
              // /backoffice/missourireportconfig.jsp(132,54) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/savesetup.gif");
              // /backoffice/missourireportconfig.jsp(132,54) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt("Save");
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("</td>\r\n    </tr>\r\n    ");
 if (form.getStore().isDistrictUser()) { 
              out.write("\r\n        <tr>\r\n            <td colspan=\"2\">");
              if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"ColRow\" colspan=\"2\" align=\"center\">\r\n                *Apply these settings at\r\n                ");
              //  base:selectSite
              com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag _jspx_th_base_005fselectSite_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag) _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag.class);
              _jspx_th_base_005fselectSite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectSite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(141,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setName(MissouriReportConfigForm.FIELD_APPLY_TO_SITEID );
              // /backoffice/missourireportconfig.jsp(141,16) name = includeAllLibraries type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setIncludeAllLibraries(true);
              // /backoffice/missourireportconfig.jsp(141,16) name = collectionType type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectSite_005f0.setCollectionType(CollectionType.LIBRARY );
              int _jspx_eval_base_005fselectSite_005f0 = _jspx_th_base_005fselectSite_005f0.doStartTag();
              if (_jspx_th_base_005fselectSite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectSite_005fname_005fincludeAllLibraries_005fcollectionType_005fnobody.reuse(_jspx_th_base_005fselectSite_005f0);
              out.write("\r\n                &nbsp;&nbsp;&nbsp;\r\n                ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(143,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName( MissouriReportConfigForm.BUTTON_PUSH);
              // /backoffice/missourireportconfig.jsp(143,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/push.gif");
              // /backoffice/missourireportconfig.jsp(143,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
              // /backoffice/missourireportconfig.jsp(143,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt("Push");
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\"><span class=\"ColRowBold\">Note:</span> <span class=\"ColRow\">Pushing configuration options does not save them as the defaults for the new sites.</span></td>\r\n        </tr>\r\n    ");
 } else { 
              out.write("\r\n        ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /backoffice/missourireportconfig.jsp(150,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f2.setProperty(MissouriReportConfigForm.FIELD_APPLY_TO_SITEID );
              int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
              if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
              out.write("\r\n    ");
 } 
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /backoffice/missourireportconfig.jsp(25,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }
}
