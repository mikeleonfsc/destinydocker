package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.entity.ejb3.ConfigSiteSpecs;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag;
import com.follett.fsc.destiny.entity.ejb3.HelpTicketSpecs;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.util.*;
import java.util.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.entity.ejb3.RoleSpecs;
import com.follett.fsc.destiny.session.backoffice.data.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.common.MessageHelper;

public final class newhelpticket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/newhelpticket.jsp(28,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/newhelpticket.jsp(28,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( NewHelpTicketForm.FORM_NAME );
      // /backoffice/newhelpticket.jsp(28,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.backoffice.servlet.NewHelpTicketForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.backoffice.servlet.NewHelpTicketForm form = null;
      form = (com.follett.fsc.destiny.client.backoffice.servlet.NewHelpTicketForm) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n");

    boolean printerFriendly = form.isPrinterFriendly();

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n  \r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/newhelpticket.jsp(38,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlenewhelpticketform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/newhelpticket.jsp(40,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(NewHelpTicketForm.PARAM_GO_TO_COPY_STATUS);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write("\r\n\r\n    <script language=\"JavaScript\" type=\"text/javascript\">\r\n    <!--\r\n    function submitForm() {    \r\n        document.");
          out.print(NewHelpTicketForm.FORM_NAME);
          out.write('.');
          out.print(NewHelpTicketForm.PARAM_GO_TO_COPY_STATUS);
          out.write(".value = true;           \r\n        document.");
          out.print(NewHelpTicketForm.FORM_NAME);
          out.write(".submit();\r\n        return false;\r\n    }\r\n    function submitAndChangeToServicingTeam() {\r\n        document.");
          out.print(NewHelpTicketForm.FORM_NAME);
          out.write('.');
          out.print(NewHelpTicketForm.FIELD_ASSIGNED_TYPE);
          out.write("[0].checked = true;\r\n        document.");
          out.print(NewHelpTicketForm.FORM_NAME);
          out.write('.');
          out.print(NewHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID);
          out.write(".selectedIndex = 0;\r\n        document.");
          out.print(NewHelpTicketForm.FORM_NAME);
          out.write(".submit();\r\n        return false;\r\n    }\r\n    -->\r\n    </script>\r\n\r\n    ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/newhelpticket.jsp(58,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(NewHelpTicketForm.TABLE_MAIN);
          // /backoffice/newhelpticket.jsp(58,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          // /backoffice/newhelpticket.jsp(58,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td>\r\n                <table id=\"");
              out.print(NewHelpTicketForm.TABLE_LEFT_SIDE);
              out.write("\" width=\"100%\">\r\n                    <tr>\r\n                        <td id=\"");
              out.print(NewHelpTicketForm.ID_ITEM);
              out.write("\" class=\"TableHeading\" colspan=\"3\">\r\n                            *&nbsp;Item\r\n                            <span id=\"showLessItemDetails\" style=\"display:inline\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showless.gif"));
              out.write("' border=\"0\" name=\"showLessItemDetails\" value=\"false\" onclick=\"return showMoreLess(0, 'ItemDetails')\"/>\r\n                            </span>\r\n                            <span id=\"showMoreItemDetails\" style=\"display:none\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showmore.gif"));
              out.write("' border=\"0\" name=\"showMoreItemDetails\" value=\"true\" onclick=\"return showMoreLess(1, 'ItemDetails')\"/>\r\n                            </span> \r\n                            ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(71,28) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(NewHelpTicketForm.BUTTON_SELECT_ASSET);
              // /backoffice/newhelpticket.jsp(71,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/selectplus.gif");
              // /backoffice/newhelpticket.jsp(71,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("select"));
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                        </td>\r\n                        <td class=\"ColRow\">\r\n                            Item submitted for repair ");
              //  html:checkbox
              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(74,54) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setProperty(NewHelpTicketForm.FIELD_SUBMIT_FOR_REPAIR);
              // /backoffice/newhelpticket.jsp(74,54) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fcheckbox_005f0.setTabindex("35");
              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td id=\"");
              out.print(NewHelpTicketForm.ID_ASSET_NAME);
              out.write("\" class=\"ColRowBold\" colspan=\"4\">\r\n                            ");

                                if (form.getTitle() != null) {
                            
              out.write("\r\n                                &nbsp;&nbsp;&nbsp;&nbsp;");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(82,56) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(82,56) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f0.setProperty("title");
              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
              out.write("\r\n                            ");

                                }
                            
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"4\">\r\n                            ");

                                if (form.getTitle() != null) {
                            
              out.write("\r\n                                <div id=\"divItemDetails\" style=\"display:block\">\r\n                                    <table width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td>\r\n                                                <img src=\"/images/icons/general/spacer.gif\" width=\"20\" height=\"1\">\r\n                                            </td>\r\n                                            <td>\r\n                                                <table id=\"");
              out.print(NewHelpTicketForm.TABLE_SITE_NAME);
              out.write("\" width=\"100%\">\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\" class=\"ColRowBold\" align=\"center\" id=\"");
              out.print(NewHelpTicketForm.ID_SITE_NAME);
              out.write("\">\r\n                                                            ");

                                                                if (form.getStore().getSiteID() == ConfigSiteSpecs.SITE_ID_MY_DISTRICT)  {
                                                            
              out.write("\r\n                                                                ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(106,64) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(106,64) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f1.setProperty("siteName");
              int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
              if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
              out.write("\r\n                                                            ");

                                                                }
                                                            
              out.write("\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_DEPARTMENT_LABEL);
              out.write("\">\r\n                                                            Department: \r\n                                                        </td>\r\n                                                        <td class=\"ColRow tdAlignLeft\" id=\"");
              out.print(NewHelpTicketForm.ID_DEPARTMENT);
              out.write("\">\r\n                                                            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(117,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(117,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f2.setProperty("departmentName");
              int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
              if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
              out.write("\r\n                                                        </td>                                \r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_HOME_LOCATION_LABEL);
              out.write("\">\r\n                                                            Home Location:\r\n                                                        </td>\r\n                                                        <td class=\"ColRow\" align=\"left\" id=\"");
              out.print(NewHelpTicketForm.ID_HOME_LOCATION);
              out.write("\">\r\n                                                            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(125,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(125,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f3.setProperty("homeLocation");
              int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
              if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
              out.write("\r\n                                                        </td>                                \r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_CUSTODIAN_LABEL);
              out.write("\">\r\n                                                            Custodian:\r\n                                                        </td>\r\n                                                        <td class=\"ColRow\" align=\"left\" id=\"");
              out.print(NewHelpTicketForm.ID_CUSTODIAN);
              out.write("\">\r\n                                                            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(133,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f4.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(133,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f4.setProperty("custodian");
              int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
              if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
              out.write("\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                            <td>\r\n                                                <img src=\"/images/icons/general/spacer.gif\" width=\"20\" height=\"1\">                        \r\n                                            </td>\r\n                                            <td>\r\n                                                <table id=\"");
              out.print(NewHelpTicketForm.TABLE_BARCODE);
              out.write("\" width=\"100%\">\r\n                                                    <tr>\r\n                                                        <td align=\"right\" class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_COPY_BARCODE_LABEL);
              out.write("\">\r\n                                                            Barcode: \r\n                                                        </td>\r\n                                                        <td align=\"left\" class=\"ColRow\" id=\"");
              out.print(NewHelpTicketForm.ID_COPY_BARCODE);
              out.write("\">\r\n                                                            ");
              out.print(form.buildAssetItemBarcodeLink(false));
              out.write("\r\n                                                        </td>\r\n                                                    </tr>    \r\n                                                    <tr>\r\n                                                        <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_DISTRICT_ID_LABEL);
              out.write("\">\r\n                                                            District ID: \r\n                                                        </td>\r\n                                                        <td align=\"left\" class=\"ColRow\" id=\"");
              out.print(NewHelpTicketForm.ID_DISTRICT_ID);
              out.write("\">\r\n                                                            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(156,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f5.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(156,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f5.setProperty("districtID");
              int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
              if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
              out.write("\r\n                                                        </td>\r\n                                                    </tr>    \r\n                                                    <tr>\r\n                                                        <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_SERIAL_NUMBER_LABEL);
              out.write("\">\r\n                                                            Serial Number:\r\n                                                        </td>\r\n                                                        <td align=\"left\" class=\"ColRow\" id=\"");
              out.print(NewHelpTicketForm.ID_SERIAL_NUMBER);
              out.write("\">\r\n                                                            ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(164,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f6.setName(NewHelpTicketForm.FORM_NAME);
              // /backoffice/newhelpticket.jsp(164,60) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f6.setProperty("serialNumber");
              int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
              if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
              out.write("\r\n                                                        </td>\r\n                                                    </tr>    \r\n                                                </table>                    \r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                            ");

                                }
                            
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\" colspan=\"4\">\r\n                            ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>     \r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"TableHeading\" colspan=\"4\">\r\n                            Issue \r\n                            <span id=\"showLessIssue\" style=\"display:inline\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showless.gif"));
              out.write("' border=\"0\" name=\"showLessIssue\" value=\"false\" onclick=\"return showMoreLess(0, 'Issue')\"/>\r\n                            </span>\r\n                            <span id=\"showMoreIssue\" style=\"display:none\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showmore.gif"));
              out.write("' border=\"0\" name=\"showMoreIssue\" value=\"true\" onclick=\"return showMoreLess(1, 'Issue')\"/>\r\n                            </span>\r\n                        </td>\r\n                    </tr>               \r\n                    <tr>\r\n                        <td colspan=\"4\">\r\n                            <div id=\"divIssue\" style=\"display:block\">\r\n                                <table width=\"100%\" border=\"0\">\r\n                                    <tr>\r\n                                        <td>\r\n                                            <img src=\"/images/icons/general/spacer.gif\" width=\"20\" height=\"1\">\r\n                                        </td>                       \r\n                                        <td colspan=\"3\">\r\n                                            <table id=\"");
              out.print(NewHelpTicketForm.TABLE_PROBLEM);
              out.write("\" width=\"100%\">\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\"colspan=\"1\" id=\"");
              out.print(NewHelpTicketForm.ID_TICKET_NUMBER_LABEL);
              out.write("\">\r\n                                                        Ticket #:\r\n                                                    </td>  \r\n                                                    <td >\r\n                                                        <table id=\"");
              out.print(NewHelpTicketForm.TABLE_TICKET_NUMBER);
              out.write("\">\r\n                                                            <tr>\r\n                                                                <td class=\"ColRow tdAlignLeft\" colspan=\"1\" id=\"");
              out.print(NewHelpTicketForm.ID_TICKET_NUMBER);
              out.write("\"></td>\r\n                                                                <td class=\"ColRowBold tdAlignRight\">\r\n                                                                    <img src=\"/images/icons/general/spacer.gif\" width=\"40\" height=\"1\">\r\n                                                                    Priority:\r\n                                                                </td>\r\n                                                                <td align=\"left\"> \r\n                                                                    ");
              out.print(JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_PRIORITY, null, HelpTicketSpecs.lookupHelpTicketPriorities(), new Long(form.getPriorityID())));
              out.write("\r\n                                                                </td>\r\n                                                                <td class=\"ColRowBold tdAlignRight\">\r\n                                                                    <img src=\"/images/icons/general/spacer.gif\" width=\"5\" height=\"1\">\r\n                                                                    Status:\r\n                                                                </td>\r\n                                                                <td align=\"left\"> \r\n                                                                    ");
              out.print(JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_STATUS, null, HelpTicketSpecs.lookupHelpTicketStatuses(), form.getStatus()));
              out.write("  \r\n                                                                </td>\r\n                                                            </tr>\r\n                                                        </table>\r\n                                                    </td>\r\n                                                </tr>  \r\n                                                <tr>\r\n                                                     <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_SUMMARY_LABEL);
              out.write("\">\r\n                                                        *&nbsp;Summary:\r\n                                                    </td>\r\n                                                    <td class=\"ColRow\" colspan=\"2\" align=\"left\" id=\"");
              out.print(NewHelpTicketForm.ID_SUMMARY);
              out.write("\"> \r\n                                                        <textarea name=\"");
              out.print(NewHelpTicketForm.FIELD_SUMMARY);
              out.write("\" rows=\"2\" cols=\"50\" maxlength=\"255\">");
              out.print(form.getSummary());
              out.write("</textarea>                     \r\n                                                    </td>                               \r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_DETAILS_LABEL);
              out.write("\">\r\n                                                        Details:\r\n                                                    </td>\r\n                                                    <td class=\"ColRow\" align=\"left\" colspan=\"2\" id=\"");
              out.print(NewHelpTicketForm.ID_DETAILS);
              out.write("\">\r\n                                                        <textarea name=\"");
              out.print(NewHelpTicketForm.FIELD_DETAILS);
              out.write("\"rows=\"2\" cols=\"50\" maxlength=\"1000\">");
              out.print(form.getDetails());
              out.write("</textarea>                            \r\n                                                    </td>                                \r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print(NewHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME_LABEL);
              out.write("\">\r\n                                                        Assigned to:\r\n                                                    </td>                                \r\n                                                    <td>\r\n                                                        <table id=\"");
              out.print(NewHelpTicketForm.TABLE_ASSIGNED_TO);
              out.write("\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\">\r\n                                                            <tr>\r\n                                                                <td class=\"ColRow\">\r\n                                                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(253,68) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setProperty(NewHelpTicketForm.FIELD_ASSIGNED_TYPE);
              // /backoffice/newhelpticket.jsp(253,68) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f0.setValue(NewHelpTicketForm.ASSIGNED_TYPE_SERVICING_TEAM);
              int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
              if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                                                        ");

                                                                        if (form.getTitle() == null) {
                                                                        
                  out.write("\r\n                                                                            Servicing team\r\n                                                                        ");
} else if (form.getServicingTeamList() == null || form.getServicingTeamList().size() == 0) {
                                                                    
                  out.write("\r\n                                                                    Servicing team : No servicing teams defined\r\n                                                                        ");

                                                                        } else {
                                                                    
                  out.write("\r\n                                                                                Servicing team : ");
                  out.print(JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_ASSIGNED_SERVICING_TEAM_SITE_JOIN_ID,"submitAndChangeToServicingTeam();" 
                                                                                    , form.getServicingTeamList(), form.getAssignedServicingTeamSiteJoinID()));
                  out.write("\r\n                                                                                ");
                  out.print(JSPHelper.renderDropDown(NewHelpTicketForm.FIELD_SERVICING_TEAM_MEMBER_ID, null, form.getServicingTeamMemberList(), form.getServicingTeamMemberID()));
                  out.write("\r\n                                                                        ");
 } 
                  out.write("  \r\n                                                                    ");
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
              out.write("\r\n                                                                    <br>\r\n                                                                    ");
              //  html:radio
              org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
              _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
              _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(270,68) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setProperty( NewHelpTicketForm.FIELD_ASSIGNED_TYPE );
              // /backoffice/newhelpticket.jsp(270,68) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fradio_005f1.setValue( NewHelpTicketForm.ASSIGNED_TYPE_INDIVIDUAL );
              int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
              if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_005fradio_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                                                        Individual : \r\n                                                                        <span id=\"");
                  out.print(NewHelpTicketForm.ID_ASSIGNED_TO_FIRST_LAST_NAME);
                  out.write("\">\r\n                                                                            ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/newhelpticket.jsp(273,76) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f7.setName( NewHelpTicketForm.FORM_NAME );
                  // /backoffice/newhelpticket.jsp(273,76) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f7.setProperty("displayableAssignedToName");
                  int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
                  out.write("\r\n                                                                            <font color=\"#CC0000\">\r\n                                                                                ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/newhelpticket.jsp(275,80) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f8.setName( NewHelpTicketForm.FORM_NAME );
                  // /backoffice/newhelpticket.jsp(275,80) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f8.setProperty("displayableAssignedToSiteName");
                  int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
                  out.write("\r\n                                                                            </font>\r\n                                                                        </span>&nbsp;                            \r\n                                                                        ");
 if (form.getAssignedPatronID() != null) { 
                  out.write("\r\n                                                                            &nbsp;\r\n                                                                            ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/newhelpticket.jsp(280,76) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setName( NewHelpTicketForm.BUTTON_CLEAR );
                  // /backoffice/newhelpticket.jsp(280,76) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/clear.gif");
                  // /backoffice/newhelpticket.jsp(280,76) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("clear") );
                  int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                  out.write("\r\n                                                                        ");
 } 
                  out.write("\r\n                                                                        ");
                  //  base:genericButton
                  com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                  _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fradio_005f1);
                  // /backoffice/newhelpticket.jsp(282,72) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setName( NewHelpTicketForm.BUTTON_SELECT_ASSIGNED );
                  // /backoffice/newhelpticket.jsp(282,72) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/selectplus.gif");
                  // /backoffice/newhelpticket.jsp(282,72) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("select") );
                  int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                  if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                  out.write("\r\n                                                                    ");
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
              out.write("\r\n                                                                </td>\r\n                                                                <td>\r\n                                                                &nbsp;\r\n                                                                </td>\r\n                                                            </tr>                                        \r\n                                                        </table>\r\n                                                    </td>                                    \r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\">\r\n                                                        Expected Completion:\r\n                                                    </td>                                \r\n                                                    <td class=\"ColRowBold tdAlignleft\">\r\n                                                        ");
              //  base:date
              com.follett.fsc.destiny.client.common.jsptag.DateTag _jspx_th_base_005fdate_005f0 = (com.follett.fsc.destiny.client.common.jsptag.DateTag) _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.DateTag.class);
              _jspx_th_base_005fdate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fdate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(297,56) name = buttonName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setButtonName( NewHelpTicketForm.BUTTON_EXPECTED_COMPLETION );
              // /backoffice/newhelpticket.jsp(297,56) name = fieldName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setFieldName( NewHelpTicketForm.FIELD_COMPLETION_DATE );
              // /backoffice/newhelpticket.jsp(297,56) name = dateValue type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setDateValue(form.getCompletionDate());
              // /backoffice/newhelpticket.jsp(297,56) name = altText type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fdate_005f0.setAltText(NewHelpTicketForm.ALT_EXPECTED_COMPLETION);
              int _jspx_eval_base_005fdate_005f0 = _jspx_th_base_005fdate_005f0.doStartTag();
              if (_jspx_th_base_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fdate_005ffieldName_005fdateValue_005fbuttonName_005faltText_005fnobody.reuse(_jspx_th_base_005fdate_005f0);
              out.write("\r\n                                                    </td>                                \r\n                                                </tr>\r\n                                            </table>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\" colspan=\"4\">\r\n                            ");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                        </td>     \r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"TableHeading\" colspan=\"4\">\r\n                            Requestor Information\r\n                            <span id=\"showLessRequestor\" style=\"display:inline\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showless.gif"));
              out.write("' border=\"0\" name=\"showLessRequestor\" value=\"false\" onclick=\"return showMoreLess(0, 'Requestor')\"/>\r\n                            </span>\r\n                            <span id=\"showMoreRequestor\" style=\"display:none\">\r\n                                <input type=\"image\" src='");
              out.print(lh.getLocalizedImagePath("/icons/general/showmore.gif"));
              out.write("' border=\"0\" name=\"showMoreRequestor\" value=\"true\" onclick=\"return showMoreLess(1, 'Requestor')\"/>\r\n                            </span>\r\n                        </td>\r\n                    </tr>    \r\n                    <tr>\r\n                        <td colspan=\"4\">\r\n                            <div id=\"divRequestor\" style=\"display:block\">\r\n                                <table width=\"100%\" border=\"0\">\r\n                                    <tr>              \r\n                                        <td>\r\n                                            <img src=\"/images/icons/general/spacer.gif\" width=\"20\" height=\"1\">\r\n                                        </td>\r\n                                        <td colspan=\"3\">\r\n                                            <table id=\"");
              out.print( NewHelpTicketForm.TABLE_REQUESTOR );
              out.write("\" width=\"100%\">\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print( NewHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME_LABEL );
              out.write("\">\r\n                                                        *&nbsp;Name:\r\n                                                    </td>\r\n                                                    <td>\r\n                                                        <table id=\"");
              out.print( NewHelpTicketForm.TABLE_REQUESTOR_DETAILS );
              out.write("\" cellspacing=\"0\" border=\"0\" cellpadding=\"0\">\r\n                                                            <tr>\r\n                                                                <td class=\"ColRow tdAlignLeft\" id=\"");
              out.print( NewHelpTicketForm.ID_REQUESTED_FIRST_LAST_NAME );
              out.write("\">\r\n                                                                    ");
 if (StringHelper.isEmpty(form.getFirstLastName())) { 
              out.write("\r\n                                                                        <img src=\"/images/icons/general/spacer.gif\" width=\"60\" height=\"1\">\r\n                                                                    ");
 } 
              out.write("                                                \r\n                                                                    ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(349,68) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f9.setName( NewHelpTicketForm.FORM_NAME );
              // /backoffice/newhelpticket.jsp(349,68) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f9.setProperty("firstLastName");
              int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
              if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
              out.write("\r\n                                                                    <font color=\"#CC0000\">\r\n                                                                        ");
              //  bean:write
              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
              _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
              _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(351,72) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f10.setName( NewHelpTicketForm.FORM_NAME );
              // /backoffice/newhelpticket.jsp(351,72) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_bean_005fwrite_005f10.setProperty("requestedPatronSiteName");
              int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
              if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
              out.write("\r\n                                                                    </font>\r\n                                                                    &nbsp;\r\n                                                                </td>                                \r\n                                                                <td align=\"left\">\r\n                                                                    ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(356,68) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setName( NewHelpTicketForm.BUTTON_SELECT_REQUESTED );
              // /backoffice/newhelpticket.jsp(356,68) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/selectplus.gif");
              // /backoffice/newhelpticket.jsp(356,68) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("select") );
              int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
              out.write("                                                                    \r\n                                                                </td> \r\n                                                                <td>\r\n                                                                &nbsp;\r\n                                                                </td>\r\n                                                            </tr>                                        \r\n                                                        </table>\r\n                                                    </td>\r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print( NewHelpTicketForm.ID_EMAIL_LABEL );
              out.write("\">\r\n                                                        Email:\r\n                                                    </td>\r\n                                                    <td class=\"ColRow tdAlignLeft\" id=\"");
              out.print( NewHelpTicketForm.ID_EMAIL );
              out.write("\">\r\n                                                        ");
              if (_jspx_meth_html_005ftext_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                                    </td>                                \r\n                                                </tr>\r\n                                                <tr>\r\n                                                    <td class=\"ColRowBold tdAlignRight\" id=\"");
              out.print( NewHelpTicketForm.ID_PHONE_LABEL );
              out.write("\">\r\n                                                        Phone:\r\n                                                    </td>\r\n                                                    <td class=\"ColRow tdAlignLeft\" id=\"");
              out.print( NewHelpTicketForm.ID_PHONE );
              out.write("\">\r\n                                                        ");
              if (_jspx_meth_html_005ftext_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                                    </td>                                \r\n                                                </tr>\r\n                                            </table>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            <span class=\"Instruction\" style=\"color: black; font-weight: lighter;\"> * = required field </span>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n            <td>\r\n                <img src=\"/images/icons/general/spacer.gif\" width=\"20\" height=\"1\">\r\n            </td>\r\n            <td valign=\"top\">\r\n                <table id=\"tableButtons\">\r\n                    <tr>\r\n                        <td>\r\n                            ");
              //  base:saveButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
              _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(402,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsaveButton_005f0.setName( NewHelpTicketForm.BUTTON_SAVE );
              int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
              if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsaveButton_005fname_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            ");
              //  base:cancelButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
              _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/newhelpticket.jsp(407,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fcancelButton_005f0.setName( NewHelpTicketForm.BUTTON_CANCEL );
              int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
              if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            &nbsp;\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                        &nbsp;\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            &nbsp;\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n    \r\n    <script language=\"JavaScript\">\r\n    <!--\r\n    function showMoreLess(t, section) {\r\n        var spanLess = document.getElementById('showLess' + section);\r\n        var spanMore = document.getElementById('showMore' + section);\r\n        var div = document.getElementById('div' + section);\r\n        if (t == 0) {\r\n            spanLess.style.display='none';\r\n            spanMore.style.display='inline';\r\n            div.style.display='none';\r\n        } else {\r\n            spanLess.style.display='inline';\r\n            spanMore.style.display='none';\r\n            div.style.display='block';\r\n        }\r\n        return false;\r\n    }\r\n    //-->\r\n    </script>\r\n    \r\n");
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
    // /backoffice/newhelpticket.jsp(36,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/newhelpticket.jsp(179,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/newhelpticket.jsp(179,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/newhelpticket.jsp(314,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /backoffice/newhelpticket.jsp(314,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/newhelpticket.jsp(370,56) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setProperty("email");
    // /backoffice/newhelpticket.jsp(370,56) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setSize("20");
    // /backoffice/newhelpticket.jsp(370,56) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setMaxlength("200");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/newhelpticket.jsp(378,56) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setProperty("phone");
    // /backoffice/newhelpticket.jsp(378,56) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setSize("20");
    // /backoffice/newhelpticket.jsp(378,56) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f1.setMaxlength("30");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }
}
