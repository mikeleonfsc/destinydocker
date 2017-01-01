package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import com.follett.fsc.destiny.session.common.*;
import com.follett.fsc.destiny.entity.ejb3.PatronSpecs;
import com.follett.fsc.destiny.util.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.jsptag.SelectSiteTag;
import com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag;
import com.follett.fsc.destiny.entity.ejb3.EmailSpecs;

public final class editpatrongeneralinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.release();
    _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.release();
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(25,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /backoffice/editpatrongeneralinfo.jsp(25,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(25,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("com.follett.fsc.destiny.client.backoffice.servlet.EditPatronGeneralInfoForm");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      com.follett.fsc.destiny.client.backoffice.servlet.EditPatronGeneralInfoForm form = null;
      form = (com.follett.fsc.destiny.client.backoffice.servlet.EditPatronGeneralInfoForm) _jspx_page_context.findAttribute("form");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(26,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("gendersID");
      // /backoffice/editpatrongeneralinfo.jsp(26,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(26,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("genders");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object gendersID = null;
      gendersID = (java.lang.Object) _jspx_page_context.findAttribute("gendersID");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f2 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f2.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f2.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(27,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setId("patronTypesID");
      // /backoffice/editpatrongeneralinfo.jsp(27,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(27,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f2.setProperty("patronTypes");
      int _jspx_eval_bean_005fdefine_005f2 = _jspx_th_bean_005fdefine_005f2.doStartTag();
      if (_jspx_th_bean_005fdefine_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f2);
      java.lang.Object patronTypesID = null;
      patronTypesID = (java.lang.Object) _jspx_page_context.findAttribute("patronTypesID");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f3 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f3.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f3.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(28,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setId("patronStatusesID");
      // /backoffice/editpatrongeneralinfo.jsp(28,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(28,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f3.setProperty("patronStatuses");
      int _jspx_eval_bean_005fdefine_005f3 = _jspx_th_bean_005fdefine_005f3.doStartTag();
      if (_jspx_th_bean_005fdefine_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f3);
      java.lang.Object patronStatusesID = null;
      patronStatusesID = (java.lang.Object) _jspx_page_context.findAttribute("patronStatusesID");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f4 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f4.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f4.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(29,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setId("userLevelsList");
      // /backoffice/editpatrongeneralinfo.jsp(29,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(29,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f4.setProperty("userLevels");
      int _jspx_eval_bean_005fdefine_005f4 = _jspx_th_bean_005fdefine_005f4.doStartTag();
      if (_jspx_th_bean_005fdefine_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f4);
      java.lang.Object userLevelsList = null;
      userLevelsList = (java.lang.Object) _jspx_page_context.findAttribute("userLevelsList");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f5 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f5.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f5.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(30,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setId("manageReadingPathsOptions");
      // /backoffice/editpatrongeneralinfo.jsp(30,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setName( EditPatronGeneralInfoForm.FORM_NAME );
      // /backoffice/editpatrongeneralinfo.jsp(30,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f5.setProperty("manageReadingPathsOptions");
      int _jspx_eval_bean_005fdefine_005f5 = _jspx_th_bean_005fdefine_005f5.doStartTag();
      if (_jspx_th_bean_005fdefine_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f5);
      java.lang.Object manageReadingPathsOptions = null;
      manageReadingPathsOptions = (java.lang.Object) _jspx_page_context.findAttribute("manageReadingPathsOptions");
      out.write("\r\n\r\n");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(32,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
          // /backoffice/editpatrongeneralinfo.jsp(33,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName( EditPatronGeneralInfoForm.FORM_NAME );
          // /backoffice/editpatrongeneralinfo.jsp(33,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty( EditPatronGeneralInfoForm.FIELD_SHOW_DUPLICATE_BARCODE_MESSAGE );
          // /backoffice/editpatrongeneralinfo.jsp(33,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td>");
              if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n            <td>                                    \r\n                ");
              //  base:patronSearchResultDisplay
              com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag _jspx_th_base_005fpatronSearchResultDisplay_005f0 = (com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag) _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag.class);
              _jspx_th_base_005fpatronSearchResultDisplay_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fpatronSearchResultDisplay_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(37,16) name = patronValue type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronSearchResultDisplay_005f0.setPatronValue(form.getDuplicateBarcodePatronValue() );
              // /backoffice/editpatrongeneralinfo.jsp(37,16) name = printerFriendly type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronSearchResultDisplay_005f0.setPrinterFriendly(false);
              // /backoffice/editpatrongeneralinfo.jsp(37,16) name = displayButtons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fpatronSearchResultDisplay_005f0.setDisplayButtons(false);
              int _jspx_eval_base_005fpatronSearchResultDisplay_005f0 = _jspx_th_base_005fpatronSearchResultDisplay_005f0.doStartTag();
              if (_jspx_th_base_005fpatronSearchResultDisplay_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f0);
              out.write("\r\n            </td>\r\n        </tr>\r\n    ");
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
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("            \r\n\r\n\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function trapEnter(e) {\r\n      var whichCode = (window.Event) ? e.which : e.keyCode;\r\n      if (e.keyCode == 13) {\r\n        return false;\r\n      }\r\n      return true;\r\n    }\r\n//-->\r\n</script>\r\n\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );

    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

    String focus = "";
    if(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL) {
        if((EditPatronGeneralInfoForm.ACTION_EDIT_SITE.equals(form.getAction()) | EditPatronGeneralInfoForm.ACTION_ATTACH.equals(form.getAction())) && (form.getAssignNextBarcode().equals(EditPatronGeneralInfoForm.RADIO_EXPLICIT_BARCODE))) {
            focus = EditPatronGeneralInfoForm.FIELD_BARCODE;
        } else {
            focus = EditPatronGeneralInfoForm.FIELD_LAST_NAME;
        }
    } else if (form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_ADDRESS) {
        focus = EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE1;
    } 

      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f1.setParent(null);
      // /backoffice/editpatrongeneralinfo.jsp(75,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setName(EditPatronGeneralInfoForm.FORM_NAME);
      // /backoffice/editpatrongeneralinfo.jsp(75,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setProperty("patronPresent");
      // /backoffice/editpatrongeneralinfo.jsp(75,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f1.setValue("true");
      int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
      if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  base:form
          com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
          _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
          // /backoffice/editpatrongeneralinfo.jsp(76,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fform_005f0.setAction("/backoffice/servlet/handleeditpatrongeneralinfoform.do");
          // /backoffice/editpatrongeneralinfo.jsp(76,0) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fform_005f0.setEnctype("multipart/form-data");
          // /backoffice/editpatrongeneralinfo.jsp(76,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fform_005f0.setFocus( focus );
          int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
          if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(77,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setName( EditPatronGeneralInfoForm.FORM_NAME );
              // /backoffice/editpatrongeneralinfo.jsp(77,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setProperty( EditPatronGeneralInfoForm.FIELD_SHOW_DELETE_MESSAGE );
              // /backoffice/editpatrongeneralinfo.jsp(77,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f2.setValue("true");
              int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
              if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                  // /backoffice/editpatrongeneralinfo.jsp(78,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
                  // /backoffice/editpatrongeneralinfo.jsp(78,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f1.setMessage(form.gimmeDisplayableDeleteMessage());
                  int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr valign=\"top\">\r\n                <td class=\"Error\" colspan=\"2\">\r\n                    ");
                      //  bean:size
                      java.lang.Integer numMsgs = null;
                      org.apache.struts.taglib.bean.SizeTag _jspx_th_bean_005fsize_005f0 = (org.apache.struts.taglib.bean.SizeTag) _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.SizeTag.class);
                      _jspx_th_bean_005fsize_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fsize_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                      // /backoffice/editpatrongeneralinfo.jsp(81,20) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setId("numMsgs");
                      // /backoffice/editpatrongeneralinfo.jsp(81,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setName( EditPatronGeneralInfoForm.FORM_NAME );
                      // /backoffice/editpatrongeneralinfo.jsp(81,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fsize_005f0.setProperty("confirmationMessageList");
                      int _jspx_eval_bean_005fsize_005f0 = _jspx_th_bean_005fsize_005f0.doStartTag();
                      numMsgs = (java.lang.Integer) _jspx_page_context.findAttribute("numMsgs");
                      if (_jspx_th_bean_005fsize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
                        return;
                      }
                      numMsgs = (java.lang.Integer) _jspx_page_context.findAttribute("numMsgs");
                      _005fjspx_005ftagPool_005fbean_005fsize_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fsize_005f0);
                      out.write("\r\n                    ");
                      //  logic:notEqual
                      org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
                      _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                      // /backoffice/editpatrongeneralinfo.jsp(82,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f0.setName("numMsgs");
                      // /backoffice/editpatrongeneralinfo.jsp(82,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fnotEqual_005f0.setValue("0");
                      int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
                      if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(83,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f3.setName( EditPatronGeneralInfoForm.FORM_NAME );
                          // /backoffice/editpatrongeneralinfo.jsp(83,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f3.setProperty( EditPatronGeneralInfoForm.PARAM_CAN_DELETE_PATRON );
                          // /backoffice/editpatrongeneralinfo.jsp(83,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f3.setValue("true");
                          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_TheFollowingActionsWillBeTakenIfThisPatronIsRemove") );
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
                          out.write("\r\n                            <ul>\r\n                            ");
                          //  logic:iterate
                          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(85,28) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f0.setId("messages");
                          // /backoffice/editpatrongeneralinfo.jsp(85,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f0.setName( EditPatronGeneralInfoForm.FORM_NAME );
                          // /backoffice/editpatrongeneralinfo.jsp(85,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fiterate_005f0.setProperty("confirmationMessageList");
                          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object messages = null;
                            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_logic_005fiterate_005f0.doInitBody();
                            }
                            messages = (java.lang.Object) _jspx_page_context.findAttribute("messages");
                            do {
                              out.write("\r\n                                <li>");
                              out.print( messages);
                              out.write("</li>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                              messages = (java.lang.Object) _jspx_page_context.findAttribute("messages");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                          out.write("\r\n                            \r\n                        </ul>\r\n                    ");
                          int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fnotEqual_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
                      out.write("\r\n                </td>\r\n            </tr>\r\n            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                      // /backoffice/editpatrongeneralinfo.jsp(93,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setName( EditPatronGeneralInfoForm.FORM_NAME );
                      // /backoffice/editpatrongeneralinfo.jsp(93,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setProperty("showNeedReassignPreferred");
                      // /backoffice/editpatrongeneralinfo.jsp(93,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setValue("true");
                      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td>&nbsp;</td>\r\n                ");
                          //  bean:define
                          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f6 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
                          _jspx_th_bean_005fdefine_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fdefine_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /backoffice/editpatrongeneralinfo.jsp(96,16) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f6.setId("associatedList");
                          // /backoffice/editpatrongeneralinfo.jsp(96,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f6.setName( EditPatronGeneralInfoForm.FORM_NAME );
                          // /backoffice/editpatrongeneralinfo.jsp(96,16) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fdefine_005f6.setProperty("reassignPrimaryPatronList");
                          int _jspx_eval_bean_005fdefine_005f6 = _jspx_th_bean_005fdefine_005f6.doStartTag();
                          if (_jspx_th_bean_005fdefine_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f6);
                          java.lang.Object associatedList = null;
                          associatedList = (java.lang.Object) _jspx_page_context.findAttribute("associatedList");
                          out.write("\r\n                <td class=\"ColRowBold\" align=\"center\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_YouMustSelectANewPrimarySiteForThisPatron") );
                          //  html:select
                          org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                          _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /backoffice/editpatrongeneralinfo.jsp(97,155) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fselect_005f0.setProperty( EditPatronGeneralInfoForm.FIELD_REASSIGN_TO_ID );
                          int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                          if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f0.doInitBody();
                            }
                            do {
                              out.write("\r\n                        ");
                              if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                              return;
                              out.write("\r\n                    ");
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
                          out.write("\r\n                </td>\r\n            </tr>\r\n            ");
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
                      out.write("\r\n            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                      // /backoffice/editpatrongeneralinfo.jsp(103,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setName( EditPatronGeneralInfoForm.FORM_NAME );
                      // /backoffice/editpatrongeneralinfo.jsp(103,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setProperty( EditPatronGeneralInfoForm.PARAM_CAN_DELETE_PATRON );
                      // /backoffice/editpatrongeneralinfo.jsp(103,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f5.setValue("true");
                      int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_AreYouSureYouWantToRemoveThisSiteAssociation") );
                          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
                          if (_jspx_meth_base_005fyesNo_005f0(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                            return;
                          out.write("\r\n                </td>\r\n            </tr>\r\n            ");
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
                      out.write("\r\n        ");
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
                  out.write("\r\n    \r\n    ");
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
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(116,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName( EditPatronGeneralInfoForm.FORM_NAME );
              // /backoffice/editpatrongeneralinfo.jsp(116,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty( EditPatronGeneralInfoForm.FIELD_SHOW_TRANSFER_MESSAGE );
              // /backoffice/editpatrongeneralinfo.jsp(116,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("true");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /backoffice/editpatrongeneralinfo.jsp(117,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f2.setShowWarningIcon(true);
                  // /backoffice/editpatrongeneralinfo.jsp(117,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f2.setMessage(form.gimmeDisplayableTransferMessage());
                  int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                      // /backoffice/editpatrongeneralinfo.jsp(118,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setName( EditPatronGeneralInfoForm.FORM_NAME );
                      // /backoffice/editpatrongeneralinfo.jsp(118,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setProperty( EditPatronGeneralInfoForm.PARAM_CAN_TRANSFER_PATRON );
                      // /backoffice/editpatrongeneralinfo.jsp(118,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f7.setValue("true");
                      int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td align=\"center\" class=\"ColRow\" colspan=\"2\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_AreYouSureYouWantToTransferThisPatron") );
                          out.write("</td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    ");
                          if (_jspx_meth_base_005fyesNo_005f1(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
                            return;
                          out.write("\r\n                </td>\r\n            </tr>\r\n            ");
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
                      out.write("\r\n        ");
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
                  out.write("\r\n    \r\n    ");
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
              out.write("\r\n    \r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(132,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setName( EditPatronGeneralInfoForm.FORM_NAME );
              // /backoffice/editpatrongeneralinfo.jsp(132,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setProperty( EditPatronGeneralInfoForm.FIELD_SHOW_REPLACEMENT_MESSAGE );
              // /backoffice/editpatrongeneralinfo.jsp(132,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f8.setValue("true");
              int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
              if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                  // /backoffice/editpatrongeneralinfo.jsp(133,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f3.setShowWarningIcon(true);
                  // /backoffice/editpatrongeneralinfo.jsp(133,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f3.setMessage( form.buildDuplicateDistrictIDMessage() );
                  int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n            <tr>\r\n                <td>");
                      if (_jspx_meth_base_005fimageSpacer_005f1(_jspx_th_base_005fmessageBox_005f3, _jspx_page_context))
                        return;
                      out.write("</td>\r\n                <td>                                    \r\n                    ");
                      //  base:patronSearchResultDisplay
                      com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag _jspx_th_base_005fpatronSearchResultDisplay_005f1 = (com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag) _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag.class);
                      _jspx_th_base_005fpatronSearchResultDisplay_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fpatronSearchResultDisplay_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
                      // /backoffice/editpatrongeneralinfo.jsp(137,20) name = patronValue type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fpatronSearchResultDisplay_005f1.setPatronValue(form.getDistrictPatronValue() );
                      // /backoffice/editpatrongeneralinfo.jsp(137,20) name = printerFriendly type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fpatronSearchResultDisplay_005f1.setPrinterFriendly(false);
                      // /backoffice/editpatrongeneralinfo.jsp(137,20) name = displayButtons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fpatronSearchResultDisplay_005f1.setDisplayButtons(false);
                      int _jspx_eval_base_005fpatronSearchResultDisplay_005f1 = _jspx_th_base_005fpatronSearchResultDisplay_005f1.doStartTag();
                      if (_jspx_th_base_005fpatronSearchResultDisplay_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f1);
                      out.write("\r\n                </td>\r\n            </tr>\r\n            ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
                      // /backoffice/editpatrongeneralinfo.jsp(140,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setName( EditPatronGeneralInfoForm.FORM_NAME );
                      // /backoffice/editpatrongeneralinfo.jsp(140,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setProperty( EditPatronGeneralInfoForm.FIELD_SHOW_REPLACEMENT_CONFIRMATION );
                      // /backoffice/editpatrongeneralinfo.jsp(140,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f9.setValue("true");
                      int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td>");
                          if (_jspx_meth_base_005fimageSpacer_005f2(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                <td>\r\n                    <span class=\"ColRowBold\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_WhatDoYouWantToDo") );
                          out.write("</span>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
                          if (_jspx_meth_base_005fimageSpacer_005f3(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                <td>\r\n                    <span class=\"ColRow\">\r\n                        &nbsp;&nbsp;");
                          //  html:radio
                          org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                          _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /backoffice/editpatrongeneralinfo.jsp(151,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f0.setProperty(EditPatronGeneralInfoForm.FIELD_REPLACE_OPTION);
                          // /backoffice/editpatrongeneralinfo.jsp(151,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f0.setValue("true");
                          int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
                          if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fradio_005f0.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_UseThisPatronReplacingThePatronInformationEnteredB") );
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
                          out.write("\r\n                    </span>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>");
                          if (_jspx_meth_base_005fimageSpacer_005f4(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
                            return;
                          out.write("</td>\r\n                <td>\r\n                    <span class=\"ColRow\">\r\n                        &nbsp;&nbsp;");
                          //  html:radio
                          org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_005fvalue_005fproperty.get(org.apache.struts.taglib.html.RadioTag.class);
                          _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                          // /backoffice/editpatrongeneralinfo.jsp(159,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f1.setProperty(EditPatronGeneralInfoForm.FIELD_REPLACE_OPTION);
                          // /backoffice/editpatrongeneralinfo.jsp(159,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fradio_005f1.setValue("false");
                          int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
                          if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fradio_005f1.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_GoBackToTheRecordAndModifyTheDistrictID") );
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
                          out.write("\r\n                    </span>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td valign=\"baseline\" align=\"center\" class=\"ColRow\" colspan=\"2\">\r\n                    <input type=\"submit\" name=\"");
                          out.print(EditPatronGeneralInfoForm.BUTTON_NAME_CONFIRM_REPLACE);
                          out.write("\" value='");
                          out.print(MessageHelper.formatMessage("ok"));
                          out.write("'>\r\n                </td>\r\n            </tr>\r\n            ");
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
                      out.write("\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage.reuse(_jspx_th_base_005fmessageBox_005f3);
                  out.write("\r\n    ");
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
              out.write("\r\n    ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(171,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setName( EditPatronGeneralInfoForm.FORM_NAME );
              // /backoffice/editpatrongeneralinfo.jsp(171,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setProperty("showConfirmation");
              // /backoffice/editpatrongeneralinfo.jsp(171,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f10.setValue("true");
              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        ");

            String message = form.getConfirmMessage();
        
                  out.write("\r\n        ");
                  //  base:messageBox
                  com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
                  _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                  // /backoffice/editpatrongeneralinfo.jsp(175,8) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setShowWarningIcon(true);
                  // /backoffice/editpatrongeneralinfo.jsp(175,8) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setMessage(message);
                  // /backoffice/editpatrongeneralinfo.jsp(175,8) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fmessageBox_005f4.setFilterMessage(false);
                  int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
                  if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td align=\"center\" class=\"ColRow\">");
                      out.print( MessageHelper.formatMessage("editpatrongeneralinfo_ClickYesToSaveYourChanges") );
                      out.write("</td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n\t\t\t\t");
                      if (_jspx_meth_base_005fyesButton_005f0(_jspx_th_base_005fmessageBox_005f4, _jspx_page_context))
                        return;
                      out.write("\r\n\t\t\t\t");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                      // /backoffice/editpatrongeneralinfo.jsp(184,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f0.setName(EditPatronGeneralInfoForm.BUTTON_NAME_NO);
                      int _jspx_eval_base_005fnoButton_005f0 = _jspx_th_base_005fnoButton_005f0.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                      out.write("\r\n            </td>\r\n        </tr>\r\n        ");
                      int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fmessageBox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005ffilterMessage.reuse(_jspx_th_base_005fmessageBox_005f4);
                  out.write("\r\n\r\n    ");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
              out.write("\r\n\r\n\r\n");
              out.write('\r');
              out.write('\n');
              //  base:isNotMacBrowser
              com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag _jspx_th_base_005fisNotMacBrowser_005f0 = (com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag) _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag.class);
              _jspx_th_base_005fisNotMacBrowser_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fisNotMacBrowser_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              int _jspx_eval_base_005fisNotMacBrowser_005f0 = _jspx_th_base_005fisNotMacBrowser_005f0.doStartTag();
              if (_jspx_eval_base_005fisNotMacBrowser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"true\"  name=\"");
                  out.print(EditPatronGeneralInfoForm.BUTTON_ENTER);
                  out.write("\">\r\n");
                  int evalDoAfterBody = _jspx_th_base_005fisNotMacBrowser_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fisNotMacBrowser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f0);
              out.write('\r');
              out.write('\n');
              //  html:hidden
              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
              _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
              _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(203,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f0.setProperty( EditPatronGeneralInfoForm.FIELD_PAGE );
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
              // /backoffice/editpatrongeneralinfo.jsp(204,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f1.setProperty( EditPatronGeneralInfoForm.FIELD_ACTION );
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
              // /backoffice/editpatrongeneralinfo.jsp(205,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f2.setProperty( EditPatronGeneralInfoForm.FIELD_REPLACEMENT_PATRON_ID );
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
              // /backoffice/editpatrongeneralinfo.jsp(206,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f3.setProperty( EditPatronGeneralInfoForm.FIELD_ORIGINAL_SITEID );
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
              // /backoffice/editpatrongeneralinfo.jsp(207,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f4.setProperty( EditPatronGeneralInfoForm.FIELD_CLASS_XML_SECTION_IDS );
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
              // /backoffice/editpatrongeneralinfo.jsp(208,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_html_005fhidden_005f5.setProperty( EditPatronGeneralInfoForm.FIELD_STATUS_CLEARED );
              int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
              if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
              out.write('\r');
              out.write('\n');
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(209,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setName( EditPatronGeneralInfoForm.FORM_NAME );
              // /backoffice/editpatrongeneralinfo.jsp(209,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setProperty( EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION );
              // /backoffice/editpatrongeneralinfo.jsp(209,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f11.setValue("true");
              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(210,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f6.setProperty( EditPatronGeneralInfoForm.FIELD_LAST_NAME );
                  int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
                  if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(211,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f7.setProperty( EditPatronGeneralInfoForm.FIELD_FIRST_NAME );
                  int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
                  if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(212,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f8.setProperty( EditPatronGeneralInfoForm.FIELD_MIDDLE_NAME );
                  int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
                  if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(213,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f9.setProperty( EditPatronGeneralInfoForm.FIELD_NICKNAME );
                  int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
                  if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(214,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f10.setProperty( EditPatronGeneralInfoForm.FIELD_DISTRICT_ID );
                  int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
                  if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(215,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f11.setProperty( EditPatronGeneralInfoForm.FIELD_GENDER );
                  int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
                  if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(216,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f12.setProperty( EditPatronGeneralInfoForm.FIELD_GRAD_YEAR );
                  int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
                  if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f13 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(217,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f13.setProperty( EditPatronGeneralInfoForm.FIELD_GRADE_LEVEL );
                  int _jspx_eval_html_005fhidden_005f13 = _jspx_th_html_005fhidden_005f13.doStartTag();
                  if (_jspx_th_html_005fhidden_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f13);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f14 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(218,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f14.setProperty( EditPatronGeneralInfoForm.FIELD_EMAIL1 );
                  int _jspx_eval_html_005fhidden_005f14 = _jspx_th_html_005fhidden_005f14.doStartTag();
                  if (_jspx_th_html_005fhidden_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f14);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f15 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(219,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f15.setProperty( EditPatronGeneralInfoForm.FIELD_EMAIL2 );
                  int _jspx_eval_html_005fhidden_005f15 = _jspx_th_html_005fhidden_005f15.doStartTag();
                  if (_jspx_th_html_005fhidden_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f15);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f16 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(220,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f16.setProperty( EditPatronGeneralInfoForm.FIELD_LOGIN_ID );
                  int _jspx_eval_html_005fhidden_005f16 = _jspx_th_html_005fhidden_005f16.doStartTag();
                  if (_jspx_th_html_005fhidden_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f16);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f17 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(221,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f17.setProperty( EditPatronGeneralInfoForm.FIELD_PASSWORD );
                  int _jspx_eval_html_005fhidden_005f17 = _jspx_th_html_005fhidden_005f17.doStartTag();
                  if (_jspx_th_html_005fhidden_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f17);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f18 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(222,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f18.setProperty( EditPatronGeneralInfoForm.FIELD_CONFIRM_PASSWORD );
                  int _jspx_eval_html_005fhidden_005f18 = _jspx_th_html_005fhidden_005f18.doStartTag();
                  if (_jspx_th_html_005fhidden_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f18);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f19 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f19.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(223,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f19.setProperty( EditPatronGeneralInfoForm.PARAM_ASSIGNED_PASSWORD );
                  int _jspx_eval_html_005fhidden_005f19 = _jspx_th_html_005fhidden_005f19.doStartTag();
                  if (_jspx_th_html_005fhidden_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f19);
                  out.write("\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f20 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                  // /backoffice/editpatrongeneralinfo.jsp(224,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f20.setProperty( EditPatronGeneralInfoForm.FIELD_TEACHER );
                  int _jspx_eval_html_005fhidden_005f20 = _jspx_th_html_005fhidden_005f20.doStartTag();
                  if (_jspx_th_html_005fhidden_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f20);
                  out.write('\r');
                  out.write('\n');
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
              out.write("\r\n\r\n");
              //  base:outlinedTableAndTabsWithinThere
              com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag) _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableAndTabsWithinThereTag.class);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
              // /backoffice/editpatrongeneralinfo.jsp(227,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setId(EditPatronGeneralInfoForm.TABLE_PATRON_OUTLINE);
              // /backoffice/editpatrongeneralinfo.jsp(227,0) name = selectedTabID type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTabID(form.gimmeSelectedTabID());
              // /backoffice/editpatrongeneralinfo.jsp(227,0) name = selectedTab type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setSelectedTab(form.gimmeSelectedTab());
              // /backoffice/editpatrongeneralinfo.jsp(227,0) name = tabs type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.setTabs(form.gimmeTabs());
              int _jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doStartTag();
              if (_jspx_eval_base_005foutlinedTableAndTabsWithinThere_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    <tr>\r\n       <td class=\"tdAlignRight\">\r\n           ");
                  if (_jspx_meth_base_005fisNotMacBrowser_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/editpatrongeneralinfo.jsp(233,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f0.setId("topSaveButton");
                  int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n           ");
                      if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n           &nbsp;\r\n            ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                      // /backoffice/editpatrongeneralinfo.jsp(236,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.showAddAdditionalSite}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
                      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(237,16) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setOnclick("hideButtonsWithinThere()");
                          // /backoffice/editpatrongeneralinfo.jsp(237,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setName( EditPatronGeneralInfoForm.BUTTON_NAME_ADD_SITE );
                          // /backoffice/editpatrongeneralinfo.jsp(237,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("addAdditionalSite") );
                          // /backoffice/editpatrongeneralinfo.jsp(237,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/addsite.gif");
                          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                          out.write("\r\n               &nbsp;\r\n           ");
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
                      out.write("\r\n           ");
                      if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n            ");
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
                  out.write("\r\n       </td>\r\n    </tr>\r\n    \r\n    ");
                  //  c:choose
                  org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                  _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
                  if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n       ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      // /backoffice/editpatrongeneralinfo.jsp(246,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f0.setTest(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL );
                      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td>\r\n                    <table id=\"");
                          out.print( EditPatronGeneralInfoForm.TABLE_PATRON_EDIT_BOX );
                          out.write("\" border=\"0\" width=\"100%\">\r\n                        ");
                          //  c:if
                          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                          _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(250,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_c_005fif_005f1.setTest(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_GENERAL );
                          int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
                          if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                        <tr>\r\n                           <td class=\"Instruction\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_RequiredField") );
                              out.write("</td>\r\n                        </tr>\r\n                        ");
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
                          out.write("\r\n                       <tr>\r\n                          <td colspan=\"4\"><span class=\"TableHeading\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PatronInformation") );
                          out.write("</span> <span class=\"ColRow\">");
                          out.print(form.gimmeLastSaved() );
                          out.write("</span></td>\r\n                       </tr>\r\n                        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(258,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f12.setName( EditPatronGeneralInfoForm.FORM_NAME );
                          // /backoffice/editpatrongeneralinfo.jsp(258,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f12.setProperty( EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION );
                          // /backoffice/editpatrongeneralinfo.jsp(258,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f12.setValue("true");
                          int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            <tr>\r\n                               <td colspan=\"4\">\r\n                                    ");
                              //  base:patronSearchResultDisplay
                              com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag _jspx_th_base_005fpatronSearchResultDisplay_005f2 = (com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag) _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.get(com.follett.fsc.destiny.client.backoffice.jsptag.PatronSearchResultDisplayTag.class);
                              _jspx_th_base_005fpatronSearchResultDisplay_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fpatronSearchResultDisplay_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                              // /backoffice/editpatrongeneralinfo.jsp(261,36) name = patronValue type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpatronSearchResultDisplay_005f2.setPatronValue(form.getDistrictPatronValue() );
                              // /backoffice/editpatrongeneralinfo.jsp(261,36) name = printerFriendly type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpatronSearchResultDisplay_005f2.setPrinterFriendly(false);
                              // /backoffice/editpatrongeneralinfo.jsp(261,36) name = displayButtons type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fpatronSearchResultDisplay_005f2.setDisplayButtons(false);
                              int _jspx_eval_base_005fpatronSearchResultDisplay_005f2 = _jspx_th_base_005fpatronSearchResultDisplay_005f2.doStartTag();
                              if (_jspx_th_base_005fpatronSearchResultDisplay_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fpatronSearchResultDisplay_005fprinterFriendly_005fpatronValue_005fdisplayButtons_005fnobody.reuse(_jspx_th_base_005fpatronSearchResultDisplay_005f2);
                              out.write("\r\n                               </td>\r\n                            </tr>\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
                          out.write("\r\n                    \r\n                        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(266,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setName( EditPatronGeneralInfoForm.FORM_NAME );
                          // /backoffice/editpatrongeneralinfo.jsp(266,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setProperty( EditPatronGeneralInfoForm.FIELD_DISTRICT_USER_ON_ATTACH_ACTION );
                          // /backoffice/editpatrongeneralinfo.jsp(266,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f13.setValue("false");
                          int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_LastName") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(270,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f0.setProperty( EditPatronGeneralInfoForm.FIELD_LAST_NAME );
                              // /backoffice/editpatrongeneralinfo.jsp(270,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f0.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(270,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f0.setMaxlength("42");
                              // /backoffice/editpatrongeneralinfo.jsp(270,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f0.setTabindex("1");
                              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                              out.write("\r\n                              </td>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_FirstName") );
                              out.write("</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(274,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f1.setProperty( EditPatronGeneralInfoForm.FIELD_FIRST_NAME );
                              // /backoffice/editpatrongeneralinfo.jsp(274,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f1.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(274,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f1.setMaxlength("42");
                              // /backoffice/editpatrongeneralinfo.jsp(274,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f1.setTabindex("2");
                              int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
                              if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
                              out.write("\r\n                              </td>\r\n                           </tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_MiddleName") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(280,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f2.setProperty( EditPatronGeneralInfoForm.FIELD_MIDDLE_NAME );
                              // /backoffice/editpatrongeneralinfo.jsp(280,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f2.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(280,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f2.setMaxlength("42");
                              // /backoffice/editpatrongeneralinfo.jsp(280,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f2.setTabindex("3");
                              int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
                              if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
                              out.write("\r\n                              </td>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Nickname") );
                              out.write("</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(284,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f3.setProperty( EditPatronGeneralInfoForm.FIELD_NICKNAME );
                              // /backoffice/editpatrongeneralinfo.jsp(284,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f3.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(284,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f3.setMaxlength("30");
                              // /backoffice/editpatrongeneralinfo.jsp(284,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f3.setTabindex("4");
                              int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
                              if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
                              out.write("\r\n                              </td>\r\n                           </tr>\r\n                           <tr><td colspan=\"3\">&nbsp;</td></tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">\r\n                                ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(290,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setName( EditPatronGeneralInfoForm.FORM_NAME );
                              // /backoffice/editpatrongeneralinfo.jsp(290,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setProperty("districtIDRequired");
                              // /backoffice/editpatrongeneralinfo.jsp(290,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f14.setValue("true");
                              int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                *&nbsp;\r\n                                ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
                              out.write("\r\n                                ");
                              out.print(PatronSpecs.getDistrictIDPrompt() );
                              out.write("&nbsp;\r\n                              </td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(296,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f4.setProperty( EditPatronGeneralInfoForm.FIELD_DISTRICT_ID );
                              // /backoffice/editpatrongeneralinfo.jsp(296,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f4.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(296,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f4.setMaxlength("40");
                              // /backoffice/editpatrongeneralinfo.jsp(296,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f4.setTabindex("5");
                              int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
                              if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
                              out.write("\r\n                              </td>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Email1") );
                              out.write("</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f5 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f5.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(300,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f5.setProperty( EditPatronGeneralInfoForm.FIELD_EMAIL1 );
                              // /backoffice/editpatrongeneralinfo.jsp(300,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f5.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(300,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f5.setMaxlength("" + EmailSpecs.EMAIL_MAX_LENGTH );
                              // /backoffice/editpatrongeneralinfo.jsp(300,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f5.setTabindex("21");
                              int _jspx_eval_html_005ftext_005f5 = _jspx_th_html_005ftext_005f5.doStartTag();
                              if (_jspx_th_html_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f5);
                              out.write("\r\n                              </td>\r\n                           </tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Gender") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                  ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(306,34) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f1.setProperty( EditPatronGeneralInfoForm.FIELD_GENDER );
                              // /backoffice/editpatrongeneralinfo.jsp(306,34) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f1.setTabindex("6");
                              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f1.doInitBody();
                              }
                              do {
                              out.write("\r\n                                    ");
                              if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                              return;
                              out.write("\r\n                                  ");
                              int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.reuse(_jspx_th_html_005fselect_005f1);
                              out.write("\r\n                              </td>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Email2") );
                              out.write("</td>\r\n                              <td>\r\n                                 ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f6 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f6.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(313,33) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f6.setProperty( EditPatronGeneralInfoForm.FIELD_EMAIL2 );
                              // /backoffice/editpatrongeneralinfo.jsp(313,33) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f6.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(313,33) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f6.setMaxlength("" + EmailSpecs.EMAIL_MAX_LENGTH );
                              // /backoffice/editpatrongeneralinfo.jsp(313,33) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f6.setTabindex("22");
                              int _jspx_eval_html_005ftext_005f6 = _jspx_th_html_005ftext_005f6.doStartTag();
                              if (_jspx_th_html_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f6);
                              out.write("\r\n                              </td>\r\n                           </tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Birthdate") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f7 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(319,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setProperty( EditPatronGeneralInfoForm.FIELD_BIRTH_DATE );
                              // /backoffice/editpatrongeneralinfo.jsp(319,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setSize("10");
                              // /backoffice/editpatrongeneralinfo.jsp(319,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setMaxlength("10");
                              // /backoffice/editpatrongeneralinfo.jsp(319,32) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f7.setTabindex("7");
                              int _jspx_eval_html_005ftext_005f7 = _jspx_th_html_005ftext_005f7.doStartTag();
                              if (_jspx_th_html_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f7);
                              out.write("\r\n                              </td>\r\n                              \r\n                               ");
 if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { 
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_UserName") );
                              out.write("</td>\r\n                                  <td>\r\n                                     ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f8 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f8.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(325,37) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setProperty( EditPatronGeneralInfoForm.FIELD_LOGIN_ID );
                              // /backoffice/editpatrongeneralinfo.jsp(325,37) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setSize("20");
                              // /backoffice/editpatrongeneralinfo.jsp(325,37) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setMaxlength("50");
                              // /backoffice/editpatrongeneralinfo.jsp(325,37) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f8.setTabindex("23");
                              int _jspx_eval_html_005ftext_005f8 = _jspx_th_html_005ftext_005f8.doStartTag();
                              if (_jspx_th_html_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f8);
                              out.write("\r\n                                  </td>\r\n                              ");
 } else { 
                              out.write("\r\n                                  <td colspan=\"2\">&nbsp;</td>\r\n                              ");
 } 
                              out.write("\r\n                           </tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_GradYear") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f9 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f9.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(334,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setProperty( EditPatronGeneralInfoForm.FIELD_GRAD_YEAR );
                              // /backoffice/editpatrongeneralinfo.jsp(334,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setSize("10");
                              // /backoffice/editpatrongeneralinfo.jsp(334,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setMaxlength("4");
                              // /backoffice/editpatrongeneralinfo.jsp(334,32) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f9.setTabindex("8");
                              int _jspx_eval_html_005ftext_005f9 = _jspx_th_html_005ftext_005f9.doStartTag();
                              if (_jspx_th_html_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f9);
                              out.write("\r\n                              </td>\r\n                              \r\n                               ");
 if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { 
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_NewPassword") );
                              out.write("</td>\r\n                                  <td>\r\n                                    <input type=\"password\" name=\"");
                              out.print(EditPatronGeneralInfoForm.FIELD_PASSWORD);
                              out.write("\" size=\"20\" maxlength=\"50\" redisplay=\"true\" tabindex=\"24\" autocomplete=\"off\" value='");
                              out.print( form.getPassword() == null ? "" : form.getPassword() );
                              out.write("'/>\r\n                                  </td>\r\n                              ");
 } else { 
                              out.write("\r\n                                  <td colspan=\"2\">&nbsp;</td>\r\n                              ");
 } 
                              out.write("\r\n                              \r\n                           </tr>\r\n                           <tr>\r\n                              <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_GradeLevel") );
                              out.write("&nbsp;</td>\r\n                              <td>\r\n                                ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f10 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              // /backoffice/editpatrongeneralinfo.jsp(350,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f10.setProperty( EditPatronGeneralInfoForm.FIELD_GRADE_LEVEL );
                              // /backoffice/editpatrongeneralinfo.jsp(350,32) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f10.setSize("10");
                              // /backoffice/editpatrongeneralinfo.jsp(350,32) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f10.setMaxlength("30");
                              // /backoffice/editpatrongeneralinfo.jsp(350,32) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f10.setTabindex("9");
                              int _jspx_eval_html_005ftext_005f10 = _jspx_th_html_005ftext_005f10.doStartTag();
                              if (_jspx_th_html_005ftext_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f10);
                              out.write("\r\n                              </td>\r\n                               ");
 if (store.canView(Permission.BACK_OFFICE_EDIT_PASSWORDS_LOGINS)) { 
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_ConfirmPassword") );
                              out.write("</td>\r\n                                  <td>\r\n                                     <input type=\"password\" name=\"");
                              out.print(EditPatronGeneralInfoForm.FIELD_CONFIRM_PASSWORD);
                              out.write("\" size=\"20\" maxlength=\"50\" redisplay=\"true\" tabindex=\"25\" autocomplete=\"off\" value='");
                              out.print( form.getConfirmPassword() == null ? "" : form.getConfirmPassword() );
                              out.write("'/>\r\n                                  </td>\r\n                              ");
 } else { 
                              out.write("\r\n                                  <td colspan=\"2\">&nbsp;</td>\r\n                              ");
 } 
                              out.write("\r\n                           </tr>\r\n                           <tr><!-- could be ManageReadingPaths or IsTeaching or blank on left -->\r\n                           ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              // /backoffice/editpatrongeneralinfo.jsp(363,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f1.setTest(form.isLibraryProductSupported() );
                              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_ManagesReadingPaths") );
                              out.write("&nbsp;</td>\r\n                                  <td class=\"FormLabel\">\r\n\t                                  ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f2 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
                              // /backoffice/editpatrongeneralinfo.jsp(366,35) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f2.setProperty( EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS );
                              // /backoffice/editpatrongeneralinfo.jsp(366,35) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f2.setTabindex("10");
                              int _jspx_eval_html_005fselect_005f2 = _jspx_th_html_005fselect_005f2.doStartTag();
                              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f2.doInitBody();
                              }
                              do {
                              out.write("\r\n\t                                    ");
                              if (_jspx_meth_html_005foptions_005f2(_jspx_th_html_005fselect_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n\t                                  ");
                              int evalDoAfterBody = _jspx_th_html_005fselect_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fselect_005ftabindex_005fproperty.reuse(_jspx_th_html_005fselect_005f2);
                              out.write("\r\n                                  </td>\r\n                             ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                              out.write("\r\n                            ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              // /backoffice/editpatrongeneralinfo.jsp(372,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f2.setTest( !form.isLibraryProductSupported() && (form.isTextbookProductSupported() || form.isAssetProductSupported()) && !form.isFromUploadClassJobSummary() );
                              int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_CurrentlyTeaching") );
                              out.write("&nbsp;</td>\r\n                                  <td class=\"FormLabel\">\r\n                                        ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f21 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f21.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                              // /backoffice/editpatrongeneralinfo.jsp(375,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f21.setProperty(EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS);
                              int _jspx_eval_html_005fhidden_005f21 = _jspx_th_html_005fhidden_005f21.doStartTag();
                              if (_jspx_th_html_005fhidden_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f21);
                              out.write("\r\n                                        ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
                              // /backoffice/editpatrongeneralinfo.jsp(376,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f0.setProperty(EditPatronGeneralInfoForm.FIELD_TEACHER);
                              // /backoffice/editpatrongeneralinfo.jsp(376,40) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f0.setTabindex("11");
                              int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f0.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Yes") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                              out.write("\r\n                                  </td>\r\n                             ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
                              out.write("\r\n                             ");
                              //  c:otherwise
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                              _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
                              int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
                              if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                  <td colspan=\"2\">\r\n                                    &nbsp;\r\n                                  </td>\r\n                                ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f22 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f22.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                              // /backoffice/editpatrongeneralinfo.jsp(383,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f22.setProperty(EditPatronGeneralInfoForm.FIELD_MANAGE_READING_PATHS);
                              int _jspx_eval_html_005fhidden_005f22 = _jspx_th_html_005fhidden_005f22.doStartTag();
                              if (_jspx_th_html_005fhidden_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f22);
                              out.write("\r\n                                ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f23 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f23.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                              // /backoffice/editpatrongeneralinfo.jsp(384,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f23.setProperty(EditPatronGeneralInfoForm.FIELD_TEACHER);
                              int _jspx_eval_html_005fhidden_005f23 = _jspx_th_html_005fhidden_005f23.doStartTag();
                              if (_jspx_th_html_005fhidden_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f23);
                              out.write("                                \r\n                             ");
                              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                              out.write("\r\n                           ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
                              out.write("\r\n                           ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                              // /backoffice/editpatrongeneralinfo.jsp(388,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f3.setTest(form.isAssignedPassword() );
                              int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PasswordAssigned") );
                              out.write("</td>\r\n                                <td class=\"ColRow\">\r\n                                    ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f1 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
                              // /backoffice/editpatrongeneralinfo.jsp(391,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f1.setProperty(EditPatronGeneralInfoForm.FIELD_CLEAR_PASSWORD);
                              // /backoffice/editpatrongeneralinfo.jsp(391,36) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f1.setTabindex("26");
                              int _jspx_eval_html_005fcheckbox_005f1 = _jspx_th_html_005fcheckbox_005f1.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f1.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_ClearPassword") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f1);
                              out.write("\r\n                                </td>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                              out.write("\r\n                             ");
                              if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
                              return;
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                              out.write("\r\n                            </tr>\r\n                            \r\n                           <tr><!-- could be IsTeaching or blank on left -->\r\n                           ");
                              //  c:choose
                              org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                              _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                              int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
                              if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                              // /backoffice/editpatrongeneralinfo.jsp(404,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_c_005fwhen_005f4.setTest(form.isLibraryProductSupported() && (form.isTextbookProductSupported() || form.isAssetProductSupported()) && !form.isFromUploadClassJobSummary() );
                              int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                  <td class=\"FormLabel tdAlignRight\">");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_CurrentlyTeaching") );
                              out.write("&nbsp;</td>\r\n                                  <td class=\"FormLabel\">\r\n                                        ");
                              //  html:checkbox
                              org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f2 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                              _jspx_th_html_005fcheckbox_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
                              // /backoffice/editpatrongeneralinfo.jsp(407,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f2.setProperty(EditPatronGeneralInfoForm.FIELD_TEACHER);
                              // /backoffice/editpatrongeneralinfo.jsp(407,40) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fcheckbox_005f2.setTabindex("12");
                              int _jspx_eval_html_005fcheckbox_005f2 = _jspx_th_html_005fcheckbox_005f2.doStartTag();
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f2.doInitBody();
                              }
                              do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Yes") );
                              int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fcheckbox_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fcheckbox_005ftabindex_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f2);
                              out.write("\r\n                                  </td>\r\n                             ");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                              out.write("\r\n                             ");
                              if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f3, _jspx_page_context))
                              return;
                              out.write("\r\n                           ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fchoose_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                              out.write("\r\n                              <td colspan=\"2\">\r\n                                &nbsp;\r\n                              </td>\r\n                            </tr>\r\n                            \r\n                         ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                          out.write("\r\n                     </table>\r\n                </td>\r\n             </tr>\r\n             \r\n           <tr>\r\n              <td>\r\n                 ");
                          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/backoffice/editsitepatroninfo.jsp", out, false);
                          out.write("\r\n               </td>\r\n            </tr>\r\n                \r\n             \r\n       ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                      out.write("\r\n       ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      // /backoffice/editpatrongeneralinfo.jsp(434,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f5.setTest(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_ADDRESS );
                      int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n          <tr>\r\n             <td>\r\n                <table id=\"");
                          out.print( EditPatronGeneralInfoForm.TABLE_PATRON_ADDRESS_BOX );
                          out.write("\" border=\"0\" width=\"100%\">\r\n                   <tr>\r\n                      <td class=\"TableHeading\" colspan=\"4\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_AddressInformation0", ResponseUtils.filter(form.gimmePatronAddressInfo())) );
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td colspan=\"2\" align=\"Center\" class=\"FormLabel\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PrimaryInformation") );
                          out.write("</td>\r\n                      <td colspan=\"2\" align=\"Center\" class=\"FormLabel\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_SecondaryInformation") );
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Address") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f11 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f11.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(447,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f11.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE1 );
                          // /backoffice/editpatrongeneralinfo.jsp(447,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f11.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(447,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f11.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(447,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f11.setTabindex("1");
                          int _jspx_eval_html_005ftext_005f11 = _jspx_th_html_005ftext_005f11.doStartTag();
                          if (_jspx_th_html_005ftext_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f11);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f11);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Address") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f12 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f12.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(449,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f12.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_LINE1 );
                          // /backoffice/editpatrongeneralinfo.jsp(449,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f12.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(449,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f12.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(449,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f12.setTabindex("8");
                          int _jspx_eval_html_005ftext_005f12 = _jspx_th_html_005ftext_005f12.doStartTag();
                          if (_jspx_th_html_005ftext_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f12);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f12);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f13 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f13.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(453,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f13.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_LINE2 );
                          // /backoffice/editpatrongeneralinfo.jsp(453,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f13.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(453,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f13.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(453,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f13.setTabindex("2");
                          int _jspx_eval_html_005ftext_005f13 = _jspx_th_html_005ftext_005f13.doStartTag();
                          if (_jspx_th_html_005ftext_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f13);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f13);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f14 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(455,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f14.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_LINE2 );
                          // /backoffice/editpatrongeneralinfo.jsp(455,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f14.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(455,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f14.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(455,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f14.setTabindex("9");
                          int _jspx_eval_html_005ftext_005f14 = _jspx_th_html_005ftext_005f14.doStartTag();
                          if (_jspx_th_html_005ftext_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f14);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f14);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_City") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f15 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f15.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(459,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f15.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_CITY );
                          // /backoffice/editpatrongeneralinfo.jsp(459,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f15.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(459,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f15.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(459,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f15.setTabindex("3");
                          int _jspx_eval_html_005ftext_005f15 = _jspx_th_html_005ftext_005f15.doStartTag();
                          if (_jspx_th_html_005ftext_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f15);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f15);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_City") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f16 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f16.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(461,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f16.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_CITY );
                          // /backoffice/editpatrongeneralinfo.jsp(461,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f16.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(461,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f16.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(461,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f16.setTabindex("10");
                          int _jspx_eval_html_005ftext_005f16 = _jspx_th_html_005ftext_005f16.doStartTag();
                          if (_jspx_th_html_005ftext_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f16);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f16);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_StateProvince", "<br>") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f17 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f17.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(465,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f17.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_STATE );
                          // /backoffice/editpatrongeneralinfo.jsp(465,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f17.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(465,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f17.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(465,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f17.setTabindex("4");
                          int _jspx_eval_html_005ftext_005f17 = _jspx_th_html_005ftext_005f17.doStartTag();
                          if (_jspx_th_html_005ftext_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f17);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f17);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_StateProvince", "<br>") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f18 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f18.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(467,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f18.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_STATE );
                          // /backoffice/editpatrongeneralinfo.jsp(467,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f18.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(467,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f18.setMaxlength("42");
                          // /backoffice/editpatrongeneralinfo.jsp(467,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f18.setTabindex("11");
                          int _jspx_eval_html_005ftext_005f18 = _jspx_th_html_005ftext_005f18.doStartTag();
                          if (_jspx_th_html_005ftext_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f18);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f18);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PostalCode") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f19 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f19.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(471,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f19.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_ZIP );
                          // /backoffice/editpatrongeneralinfo.jsp(471,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f19.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(471,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f19.setMaxlength("20");
                          // /backoffice/editpatrongeneralinfo.jsp(471,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f19.setTabindex("5");
                          int _jspx_eval_html_005ftext_005f19 = _jspx_th_html_005ftext_005f19.doStartTag();
                          if (_jspx_th_html_005ftext_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f19);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f19);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PostalCode") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f20 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f20.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(473,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f20.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_ZIP );
                          // /backoffice/editpatrongeneralinfo.jsp(473,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f20.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(473,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f20.setMaxlength("20");
                          // /backoffice/editpatrongeneralinfo.jsp(473,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f20.setTabindex("12");
                          int _jspx_eval_html_005ftext_005f20 = _jspx_th_html_005ftext_005f20.doStartTag();
                          if (_jspx_th_html_005ftext_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f20);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f20);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Phone1") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f21 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f21.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(477,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f21.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_PRIMARY_PHONE );
                          // /backoffice/editpatrongeneralinfo.jsp(477,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f21.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(477,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f21.setMaxlength("30");
                          // /backoffice/editpatrongeneralinfo.jsp(477,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f21.setTabindex("6");
                          int _jspx_eval_html_005ftext_005f21 = _jspx_th_html_005ftext_005f21.doStartTag();
                          if (_jspx_th_html_005ftext_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f21);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f21);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Phone1") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f22 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f22.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(479,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f22.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_PRIMARY_PHONE );
                          // /backoffice/editpatrongeneralinfo.jsp(479,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f22.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(479,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f22.setMaxlength("30");
                          // /backoffice/editpatrongeneralinfo.jsp(479,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f22.setTabindex("13");
                          int _jspx_eval_html_005ftext_005f22 = _jspx_th_html_005ftext_005f22.doStartTag();
                          if (_jspx_th_html_005ftext_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f22);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f22);
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Phone2") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f23 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f23.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(483,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f23.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_1_OTHER_PHONE );
                          // /backoffice/editpatrongeneralinfo.jsp(483,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f23.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(483,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f23.setMaxlength("30");
                          // /backoffice/editpatrongeneralinfo.jsp(483,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f23.setTabindex("7");
                          int _jspx_eval_html_005ftext_005f23 = _jspx_th_html_005ftext_005f23.doStartTag();
                          if (_jspx_th_html_005ftext_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f23);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f23);
                          out.write("</td>\r\n                      <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_Phone2") );
                          out.write("&nbsp;</td>\r\n                      <td>");
                          //  html:text
                          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f24 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                          _jspx_th_html_005ftext_005f24.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ftext_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
                          // /backoffice/editpatrongeneralinfo.jsp(485,26) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f24.setProperty( EditPatronGeneralInfoForm.FIELD_ADDRESS_2_OTHER_PHONE );
                          // /backoffice/editpatrongeneralinfo.jsp(485,26) name = size type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f24.setSize("25");
                          // /backoffice/editpatrongeneralinfo.jsp(485,26) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f24.setMaxlength("30");
                          // /backoffice/editpatrongeneralinfo.jsp(485,26) name = tabindex type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ftext_005f24.setTabindex("14");
                          int _jspx_eval_html_005ftext_005f24 = _jspx_th_html_005ftext_005f24.doStartTag();
                          if (_jspx_th_html_005ftext_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f24);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ftext_005ftabindex_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f24);
                          out.write("</td>\r\n                   </tr>\r\n                </table>\r\n             </td>\r\n          </tr>\r\n       ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
                      out.write("\r\n       ");
                      //  c:when
                      org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                      _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
                      // /backoffice/editpatrongeneralinfo.jsp(491,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fwhen_005f6.setTest(form.getPage() == EditPatronGeneralInfoForm.PAGE_INDEX_PICTURE );
                      int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
                      if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n          <tr>\r\n             <td>\r\n                <table id=\"");
                          out.print( EditPatronGeneralInfoForm.TABLE_PATRON_PICTURE );
                          out.write("\" border=\"0\" width=\"100%\">\r\n                   <tr>\r\n                      <td class=\"TableHeading\" colspan=\"3\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture0", ResponseUtils.filter(form.gimmePatronAddressInfo())) );
                          out.write("</td>\r\n                   </tr>\r\n                   <tr>\r\n                        <td>\r\n                            ");
                          //  base:outlinedTable
                          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
                          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f6);
                          // /backoffice/editpatrongeneralinfo.jsp(500,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005foutlinedTable_005f0.setId( EditPatronGeneralInfoForm.TABLE_PATRON_PICTURE_CONTENT );
                          // /backoffice/editpatrongeneralinfo.jsp(500,28) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005foutlinedTable_005f0.setWidth("100%");
                          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
                          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            <tr>\r\n                                <td align=\"center\">\r\n                                   <img alt='");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture") );
                              out.write("' name=\"Patron Picture\" title='");
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PatronPicture") );
                              out.write("' src='");
                              //  bean:write
                              org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                              _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                              // /backoffice/editpatrongeneralinfo.jsp(503,229) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f0.setName( EditPatronGeneralInfoForm.FORM_NAME );
                              // /backoffice/editpatrongeneralinfo.jsp(503,229) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_bean_005fwrite_005f0.setProperty("imageURL");
                              int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                              if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                              out.write("' height=\"");
                              out.print( PatronSpecs.BIG_PICTURE_HEIGHT );
                              out.write("\">\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"center\" class='ColRowBold'>\r\n                                    ");
                              out.write("\r\n                                    ");
                              //  base:showHideTag
                              com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                              _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                              // /backoffice/editpatrongeneralinfo.jsp(509,36) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fshowHideTag_005f1.setId("previewButton");
                              int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
                              if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                    ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                              // /backoffice/editpatrongeneralinfo.jsp(510,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f1.setOnclick("hideElementpreviewButton()");
                              // /backoffice/editpatrongeneralinfo.jsp(510,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f1.setName( EditPatronGeneralInfoForm.BUTTON_NAME_PREVIEW );
                              // /backoffice/editpatrongeneralinfo.jsp(510,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f1.setAlt( MessageHelper.formatMessage("preview") );
                              // /backoffice/editpatrongeneralinfo.jsp(510,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/preview2.gif");
                              int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
                              out.write("\r\n                                    &nbsp;\r\n                                    ");
                              //  base:genericButton
                              com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                              _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                              // /backoffice/editpatrongeneralinfo.jsp(512,36) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setOnclick("hideElementpreviewButton()");
                              // /backoffice/editpatrongeneralinfo.jsp(512,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setName( EditPatronGeneralInfoForm.BUTTON_NAME_CLEAR );
                              // /backoffice/editpatrongeneralinfo.jsp(512,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setAlt( MessageHelper.formatMessage("clear") );
                              // /backoffice/editpatrongeneralinfo.jsp(512,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/clear.gif");
                              int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
                              if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
                              out.write("\r\n                                    ");
                              int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_base_005fshowHideTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f1);
                              out.write("\r\n                                </td>\r\n                            </tr>\r\n                            ");
                              int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid.reuse(_jspx_th_base_005foutlinedTable_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid.reuse(_jspx_th_base_005foutlinedTable_005f0);
                          out.write("\r\n                        </td>\r\n                        <td class=\"FormLabel tdAlignRight\">");
                          out.print( MessageHelper.formatMessage("editpatrongeneralinfo_NewImage") );
                          out.write("\r\n                        </td>                \r\n                        <td class=\"FormLabel\">\r\n                            ");
                          //  html:file
                          org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
                          _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f6);
                          // /backoffice/editpatrongeneralinfo.jsp(521,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005ffile_005f0.setProperty( EditPatronGeneralInfoForm.FIELD_UPLOAD_FILE );
                          int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
                          if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fhtml_005ffile_005fproperty_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
                          out.write("\r\n                        </td>\r\n                   </tr>\r\n                </table>\r\n             </td>\r\n          </tr>\r\n       ");
                          int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
                      out.write("\r\n       ");
                      if (_jspx_meth_c_005fotherwise_005f3(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
                  out.write("\r\n    \r\n    <tr>\r\n       <td>\r\n           ");
                  if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n       </td>\r\n    </tr>\r\n    <tr>\r\n       <td class=\"tdAlignRight\">\r\n          <table>\r\n             <tr>\r\n                <td class=\"tdAlignRight\">\r\n                    ");
                  //  c:if
                  org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                  _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/editpatrongeneralinfo.jsp(542,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!form.fromUploadClassJobSummary}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                  int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
                  if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                    ");
                      //  base:spanIfAllowed
                      com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
                      _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                      // /backoffice/editpatrongeneralinfo.jsp(543,20) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fspanIfAllowed_005f0.setPermissions( new Permission[] { Permission.BACK_OFFICE_GENERATE_REPORTS_PATRON, Permission.DISTRICT_CREATE_DISTRICT_REPORTS } );
                      int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
                      if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        <span class=\"ColRow\">");
                          //  html:checkbox
                          org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f3 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                          _jspx_th_html_005fcheckbox_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_html_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
                          // /backoffice/editpatrongeneralinfo.jsp(544,45) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_html_005fcheckbox_005f3.setProperty(EditPatronGeneralInfoForm.FIELD_PRINT_LABEL_ON_SAVE);
                          int _jspx_eval_html_005fcheckbox_005f3 = _jspx_th_html_005fcheckbox_005f3.doStartTag();
                          if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_html_005fcheckbox_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fcheckbox_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fcheckbox_005f3.doInitBody();
                            }
                            do {
                              out.print( MessageHelper.formatMessage("editpatrongeneralinfo_PrintLabelOnSave") );
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
                          out.write("</span>\r\n                    ");
                          int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
                      out.write("\r\n                    ");
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
                  out.write("\r\n                    &nbsp;&nbsp;\r\n                </td>\r\n                <td class=\"tdAlignRight\">\r\n                   ");
                  if (_jspx_meth_base_005fisNotMacBrowser_005f2(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                    ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/editpatrongeneralinfo.jsp(553,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f2.setId("bottomSaveButton");
                  int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                   ");
                      if (_jspx_meth_base_005fsaveButton_005f1(_jspx_th_base_005fshowHideTag_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n                   &nbsp;\r\n                   \r\n                    ");
                      //  c:if
                      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
                      // /backoffice/editpatrongeneralinfo.jsp(557,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.showAddAdditionalSite}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n                        ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                          // /backoffice/editpatrongeneralinfo.jsp(558,24) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setOnclick("hideButtonsWithinThere()");
                          // /backoffice/editpatrongeneralinfo.jsp(558,24) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setName( EditPatronGeneralInfoForm.BUTTON_NAME_ADD_SITE );
                          // /backoffice/editpatrongeneralinfo.jsp(558,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setAlt( MessageHelper.formatMessage("addAdditionalSite") );
                          // /backoffice/editpatrongeneralinfo.jsp(558,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/addsite.gif");
                          int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fonclick_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
                          out.write("\r\n                       &nbsp;\r\n                   ");
                          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                      out.write("\r\n                   \r\n                   ");
                      if (_jspx_meth_base_005fcancelButton_005f1(_jspx_th_base_005fshowHideTag_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n                    ");
                      int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fshowHideTag_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f2);
                  out.write("\r\n                </td>\r\n                \r\n             </tr>\r\n          </table>\r\n       </td>\r\n    </tr>\r\n    ");
 if (store.isDistrictPatronizer()){ 
                  out.write("\r\n    <tr>\r\n       <td>\r\n           ");
                  if (_jspx_meth_base_005fimageLine_005f1(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n       </td>\r\n    </tr>\r\n    <tr>\r\n        <td>\r\n             <table border=\"0\" width=\"100%\">\r\n                <tr>\r\n                    <td>\r\n                    ");
                  //  base:helpIcons
                  com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag _jspx_th_base_005fhelpIcons_005f0 = (com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag) _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.HelpIconsTag.class);
                  _jspx_th_base_005fhelpIcons_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fhelpIcons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                  // /backoffice/editpatrongeneralinfo.jsp(581,20) name = buttonsToOutput type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fhelpIcons_005f0.setButtonsToOutput(new int[]{HelpIconsTag.ICON_PRIMARY_SITE_PATRON, HelpIconsTag.ICON_ADDITIONAL_SITE_PATRON} );
                  int _jspx_eval_base_005fhelpIcons_005f0 = _jspx_th_base_005fhelpIcons_005f0.doStartTag();
                  if (_jspx_th_base_005fhelpIcons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fhelpIcons_005fbuttonsToOutput_005fnobody.reuse(_jspx_th_base_005fhelpIcons_005f0);
                  out.write("\r\n                    </td>\r\n                </tr>   \r\n            </table>\r\n        </td>\r\n   </tr>          \r\n    ");
 } 
                  out.write("\r\n\r\n    \r\n");
                  int evalDoAfterBody = _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005foutlinedTableAndTabsWithinThere_005ftabs_005fselectedTabID_005fselectedTab_005fid.reuse(_jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
              out.write("\r\n\r\n");
              int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005fenctype_005faction.reuse(_jspx_th_base_005fform_005f0);
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
      out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n    function hideButtonsWithinThere() {\r\n\t  hideElementbottomSaveButton();\r\n\t  hideElementtopSaveButton();\r\n    }\r\n  // -->\r\n</script>\r\n");
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

  private boolean _jspx_meth_base_005fimageSpacer_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /backoffice/editpatrongeneralinfo.jsp(35,16) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(31);
    // /backoffice/editpatrongeneralinfo.jsp(35,16) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f0 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    // /backoffice/editpatrongeneralinfo.jsp(98,24) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("associatedList");
    // /backoffice/editpatrongeneralinfo.jsp(98,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("longID");
    // /backoffice/editpatrongeneralinfo.jsp(98,24) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f0 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    int _jspx_eval_base_005fyesNo_005f0 = _jspx_th_base_005fyesNo_005f0.doStartTag();
    if (_jspx_th_base_005fyesNo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesNo_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesNo
    com.follett.fsc.destiny.client.common.jsptag.YesNoTag _jspx_th_base_005fyesNo_005f1 = (com.follett.fsc.destiny.client.common.jsptag.YesNoTag) _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.YesNoTag.class);
    _jspx_th_base_005fyesNo_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesNo_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    int _jspx_eval_base_005fyesNo_005f1 = _jspx_th_base_005fyesNo_005f1.doStartTag();
    if (_jspx_th_base_005fyesNo_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesNo_005fnobody.reuse(_jspx_th_base_005fyesNo_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
    // /backoffice/editpatrongeneralinfo.jsp(135,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setWidth(31);
    // /backoffice/editpatrongeneralinfo.jsp(135,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f1.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f1 = _jspx_th_base_005fimageSpacer_005f1.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /backoffice/editpatrongeneralinfo.jsp(142,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setWidth(31);
    // /backoffice/editpatrongeneralinfo.jsp(142,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f2.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f2 = _jspx_th_base_005fimageSpacer_005f2.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /backoffice/editpatrongeneralinfo.jsp(148,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setWidth(31);
    // /backoffice/editpatrongeneralinfo.jsp(148,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f3.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f3 = _jspx_th_base_005fimageSpacer_005f3.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    // /backoffice/editpatrongeneralinfo.jsp(156,20) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setWidth(31);
    // /backoffice/editpatrongeneralinfo.jsp(156,20) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f4.setHeight(5);
    int _jspx_eval_base_005fimageSpacer_005f4 = _jspx_th_base_005fimageSpacer_005f4.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fmessageBox_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
    int _jspx_eval_base_005fyesButton_005f0 = _jspx_th_base_005fyesButton_005f0.doStartTag();
    if (_jspx_th_base_005fyesButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fisNotMacBrowser_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:isNotMacBrowser
    com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag _jspx_th_base_005fisNotMacBrowser_005f1 = (com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag) _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag.class);
    _jspx_th_base_005fisNotMacBrowser_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fisNotMacBrowser_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fisNotMacBrowser_005f1 = _jspx_th_base_005fisNotMacBrowser_005f1.doStartTag();
    if (_jspx_eval_base_005fisNotMacBrowser_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n               <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"Save Patron\"  name=\"savePatronOnEnter\">\r\n           ");
        int evalDoAfterBody = _jspx_th_base_005fisNotMacBrowser_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fisNotMacBrowser_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /backoffice/editpatrongeneralinfo.jsp(234,11) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setOnclick("hideButtonsWithinThere()");
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /backoffice/editpatrongeneralinfo.jsp(240,11) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcancelButton_005f0.setOnclick("hideButtonsWithinThere()");
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f1 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f1);
    // /backoffice/editpatrongeneralinfo.jsp(307,36) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("gendersID");
    // /backoffice/editpatrongeneralinfo.jsp(307,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("stringCode");
    // /backoffice/editpatrongeneralinfo.jsp(307,36) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foptions_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_005foptions_005f2 = (org.apache.struts.taglib.html.OptionsTag) _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_005foptions_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptions_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f2);
    // /backoffice/editpatrongeneralinfo.jsp(367,37) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setCollection("manageReadingPathsOptions");
    // /backoffice/editpatrongeneralinfo.jsp(367,37) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setProperty("stringCode");
    // /backoffice/editpatrongeneralinfo.jsp(367,37) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f2.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f2 = _jspx_th_html_005foptions_005f2.doStartTag();
    if (_jspx_th_html_005foptions_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                  <td colspan=\"2\">\r\n                                    &nbsp;\r\n                                  </td>\r\n                             ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                  <td colspan=\"2\">\r\n                                    &nbsp;\r\n                                  </td>\r\n                             ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f3 = _jspx_th_c_005fotherwise_005f3.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n       ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
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

  private boolean _jspx_meth_base_005fisNotMacBrowser_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:isNotMacBrowser
    com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag _jspx_th_base_005fisNotMacBrowser_005f2 = (com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag) _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.get(com.follett.fsc.destiny.client.common.jsptag.IsNotMacBrowserTag.class);
    _jspx_th_base_005fisNotMacBrowser_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fisNotMacBrowser_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTableAndTabsWithinThere_005f0);
    int _jspx_eval_base_005fisNotMacBrowser_005f2 = _jspx_th_base_005fisNotMacBrowser_005f2.doStartTag();
    if (_jspx_eval_base_005fisNotMacBrowser_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                       <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"Save Patron\"  name=\"savePatronOnEnter\">\r\n                   ");
        int evalDoAfterBody = _jspx_th_base_005fisNotMacBrowser_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_base_005fisNotMacBrowser_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fisNotMacBrowser.reuse(_jspx_th_base_005fisNotMacBrowser_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
    // /backoffice/editpatrongeneralinfo.jsp(554,19) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f1.setOnclick("hideButtonsWithinThere()");
    int _jspx_eval_base_005fsaveButton_005f1 = _jspx_th_base_005fsaveButton_005f1.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
    // /backoffice/editpatrongeneralinfo.jsp(562,19) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcancelButton_005f1.setOnclick("hideButtonsWithinThere()");
    int _jspx_eval_base_005fcancelButton_005f1 = _jspx_th_base_005fcancelButton_005f1.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f1);
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
}
