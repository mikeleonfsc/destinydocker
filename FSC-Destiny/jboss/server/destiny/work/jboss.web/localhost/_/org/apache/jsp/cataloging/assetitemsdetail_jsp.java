package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.entity.ejb3.CopySpecs;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetDescriptionDetailForm;
import com.follett.fsc.destiny.client.cataloging.servlet.BaseTitleDetailForm;
import com.follett.fsc.destiny.util.Permission;

public final class assetitemsdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisDistrictUser;

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
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.release();
    _005fjspx_005ftagPool_005fbase_005fisDistrictUser.release();
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
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

    AssetDescriptionDetailForm form = (AssetDescriptionDetailForm)request.getAttribute(AssetDescriptionDetailForm.FORM_NAME);

    int numberOfColumns = form.numberOfColumns();
    int numberOfOnOrderColumns = form.numberOfOnOrderColumns();
    form.setViewingItemDocumentsIcon(false);

      out.write("\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n<!--\r\nfunction changeGroupBy() {\r\n    document.");
      out.print(AssetDescriptionDetailForm.FORM_NAME);
      out.write('.');
      out.print(AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY_CHANGED);
      out.write(".value = \"true\";\r\n    document.");
      out.print(AssetDescriptionDetailForm.FORM_NAME);
      out.write(".submit();\r\n}\r\n\r\n//-->\r\n</script>\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/assetitemsdetail.jsp(33,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleassetdescriptiondetailform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(34,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY_CHANGED);
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
          // /cataloging/assetitemsdetail.jsp(35,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(AssetDescriptionDetailForm.PARAM_BIBID);
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
          // /cataloging/assetitemsdetail.jsp(36,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(AssetDescriptionDetailForm.PARAM_BIB_WALKER_ID);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(37,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(AssetDescriptionDetailForm.PARAM_UNLIMITED_BIBID);
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f4.setProperty(AssetDescriptionDetailForm.PARAM_UNLIMITED_SITEID);
          int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
          if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f5.setProperty(AssetDescriptionDetailForm.PARAM_DELETE_CODE_SITEID );
          int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
          if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
          out.write('\r');
          out.write('\n');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(40,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(AssetDescriptionDetailForm.FORM_NAME);
          // /cataloging/assetitemsdetail.jsp(40,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty(AssetDescriptionDetailForm.PARAM_ACTION);
          // /cataloging/assetitemsdetail.jsp(40,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue( AssetDescriptionDetailForm.ACTION_DELETED_UNLIMITED);
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("\r\n    ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/assetitemsdetail.jsp(42,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
              // /cataloging/assetitemsdetail.jsp(42,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setMessage("Unlimited items will be removed.  Are you sure you want to do this?");
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                ");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /cataloging/assetitemsdetail.jsp(45,16) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonYesName(AssetDescriptionDetailForm.BUTTON_NAME_DELETE_UNLIMITED_YES);
                  // /cataloging/assetitemsdetail.jsp(45,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f0.setButtonNoName(AssetDescriptionDetailForm.BUTTON_NAME_DELETE_UNLIMITED_NO);
                  int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f1);
              out.write('\r');
              out.write('\n');
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
          out.write('\r');
          out.write('\n');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(53,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(AssetDescriptionDetailForm.FORM_NAME);
          // /cataloging/assetitemsdetail.jsp(53,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty(AssetDescriptionDetailForm.PARAM_ACTION);
          // /cataloging/assetitemsdetail.jsp(53,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue( AssetDescriptionDetailForm.ACTION_DELETE_CODES);
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                return;
              out.write("\r\n    ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /cataloging/assetitemsdetail.jsp(55,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
              // /cataloging/assetitemsdetail.jsp(55,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f2.setMessage( form.getConfirmDeleteCodesMessage() );
              int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                ");
                  //  base:yesNo
                  com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
                  _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                  // /cataloging/assetitemsdetail.jsp(58,16) name = buttonYesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f1.setButtonYesName(AssetDescriptionDetailForm.BUTTON_NAME_DELETE_CODES_YES);
                  // /cataloging/assetitemsdetail.jsp(58,16) name = buttonNoName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fyesNo_005f1.setButtonNoName(AssetDescriptionDetailForm.BUTTON_NAME_DELETE_CODES_NO);
                  int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
                  if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fyesNo_005fbuttonYesName_005fbuttonNoName_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
                  out.write("\r\n            </td>\r\n        </tr>\r\n    ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f2);
              out.write('\r');
              out.write('\n');
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
          out.write('\r');
          out.write('\n');
          //  base:outlinedTableAndTabsWithinThere
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/assetitemsdetail.jsp(66,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(AssetDescriptionDetailForm.TABLE_MAIN);
          // /cataloging/assetitemsdetail.jsp(66,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.getSelectedTab());
          // /cataloging/assetitemsdetail.jsp(66,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.getTabs());
          int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <tr>\r\n        <td valign=\"top\" width=\"100%\">\r\n            <table id=\"");
              out.print(AssetDescriptionDetailForm.TABLE_ASSETDETAILS);
              out.write("\" border=\"0\" cellpadding=\"3\" cellspacing=\"0\" width=\"100%\">\r\n                <tr>\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(71,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName(AssetDescriptionDetailForm.FORM_NAME);
              // /cataloging/assetitemsdetail.jsp(71,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty("textbookAsset");
              // /cataloging/assetitemsdetail.jsp(71,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("false");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                    <td class=\"TableHeading\">\r\n                        ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /cataloging/assetitemsdetail.jsp(73,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f0.setName( AssetDescriptionDetailForm.FORM_NAME );
                  // /cataloging/assetitemsdetail.jsp(73,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f0.setProperty("assetDescription");
                  int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                  out.write("\r\n                    </td>\r\n                    ");
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
              out.write("\r\n                    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(76,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(AssetDescriptionDetailForm.FORM_NAME);
              // /cataloging/assetitemsdetail.jsp(76,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty("textbookAsset");
              // /cataloging/assetitemsdetail.jsp(76,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("true");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                       ");
                  out.print(form.renderTextbookAsset() );
                  out.write("\r\n                    ");
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
              out.write("\r\n                    <td class=\"tdAlignRight\">\r\n                        <table border=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                ");
 if (form.canAddCopy()) { 
              out.write("\r\n                                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(84,36) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPermission( Permission.CAT_ASSET_ADD_ASSET_ITEM );
              // /cataloging/assetitemsdetail.jsp(84,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setPage( form.getAddItemLink() );
              // /cataloging/assetitemsdetail.jsp(84,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f0.setId( form.getAddItemID() );
              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f0.doInitBody();
                }
                do {
                  out.write("\r\n                                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/assetitemsdetail.jsp(85,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(85,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setProperty("viewType");
                  // /cataloging/assetitemsdetail.jsp(85,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f4.setValue(String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_ITEMS));
                  int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                      // /cataloging/assetitemsdetail.jsp(86,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/additem.gif");
                      // /cataloging/assetitemsdetail.jsp(86,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f0.setAlt(AssetDescriptionDetailForm.ALT_ADD_ITEM);
                      int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                      if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/assetitemsdetail.jsp(88,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(88,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setProperty("viewType");
                  // /cataloging/assetitemsdetail.jsp(88,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setValue(String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_LICENSES));
                  int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                      // /cataloging/assetitemsdetail.jsp(89,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/buttons/large/addlicense.gif");
                      // /cataloging/assetitemsdetail.jsp(89,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt(AssetDescriptionDetailForm.ALT_ADD_LICENSE);
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/assetitemsdetail.jsp(91,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(91,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setProperty("viewType");
                  // /cataloging/assetitemsdetail.jsp(91,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f6.setValue(String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_MEDIA));
                  int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                      // /cataloging/assetitemsdetail.jsp(92,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setSrc("/buttons/large/addmedia.gif");
                      // /cataloging/assetitemsdetail.jsp(92,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f2.setAlt(AssetDescriptionDetailForm.ALT_ADD_MEDIA);
                      int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                      if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                  // /cataloging/assetitemsdetail.jsp(94,40) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(94,40) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setProperty("viewType");
                  // /cataloging/assetitemsdetail.jsp(94,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f7.setValue(String.valueOf(AssetDescriptionDetailForm.VIEW_TYPE_KIT));
                  int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                                            ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                      // /cataloging/assetitemsdetail.jsp(95,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setSrc("/buttons/large/addkit.gif");
                      // /cataloging/assetitemsdetail.jsp(95,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlt(AssetDescriptionDetailForm.ALT_ADD_KIT);
                      int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                      if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                      out.write("\r\n                                        ");
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
                  out.write("\r\n                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
              out.write("\r\n                                ");
 } 
              out.write("    \r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td class=\"Instruction\" nowrap>\r\n                                ");
 if(form.getPreviousBibID() != null) { 
              out.write("\r\n                                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(104,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setPage( form.getPreviousRecordLink() );
              // /cataloging/assetitemsdetail.jsp(104,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f1.setId( AssetDescriptionDetailForm.ID_LINK_PREVIOUS_ASSET);
              int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
              if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f1.doInitBody();
                }
                do {
                  out.write("\r\n                                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f1);
                  // /cataloging/assetitemsdetail.jsp(105,36) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setAlign("top");
                  // /cataloging/assetitemsdetail.jsp(105,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setSrc("/icons/general/previouslonger.gif");
                  // /cataloging/assetitemsdetail.jsp(105,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setWidth(44);
                  // /cataloging/assetitemsdetail.jsp(105,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setHeight(26);
                  // /cataloging/assetitemsdetail.jsp(105,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f4.setAlt(AssetDescriptionDetailForm.LINK_PREVIOUS_ASSET);
                  int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
                  if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
                  out.write("\r\n                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f1);
              out.write("\r\n                                ");
 } else { 
              out.write("\r\n                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                ");
 } 
              out.write("\r\n                                ");
 if(form.getNextBibID() != null) { 
              out.write("\r\n                                    ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(111,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setPage( form.getNextRecordLink() );
              // /cataloging/assetitemsdetail.jsp(111,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f2.setId( AssetDescriptionDetailForm.ID_LINK_NEXT_ASSET);
              int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
              if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f2.doInitBody();
                }
                do {
                  out.write("\r\n                                    ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
                  // /cataloging/assetitemsdetail.jsp(112,36) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setAlign("top");
                  // /cataloging/assetitemsdetail.jsp(112,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setSrc("/icons/general/nextlonger.gif");
                  // /cataloging/assetitemsdetail.jsp(112,36) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setWidth(44);
                  // /cataloging/assetitemsdetail.jsp(112,36) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setHeight(26);
                  // /cataloging/assetitemsdetail.jsp(112,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f5.setAlt(AssetDescriptionDetailForm.LINK_NEXT_ASSET);
                  int _jspx_eval_base_005fimage_005f5 = _jspx_th_base_005fimage_005f5.doStartTag();
                  if (_jspx_th_base_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f5);
                  out.write("\r\n                                    ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f2);
              out.write("\r\n                                ");
 } else { 
              out.write("\r\n                                    ");
              if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n                                ");
 } 
              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            \r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td align=\"center\">\r\n            ");
              if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                return;
              out.write("\r\n        </td>\r\n    </tr>\r\n");
              //  base:isNotDistrictUser
              com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
              _jspx_th_base_005fisNotDistrictUser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              int _jspx_eval_base_005fisNotDistrictUser_005f0 = _jspx_th_base_005fisNotDistrictUser_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n        <td>\r\n            <table id=\"");
                  out.print(AssetDescriptionDetailForm.TABLE_LOCAL_ITEMS);
                  out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                <tr>\r\n                    <td class=\"TableHeading2\" colspan=\"");
                  out.print( numberOfColumns );
                  out.write("\">\r\n                    ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /cataloging/assetitemsdetail.jsp(138,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setName( AssetDescriptionDetailForm.FORM_NAME );
                  // /cataloging/assetitemsdetail.jsp(138,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f1.setProperty("localCopyHeader");
                  int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
                  out.write("\r\n                    ");
 if (form.getAssetDetailValue().isDigitalMaterial() && form.canRemoveCodes()) { 
                  out.write("\r\n                        &nbsp;&nbsp;&nbsp;&nbsp;\r\n                        ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /cataloging/assetitemsdetail.jsp(141,24) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setPage( form.getDeleteCodesURL(form.getStore().getSiteID()) );
                  // /cataloging/assetitemsdetail.jsp(141,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f3.setId(AssetDescriptionDetailForm.ID_CLEAR_SITE_CODES + form.getStore().getSiteID() );
                  int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
                  if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f3.doInitBody();
                    }
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fimage_005f6(_jspx_th_base_005flink_005f3, _jspx_page_context))
                        return;
                      out.write("      \r\n                        ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f3);
                  out.write("\r\n                    ");
 } 
                  out.write("\r\n                    </td>\r\n                </tr>\r\n                <!-- Only display the group by drop down if we are on the items tab and we have items to group -->\r\n                ");
 if (!form.getAssetDetailValue().isDigitalMaterial() && form.getViewType() == AssetDescriptionDetailForm.VIEW_TYPE_ITEMS 
                    && form.getAssetDetailValue().getLocalItemsTotal() > 0) { 
                  out.write("\r\n                    <tr>\r\n                        <td class=\"TableHeading2\" colspan=\"");
                  out.print( numberOfColumns );
                  out.write("\">\r\n                           Group by: \r\n                           ");
                  //  html:select
                  org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                  _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /cataloging/assetitemsdetail.jsp(154,27) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setProperty(AssetDescriptionDetailForm.FIELD_ITEM_GROUP_BY );
                  // /cataloging/assetitemsdetail.jsp(154,27) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fselect_005f0.setOnchange("changeGroupBy()");
                  int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                  if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fselect_005f0.doInitBody();
                    }
                    do {
                      out.write("\r\n                                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                      // /cataloging/assetitemsdetail.jsp(155,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f0.setValue(String.valueOf(CopySpecs.ITEM_GROUP_BY_NONE));
                      int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
                      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f0.doInitBody();
                        }
                        do {
                          out.write("-- None --");
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
                      out.write("\r\n                                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                      // /cataloging/assetitemsdetail.jsp(156,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f1.setValue(String.valueOf(CopySpecs.ITEM_GROUP_BY_DATE_ACQUIRED));
                      int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
                      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f1.doInitBody();
                        }
                        do {
                          out.write("Date Acquired");
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
                      out.write("\r\n                                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                      // /cataloging/assetitemsdetail.jsp(157,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f2.setValue(String.valueOf(CopySpecs.ITEM_GROUP_BY_DEPARTMENT));
                      int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
                      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f2.doInitBody();
                        }
                        do {
                          out.write("Department");
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
                      out.write("\r\n                                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f3 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                      // /cataloging/assetitemsdetail.jsp(158,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f3.setValue(String.valueOf(CopySpecs.ITEM_GROUP_BY_LOCATION));
                      int _jspx_eval_html_005foption_005f3 = _jspx_th_html_005foption_005f3.doStartTag();
                      if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f3.doInitBody();
                        }
                        do {
                          out.write("Home Location");
                          int evalDoAfterBody = _jspx_th_html_005foption_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f3);
                      out.write("\r\n                                ");
                      //  html:option
                      org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f4 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
                      _jspx_th_html_005foption_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_html_005foption_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
                      // /cataloging/assetitemsdetail.jsp(159,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005foption_005f4.setValue(String.valueOf(CopySpecs.ITEM_GROUP_BY_STATUS));
                      int _jspx_eval_html_005foption_005f4 = _jspx_th_html_005foption_005f4.doStartTag();
                      if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005foption_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005foption_005f4.doInitBody();
                        }
                        do {
                          out.write("Status");
                          int evalDoAfterBody = _jspx_th_html_005foption_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_html_005foption_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_html_005foption_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005foption_005fvalue.reuse(_jspx_th_html_005foption_005f4);
                      out.write("\r\n                           ");
                      int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
                  out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
 } 
                  out.write("\r\n                <!-- Only display the group list if we are on the items tab, we have a group by list, None is not selected -->\r\n                ");
 if (form.getItemGroupBy() == CopySpecs.ITEM_GROUP_BY_NONE 
                    || form.getViewType() != AssetDescriptionDetailForm.VIEW_TYPE_ITEMS
                    || form.getAssetDetailValue().getAssetItemGroupList() == null) {
                        form.outputList(out, form.getAssetDetailValue().getLocalItems(), false); 
                   } else {
                        form.outputGroupedList(out);    
                   }
                
                  out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n    <tr>\r\n        <td align=\"center\">\r\n            ");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005fisNotDistrictUser_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td>\r\n            <table id=\"");
                  out.print(AssetDescriptionDetailForm.TABLE_ON_ORDER_ITEMS);
                  out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                <tr>\r\n                    <td class=\"TableHeading2\" colspan=\"");
                  out.print( numberOfOnOrderColumns );
                  out.write("\">\r\n                    ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /cataloging/assetitemsdetail.jsp(188,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f2.setName( AssetDescriptionDetailForm.FORM_NAME );
                  // /cataloging/assetitemsdetail.jsp(188,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f2.setProperty("onOrderCopyHeader");
                  int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
                  out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
                  out.print( form.outputOnOrderList() );
                  out.write("\r\n                ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
                  // /cataloging/assetitemsdetail.jsp(192,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(192,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setProperty("showCopyLevelHelp");
                  // /cataloging/assetitemsdetail.jsp(192,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f8.setValue("true");
                  int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("       \r\n                    <tr>\r\n                        <td align=\"center\" colspan=\"");
                      out.print( numberOfOnOrderColumns );
                      out.write("\">\r\n                            ");
                      if (_jspx_meth_base_005fimageLine_005f2(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
                        return;
                      out.write("\r\n                        </td>\r\n                    </tr>                         \r\n                    <tr>\r\n                        <td colspan=\"");
                      out.print( numberOfOnOrderColumns );
                      out.write("\">\r\n                            ");
                      //  base:helpIcons
                      com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                      _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                      // /cataloging/assetitemsdetail.jsp(200,28) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput( form.getHelpIcons() );
                      int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                      if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                      out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
                  out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n\r\n    \r\n");
                  int evalDoAfterBody = _jspx_th_base_005fisNotDistrictUser_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotDistrictUser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f0);
              out.write("   \r\n\r\n");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              // /cataloging/assetitemsdetail.jsp(211,0) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f0.setPermission( Permission.CAT_ASSET_SHOW_ALL_ASSETS );
              int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('\r');
                  out.write('\n');
                  if (_jspx_meth_base_005fisNotDistrictUser_005f1(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                    return;
                  out.write("   \r\n    \r\n    <tr>\r\n        <td>\r\n            <A name=\"");
                  out.print(BaseTitleDetailForm.ANCHOR_OFF_SITE_COPIES );
                  out.write("\"></A>\r\n            <table id=\"");
                  out.print(AssetDescriptionDetailForm.TABLE_OFFSITE_ITEMS);
                  out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                <tr>\r\n                    <td class=\"TableHeading2\" colspan=\"");
                  out.print( numberOfColumns );
                  out.write("\">\r\n                    ");
                  if (_jspx_meth_base_005fisNotDistrictUser_005f2(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                    ");
                  //  bean:write
                  org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                  _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  // /cataloging/assetitemsdetail.jsp(229,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f3.setName(AssetDescriptionDetailForm.FORM_NAME);
                  // /cataloging/assetitemsdetail.jsp(229,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_bean_005fwrite_005f3.setProperty("viewTypePluralDisplayable");
                  int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
                  if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
                  out.write("\r\n                    ");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f0 = _jspx_th_base_005fisDistrictUser_005f0.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
 if (form.getAssetDetailValue().isDigitalMaterial() && form.isShowClearAllCodesForDistrict()) { 
                      out.write("\r\n                        &nbsp;&nbsp;&nbsp;&nbsp;\r\n                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f0);
                      // /cataloging/assetitemsdetail.jsp(233,24) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f4.setPage( form.getDeleteCodesURL(null) );
                      // /cataloging/assetitemsdetail.jsp(233,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f4.setId(AssetDescriptionDetailForm.ID_CLEAR_ALL_DISTRICT_CODES );
                      int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f4.doInitBody();
                        }
                        do {
                          out.write("\r\n                            ");
                          if (_jspx_meth_base_005fimage_005f7(_jspx_th_base_005flink_005f4, _jspx_page_context))
                            return;
                          out.write("      \r\n                        ");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage_005fid.reuse(_jspx_th_base_005flink_005f4);
                      out.write("\r\n                    ");
 } 
                      out.write("\r\n                    ");
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
                  out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
 if (form.getAssetDetailValue().isDigitalMaterial()) { 
                  out.write("\r\n                    ");
 form.outputGroupedListForOffsiteDigital(out); 
                  out.write("\r\n                ");
 } else { 
                  out.write("\r\n                    ");
 form.outputList(out, form.getAssetDetailValue().getOffsiteItems(), true); 
                  out.write("\r\n                ");
 } 
                  out.write("\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    \r\n");
                  //  base:isDistrictUser
                  com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag _jspx_th_base_005fisDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsDistrictUserTag.class);
                  _jspx_th_base_005fisDistrictUser_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fisDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                  int _jspx_eval_base_005fisDistrictUser_005f1 = _jspx_th_base_005fisDistrictUser_005f1.doStartTag();
                  if (_jspx_eval_base_005fisDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("   \r\n    <tr>\r\n        <td align=\"center\">\r\n            ");
                      if (_jspx_meth_base_005fimageLine_005f4(_jspx_th_base_005fisDistrictUser_005f1, _jspx_page_context))
                        return;
                      out.write("\r\n        </td>\r\n    </tr>                         \r\n    <tr>\r\n        <td>\r\n            <table id=\"");
                      out.print(AssetDescriptionDetailForm.TABLE_ON_ORDER_ITEMS);
                      out.write("\" cellspacing=\"0\" width=\"100%\" cellpadding=\"4\" border=\"0\">\r\n                <tr>\r\n                    <td class=\"TableHeading2\" colspan=\"");
                      out.print( numberOfOnOrderColumns );
                      out.write("\">\r\n                    ");
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
                      // /cataloging/assetitemsdetail.jsp(260,20) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f4.setName( AssetDescriptionDetailForm.FORM_NAME );
                      // /cataloging/assetitemsdetail.jsp(260,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f4.setProperty("onOrderCopyHeader");
                      int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
                      out.write("\r\n                    </td>\r\n                </tr>\r\n                ");
                      out.print(form.outputOnOrderList() );
                      out.write("\r\n                ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
                      // /cataloging/assetitemsdetail.jsp(264,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setName(AssetDescriptionDetailForm.FORM_NAME);
                      // /cataloging/assetitemsdetail.jsp(264,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setProperty("showCopyLevelHelp");
                      // /cataloging/assetitemsdetail.jsp(264,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setValue("true");
                      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("       \r\n                    <tr>\r\n                        <td align=\"center\" colspan=\"");
                          out.print( numberOfOnOrderColumns );
                          out.write("\">\r\n                            ");
                          if (_jspx_meth_base_005fimageLine_005f5(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                            return;
                          out.write("\r\n                        </td>\r\n                    </tr>                         \r\n                    <tr>\r\n                        <td colspan=\"");
                          out.print( numberOfOnOrderColumns );
                          out.write("\">\r\n                            ");
                          //  base:helpIcons
                          com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f1 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                          _jspx_th_base_005fhelpIcons_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fhelpIcons_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /cataloging/assetitemsdetail.jsp(272,28) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fhelpIcons_005f1.setButtonsToOutput( form.getHelpIcons() );
                          int _jspx_eval_base_005fhelpIcons_005f1 = _jspx_th_base_005fhelpIcons_005f1.doStartTag();
                          if (_jspx_th_base_005fhelpIcons_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f1);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f1);
                          out.write("\r\n                        </td>\r\n                    </tr>\r\n                ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                      out.write("                \r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
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
                  out.write("\r\n\r\n");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermission.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
              out.write("\r\n\r\n");
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
    // /cataloging/assetitemsdetail.jsp(15,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /cataloging/assetitemsdetail.jsp(41,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(1);
    // /cataloging/assetitemsdetail.jsp(41,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /cataloging/assetitemsdetail.jsp(54,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(1);
    // /cataloging/assetitemsdetail.jsp(54,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(3);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/assetitemsdetail.jsp(108,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(44);
    // /cataloging/assetitemsdetail.jsp(108,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/assetitemsdetail.jsp(115,36) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(44);
    // /cataloging/assetitemsdetail.jsp(115,36) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(26);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    // /cataloging/assetitemsdetail.jsp(129,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(129,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f0.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f6 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
    // /cataloging/assetitemsdetail.jsp(143,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f6.setSrc("/buttons/large/clearcodes.gif");
    // /cataloging/assetitemsdetail.jsp(143,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f6.setAlt("Clear Redemption Codes");
    int _jspx_eval_base_005fimage_005f6 = _jspx_th_base_005fimage_005f6.doStartTag();
    if (_jspx_th_base_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f6);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisNotDistrictUser_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f0);
    // /cataloging/assetitemsdetail.jsp(179,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(179,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f1.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f1 = _jspx_th_base_005fimageLine_005f1.doStartTag();
    if (_jspx_th_base_005fimageLine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    // /cataloging/assetitemsdetail.jsp(195,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(195,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f2.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f2 = _jspx_th_base_005fimageLine_005f2.doStartTag();
    if (_jspx_th_base_005fimageLine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fisNotDistrictUser_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:isNotDistrictUser
    com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
    _jspx_th_base_005fisNotDistrictUser_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fisNotDistrictUser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    int _jspx_eval_base_005fisNotDistrictUser_005f1 = _jspx_th_base_005fisNotDistrictUser_005f1.doStartTag();
    if (_jspx_eval_base_005fisNotDistrictUser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \r\n    <tr>\r\n        <td align=\"center\">\r\n            ");
        if (_jspx_meth_base_005fimageLine_005f3(_jspx_th_base_005fisNotDistrictUser_005f1, _jspx_page_context))
          return true;
        out.write("\r\n        </td>\r\n    </tr>                         \r\n");
        int evalDoAfterBody = _jspx_th_base_005fisNotDistrictUser_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fisNotDistrictUser_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisNotDistrictUser_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisNotDistrictUser_005f1);
    // /cataloging/assetitemsdetail.jsp(215,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(215,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f3.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f3 = _jspx_th_base_005fimageLine_005f3.doStartTag();
    if (_jspx_th_base_005fimageLine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fisNotDistrictUser_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:isNotDistrictUser
    com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag _jspx_th_base_005fisNotDistrictUser_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag) _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotDistrictUserTag.class);
    _jspx_th_base_005fisNotDistrictUser_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fisNotDistrictUser_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    int _jspx_eval_base_005fisNotDistrictUser_005f2 = _jspx_th_base_005fisNotDistrictUser_005f2.doStartTag();
    if (_jspx_eval_base_005fisNotDistrictUser_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        Off-site \r\n                    ");
        int evalDoAfterBody = _jspx_th_base_005fisNotDistrictUser_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fisNotDistrictUser_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fisNotDistrictUser.reuse(_jspx_th_base_005fisNotDistrictUser_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f7 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
    // /cataloging/assetitemsdetail.jsp(234,28) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setSrc("/buttons/large/clearcodes.gif");
    // /cataloging/assetitemsdetail.jsp(234,28) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f7.setAlt("Clear all Redemption Codes");
    int _jspx_eval_base_005fimage_005f7 = _jspx_th_base_005fimage_005f7.doStartTag();
    if (_jspx_th_base_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fisDistrictUser_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fisDistrictUser_005f1);
    // /cataloging/assetitemsdetail.jsp(252,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(252,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f4.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f4 = _jspx_th_base_005fimageLine_005f4.doStartTag();
    if (_jspx_th_base_005fimageLine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f5 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f5.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /cataloging/assetitemsdetail.jsp(267,28) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setHeight("1");
    // /cataloging/assetitemsdetail.jsp(267,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageLine_005f5.setWidth("100%");
    int _jspx_eval_base_005fimageLine_005f5 = _jspx_th_base_005fimageLine_005f5.doStartTag();
    if (_jspx_th_base_005fimageLine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageLine_005f5);
    return false;
  }
}
