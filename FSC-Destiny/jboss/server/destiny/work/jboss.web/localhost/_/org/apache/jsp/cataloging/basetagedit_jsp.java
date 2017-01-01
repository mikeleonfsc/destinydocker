package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.util.marc.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import java.util.Iterator;
import java.util.List;
import com.follett.fsc.common.StringStringLookup;
import com.follett.fsc.destiny.client.cataloging.data.SubfieldEditContainer;

public final class basetagedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String formName = request.getParameter("formName");
    BaseTagEditForm form = (BaseTagEditForm)request.getAttribute(formName);
    boolean bibTag = "true".equals(request.getParameter("bibTag"));

      out.write("\r\n\r\n    ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /cataloging/basetagedit.jsp(32,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(BaseTagEditForm.FIELD_CHANGED_ADD_SUBFIELD );
      // /cataloging/basetagedit.jsp(32,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setValue("false");
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("\r\n    <table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"2\">\r\n        <tr>\r\n            <td class=\"TableHeading\">");
      out.print((form.isAddingTag() 
                ? MessageHelper.formatMessage("basetagedit_AddingTag01", MarcHelper.getFormattedTagNumber(form.getTagToEdit().getTagNumber()), form.gimmeTagDescription()) 
                    : MessageHelper.formatMessage("basetagedit_EditingTag01", MarcHelper.getFormattedTagNumber(form.getTagToEdit().getTagNumber()), form.gimmeTagDescription())) );
      out.write(" \r\n             </td>\r\n            <td class=\"tdAlignRight\">\r\n                ");
      //  base:showHideTag
      com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
      _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fshowHideTag_005f0.setParent(null);
      // /cataloging/basetagedit.jsp(40,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fshowHideTag_005f0.setId("onSaveHeader");
      int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
      if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    ");
 if(bibTag) { 
          out.write("\r\n                    ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
          // /cataloging/basetagedit.jsp(42,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("ok") );
          // /cataloging/basetagedit.jsp(42,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/ok.gif");
          // /cataloging/basetagedit.jsp(42,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setOnclick("hideElementonSaveHeader()");
          // /cataloging/basetagedit.jsp(42,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(BaseTagEditForm.ID_BUTTON_KEEP );
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n                    ");
 } else { 
          out.write("\r\n                    ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
          // /cataloging/basetagedit.jsp(44,20) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("save") );
          // /cataloging/basetagedit.jsp(44,20) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/save.gif");
          // /cataloging/basetagedit.jsp(44,20) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setOnclick("hideElementonSaveHeader()");
          // /cataloging/basetagedit.jsp(44,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setName(BaseTagEditForm.ID_BUTTON_KEEP );
          int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
          out.write("\r\n                    ");
 } 
          out.write("\r\n                    &nbsp;\r\n                    ");
          //  base:cancelButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
          _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
          // /cataloging/basetagedit.jsp(47,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fcancelButton_005f0.setName(BaseTagEditForm.ID_BUTTON_CANCEL );
          int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
          if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fcancelButton_005fname_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
          out.write("\r\n                ");
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
      out.write("\r\n            </td>\r\n        </tr>\r\n        \r\n        <tr>\r\n            <td colspan=\"2\">\r\n                <table id=\"");
      out.print(BaseTagEditForm.TABLE_SUBFIELDS );
      out.write("\" cellspacing=\"2\" cellpadding=\"2\">\r\n                    <tr id=\"");
      out.print(BaseTagEditForm.HEADING_INDICATOR_INFO);
      out.write("\"><td colspan=\"2\" class=\"TableHeading2\">");
      out.print(MessageHelper.formatMessage("basetagedit_IndicatorInformation"));
      out.write("</td></tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\">\r\n                            ");
      out.print(form.gimmeIndicatorDescription(0));
      out.write(":\r\n                        </td>\r\n                        <td colspan=\"4\">\r\n                            ");
      out.print(JSPHelper.renderDropDown(BaseTagEditForm.FIELD_INDICATOR_1, null, form.gimmeIndicatorDropdown(0), String.valueOf(form.getTagToEdit().getFirstIndicator())) );
      out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold tdAlignRight\">\r\n                            ");
      out.print(form.gimmeIndicatorDescription(1));
      out.write(":\r\n                        </td>\r\n                        <td colspan=\"4\">\r\n                            ");
      out.print(JSPHelper.renderDropDown(BaseTagEditForm.FIELD_INDICATOR_2, null, form.gimmeIndicatorDropdown(1), String.valueOf(form.getTagToEdit().getSecondIndicator())) );
      out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr><td colspan=\"5\" class=\"Instruction\">&nbsp;</td></tr>\r\n                    <tr id=\"");
      out.print(BaseTagEditForm.HEADING_SUBFIELD_INFO);
      out.write("\"><td colspan=\"2\" class=\"TableHeading2\">");
      out.print(MessageHelper.formatMessage("basetagedit_SubfieldInformation"));
      out.write("</td></tr>\r\n                    ");
 
                        Iterator<SubfieldEditContainer> subIter = form.getSubfields().iterator();
                        int offset = 0;
                        while(subIter.hasNext()) {
                            SubfieldEditContainer thisSub = subIter.next();
                    
      out.write("\r\n                    <tr>\r\n                       <td id=\"");
      out.print(BaseTagEditForm.TD_SUBFIELD_DESCRIPTION_PREFIX + offset);
      out.write("\" class=\"ColRowBold tdAlignRight\">");
      out.print(thisSub.description );
      out.write("</td>    \r\n                       <td id=\"");
      out.print(BaseTagEditForm.TD_SUBFIELD_DATA_PREFIX + offset);
      out.write("\">\r\n                           ");
 if(thisSub.control || thisSub.dropdown) { 
      out.write("\r\n                               <span class=\"ColRow\">");
      out.print(ResponseUtils.filter(thisSub.subData) );
      out.write("</span>\r\n                           ");
 } else if(thisSub.optionlist) { 
      out.write("\r\n                              ");
      out.print( JSPHelper.renderDropDown(BaseTagEditForm.FIELD_SUBFIELD_DATA_PREFIX + offset, null, 
                                  form.gimmeDropdownList(thisSub.subCode, thisSub.subData), thisSub.subData, null, null, null));
      out.write("                           \r\n                           ");
 } else  { 
      out.write("\r\n                               <input type=\"text\" value=\"");
      out.print(ResponseUtils.filter(thisSub.subData) );
      out.write("\" name=\"");
      out.print(BaseTagEditForm.FIELD_SUBFIELD_DATA_PREFIX + offset);
      out.write("\" size=\"40\" maxlength=\"9000\"/>\r\n                           ");
 } 
      out.write("\r\n                       </td>\r\n                       <td>\r\n                           ");
 if(subIter.hasNext()) { 
      out.write("\r\n                               ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f2.setParent(null);
      // /cataloging/basetagedit.jsp(94,31) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setAlt(MessageHelper.formatMessage("basetagedit_MoveDown"));
      // /cataloging/basetagedit.jsp(94,31) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setSrc("/icons/general/showmore.gif");
      // /cataloging/basetagedit.jsp(94,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setName(BaseTagEditForm.ID_BUTTON_MOVE_DOWN_PREFIX + offset );
      int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
      out.write("\r\n                           ");
 } else {
      out.write("\r\n                               &nbsp;    \r\n                           ");
 } 
      out.write("\r\n                       </td>\r\n                       <td>\r\n                           ");
 if(offset > 0) { 
      out.write("\r\n                               ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f3.setParent(null);
      // /cataloging/basetagedit.jsp(101,31) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f3.setAlt(MessageHelper.formatMessage("basetagedit_MoveUp"));
      // /cataloging/basetagedit.jsp(101,31) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f3.setSrc("/icons/general/showless.gif");
      // /cataloging/basetagedit.jsp(101,31) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f3.setName(BaseTagEditForm.ID_BUTTON_MOVE_UP_PREFIX + offset );
      int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
      out.write("    \r\n                           ");
 } else {
      out.write("\r\n                               &nbsp;    \r\n                           ");
 } 
      out.write("\r\n                       </td>\r\n                       <td>\r\n                           ");
 if(thisSub.required) { 
      out.write("\r\n                               &nbsp;    \r\n                           ");
 } else {
      out.write("\r\n                           ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f4.setParent(null);
      // /cataloging/basetagedit.jsp(110,27) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f4.setAlt(MessageHelper.formatMessage("basetagedit_Remove"));
      // /cataloging/basetagedit.jsp(110,27) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f4.setSrc("/icons/general/x.gif");
      // /cataloging/basetagedit.jsp(110,27) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f4.setName(BaseTagEditForm.ID_BUTTON_REMOVE_PREFIX + offset );
      int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
      out.write("    \r\n                           ");
 } 
      out.write("\r\n                       </td>\r\n                    </tr>\r\n                    ");
 
                            if(thisSub.dropdown) {
                               MarcRulesTagIndicatorElement tie = form.gimmeSubfieldDropdownList(thisSub.subCode);
                               if(tie != null) {
                                   
      out.write("\r\n                                       <tr>\r\n                                           <td class=\"Instruction tdAlignRight\">");
      out.print(tie.getName() );
      out.write("</td>\r\n                                           <td>");
      out.print( JSPHelper.renderDropDown(BaseTagEditForm.FIELD_CONTROL_PREFIX + tie.getPosition(), null, tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition()))), String.valueOf(thisSub.subData.charAt(tie.getPosition())), null, "Instruction", null));
      out.write("</td>\r\n                                           <td colspan=\"3\">&nbsp;</td>\r\n                                       </tr>\r\n                                   ");

                                   
                               }
                                
                            } else if(thisSub.control) {
                               Iterator<MarcRulesTagIndicatorElement> ctrlIter = form.gimmeControlList().iterator();
                               while(ctrlIter.hasNext()) {
                                   MarcRulesTagIndicatorElement tie = ctrlIter.next();
                                   List<StringStringLookup> lookupList = tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition())));
                                   
      out.write("\r\n                                       <tr>\r\n                                           <td class=\"Instruction tdAlignRight\">");
      out.print(tie.getName() );
      out.write("</td>\r\n                                           <td>");
      out.print( JSPHelper.renderDropDown(BaseTagEditForm.FIELD_CONTROL_PREFIX + tie.getPosition(), null, tie.buildSelectOptionList(String.valueOf(thisSub.subData.charAt(tie.getPosition()))), String.valueOf(thisSub.subData.charAt(tie.getPosition())), null, "Instruction", null));
      out.write("</td>\r\n                                           <td colspan=\"3\">&nbsp;</td>\r\n                                       </tr>\r\n                                   ");

                               }
                            } 
                            offset++;
                        }
                    
      out.write("    \r\n               </table>\r\n            </td>\r\n        </tr>\r\n        \r\n        ");
 if (!form.gimmeSubfieldDropdown().isEmpty()) { 
      out.write("\r\n        <tr><td colspan=\"2\" class=\"Instruction\">&nbsp;</td></tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\" class=\"ColRow\">\r\n            ");
 if(form.getRdaElement() != null) { 
      out.write("\r\n                <script language=\"javascript\"> \r\n                <!-- \r\n                function changeSubfield() { \r\n                   document.");
      out.print(formName);
      out.write('.');
      out.print(BaseTagEditForm.FIELD_CHANGED_ADD_SUBFIELD);
      out.write(".value = \"true\"; \r\n                   document.");
      out.print(formName);
      out.write(".submit(); \r\n                } \r\n                // --> \r\n                </script>            \r\n                \r\n                ");
      out.print(MessageHelper.formatMessage("basetagedit_AddSubfield"));
      out.write(" \r\n                ");
      out.print(JSPHelper.renderDropDown(BaseTagEditForm.FIELD_ADD_SUBFIELD, "changeSubfield()", form.gimmeSubfieldDropdown(), form.getAddSubfield()) );
      out.write(" \r\n                ");
      out.print(MessageHelper.formatMessage("basetagedit_Contents"));
      out.write("\r\n                 \r\n                ");
 if("a".equals(form.getAddSubfield())) { 
      out.write("\r\n                      ");
      out.print( JSPHelper.renderDropDown(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA, null, 
                          form.gimmeDropdownList('a', null), null, null, null, null));
      out.write("                           \r\n                ");
 } else if("b".equals(form.getAddSubfield())) { 
      out.write("\r\n                      ");
      out.print( JSPHelper.renderDropDown(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA, null, 
                          form.gimmeDropdownList('b', null), null, null, null, null));
      out.write("                           \r\n                ");
 } else  { 
      out.write("\r\n                    <input type=\"text\" value=\"\" name=\"");
      out.print(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA);
      out.write("\" size=\"20\" maxlength=\"9000\"/>\r\n                ");
 } 
      out.write("\r\n            ");
 } else { 
      out.write("\r\n                ");
      out.print(MessageHelper.formatMessage("basetagedit_AddSubfield"));
      out.write(" \r\n                ");
      out.print(JSPHelper.renderDropDown(BaseTagEditForm.FIELD_ADD_SUBFIELD, null, form.gimmeSubfieldDropdown(), form.getAddSubfield()) );
      out.write(" \r\n                ");
      out.print(MessageHelper.formatMessage("basetagedit_Contents"));
      out.write("\r\n                <input type=\"text\" value=\"\" name=\"");
      out.print(BaseTagEditForm.FIELD_NEW_SUBFIELD_DATA);
      out.write("\" size=\"20\" maxlength=\"9000\"/>\r\n            ");
 }  
      out.write("\r\n            ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f5 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f5.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f5.setParent(null);
      // /cataloging/basetagedit.jsp(182,12) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f5.setAbsbottom(true);
      // /cataloging/basetagedit.jsp(182,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f5.setAlt( MessageHelper.formatMessage("add") );
      // /cataloging/basetagedit.jsp(182,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f5.setSrc("/buttons/small/add.gif");
      // /cataloging/basetagedit.jsp(182,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f5.setName(BaseTagEditForm.ID_BUTTON_ADD_SUB );
      int _jspx_eval_base_005fgenericButton_005f5 = _jspx_th_base_005fgenericButton_005f5.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f5);
      out.write("\r\n           </td>\r\n        </tr>\r\n        ");
 }  
      out.write("\r\n        \r\n    </table>\r\n");
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
}
