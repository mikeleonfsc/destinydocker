package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.client.common.data.Tab;
import com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm;
import com.follett.fsc.destiny.client.common.PageCalculator;
import com.follett.fsc.destiny.client.common.servlet.BaseListForm;
import java.util.List;
import com.follett.fsc.destiny.entity.ejb3.PatronSpecs;
import com.follett.fsc.destiny.client.common.SitePatronHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;

public final class patronlistselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
    _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    PatronListSelectForm form = (PatronListSelectForm) request.getAttribute(PatronListSelectForm.FORM_NAME);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(request);
    
    String focusControl;
    focusControl = form.getFocus();

      out.write("\r\n\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function trapEnter(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode == 13) {\r\n        document.");
      out.print(PatronListSelectForm.FORM_NAME);
      out.write('.');
      out.print(PatronListSelectForm.FIELD_TRAP_ENTER_PRESSED);
      out.write(".value=true;\r\n      }\r\n      return true;\r\n    }\r\n//-->\r\n</script>\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /backoffice/patronlistselect.jsp(52,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handlepatronlistselectform.do");
      // /backoffice/patronlistselect.jsp(52,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focusControl);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronlistselect.jsp(53,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(PatronListSelectForm.PARAM_PATRONS_LIST_OUT);
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
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronlistselect.jsp(54,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(PatronListSelectForm.FIELD_LAST_SEARCH_STRING);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronlistselect.jsp(55,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(PatronListSelectForm.PARAM_LAST_SITEID);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n    ");
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronlistselect.jsp(56,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty( PatronListSelectForm.FIELD_TRAP_ENTER_PRESSED );
          // /backoffice/patronlistselect.jsp(56,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setValue("false");
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("    \r\n    ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /backoffice/patronlistselect.jsp(57,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(PatronListSelectForm.TABLE_MAIN);
          // /backoffice/patronlistselect.jsp(57,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          // /backoffice/patronlistselect.jsp(57,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n    \r\n        <tr>\r\n            <td colspan=\"2\" class=\"TableHeading\" nowrap>\r\n                    ");
              out.print(MessageHelper.formatMessage("patronlistselect_SelectPatrons") );
              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr><td>\r\n        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" >\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                        ");
              out.print(MessageHelper.formatMessage("patronlistselect_FindPatronRecordsWith"));
              out.write("&nbsp;\r\n                        <span onKeyPress=\"return trapEnter(event);\">\r\n                            ");
              //  html:text
              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(70,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setProperty(PatronListSelectForm.FIELD_SEARCH_STRING );
              // /backoffice/patronlistselect.jsp(70,28) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setSize("20");
              // /backoffice/patronlistselect.jsp(70,28) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005ftext_005f0.setMaxlength("90");
              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005ftext_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
              out.write("&nbsp;");
              out.print(MessageHelper.formatMessage("patronlistselect_In"));
              out.write("\r\n                        </span>                        \r\n                        ");
              //  base:selectPatronByType
              com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag _jspx_th_base_005fselectPatronByType_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag) _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SelectPatronByTypeTag.class);
              _jspx_th_base_005fselectPatronByType_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectPatronByType_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(72,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setName(PatronListSelectForm.FIELD_SEARCH_TYPE );
              // /backoffice/patronlistselect.jsp(72,24) name = selected type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setSelected(form.getSearchType());
              // /backoffice/patronlistselect.jsp(72,24) name = onlyMyPatrons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setOnlyMyPatrons(true);
              // /backoffice/patronlistselect.jsp(72,24) name = siteID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setSiteID(store.getSiteID());
              // /backoffice/patronlistselect.jsp(72,24) name = returnAllEvenIfWeFindAMatchByBarcode type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectPatronByType_005f0.setReturnAllEvenIfWeFindAMatchByBarcode(true);
              int _jspx_eval_base_005fselectPatronByType_005f0 = _jspx_th_base_005fselectPatronByType_005f0.doStartTag();
              if (_jspx_th_base_005fselectPatronByType_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectPatronByType_005fsiteID_005fselected_005freturnAllEvenIfWeFindAMatchByBarcode_005fonlyMyPatrons_005fname_005fnobody.reuse(_jspx_th_base_005fselectPatronByType_005f0);
              out.write("\r\n                        &nbsp;");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(73,30) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/search.gif");
              // /backoffice/patronlistselect.jsp(73,30) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt(MessageHelper.formatMessage("patronlistselect_Search"));
              // /backoffice/patronlistselect.jsp(73,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName( PatronLookupForm.BUTTON_SEARCH );
              // /backoffice/patronlistselect.jsp(73,30) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                    </td>\r\n                </tr>\r\n    ");

                     List patronsList = form.getPatronsList();
                     if (patronsList != null && patronsList.size() > 0) {
    
                         int itemsInList = patronsList.size();
                         int currentPage = PageCalculator.getCurrentPage(form);
                         int itemsToSkip = PageCalculator.getFirstNumberInPage(currentPage, form.gimmeMaxRowsToDisplay(),
                             itemsInList);
                         int itemsToPrint = PageCalculator.getOnePastLastNumberInPage(currentPage,
                             form.gimmeMaxRowsToDisplay(), itemsInList);
    
              out.write("             \r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                    <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                        <tr>\r\n                                            <td class=\"ColRowBold\">\r\n                                                ");
              out.print(form.getSearchSummary());
              out.write("\r\n                                            </td>\r\n                                       </tr>\r\n                                       <tr>\r\n                                            <td class=\"SmallColHeading\">\r\n                                             <a name=\"");
              out.print(BasePatronListForm.ANCHOR );
              out.write("\"></a>\r\n                                                ");
              out.print(form.gimmeCurrentlySelectedCountMessage());
              out.write("\r\n                                            </td>\r\n                                            <td class=\"SmallColHeading tdAlignRight\">\r\n                                               ");
              //  base:pageListOutput
              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
              _jspx_th_base_005fpageListOutput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpageListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(101,47) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpageListOutput_005f0.setFormName( PatronListSelectForm.FORM_NAME );
              int _jspx_eval_base_005fpageListOutput_005f0 = _jspx_th_base_005fpageListOutput_005f0.doStartTag();
              if (_jspx_th_base_005fpageListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f0);
              out.write("\r\n                                            </td>\r\n                                       </tr>\r\n                                    </table>\r\n                                 </td>\r\n                             </tr>\r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                ");
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(109,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty("page");
              // /backoffice/patronlistselect.jsp(109,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setValue( "" + currentPage );
              int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
              if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
              out.write("\r\n                                \r\n                                    <table id=\"");
              out.print(UpdatePatronMergeDuplicatesForm.TABLE_PATRON_INFO_DETAIL);
              out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"0\">\r\n                                        <tr>\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              out.print(MessageHelper.formatMessage("patronlistselect_LastFirstMiddle"));
              out.write("\r\n                                            </td>\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              out.print(MessageHelper.formatMessage("patronlistselect_Barcode"));
              out.write("\r\n                                            </td>\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              out.print(PatronSpecs.getDistrictIDPrompt());
              out.write("\r\n                                            </td>\r\n                                            ");
              //  base:isDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
              _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                                                <td class=\"SmallColHeading\">\r\n                                                    ");
                  out.print(MessageHelper.formatMessage("patronlistselect_Site"));
                  out.write("\r\n                                                </td>\r\n                                            ");
                  int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisDistrictUser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f0);
              out.write("\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              out.print(MessageHelper.formatMessage("patronlistselect_PatronType"));
              out.write("\r\n                                            </td>\r\n                                            <td>&nbsp;</td>\r\n                                        </tr>\r\n                                        ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005foffset_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(132,40) name = offset type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setOffset(""+itemsToSkip);
              // /backoffice/patronlistselect.jsp(132,40) name = length type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setLength(""+(itemsToPrint - itemsToSkip));
              // /backoffice/patronlistselect.jsp(132,40) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
              // /backoffice/patronlistselect.jsp(132,40) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("row");
              // /backoffice/patronlistselect.jsp(132,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName( PatronListSelectForm.FORM_NAME );
              // /backoffice/patronlistselect.jsp(132,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("patronsList");
              // /backoffice/patronlistselect.jsp(132,40) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
                  out.write("\r\n                                            <tr valign=\"top\" ");
                  out.print(( (!form.isPrinterFriendly() && (1 & flipper.intValue())==0)? "bgColor=\""+ FlipperTag.ROW_GRAY +"\"" : "" ));
                  out.write(" >\r\n                                                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronlistselect.jsp(134,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f0.setClazz("ColRow");
                  // /backoffice/patronlistselect.jsp(134,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f0.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
                  if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f0.doInitBody();
                    }
                    do {
                      out.print(form.getPatronName(row));
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
                  out.write("\r\n                                                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronlistselect.jsp(135,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f1.setClazz("ColRow");
                  // /backoffice/patronlistselect.jsp(135,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f1.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
                  if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f1.doInitBody();
                    }
                    do {
                      out.print(SitePatronHelper.getPatronBarcode(store, row, form.getLastSiteID()));
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
                  out.write("\r\n                                                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronlistselect.jsp(136,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f2.setClazz("ColRow");
                  // /backoffice/patronlistselect.jsp(136,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f2.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
                  if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f2.doInitBody();
                    }
                    do {
                      out.print(row.getDistrictID());
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
                  out.write("\r\n                                                ");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f1 = _jspx_th_base_005fisDistrictUser_005f1.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                                    ");
                      //  base:td
                      com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                      _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
                      // /backoffice/patronlistselect.jsp(138,52) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f3.setClazz("ColRow");
                      // /backoffice/patronlistselect.jsp(138,52) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005ftd_005f3.setFiltered(true);
                      int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
                      if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005ftd_005f3.doInitBody();
                        }
                        do {
                          out.print(SitePatronHelper.getPatronSiteName(store, row, form.getLastSiteID()));
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
                      out.write("\r\n                                                 ");
                      int evalDoAfterBody = _jspx_th_base_005fisDistrictUser_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fisDistrictUser_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fisDistrictUser.reuse(_jspx_th_base_005fisDistrictUser_005f1);
                  out.write("\r\n                                                ");
                  //  base:td
                  com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f4 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                  _jspx_th_base_005ftd_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005ftd_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                  // /backoffice/patronlistselect.jsp(140,48) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f4.setClazz("ColRow");
                  // /backoffice/patronlistselect.jsp(140,48) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005ftd_005f4.setFiltered(true);
                  int _jspx_eval_base_005ftd_005f4 = _jspx_th_base_005ftd_005f4.doStartTag();
                  if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005ftd_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005ftd_005f4.doInitBody();
                    }
                    do {
                      out.print(SitePatronHelper.getPatronTypeDescription(store, row, form.getLastSiteID()));
                      int evalDoAfterBody = _jspx_th_base_005ftd_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005ftd_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f4);
                  out.write("\r\n                                                <td class=\"SmallColHeading tdAlignRight\">");
                  out.print(form.getPatronLinks(row));
                  out.write("</td>\r\n                                            </tr>\r\n                                        ");
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
              out.write("\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                             \r\n             \r\n                               <tr>\r\n                                    <td colspan=\"2\" class=\"SmallColHeading tdAlignRight\">\r\n                                       ");
              //  base:pageListOutput
              com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag _jspx_th_base_005fpageListOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag) _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.PageListDisplayTag.class);
              _jspx_th_base_005fpageListOutput_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpageListOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(151,39) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpageListOutput_005f1.setFormName( PatronListSelectForm.FORM_NAME );
              int _jspx_eval_base_005fpageListOutput_005f1 = _jspx_th_base_005fpageListOutput_005f1.doStartTag();
              if (_jspx_th_base_005fpageListOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpageListOutput_005fformName_005fnobody.reuse(_jspx_th_base_005fpageListOutput_005f1);
              out.write("\r\n                                    </td>\r\n                               </tr>\r\n               \r\n                    ");

                    } else {
                    
              out.write("\r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                    <table id=\"searchSummary\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                       <tr>\r\n                                            <td class=\"SmallColHeading\">\r\n                                                ");
              out.print(form.gimmeCurrentlySelectedCountMessage());
              out.write("\r\n                                            </td>\r\n                                       </tr>\r\n                                         \r\n                                    </table>\r\n                                 </td>\r\n                             </tr>\r\n                   \r\n                    ");

                    }
                    
              out.write("                \r\n    \r\n                             <tr>\r\n                                <td colspan=\"2\">\r\n                                    ");
              //  base:selectedPatronListOutput
              com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag _jspx_th_base_005fselectedPatronListOutput_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag) _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.SelectedPatronListOutputTag.class);
              _jspx_th_base_005fselectedPatronListOutput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fselectedPatronListOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(177,36) name = form type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fselectedPatronListOutput_005f0.setForm(form);
              int _jspx_eval_base_005fselectedPatronListOutput_005f0 = _jspx_th_base_005fselectedPatronListOutput_005f0.doStartTag();
              if (_jspx_th_base_005fselectedPatronListOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.reuse(_jspx_th_base_005fselectedPatronListOutput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fselectedPatronListOutput_005fform_005fnobody.reuse(_jspx_th_base_005fselectedPatronListOutput_005f0);
              out.write("\r\n                                </td>\r\n                             </tr>\r\n                             \r\n                             \r\n    \r               \r\n            </table>\r\n            \r\n          </td></tr>\r\n          <tr><td>");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td></tr>\r\n          <tr><td colspan=\"2\" align=\"center\">");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /backoffice/patronlistselect.jsp(187,45) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/ok.gif");
              // /backoffice/patronlistselect.jsp(187,45) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setName(PatronLabelForm.BUTTON_OK );
              // /backoffice/patronlistselect.jsp(187,45) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f1.setAlt(MessageHelper.formatMessage("patronlistselect_Ok"));
              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
              out.write("</td></tr>\r\n    ");
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
      out.write("\r\n\r\n\r\n\r\n");
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
    // /backoffice/patronlistselect.jsp(29,74) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /backoffice/patronlistselect.jsp(186,18) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /backoffice/patronlistselect.jsp(186,18) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    // /backoffice/patronlistselect.jsp(186,18) name = vspace type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setVspace("6");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fvspace_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
