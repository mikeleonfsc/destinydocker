package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.session.common.CodeAsStringHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.session.circulation.data.*;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import java.util.List;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.destiny.entity.ejb3.FineSpecs;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.client.common.jsptag.InputBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;

public final class addfine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /circulation/addfine.jsp(26,74) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("reasons");
      // /circulation/addfine.jsp(26,74) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( FineAddForm.FORM_NAME );
      // /circulation/addfine.jsp(26,74) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setProperty("reasonList");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object reasons = null;
      reasons = (java.lang.Object) _jspx_page_context.findAttribute("reasons");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f1 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f1.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f1.setParent(null);
      // /circulation/addfine.jsp(27,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setId("searchOptions");
      // /circulation/addfine.jsp(27,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setName( FineAddForm.FORM_NAME );
      // /circulation/addfine.jsp(27,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f1.setProperty("searchOptions");
      int _jspx_eval_bean_005fdefine_005f1 = _jspx_th_bean_005fdefine_005f1.doStartTag();
      if (_jspx_th_bean_005fdefine_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005fproperty_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f1);
      java.lang.Object searchOptions = null;
      searchOptions = (java.lang.Object) _jspx_page_context.findAttribute("searchOptions");
      out.write("\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    FineAddForm form = (FineAddForm)request.getAttribute(FineAddForm.FORM_NAME);

      out.write("\r\n\r\n");

    CopyInfoBean copy = (CopyInfoBean)request.getAttribute("copyInfoBean");
    List copyList = (List)request.getAttribute("copylist");

    String newFineLink = form.getBackURL();
    String focusControl = "";
    if (form.isAddFine()) {
        focusControl = FineAddForm.FIELD_AMOUNT;
    }

    // no copy selected, and we're adding a new fines
    if (form.getFineID() == null &&
        form.getCopyID() == null && form.getSearchOption() != FineAddForm.SEARCH_OPTION_ASSET) {
        focusControl = FineAddForm.FIELD_FINE_TYPE;
    }
    
    if ( form.isAddFine() && form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) {
        if ( form.getCopyID() != null) {
            focusControl = FineAddForm.FIELD_AMOUNT;
        } else {
            focusControl = FineAddForm.FIELD_SEARCH_STRING;
        }
    }

    //On the Printer friendly version we do not want a focus control.
    if (form.isOverMaxFine() || newFineLink.length() > 0 || copyList != null) {
        focusControl = "";
    }
    
    if ( form.isShowWaiveNoteBox() ) {
        focusControl = FineAddForm.FIELD_WAIVE_NOTE;
    }
        

      out.write("\r\n\r\n");
 if (form.isOffSiteFine()) { 
        String message = "<b>" +
            MessageHelper.formatMessage("addfine_WeRecommendPrintingACopyOfTheReceiptForThisOff") +
            "</b>";

      out.write("\r\n    ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f1.setParent(null);
      // /circulation/addfine.jsp(74,4) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setShowWarningIcon(true);
      // /circulation/addfine.jsp(74,4) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setHeader( MessageHelper.formatMessage("addfine_PleaseNote") );
      // /circulation/addfine.jsp(74,4) name = message type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setMessage( message );
      // /circulation/addfine.jsp(74,4) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fmessageBox_005f1.setFilterMessage(false);
      int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
      if (_jspx_th_base_005fmessageBox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowWarningIcon_005fmessage_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f1);
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n\r\n\r\n");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /circulation/addfine.jsp(78,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName( FineAddForm.FORM_NAME );
      // /circulation/addfine.jsp(78,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("patronDeleted");
      // /circulation/addfine.jsp(78,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("false");
      // /circulation/addfine.jsp(78,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setScope("request");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /circulation/addfine.jsp(79,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName( FineAddForm.FORM_NAME );
          // /circulation/addfine.jsp(79,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("copyDeleted");
          // /circulation/addfine.jsp(79,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("false");
          // /circulation/addfine.jsp(79,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setScope("request");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\r\n");
              //  base:form
              com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005ffocus_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
              _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /circulation/addfine.jsp(81,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlefineaddform.do");
              // /circulation/addfine.jsp(81,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fform_005f0.setFocus(focusControl);
              int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
              if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n    ");
if ( form.isShowWaiveNoteBox() ) { 
                  out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"Save\"  name=\"");
                  out.print(InputBoxTag.BUTTON_SAVE);
                  out.write("\">\r\n    ");
} else {
                  out.write("\r\n    <input type=\"image\" src=\"/images/icons/general/spacer.gif\" width=\"1\" height=\"1\" border=\"0\" alt=\"\" value=\"Save\"  name=\"");
                  out.print(FineAddForm.BUTTON_GO_ON_ENTER);
                  out.write("\">\r\n    ");
} 
                  out.write("\r\n    ");
                  out.write("\r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                  // /circulation/addfine.jsp(88,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setName( FineAddForm.FORM_NAME );
                  // /circulation/addfine.jsp(88,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setProperty("overMaxFine");
                  // /circulation/addfine.jsp(88,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setValue("true");
                  // /circulation/addfine.jsp(88,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f2.setScope("request");
                  int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n         ");
                      if (_jspx_meth_html_005fhidden_005f0(_jspx_th_logic_005fequal_005f2, _jspx_page_context))
                        return;
                      out.write("\r\n         ");
                      //  base:confirmBox
                      com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag _jspx_th_base_005fconfirmBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag) _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ConfirmBoxTag.class);
                      _jspx_th_base_005fconfirmBox_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fconfirmBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
                      // /circulation/addfine.jsp(90,9) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fconfirmBox_005f0.setShowWarningIcon(true);
                      // /circulation/addfine.jsp(90,9) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fconfirmBox_005f0.setFilterMessage(false);
                      // /circulation/addfine.jsp(90,9) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fconfirmBox_005f0.setHeader(MessageHelper.formatMessage("addfine_TheNormalFineLimit",form.getMaxFineAmountForDisplay()));
                      // /circulation/addfine.jsp(90,9) name = yesName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fconfirmBox_005f0.setYesName(FineAddForm.BUTTON_CONFIRM_OVERRIDE_MAX_FINE);
                      // /circulation/addfine.jsp(90,9) name = noName type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fconfirmBox_005f0.setNoName(FineAddForm.BUTTON_CANCEL_OVERRIDE_MAX_FINE);
                      int _jspx_eval_base_005fconfirmBox_005f0 = _jspx_th_base_005fconfirmBox_005f0.doStartTag();
                      if (_jspx_th_base_005fconfirmBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fconfirmBox_005fyesName_005fshowWarningIcon_005fnoName_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005fconfirmBox_005f0);
                      out.write("                                \r\n    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
                  out.write("\r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                  // /circulation/addfine.jsp(97,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setName( FineAddForm.FORM_NAME );
                  // /circulation/addfine.jsp(97,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setProperty("overMaxFine");
                  // /circulation/addfine.jsp(97,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setValue("false");
                  // /circulation/addfine.jsp(97,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f3.setScope("request");
                  int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                      // /circulation/addfine.jsp(98,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setName( FineAddForm.FORM_NAME );
                      // /circulation/addfine.jsp(98,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setProperty("showWaiveNoteBox");
                      // /circulation/addfine.jsp(98,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setValue("true");
                      // /circulation/addfine.jsp(98,8) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f4.setScope("request");
                      int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            ");
                          //  base:inputBox
                          com.follett.fsc.destiny.client.common.jsptag.InputBoxTag _jspx_th_base_005finputBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.InputBoxTag) _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.InputBoxTag.class);
                          _jspx_th_base_005finputBox_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005finputBox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                          // /circulation/addfine.jsp(99,12) name = showWarningIcon type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setShowWarningIcon(true);
                          // /circulation/addfine.jsp(99,12) name = filterMessage type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setFilterMessage(false);
                          // /circulation/addfine.jsp(99,12) name = header type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setHeader(MessageHelper.formatMessage("addfine_ExplanationForWaiving",form.getWaive()) );
                          // /circulation/addfine.jsp(99,12) name = inputBoxLength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setInputBoxLength(60l);
                          // /circulation/addfine.jsp(99,12) name = inputBoxMaxLength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setInputBoxMaxLength(120l);
                          // /circulation/addfine.jsp(99,12) name = inputBoxName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005finputBox_005f0.setInputBoxName(FineAddForm.FIELD_WAIVE_NOTE);
                          int _jspx_eval_base_005finputBox_005f0 = _jspx_th_base_005finputBox_005f0.doStartTag();
                          if (_jspx_th_base_005finputBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005finputBox_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005finputBox_005fshowWarningIcon_005finputBoxName_005finputBoxMaxLength_005finputBoxLength_005fheader_005ffilterMessage_005fnobody.reuse(_jspx_th_base_005finputBox_005f0);
                          out.write("\r\n        ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
                  out.write("\r\n\r\n    ");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                  // /circulation/addfine.jsp(109,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f1.setProperty(FineAddForm.PARAM_ADD_FINE);
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
                  // /circulation/addfine.jsp(110,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fhidden_005f2.setProperty(FineAddForm.PARAM_HIDE_COPY_SEARCH_BOX);
                  int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
                  if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f3(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f4(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f5(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    <input type=\"hidden\" name=\"");
                  out.print(FineAddForm.BUTTON_CHANGE_SUBMIT);
                  out.write("\" value=\"false\"/>\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f6(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f7(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f8(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  if (_jspx_meth_html_005fhidden_005f9(_jspx_th_base_005fform_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n    ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                  // /circulation/addfine.jsp(119,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setName( FineAddForm.FORM_NAME );
                  // /circulation/addfine.jsp(119,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setProperty("addFine");
                  // /circulation/addfine.jsp(119,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setValue("false");
                  // /circulation/addfine.jsp(119,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setScope("request");
                  int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n        ");
                      if (_jspx_meth_html_005fhidden_005f10(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
                        return;
                      out.write("\r\n    ");
                      int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
                  out.write("\r\n\r\n");
                  //  base:outlinedTable
                  com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
                  _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
                  // /circulation/addfine.jsp(123,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#c0c0c0");
                  // /circulation/addfine.jsp(123,0) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005foutlinedTable_005f0.setWidth("95%");
                  int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
                  if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n    ");
                      out.write('\r');
                      out.write('\n');

    if (copyList != null) {

                      out.write("\r\n                <tr>\r\n                    <td colspan=\"3\">\r\n                        <table id=\"");
                      out.print(FineAddForm.TABLE_COPY_RESULTS);
                      out.write("\" width=\"100%\"  align=\"center\" cellspacing=\"0\" cellpadding=\"4\">\r\n                        <tr>\r\n                            ");
 if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { 
                      out.write("\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Barcode") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_AssetName") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Status") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Condition") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_HomeLocation") );
                      out.write("</td>\r\n                            ");
 } else { 
                      out.write("\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Barcode") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Title") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Author") );
                      out.write("</td>\r\n                                <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Status") );
                      out.write("</td>\r\n                                ");
 if(form.getSearchOption() == FineAddForm.SEARCH_OPTION_TEXTBOOK) { 
                      out.write("\r\n                                    <td class=\"SmallColHeading\">Location</td>\r\n                                ");
 } else { 
                      out.write("\r\n                                    <td class=\"SmallColHeading\">");
                      out.print( MessageHelper.formatMessage("addfine_Call") );
                      out.write("</td>\r\n                                ");
 } 
                      out.write("\r\n                            ");
 } 
                      out.write("\r\n                        </tr>\r\n                        ");
 SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request); 
                      out.write("\r\n                        ");
                      //  logic:iterate
                      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
                      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(151,24) name = length type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setLength("50");
                      // /circulation/addfine.jsp(151,24) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
                      // /circulation/addfine.jsp(151,24) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setId("row");
                      // /circulation/addfine.jsp(151,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setName( FineAddForm.FORM_NAME);
                      // /circulation/addfine.jsp(151,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setProperty("list");
                      // /circulation/addfine.jsp(151,24) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.common.data.CopyFindVO");
                      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
                      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        com.follett.fsc.destiny.session.common.data.CopyFindVO row = null;
                        java.lang.Integer flipper = null;
                        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_logic_005fiterate_005f0.doInitBody();
                        }
                        row = (com.follett.fsc.destiny.session.common.data.CopyFindVO) _jspx_page_context.findAttribute("row");
                        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                        do {
                          out.write("\r\n                            <tr valign=\"top\" ");
                          out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"" + FlipperTag.ROW_GRAY + "\"" : "" ));
                          out.write(" >\r\n                                ");
 // Display item here 
                          out.write("\r\n                                ");
 if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { 
                          out.write("\r\n                                    <td class=\"ColRow\" nowrap=\"nowrap\">");
                          out.print( form.buildCopyLink(form.getURLAction(), row, request, response) );
                          out.write("</td>\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(156,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f0.setClazz("ColRow");
                          // /circulation/addfine.jsp(156,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f0.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
                          if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f0.doInitBody();
                            }
                            do {
                              out.print( row.getTitle() );
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
                          out.write("\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(157,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f1.setClazz("ColRow");
                          // /circulation/addfine.jsp(157,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f1.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
                          if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f1.doInitBody();
                            }
                            do {
                              out.print( CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue()) );
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
                          out.write("\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(158,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f2.setClazz("ColRow");
                          // /circulation/addfine.jsp(158,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f2.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
                          if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f2.doInitBody();
                            }
                            do {
                              out.print( row.getCopyCondition() );
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
                          out.write("\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(159,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f3.setClazz("ColRow");
                          // /circulation/addfine.jsp(159,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f3.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
                          if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f3.doInitBody();
                            }
                            do {
                              out.print( row.getLocation() );
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
                          out.write("\r\n                                ");
 } else { 
                          out.write("    \r\n                                    <td class=\"ColRow\" nowrap=\"nowrap\">");
                          out.print( form.buildCopyLink(form.getURLAction(), row, request, response) );
                          out.write("</td>\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f4 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(162,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f4.setClazz("ColRow");
                          // /circulation/addfine.jsp(162,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f4.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f4 = _jspx_th_base_005ftd_005f4.doStartTag();
                          if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f4.doInitBody();
                            }
                            do {
                              out.print( row.getTitle() );
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
                          out.write("\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f5 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f5.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(163,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f5.setClazz("ColRow");
                          // /circulation/addfine.jsp(163,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f5.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f5 = _jspx_th_base_005ftd_005f5.doStartTag();
                          if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f5.doInitBody();
                            }
                            do {
                              out.print( row.getAuthor() );
                              int evalDoAfterBody = _jspx_th_base_005ftd_005f5.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005ftd_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005ftd_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f5);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f5);
                          out.write("\r\n                                    ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f6 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f6.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(164,36) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f6.setClazz("ColRow");
                          // /circulation/addfine.jsp(164,36) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f6.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f6 = _jspx_th_base_005ftd_005f6.doStartTag();
                          if (_jspx_eval_base_005ftd_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f6.doInitBody();
                            }
                            do {
                              out.print( CodeAsStringHelper.statusAsString(row.getStatus(), row.getDateDue()) );
                              int evalDoAfterBody = _jspx_th_base_005ftd_005f6.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005ftd_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005ftd_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f6);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f6);
                          out.write("\r\n                                    ");
 if(form.getSearchOption() == FineAddForm.SEARCH_OPTION_TEXTBOOK) { 
                          out.write("\r\n                                        ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f7 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(166,40) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f7.setClazz("ColRow");
                          // /circulation/addfine.jsp(166,40) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f7.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f7 = _jspx_th_base_005ftd_005f7.doStartTag();
                          if (_jspx_eval_base_005ftd_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f7.doInitBody();
                            }
                            do {
                              out.print( row.getLocation() );
                              int evalDoAfterBody = _jspx_th_base_005ftd_005f7.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005ftd_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005ftd_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f7);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f7);
                          out.write("\r\n                                    ");
 } else { 
                          out.write("\r\n                                        ");
                          //  base:td
                          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f8 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
                          _jspx_th_base_005ftd_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_base_005ftd_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
                          // /circulation/addfine.jsp(168,40) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f8.setClazz("ColRow");
                          // /circulation/addfine.jsp(168,40) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005ftd_005f8.setFiltered(true);
                          int _jspx_eval_base_005ftd_005f8 = _jspx_th_base_005ftd_005f8.doStartTag();
                          if (_jspx_eval_base_005ftd_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_base_005ftd_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005ftd_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005ftd_005f8.doInitBody();
                            }
                            do {
                              out.print( row.getCallNumber() );
                              int evalDoAfterBody = _jspx_th_base_005ftd_005f8.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_base_005ftd_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_base_005ftd_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f8);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.reuse(_jspx_th_base_005ftd_005f8);
                          out.write("\r\n                                    ");
 } 
                          out.write("\r\n                                ");
 } 
                          out.write("\r\n                            </tr>\r\n                        ");
                          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                          row = (com.follett.fsc.destiny.session.common.data.CopyFindVO) _jspx_page_context.findAttribute("row");
                          flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                      out.write("\r\n                        <tr>\r\n                            <td colspan=\"6\"><img src=\"/images/icons/general/line.gif\" height=\"2\" width=\"95%\"></td>\r\n                        </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n");

    }

                      out.write("\r\n     <tr>\r\n        <td>\r\n            ");
                      out.write("\r\n                ");
                      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/circinfo.jsp" + (("/circulation/circinfo.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("disableLinkFines", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("hideBorderTable", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("showPrintReceipt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("false", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("addEditFineView", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("offSiteFineName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( form.getOffsiteFineSiteInfo() ), request.getCharacterEncoding()), out, true);
                      out.write("\r\n        </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table id=\"");
                      out.print(FineAddForm.TABLE_FINE_BOX);
                      out.write("\" width=\"100%\">\r\n\r\n    ");
                      out.write("\r\n    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(200,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setName( FineAddForm.FORM_NAME );
                      // /circulation/addfine.jsp(200,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setProperty("addFine");
                      // /circulation/addfine.jsp(200,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setValue("true");
                      // /circulation/addfine.jsp(200,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f6.setScope("request");
                      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td nowrap>\r\n                    <table id=\"");
                          out.print(FineAddForm.TABLE_FINE_TYPE_BOX);
                          out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"3\">\r\n                        <tr>\r\n                            ");
                          out.write("\r\n                            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /circulation/addfine.jsp(207,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setName( FineAddForm.FORM_NAME );
                          // /circulation/addfine.jsp(207,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setProperty("reasonsExist");
                          // /circulation/addfine.jsp(207,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f7.setValue("false");
                          int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                <td class=\"ColRow\" colspan = \"2\">");
                              out.print( MessageHelper.formatMessage("addfine_NoPatronFineTypesDefined") );
                              out.write("</td>\r\n                                ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f11 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
                              // /circulation/addfine.jsp(209,32) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f11.setProperty(FineAddForm.FIELD_FINE_TYPE);
                              int _jspx_eval_html_005fhidden_005f11 = _jspx_th_html_005fhidden_005f11.doStartTag();
                              if (_jspx_th_html_005fhidden_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f11);
                              out.write("\r\n                            ");
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
                          out.write("\r\n                            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /circulation/addfine.jsp(211,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f8.setName( FineAddForm.FORM_NAME );
                          // /circulation/addfine.jsp(211,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f8.setProperty("reasonsExist");
                          // /circulation/addfine.jsp(211,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f8.setValue("true");
                          int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                                <td class=\"ColRowBold\">");
                              out.print( MessageHelper.formatMessage("addfine_Reason") );
                              out.write("</td>\r\n                                ");
                              out.write("\r\n                                <td class=\"ColRow\">\r\n                                        ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
                              // /circulation/addfine.jsp(215,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f0.setProperty( FineAddForm.FIELD_FINE_TYPE );
                              // /circulation/addfine.jsp(215,40) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f0.setOnchange("submitDropDown()");
                              int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
                              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f0.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              if (_jspx_meth_html_005foptions_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
                              return;
                              out.write("\r\n                                        ");
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
                              out.write("\r\n                                </td>\r\n                            ");
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
                          out.write("\r\n                            ");
                          out.write("\r\n                            <td>\r\n                                ");
                          //  base:genericButton
                          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
                          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /circulation/addfine.jsp(222,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/large/other.gif");
                          // /circulation/addfine.jsp(222,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setName(FineAddForm.BUTTON_OTHER);
                          // /circulation/addfine.jsp(222,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_base_005fgenericButton_005f0.setAlt( MessageHelper.formatMessage("other") );
                          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
                          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
                          out.write("\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n            ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                          // /circulation/addfine.jsp(228,12) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setName( FineAddForm.FORM_NAME );
                          // /circulation/addfine.jsp(228,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setProperty( FineAddForm.PARAM_HIDE_COPY_SEARCH_BOX );
                          // /circulation/addfine.jsp(228,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setValue("false");
                          // /circulation/addfine.jsp(228,12) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f9.setScope("request");
                          int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                <tr>\r\n                    <td nowrap>\r\n                    ");
                              out.write("\r\n                        ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
                              // /circulation/addfine.jsp(232,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setName( FineAddForm.FORM_NAME );
                              // /circulation/addfine.jsp(232,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setProperty("copySpecific");
                              // /circulation/addfine.jsp(232,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setValue("true");
                              // /circulation/addfine.jsp(232,24) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f10.setScope("request");
                              int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"3\" id=\"");
                              out.print(FineAddForm.TABLE_COPY_SPECIFIC);
                              out.write("\">\r\n                            <tr>\r\n                                <td class=\"ColRowBold\">\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /circulation/addfine.jsp(236,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setName(FineAddForm.FORM_NAME);
                              // /circulation/addfine.jsp(236,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setProperty("showCopyCollectionTypeList");
                              // /circulation/addfine.jsp(236,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f11.setValue("true");
                              int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
                              //  html:select
                              org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f1 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
                              _jspx_th_html_005fselect_005f1.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
                              // /circulation/addfine.jsp(237,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f1.setProperty( BaseCircForm.FIELD_SEARCH_OPTION );
                              // /circulation/addfine.jsp(237,40) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fselect_005f1.setOnchange("submitDropDown()");
                              int _jspx_eval_html_005fselect_005f1 = _jspx_th_html_005fselect_005f1.doStartTag();
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_html_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_005fselect_005f1.doInitBody();
                              }
                              do {
                              out.write("\r\n                                            ");
                              if (_jspx_meth_html_005foptions_005f1(_jspx_th_html_005fselect_005f1, _jspx_page_context))
                              return;
                              out.write("\r\n                                        ");
                              int evalDoAfterBody = _jspx_th_html_005fselect_005f1.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_html_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_html_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fselect_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f1);
                              out.write("\r\n                                        ");
 if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { 
                              out.write("\r\n                                            &nbsp;");
                              out.print( MessageHelper.formatMessage("addfine_Item") );
                              out.write("\r\n                                        ");
 } else { 
                              out.write("\r\n                                            &nbsp;");
                              out.print( MessageHelper.formatMessage("addfine_Copy") );
                              out.write("\r\n                                        ");
 } 
                              out.write("\r\n                                    ");
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
                              out.write("\r\n                                    ");
                              //  logic:equal
                              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                              _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /circulation/addfine.jsp(246,36) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setName(FineAddForm.FORM_NAME);
                              // /circulation/addfine.jsp(246,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setProperty("showCopyCollectionTypeList");
                              // /circulation/addfine.jsp(246,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_logic_005fequal_005f12.setValue("false");
                              int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
                              if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\r\n                                        ");
 if (form.getSearchOption() == FineAddForm.SEARCH_OPTION_ASSET) { 
                              out.write("\r\n                                            ");
                              out.print( MessageHelper.formatMessage("addfine_0_Item", form.getCopyMaterialsLabel()) );
                              out.write("\r\n                                        ");
 } else { 
                              out.write("\r\n                                            ");
                              out.print( MessageHelper.formatMessage("addfine_0_Copy", form.getCopyMaterialsLabel()) );
                              out.write("\r\n                                        ");
 } 
                              out.write("\r\n                                        ");
                              //  html:hidden
                              org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f12 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
                              _jspx_th_html_005fhidden_005f12.setPageContext(_jspx_page_context);
                              _jspx_th_html_005fhidden_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
                              // /circulation/addfine.jsp(252,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005fhidden_005f12.setProperty(BaseCircForm.FIELD_SEARCH_OPTION);
                              int _jspx_eval_html_005fhidden_005f12 = _jspx_th_html_005fhidden_005f12.doStartTag();
                              if (_jspx_th_html_005fhidden_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f12);
                              out.write("\r\n                                    ");
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
                              out.write("\r\n                                    ");
                              //  html:text
                              org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
                              _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
                              // /circulation/addfine.jsp(254,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_html_005ftext_005f0.setProperty( FineAddForm.FIELD_SEARCH_STRING );
                              int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
                              if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
                              out.write("\r\n                                </td>\r\n    \r\n                                <td>");
                              if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
                              return;
                              out.write("</td>\r\n    \r\n                            </tr>\r\n                            </table>\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                              return;
                              }
                              _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
                              out.write("\r\n                    </td>\r\n                </tr>\r\n            ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
                          out.write("\r\n    ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
                      out.write("\r\n\r\n    ");
                      out.write("\r\n    ");
                      //  logic:equal
                      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f13 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                      _jspx_th_logic_005fequal_005f13.setPageContext(_jspx_page_context);
                      _jspx_th_logic_005fequal_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(268,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f13.setName( FineAddForm.FORM_NAME );
                      // /circulation/addfine.jsp(268,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f13.setProperty("addFine");
                      // /circulation/addfine.jsp(268,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f13.setValue("false");
                      // /circulation/addfine.jsp(268,4) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_logic_005fequal_005f13.setScope("request");
                      int _jspx_eval_logic_005fequal_005f13 = _jspx_th_logic_005fequal_005f13.doStartTag();
                      if (_jspx_eval_logic_005fequal_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                          out.write("\r\n            <tr>\r\n                <td nowrap>\r\n                    <table id=\"");
                          out.print(FineAddForm.TABLE_FINE_TYPE_BOX);
                          out.write("\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">&nbsp; ");
                          out.print( MessageHelper.formatMessage("addfine_Reason") );
                          out.write("&nbsp;&nbsp;</td>\r\n                        <td class=\"ColRow\">");
                          //  bean:write
                          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                          _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                          _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                          // /circulation/addfine.jsp(274,43) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fwrite_005f0.setName( FineAddForm.FORM_NAME );
                          // /circulation/addfine.jsp(274,43) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_bean_005fwrite_005f0.setProperty("fineAltName");
                          int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                          if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                            return;
                          }
                          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                          out.write("\r\n                        ");
                          //  logic:equal
                          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f14 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                          _jspx_th_logic_005fequal_005f14.setPageContext(_jspx_page_context);
                          _jspx_th_logic_005fequal_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f13);
                          // /circulation/addfine.jsp(275,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f14.setName( FineAddForm.FORM_NAME );
                          // /circulation/addfine.jsp(275,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f14.setProperty("hasFineHistory");
                          // /circulation/addfine.jsp(275,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f14.setValue("true");
                          // /circulation/addfine.jsp(275,24) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_logic_005fequal_005f14.setScope("request");
                          int _jspx_eval_logic_005fequal_005f14 = _jspx_th_logic_005fequal_005f14.doStartTag();
                          if (_jspx_eval_logic_005fequal_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                              out.write("\r\n                            ");
                              //  base:link
                              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                              _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f14);
                              // /circulation/addfine.jsp(276,28) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f0.setShowTextAlways(true);
                              // /circulation/addfine.jsp(276,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005flink_005f0.setPage(form.getFineDetailsLink());
                              int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_base_005flink_005f0.doInitBody();
                              }
                              do {
                              out.write("\r\n                                ");
                              //  base:image
                              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
                              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
                              // /circulation/addfine.jsp(277,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/detailsover.gif");
                              // /circulation/addfine.jsp(277,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("details"));
                              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
                              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                              out.write("\r\n                            ");
                              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage.reuse(_jspx_th_base_005flink_005f0);
                              return;
                              }
                              _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpage.reuse(_jspx_th_base_005flink_005f0);
                              out.write("\r\n                        ");
                              int evalDoAfterBody = _jspx_th_logic_005fequal_005f14.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                          }
                          if (_jspx_th_logic_005fequal_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
                            return;
                          }
                          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f14);
                          out.write("                       \r\n                        </td>\r\n                    </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n    ");
                          int evalDoAfterBody = _jspx_th_logic_005fequal_005f13.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                      }
                      if (_jspx_th_logic_005fequal_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                        return;
                      }
                      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f13);
                      out.write("\r\n\r\n    ");
                      out.write('\r');
                      out.write('\n');

    if (copy != null  && form.isCopySpecific()) {

                      out.write("\r\n            <tr>\r\n                <td>\r\n                    <table id=\"");
                      out.print(FineAddForm.TABLE_COPY_BOX);
                      out.write("\" cellspacing=\"5\" cellpadding=\"5\">\r\n                    <tr>\r\n                        ");
if (copy.getCollectionType() != CollectionType.ASSET || copy.isTemplateForTextbooks(form.getStore(), copy.getCopyID())) { 
                      out.write("\r\n                        <td class=\"ColRow\" vAlign=\"top\">\r\n                                ");
                      out.print(BibType.getBibTypeIcon(copy.isStateOwned(), copy.getMaterialType(), copy.getMaterialSubType(), copy.getCollectionType(), null, null));
                      out.write("\r\n                        </td>\r\n                        <td vAlign=\"top\" >\r\n                        ");
 } else { 
                      out.write("\r\n                        <td vAlign=\"top\" colspan=\"2\">\r\n                        ");
 } 
                      out.write("\r\n                            <span class=\"ColRowBold\">");
                      out.print(ResponseUtils.filter(copy.getCopyTitle()));
                      out.write("</span>&nbsp;\r\n                            ");

                                if (copy.isCopyTemporary()) {
                            
                      out.write("\r\n                                ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(307,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setSrc("/icons/materialtype/temp.gif");
                      // /circulation/addfine.jsp(307,32) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setWidth(19);
                      // /circulation/addfine.jsp(307,32) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setHeight(16);
                      // /circulation/addfine.jsp(307,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("addfine_TemporaryCopy") );
                      int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                      if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                      out.write("\r\n                            ");

                                }
                            
                      out.write("\r\n                            <span class=\"SmallColRow\">\r\n                            ");
 if(!copy.isCopyDeleted() /* &&  !StringHelper.isEmpty(copy.getCopyBarcode())*/ ) { 
                      out.write("\r\n                                (");
 
                                    String msg = (copy.getCollectionType() == CollectionType.ASSET) ? "addfine_ItemColon" : "addfine_CopyColon";
                                    out.print(MessageHelper.formatMessage(msg));
                                 
                      out.write("\r\n                                ");
 if (!StringHelper.isEmpty(copy.getCopyBarcode())) { 
                      out.write("\r\n                                    ");
 if(form.isOffsiteCopy()) { 
                      out.write("\r\n                                        ");
 out.print(ResponseUtils.filter(form.gimmeOffsiteCopyInfo())); 
                      out.write("\r\n                                    ");
 } else { 
                      out.write("\r\n                                        ");
Permission perm;
                                        if ( copy.getCollectionType() == CollectionType.TEXTBOOK) {
                                            perm = Permission.CIRC_VIEW_COPY_STATUS_TEXTBOOK;
                                        } else if (copy.getCollectionType() == CollectionType.ASSET) { 
                                            perm = Permission.CIRC_VIEW_ITEM_STATUS;
                                        } else {
                                            perm = Permission.CIRC_VIEW_COPY_STATUS;
                                        }
                                        
                      out.write("\r\n                                        ");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(330,40) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setShowTextAlways(true);
                      // /circulation/addfine.jsp(330,40) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setPage(form.getCopyStatusLink());
                      // /circulation/addfine.jsp(330,40) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f1.setPermission(perm);
                      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f1.doInitBody();
                        }
                        do {
                          out.print(ResponseUtils.filter(copy.getDisplayableBarcode()));
                          int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fpage.reuse(_jspx_th_base_005flink_005f1);
                      out.write(")\r\n                                     ");
 } 
                      out.write("\r\n                                 ");
 } else { 
                      out.write("\r\n                                    ");
 if(form.isOffsiteCopy()) { 
                      out.write("\r\n                                        ");
 out.print(ResponseUtils.filter(form.gimmeOffsiteCopyInfoNoBarcode())); 
                      out.write("\r\n                                    ");
 } else { 
                      out.write("\r\n                                        ");
                      out.print(MessageHelper.formatMessage("addfine_NoBarcode"));
                      out.write(")\r\n                                    ");
 } 
                      out.write("\r\n                                 ");
 } 
                      out.write("\r\n                             ");
 } else { 
                      out.write("\r\n                                    ");
                      out.print(form.gimmeCopyDeletedBarcodeDisplay(copy));
                      out.write("\r\n                             ");
 } 
                      out.write("\r\n                                </span>\r\n                        </td>\r\n                        <td vAlign=\"top\" class=\"ColRowBold\">\r\n                            ");
 
                                if (copy.getCollectionType() == CollectionType.ASSET) {
                                    if(!StringHelper.isEmpty(copy.getLocation())) {
                                        out.println(ResponseUtils.filter(copy.getLocation()));
                                    }
                                } else { 
                                    out.println(ResponseUtils.filter(copy.getCopyAuthor()));
                                }
                            
                      out.write("&nbsp;\r\n                        </td>\r\n                        <td vAlign=\"top\" class=\"ColRowBold\">\r\n                            ");

                                if (copy.getCopyCallNumber() != null) {
                                    out.println(ResponseUtils.filter(copy.getCopyCallNumber()));
                                }
                            
                      out.write("&nbsp;\r\n                        </td>\r\n                    </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n");

    }

                      out.write("\r\n\r\n        <tr>\r\n                  \r\n            <td>\r\n                ");
                      if (_jspx_meth_base_005ffineInfo_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                        return;
                      out.write("        \r\n            </td>\r\n        </tr>\r\n        \r\n             \r\n        <tr>\r\n            <td valign=\"top\">\r\n                <table>\r\n                    <tr>\r\n                    <td valign=\"top\" class=\"ColRowBold\">");
                      out.print( MessageHelper.formatMessage("addfine_FineNote") );
                      out.write("</td>\r\n                    </tr>\r\n                    <tr>\r\n                    <td>\r\n                        ");
                      //  html:textarea
                      org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f0 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
                      _jspx_th_html_005ftextarea_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(386,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftextarea_005f0.setProperty(FineAddForm.FIELD_FINE_NOTE);
                      // /circulation/addfine.jsp(386,24) name = rows type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftextarea_005f0.setRows("3");
                      // /circulation/addfine.jsp(386,24) name = cols type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005ftextarea_005f0.setCols("55");
                      int _jspx_eval_html_005ftextarea_005f0 = _jspx_th_html_005ftextarea_005f0.doStartTag();
                      if (_jspx_th_html_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fhtml_005ftextarea_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
                      out.write("\r\n                    </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n \r\n        <tr>\r\n            <td class=\"ColRow tdAlignRight\">\r\n                ");
                      //  html:checkbox
                      org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                      _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
                      // /circulation/addfine.jsp(395,16) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_html_005fcheckbox_005f0.setProperty(FineAddForm.FIELD_PRINT_RECEIPT);
                      int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                      if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_html_005fcheckbox_005f0.doInitBody();
                        }
                        do {
                          out.print( MessageHelper.formatMessage("addfine_PrintReceipt") );
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
                      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n                ");
                      if (_jspx_meth_base_005fsaveButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                        return;
                      out.write("&nbsp;&nbsp;\r\n                ");
                      if (_jspx_meth_base_005fcancelButton_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
                        return;
                      out.write("\r\n            </td>\r\n        </tr>\r\n            \r\n        </table>\r\n        </td>\r\n    </tr>\r\n");
                      int evalDoAfterBody = _jspx_th_base_005foutlinedTable_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005foutlinedTable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fborderColor.reuse(_jspx_th_base_005foutlinedTable_005f0);
                  out.write('\r');
                  out.write('\n');
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
              out.write("\r\n\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\n  <!--\r\n    function submitDropDown() {\r\n            document.");
              out.print(FineAddForm.FORM_NAME);
              out.write('.');
              out.print(FineAddForm.BUTTON_CHANGE_SUBMIT);
              out.write(".value = \"true\";\r\n            document.");
              out.print(FineAddForm.FORM_NAME);
              out.write(".submit();\r\n    }\r\n  // -->\r\n</script>\r\n\r\n");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
          out.write(' ');
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      out.write(' ');
      out.write('\r');
      out.write('\n');
 if (form.isOffSiteFine()) { 
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
      out.write('\r');
      out.write('\n');
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      // /circulation/addfine.jsp(420,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setName(FineAddForm.FORM_NAME);
      // /circulation/addfine.jsp(420,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setProperty("soundFile");
      // /circulation/addfine.jsp(420,0) name = scope type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fpresent_005f0.setScope("request");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\nsetSound(\"");
          //  bean:write
          org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
          _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
          _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          // /circulation/addfine.jsp(423,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f1.setName(FineAddForm.FORM_NAME);
          // /circulation/addfine.jsp(423,10) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_bean_005fwrite_005f1.setProperty("soundFile");
          int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
          if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
          out.write("\");\r\n//-->\r\n </script>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fscope_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write('\r');
      out.write('\n');
 } 
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
    // /circulation/addfine.jsp(29,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
    // /circulation/addfine.jsp(89,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("showWaiveNoteBox");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(111,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("overMaxFine");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(112,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("fineID");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(113,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("copyID");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(115,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("bibID");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f7 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f7.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(116,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f7.setProperty("patronTypeID");
    int _jspx_eval_html_005fhidden_005f7 = _jspx_th_html_005fhidden_005f7.doStartTag();
    if (_jspx_th_html_005fhidden_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f7);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f8 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f8.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(117,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f8.setProperty("circTypeID");
    int _jspx_eval_html_005fhidden_005f8 = _jspx_th_html_005fhidden_005f8.doStartTag();
    if (_jspx_th_html_005fhidden_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f8);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f9 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f9.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/addfine.jsp(118,4) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f9.setProperty("savedFineAmount");
    int _jspx_eval_html_005fhidden_005f9 = _jspx_th_html_005fhidden_005f9.doStartTag();
    if (_jspx_th_html_005fhidden_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f9);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f10 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f10.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    // /circulation/addfine.jsp(120,8) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f10.setProperty("fineType");
    int _jspx_eval_html_005fhidden_005f10 = _jspx_th_html_005fhidden_005f10.doStartTag();
    if (_jspx_th_html_005fhidden_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f10);
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
    // /circulation/addfine.jsp(216,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setCollection("reasons");
    // /circulation/addfine.jsp(216,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setProperty("fineTypeID");
    // /circulation/addfine.jsp(216,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f0.setLabelProperty("description");
    int _jspx_eval_html_005foptions_005f0 = _jspx_th_html_005foptions_005f0.doStartTag();
    if (_jspx_th_html_005foptions_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f0);
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
    // /circulation/addfine.jsp(238,44) name = collection type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setCollection("searchOptions");
    // /circulation/addfine.jsp(238,44) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setProperty("longID");
    // /circulation/addfine.jsp(238,44) name = labelProperty type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005foptions_005f1.setLabelProperty("stringDesc");
    int _jspx_eval_html_005foptions_005f1 = _jspx_th_html_005foptions_005f1.doStartTag();
    if (_jspx_th_html_005foptions_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptions_005fproperty_005flabelProperty_005fcollection_005fnobody.reuse(_jspx_th_html_005foptions_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005ffineInfo_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:fineInfo
    com.follett.fsc.destiny.client.circulation.jsptag.FineInfoTag _jspx_th_base_005ffineInfo_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.FineInfoTag) _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.FineInfoTag.class);
    _jspx_th_base_005ffineInfo_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005ffineInfo_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    int _jspx_eval_base_005ffineInfo_005f0 = _jspx_th_base_005ffineInfo_005f0.doStartTag();
    if (_jspx_th_base_005ffineInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody.reuse(_jspx_th_base_005ffineInfo_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005ffineInfo_005fnobody.reuse(_jspx_th_base_005ffineInfo_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fsaveButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:saveButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag _jspx_th_base_005fsaveButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag) _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.SaveButtonTag.class);
    _jspx_th_base_005fsaveButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fsaveButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /circulation/addfine.jsp(396,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fsaveButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fsaveButton_005f0 = _jspx_th_base_005fsaveButton_005f0.doStartTag();
    if (_jspx_th_base_005fsaveButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fsaveButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fsaveButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fcancelButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005foutlinedTable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:cancelButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag _jspx_th_base_005fcancelButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag) _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag.class);
    _jspx_th_base_005fcancelButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcancelButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
    // /circulation/addfine.jsp(397,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcancelButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fcancelButton_005f0 = _jspx_th_base_005fcancelButton_005f0.doStartTag();
    if (_jspx_th_base_005fcancelButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcancelButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcancelButton_005f0);
    return false;
  }
}
