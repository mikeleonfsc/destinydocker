package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.ViewMyListsForm;
import com.follett.fsc.destiny.session.cataloging.ejb.BookListFacadeSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;

public final class viewmylists_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
  
    ViewMyListsForm form = (ViewMyListsForm)request.getAttribute(ViewMyListsForm.FORM_NAME);

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/viewmylists.jsp(24,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleviewmylistsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/viewmylists.jsp(25,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(ViewMyListsForm.FIELD_LIST_ID);
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/viewmylists.jsp(26,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(ViewMyListsForm.EXPAND_OWNER_LIST_ID);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write("\r\n\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/viewmylists.jsp(28,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName( ViewMyListsForm.FORM_NAME );
          // /cataloging/viewmylists.jsp(28,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty( ViewMyListsForm.PARM_CONFIRM_DELETE );
          // /cataloging/viewmylists.jsp(28,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/viewmylists.jsp(29,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            ");
String listName =  ResponseUtils.filter(form.getListName()); 
                  out.write("\r\n            <td valign=\"top\" rowspan=\"3\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td align= \"center\" class=\"ColRowBold\">");
                  out.print( MessageHelper.formatMessage("viewmylists_TheListWillBeDeleted",listName) );
                  out.write("</td>\r\n        </tr> \r\n        <tr>\r\n            <td align=\"center\" class=\"ColRow\">");
                  out.print( MessageHelper.formatMessage("viewmylists_AreYouSureYouWantToDeleteThisList") );
                  out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n                ");
                  if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_base_005fmessageBox_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n            </td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f1);
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
          out.write("\r\n\r\n    ");
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/viewmylists.jsp(46,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(ViewMyListsForm.TABLE_MAIN);
          // /cataloging/viewmylists.jsp(46,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setBorderColor("#C0C0C0");
          // /cataloging/viewmylists.jsp(46,4) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(ViewMyListsForm.ID_TAB);
          // /cataloging/viewmylists.jsp(46,4) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td vAlign=top width=\"100%\" bgColor=#ffffff>\r\n            <table id=\"");
              out.print(ViewMyListsForm.TABLE_MYLISTS);
              out.write("\" cellSpacing=0 cellPadding=3 width=\"100%\" border=0>\r\n                <tr>\r\n                      <td class=\"TableHeading\" valign=\"bottom\" colspan=\"");
              out.print( (form.getNumberOfColumns() - 1) );
              out.write('"');
              out.write('>');
              out.print( MessageHelper.formatMessage("viewmylists_MyLists") );
              out.write("</td>\r\n                    ");
 if (form.canDoAddList()){ 
              out.write("\r\n                       <td class=\"ColRow tdAlignRight\" nowrap>\r\n                         ");
              //  base:genericButton
              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
              _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/viewmylists.jsp(54,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setName(ViewMyListsForm.ID_BUTTON_ADD_LIST);
              // /cataloging/viewmylists.jsp(54,25) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/addlist2.gif");
              // /cataloging/viewmylists.jsp(54,25) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("addList") );
              int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
              if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
              out.write("\r\n                       </td>\r\n                    ");
} else { 
              out.write("\r\n                       <td>&nbsp;</td>\r\n                    ");
} 
              out.write("\r\n                </tr>\r\n                <tr>\r\n                    <td class=SmallColHeading valign=\"bottom\">\r\n                        ");
              //  base:sortHeaderOutput
              com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
              _jspx_th_base_005fsortHeaderOutput_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsortHeaderOutput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/viewmylists.jsp(62,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f0.setDescription( MessageHelper.formatMessage("viewmylists_Name") );
              // /cataloging/viewmylists.jsp(62,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f0.setFormName( ViewMyListsForm.FORM_NAME );
              // /cataloging/viewmylists.jsp(62,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f0.setSort( "" + BookListFacadeSpecs.SORT_NAME );
              // /cataloging/viewmylists.jsp(62,24) name = linkID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f0.setLinkID(ViewMyListsForm.ID_SORT_NAME );
              int _jspx_eval_base_005fsortHeaderOutput_005f0 = _jspx_th_base_005fsortHeaderOutput_005f0.doStartTag();
              if (_jspx_th_base_005fsortHeaderOutput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f0);
              out.write("\r\n                    </td>\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/viewmylists.jsp(64,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName( ViewMyListsForm.FORM_NAME );
              // /cataloging/viewmylists.jsp(64,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("isPublicAndOwnersColumnViewable");
              // /cataloging/viewmylists.jsp(64,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <td class=SmallColHeading valign=\"bottom\">\r\n                            ");
                  //  base:sortHeaderOutput
                  com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
                  _jspx_th_base_005fsortHeaderOutput_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsortHeaderOutput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/viewmylists.jsp(66,28) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f1.setDescription(MessageHelper.formatMessage("viewpubliclists_Owner"));
                  // /cataloging/viewmylists.jsp(66,28) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f1.setFormName( ViewMyListsForm.FORM_NAME );
                  // /cataloging/viewmylists.jsp(66,28) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f1.setSort( "" + BookListFacadeSpecs.SORT_OWNER );
                  // /cataloging/viewmylists.jsp(66,28) name = linkID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f1.setLinkID(ViewMyListsForm.ID_SORT_OWNER );
                  int _jspx_eval_base_005fsortHeaderOutput_005f1 = _jspx_th_base_005fsortHeaderOutput_005f1.doStartTag();
                  if (_jspx_th_base_005fsortHeaderOutput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f1);
                  out.write("\r\n                        </td>                       \r\n                       <td class=SmallColHeading valign=\"bottom\" align=\"center\">\r\n                            ");
                  //  base:sortHeaderOutput
                  com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
                  _jspx_th_base_005fsortHeaderOutput_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsortHeaderOutput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/viewmylists.jsp(71,28) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f2.setDescription( MessageHelper.formatMessage("viewmylists_LocalPublic") );
                  // /cataloging/viewmylists.jsp(71,28) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f2.setFormName( ViewMyListsForm.FORM_NAME );
                  // /cataloging/viewmylists.jsp(71,28) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f2.setSort( "" + BookListFacadeSpecs.SORT_PUBLIC_LIST );
                  // /cataloging/viewmylists.jsp(71,28) name = linkID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f2.setLinkID(ViewMyListsForm.ID_SORT_PUBLIC );
                  int _jspx_eval_base_005fsortHeaderOutput_005f2 = _jspx_th_base_005fsortHeaderOutput_005f2.doStartTag();
                  if (_jspx_th_base_005fsortHeaderOutput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f2);
                  out.write("\r\n                       </td>    \r\n                       <td class=SmallColHeading valign=\"bottom\" align=\"center\">\r\n                            ");
                  //  base:sortHeaderOutput
                  com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
                  _jspx_th_base_005fsortHeaderOutput_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fsortHeaderOutput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /cataloging/viewmylists.jsp(74,28) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f3.setDescription( MessageHelper.formatMessage("viewmylists_DistrictPublic") );
                  // /cataloging/viewmylists.jsp(74,28) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f3.setFormName( ViewMyListsForm.FORM_NAME );
                  // /cataloging/viewmylists.jsp(74,28) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f3.setSort( "" + BookListFacadeSpecs.SORT_PUBLIC_LIST_DISTRICT );
                  // /cataloging/viewmylists.jsp(74,28) name = linkID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fsortHeaderOutput_005f3.setLinkID(ViewMyListsForm.ID_SORT_PUBLIC_DISTRICT );
                  int _jspx_eval_base_005fsortHeaderOutput_005f3 = _jspx_th_base_005fsortHeaderOutput_005f3.doStartTag();
                  if (_jspx_th_base_005fsortHeaderOutput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f3);
                  out.write("\r\n                       </td>    \r\n                    ");
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
              out.write("\r\n                    <td class=SmallColHeading valign=\"bottom\">\r\n                        ");
              //  base:sortHeaderOutput
              com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag _jspx_th_base_005fsortHeaderOutput_005f4 = (com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag) _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SortHeaderOutputTag.class);
              _jspx_th_base_005fsortHeaderOutput_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fsortHeaderOutput_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/viewmylists.jsp(78,24) name = description type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f4.setDescription( MessageHelper.formatMessage("viewmylists_DateLastUpdated") );
              // /cataloging/viewmylists.jsp(78,24) name = formName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f4.setFormName( ViewMyListsForm.FORM_NAME );
              // /cataloging/viewmylists.jsp(78,24) name = sort type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f4.setSort( "" + BookListFacadeSpecs.SORT_DATE_LAST_UPDATED );
              // /cataloging/viewmylists.jsp(78,24) name = dateField type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f4.setDateField(new Boolean(true));
              // /cataloging/viewmylists.jsp(78,24) name = linkID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fsortHeaderOutput_005f4.setLinkID(ViewMyListsForm.ID_SORT_DATELASTUPDATED );
              int _jspx_eval_base_005fsortHeaderOutput_005f4 = _jspx_th_base_005fsortHeaderOutput_005f4.doStartTag();
              if (_jspx_th_base_005fsortHeaderOutput_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fsortHeaderOutput_005fsort_005flinkID_005fformName_005fdescription_005fdateField_005fnobody.reuse(_jspx_th_base_005fsortHeaderOutput_005f4);
              out.write("\r\n                    </td>\r\n                    <td class=SmallColHeading valign=\"bottom\">&nbsp;</td>\r\n                </tr>\r\n\r\n                <!-- data rows -->\r\n                ");
              out.print( form.outputLists() );
              out.write("\r\n                <!-- end data rows -->\r\n            </TABLE>\r\n            </TD>\r\n        </TR>\r\n    ");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
          out.write("                \r\n");
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

  private boolean _jspx_meth_base_005fmessageBox_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:messageBox
    com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
    _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fmessageBox_005f0.setParent(null);
    // /cataloging/viewmylists.jsp(18,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
    return false;
  }
}
