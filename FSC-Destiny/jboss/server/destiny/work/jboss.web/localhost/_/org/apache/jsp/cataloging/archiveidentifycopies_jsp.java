package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.commons.marc.stdnum.ISBN;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.session.cataloging.data.ReturnTitleVO;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.entity.ejb3.ReturnsSpecs;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class archiveidentifycopies_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    ArchiveIdentifyCopiesForm form  = (ArchiveIdentifyCopiesForm)request.getAttribute(ArchiveIdentifyCopiesForm.FORM_NAME);
    ArchiveIdentifyCopiesForm cForm = (ArchiveIdentifyCopiesForm)request.getAttribute(ArchiveIdentifyCopiesForm.FORM_NAME);
    ReturnTitleVO titleInfo = (ReturnTitleVO)cForm.getTitleInfo();

      out.write("\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /cataloging/archiveidentifycopies.jsp(33,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /cataloging/archiveidentifycopies.jsp(33,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(cForm);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/archiveidentifycopies.jsp(37,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handlearchiveidentifycopiesform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/archiveidentifycopies.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty( ArchiveIdentifyCopiesForm.PARAM_BIB_ID );
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
          // /cataloging/archiveidentifycopies.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty( ArchiveIdentifyCopiesForm.PARAM_TRANSFER_ID );
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/archiveidentifycopies.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty( ArchiveIdentifyCopiesForm.PARAM_RETURN_ID );
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n\r\n\r\n");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/archiveidentifycopies.jsp(43,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.printerFriendly == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
          if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <table width=\"95%\">\r\n        <tr><td class=\"tdAlignRight\"><a href=\"/cataloging/servlet/handlearchiveidentifycopiesform.do?transferID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.transferID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("&returnID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.returnID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("&printerFriendly=true&bibID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.bibID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" target=\"_blank\" id=\"");
              out.print(GenericForm.ID_PRINTER_FRIENDLY );
              out.write('"');
              out.write('>');
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
              // /cataloging/archiveidentifycopies.jsp(45,258) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
              // /cataloging/archiveidentifycopies.jsp(45,258) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("printable") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              out.write("</a></td></tr>\r\n    </table>\r\n");
              int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
          out.write("\r\n\r\n");

String bgColor = "#FFFFFF";
if(!cForm.isPrinterFriendly()) {
    bgColor = FlipperTag.ROW_GRAY;
}

          out.write("\r\n\r\n");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/archiveidentifycopies.jsp(56,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId(ArchiveIdentifyCopiesForm.TABLE_MAIN );
          // /cataloging/archiveidentifycopies.jsp(56,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor(bgColor );
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td class = \"ColRow\"><span class = \"TableHeading\">\r\n            ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/archiveidentifycopies.jsp(59,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.printerFriendly == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
              if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  out.print(BibType.getBibTypeIcon(true, titleInfo.getBibType(), null, CollectionType.TEXTBOOK, null, null) );
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
              out.write("\r\n            ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/archiveidentifycopies.jsp(62,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.printerFriendly == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
              if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                ");
                  out.print( BibType.getBibTypePrinterFriendlyDescriptions( titleInfo.getBibType(), null, true) );
                  out.write("\r\n            ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
              out.write("\r\n            ");
              out.print( titleInfo.getTitle() );
              out.write("</span><br/>\r\n            ");
              out.print( (StringHelper.isEmptyOrWhitespace(titleInfo.getDisplayableIsbn()) ? "" : MessageHelper.formatMessage("archiveidentifycopies_Isbn0", titleInfo.getDisplayableIsbn()) + "<br/>") );
              out.write("\r\n            ");
              out.print( (StringHelper.isEmptyOrWhitespace(titleInfo.getStateTextbookID()) ? "" : MessageHelper.formatMessage("archiveidentifycopies_StatetextbookId0", titleInfo.getStateTextbookID()) + "<br/>") );
              out.write("\r\n        </td>\r\n        <td>&nbsp;</td>\r\n        <td class=\"tdAlignRight\" valign=\"bottom\">\r\n            ");
              if (_jspx_meth_c_005fif_005f3(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("&nbsp;\r\n        </td>\r\n    </tr>\r\n    ");
 if (cForm.getReturnID() != null && cForm.getStore().isStateContext() ) { 
              out.write("\r\n        <tr>\r\n            <td colspan=\"3\">");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"3\">\r\n                <table id=\"");
              out.print( ArchiveIdentifyCopiesForm.TABLE_DISPOSITION_COUNTS );
              out.write("\" width=\"100%\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">&nbsp;</td>\r\n                        <td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_WithoutBarcodes") );
              out.write("</td>\r\n                        <td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_WithBarcodes") );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Sent") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getCopiesWithoutBarcode() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getCopiesWithBarcode() );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Publisher") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getReceivedPublisher() );
              out.write("</td>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Stock") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getReceivedStock() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getBarcodedStock() );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Rebind") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getReceivedRebind() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getBarcodedRebind() );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Recycle") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getReceivedRecycle() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getBarcodedRecycle() );
              out.write("</td>\r\n                    </tr>\r\n                </table>\r\n            </td>  \r\n        </tr>\r\n    ");
 } else if (cForm.getTransferID() != null) {
              out.write("\r\n        <tr>\r\n            <td colspan=\"3\">");
              if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"3\">\r\n                <table id=\"");
              out.print( ArchiveIdentifyCopiesForm.TABLE_DISPOSITION_COUNTS );
              out.write("\" width=\"100%\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">&nbsp;</td>\r\n                        <td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_WithoutBarcodes") );
              out.write("</td>\r\n                        <td class=\"ColRowBold\" align=\"center\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_WithBarcodes") );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Sent") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getCopiesWithoutBarcode() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getCopiesWithBarcode() );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Lost") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getUnBarcodedLost() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getBarcodedLost() );
              out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Deleted") );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getUnBarcodedDeleted() );
              out.write("</td>\r\n                        <td class=\"ColRow\" align=\"center\">");
              out.print( titleInfo.getBarcodedDeleted() );
              out.write("</td>\r\n                    </tr>\r\n                </table>\r\n            </td>  \r\n        </tr>\r\n    \r\n    ");
} 
              out.write("\r\n    ");
 if  (titleInfo.getCopiesWithBarcode() > 0) { 
              out.write("\r\n        <tr>\r\n            ");
              if (_jspx_meth_base_005fsectionHeading_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </tr>\r\n        <tr>\r\n            <td colspan = \"3\">\r\n                <table width = \"100%\" id=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.constants.TABLE_COPIES}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" cellspacing=\"0\">\r\n                    <tr>\r\n                        <td class = \"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("archiveidentifycopies_Barcode") );
              out.write("</td><td>&nbsp;</td>\r\n                    </tr>\r\n             ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /cataloging/archiveidentifycopies.jsp(158,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fforEach_005f0.setVar("row");
              // /cataloging/archiveidentifycopies.jsp(158,13) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.copyList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
              // /cataloging/archiveidentifycopies.jsp(158,13) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fforEach_005f0.setVarStatus("status");
              int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n                        ");
                    com.follett.fsc.destiny.session.cataloging.data.ReturnCopyVO row = null;
                    synchronized (_jspx_page_context) {
                      row = (com.follett.fsc.destiny.session.cataloging.data.ReturnCopyVO) _jspx_page_context.getAttribute("row", PageContext.PAGE_SCOPE);
                      if (row == null){
                        throw new java.lang.InstantiationException("bean row not found within scope");
                      }
                    }
                    out.write("\r\n                        ");
                    if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("\r\n                        ");
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
                    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                    // /cataloging/archiveidentifycopies.jsp(163,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count % 2 != 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
                    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n                            <tr bgcolor = \"");
                        out.print( FlipperTag.ROW_GRAY );
                        out.write("\">\r\n                        ");
                        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                      return;
                    }
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                    out.write("\r\n                            <td>\r\n                                <span class=\"ColRow\">");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.barcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("</span>\r\n                            </td>\r\n                            <td>\r\n                                ");
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
                    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                    // /cataloging/archiveidentifycopies.jsp(170,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.received == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
                    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n                                    <span class=\"SmallColHeading\">&nbsp;&nbsp;&nbsp;&nbsp;");
                        out.print(MessageHelper.formatMessage("archiveidentifycopies_Received0", cForm.getReturnStatusText(row)) );
                        out.write("\r\n                                    </span>\r\n                                ");
                        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
                      return;
                    }
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
                    out.write("\r\n                                ");
                    //  c:if
                    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
                    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
                    // /cataloging/archiveidentifycopies.jsp(174,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.received == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
                    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n                                    <span class=\"SmallColHeading\">&nbsp;&nbsp;&nbsp;&nbsp;");
                        out.print(MessageHelper.formatMessage("archiveidentifycopies_NotReceived0", cForm.getTransferDeletedText(row)) );
                        out.write("</span>\r\n                                ");
                        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
                      return;
                    }
                    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
                    out.write("\r\n                            </td>\r\n                        </tr>\r\n                    ");
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
                _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
              }
              out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
} 
              out.write("\r\n    <tr>\r\n        <td colspan = \"3\"><br/></td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
          out.write("\r\n\r\n");
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
    // /cataloging/archiveidentifycopies.jsp(35,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/archiveidentifycopies.jsp(71,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.printerFriendly == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                ");
        if (_jspx_meth_base_005fcloseButton_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fcloseButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:closeButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
    _jspx_th_base_005fcloseButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcloseButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fsectionHeading_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:sectionHeading
    com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag _jspx_th_base_005fsectionHeading_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag) _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.SectionHeadingTag.class);
    _jspx_th_base_005fsectionHeading_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsectionHeading_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /cataloging/archiveidentifycopies.jsp(150,12) name = heading type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setHeading("Copies");
    // /cataloging/archiveidentifycopies.jsp(150,12) name = tdContent type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsectionHeading_005f0.setTdContent("colspan = '3' width = '100%'");
    int _jspx_eval_base_005fsectionHeading_005f0 = _jspx_th_base_005fsectionHeading_005f0.doStartTag();
    if (_jspx_th_base_005fsectionHeading_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsectionHeading_005ftdContent_005fheading_005fnobody.reuse(_jspx_th_base_005fsectionHeading_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /cataloging/archiveidentifycopies.jsp(160,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count % 2 == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                            <tr>\r\n                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }
}
