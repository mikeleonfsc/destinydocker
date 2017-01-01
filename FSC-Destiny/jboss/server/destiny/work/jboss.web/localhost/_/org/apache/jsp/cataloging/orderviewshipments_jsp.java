package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.destiny.entity.ejb3.OrdersSpecs;
import com.follett.fsc.common.StringHelper;
import org.apache.struts.util.ResponseUtils;
import java.util.Iterator;
import com.follett.fsc.destiny.session.cataloging.data.ShipmentInfoVO;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.session.cataloging.data.OrderBibShipmentVO;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.util.marc.BibType;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.LocaleHelper;
import java.util.List;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.CurrencyValue;

public final class orderviewshipments_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.release();
    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    OrderViewShipmentsForm form = (OrderViewShipmentsForm)request.getAttribute(OrderViewShipmentsForm.FORM_NAME);
    SessionStoreProxy store = form.getSessionStore();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /cataloging/orderviewshipments.jsp(36,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/cataloging/servlet/handleorderviewshipmentsform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(37,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setName(OrderViewShipmentsForm.FORM_NAME);
          // /cataloging/orderviewshipments.jsp(37,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setProperty(OrderViewShipmentsForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED);
          // /cataloging/orderviewshipments.jsp(37,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f0.setValue("false");
          int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
          if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(38,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(OrderViewShipmentsForm.PARAM_CONFIRM_MODE );
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
          // /cataloging/orderviewshipments.jsp(39,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(OrderViewShipmentsForm.PARAM_LAST_SHOW_MORE_ID );
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(40,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setProperty(OrderViewShipmentsForm.PARAM_COLLECTION_TYPE);
          // /cataloging/orderviewshipments.jsp(40,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f3.setValue(String.valueOf(form.getCollectionType()));
          int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
          if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(42,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(OrderViewShipmentsForm.FORM_NAME);
          // /cataloging/orderviewshipments.jsp(42,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty(OrderViewShipmentsForm.PARAM_CONFIRM_MODE);
          // /cataloging/orderviewshipments.jsp(42,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue( String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_LOST) );
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f1 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
              // /cataloging/orderviewshipments.jsp(43,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f1.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f1 = _jspx_th_base_005fmessageBox_005f1.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                ");
                  out.print(form.gimmeMarkLostCopiesMessage() );
                  out.write("\r\n\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"ColRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f1);
                  // /cataloging/orderviewshipments.jsp(55,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f0.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f0 = _jspx_th_base_005fshowHideTag_005f0.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f0(_jspx_th_base_005fshowHideTag_005f0, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
                      // /cataloging/orderviewshipments.jsp(56,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f0.setName(OrderViewShipmentsForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f0 = _jspx_th_base_005fnoButton_005f0.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f0);
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        ");
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
          // /cataloging/orderviewshipments.jsp(63,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(OrderViewShipmentsForm.FORM_NAME);
          // /cataloging/orderviewshipments.jsp(63,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty(OrderViewShipmentsForm.PARAM_CONFIRM_MODE);
          // /cataloging/orderviewshipments.jsp(63,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue(String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_DELETE_ALL) );
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f2 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
              // /cataloging/orderviewshipments.jsp(64,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f2.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f2 = _jspx_th_base_005fmessageBox_005f2.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                ");
                  out.print(form.gimmeDeleteCopiesMessage() );
                  out.write("\r\n\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"colRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f2);
                  // /cataloging/orderviewshipments.jsp(76,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f1.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f1 = _jspx_th_base_005fshowHideTag_005f1.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f1(_jspx_th_base_005fshowHideTag_005f1, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f1.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
                      // /cataloging/orderviewshipments.jsp(77,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f1.setName(OrderViewShipmentsForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f1 = _jspx_th_base_005fnoButton_005f1.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f1);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f1);
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f2);
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
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(84,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName(OrderViewShipmentsForm.FORM_NAME);
          // /cataloging/orderviewshipments.jsp(84,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty(OrderViewShipmentsForm.PARAM_CONFIRM_MODE);
          // /cataloging/orderviewshipments.jsp(84,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue(String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_REVIVE_SHIPMENT) );
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f3 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
              // /cataloging/orderviewshipments.jsp(85,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f3.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f3 = _jspx_th_base_005fmessageBox_005f3.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                Are you sure you want to revive this shipment that was marked as incomplete?\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"colRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f3);
                  // /cataloging/orderviewshipments.jsp(96,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f2.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f2 = _jspx_th_base_005fshowHideTag_005f2.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f2(_jspx_th_base_005fshowHideTag_005f2, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
                      // /cataloging/orderviewshipments.jsp(97,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f2.setName(OrderViewShipmentsForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f2 = _jspx_th_base_005fnoButton_005f2.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f2);
                      out.write("\r\n                        ");
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
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f3);
              out.write('\r');
              out.write('\n');
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
          out.write('\r');
          out.write('\n');
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(104,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setName(OrderViewShipmentsForm.FORM_NAME);
          // /cataloging/orderviewshipments.jsp(104,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setProperty(OrderViewShipmentsForm.PARAM_CONFIRM_MODE);
          // /cataloging/orderviewshipments.jsp(104,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f3.setValue(String.valueOf(OrderViewShipmentsForm.CONFIRM_MODE_INCOMPLETE) );
          int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
          if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:messageBox
              com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f4 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
              _jspx_th_base_005fmessageBox_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fmessageBox_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
              // /cataloging/orderviewshipments.jsp(105,8) name = showRedBorder type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fmessageBox_005f4.setShowRedBorder(true);
              int _jspx_eval_base_005fmessageBox_005f4 = _jspx_th_base_005fmessageBox_005f4.doStartTag();
              if (_jspx_eval_base_005fmessageBox_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n        <tr>\r\n            <td valign=\"top\">");
                  out.print(MessageBoxTag.getCAUTION_IMAGE_HTML());
                  out.write("</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                This shipment has unreceived copies.\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" align=\"center\" class=\"ColRow\">\r\n                All unreceived copies will be marked lost in your inventory and your\r\n                school will be charged unless you immediately notify the\r\n                State Textbook Office of the shortage.\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td valign=\"baseline\" class=\"ColRowBold\" align=\"center\">\r\n                Are you sure you want to mark this shipment as incomplete?\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>&nbsp;</td>\r\n            <td class=\"colRowBold\">\r\n                    <div align=\"center\">\r\n                        ");
                  //  base:showHideTag
                  com.follett.fsc.destiny.client.common.jsptag.ShowHideTag _jspx_th_base_005fshowHideTag_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ShowHideTag) _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.get(com.follett.fsc.destiny.client.common.jsptag.ShowHideTag.class);
                  _jspx_th_base_005fshowHideTag_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fshowHideTag_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f4);
                  // /cataloging/orderviewshipments.jsp(130,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fshowHideTag_005f3.setId("onYes");
                  int _jspx_eval_base_005fshowHideTag_005f3 = _jspx_th_base_005fshowHideTag_005f3.doStartTag();
                  if (_jspx_eval_base_005fshowHideTag_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                            ");
                      if (_jspx_meth_base_005fyesButton_005f3(_jspx_th_base_005fshowHideTag_005f3, _jspx_page_context))
                        return;
                      out.write("&nbsp;");
                      //  base:noButton
                      com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag _jspx_th_base_005fnoButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag) _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.NoButtonTag.class);
                      _jspx_th_base_005fnoButton_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fnoButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f3);
                      // /cataloging/orderviewshipments.jsp(131,80) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fnoButton_005f3.setName(OrderViewShipmentsForm.BUTTON_NO);
                      int _jspx_eval_base_005fnoButton_005f3 = _jspx_th_base_005fnoButton_005f3.doStartTag();
                      if (_jspx_th_base_005fnoButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fnoButton_005fname_005fnobody.reuse(_jspx_th_base_005fnoButton_005f3);
                      out.write("\r\n                        ");
                      int evalDoAfterBody = _jspx_th_base_005fshowHideTag_005f3.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                  }
                  if (_jspx_th_base_005fshowHideTag_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fshowHideTag_005fid.reuse(_jspx_th_base_005fshowHideTag_005f3);
                  out.write("\r\n                    </div>\r\n            </td>\r\n        </tr>\r\n        \r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fmessageBox_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fmessageBox_005fshowRedBorder.reuse(_jspx_th_base_005fmessageBox_005f4);
              out.write("\r\n        <br>\r\n");
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
          out.write("\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\n    function viewNotes() {\r\n        document.");
          out.print(OrderViewShipmentsForm.FORM_NAME);
          out.write('.');
          out.print(OrderViewShipmentsForm.PARAM_ORDER_NOTES_VIEW_LINK_PRESSED);
          out.write(".value = \"true\";\r\n        document.");
          out.print(OrderViewShipmentsForm.FORM_NAME);
          out.write(".submit();\r\n    }\r\n      \r\n//-->\r\n</script>\r\n\r\n\r\n\t<table id=\"");
          out.print(OrderViewShipmentsForm.TABLE_MAIN);
          out.write("\" cellSpacing=\"0\" cellPadding=\"3\" width=\"100%\" border=\"0\">\r\n    <tr>\r\n        <td class=\"TableHeading\" valign=\"top\">\r\n            Shipments");
          out.print(store.isDistrictUser() || store.isAtDistrictWarehouse() ? (" for " + ResponseUtils.filter((store.isStateContext()?(form.getVo().getDistrictName() + " - "):"") + form.getVo().getSiteName())) : "" );
          out.write("\r\n        </td>\r\n        <td>\r\n            &nbsp;\r\n        </td>\r\n    </tr>\r\n    ");
if(!StringHelper.isEmpty(form.getVo().getOrderVO().getOrderNumber())){ 
          out.write("\r\n        <tr>\r\n            <td class=\"ColRow\" valign=\"top\">\r\n                <b>Order #:</b>&nbsp;");
          out.print(form.getVo().getOrderVO().getOrderNumber() );
          out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                ");
          if (_jspx_meth_base_005fcloseButton_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n            </td>\r\n        </tr>\r\n    ");
 } 
          out.write("\r\n    ");
if(form.isBackordered()){ 
          out.write("\r\n        <tr>\r\n            <td class=\"ColRowBold\" valign=\"top\">\r\n                ");
          if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n                <a href=");
          out.print("/cataloging/servlet/handleorderviewshipmentsform.do?" + OrderViewShipmentsForm.PARAM_BACKORDERED_LINK + "=true");
          out.write(">This order has backordered items.</a>\r\n            </td>\r\n        </tr>\r\n    ");
 } 
          out.write("\r\n    ");
if(!StringHelper.isEmpty(form.getAddViewNoteLinkText())){ 
          out.write("\r\n        <tr>\r\n            <td class=\"ColRow\" valign=\"top\">\r\n                ");
          if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write("&nbsp;<a href=\"javascript:viewNotes();\">");
          out.print(form.getAddViewNoteLinkText() );
          out.write("</a>\r\n            </td>\r\n            <td>\r\n                &nbsp;\r\n            </td>\r\n        </tr>\r\n        <tr><td class=\"Instruction\" colspan=\"2\">&nbsp;</td></tr>\r\n    ");
} 
          out.write("\r\n     ");
if(!store.isStateRepositoryRunning() && store.isAtDistrictWarehouse() && 
            (form.getVo().getOrderVO().getStatus() ==  OrdersSpecs.STATUS_ON_ORDER || form.isBackordered())){ 
          out.write("\r\n       <tr>\r\n          <td class=\"ColRow\" valign=\"top\">&nbsp;\r\n           </td>       \r\n          <td class=\"tdAlignRight\">\r\n            <input type=\"image\" align=\"bottom\" src='");
          out.print(lh.getLocalizedImagePath("/buttons/large/addshipment.gif"));
          out.write("'  alt=\"");
          out.print( OrderViewShipmentsForm.ALT_ADD_SHIPMENT );
          out.write("\" title=\"");
          out.print( OrderViewShipmentsForm.ALT_ADD_SHIPMENT );
          out.write("\" name=\"");
          out.print( OrderViewShipmentsForm.BUTTON_ADD_SHIPMENT );
          out.write("\"/>\r\n          </td>\r\n       </tr>\r\n    ");
} 
          out.write("\r\n    \r\n    ");
if(form.getVo().getShipments().size() > 0) { 
          out.write("\r\n    <tr>\r\n        <td background=\"/images/icons/general/thickline.gif\" nowrap colspan=\"2\" width=\"100%\" valign=\"top\">\r\n            <span class=\"colRow\">&nbsp;&nbsp;</span><span class=\"SectionHeader\">&nbsp;Shipments&nbsp;</span>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"2\">\r\n            <table cellspacing=\"0\" cellpadding=\"3\" id=\"");
          out.print(OrderViewShipmentsForm.TABLE_SHIPMENTS );
          out.write("\" width=\"100%\">\r\n            ");
int flipper = 0; 
          out.write("\r\n                <tr valign=\"top\" class=\"SmallColHeading\">\r\n                    <td nowrap>\r\n                        <a id=\"");
          out.print(OrderViewShipmentsForm.LINK_DATE_SHIPPED );
          out.write("\" href=\"/cataloging/servlet/handleorderviewshipmentsform.do?sortDesc=");
          out.print(Boolean.toString(!form.isSortDesc()) );
          out.write("\" >Date Shipped\r\n                        ");
 if (form.isSortDesc()) { 
          out.write("\r\n                            <img src=\"");
          out.print(lh.getLocalizedImagePath("/icons/general/descend.gif"));
          out.write(" border=\"0\"></a>\r\n                        ");
 } else { 
          out.write("\r\n                            <img src=\"");
          out.print(lh.getLocalizedImagePath("/icons/general/ascend.gif"));
          out.write(" border=\"0\"></a>\r\n                        ");
 } 
          out.write("\r\n                    </td>\r\n                    ");
if(store.isStateRepositoryRunning()){ 
          out.write("\r\n                        <td>Carrier</td>\r\n                        <td>Tracking<br/>Number</td>\r\n                        <td>Weight</td>\r\n                    ");
} else { 
          out.write("\r\n                        <td>&nbsp;</td>\r\n                        <td>&nbsp;</td>\r\n                        <td>&nbsp;</td>\r\n                    ");
 } 
          out.write(" \r\n                    <td class=\"tdAlignRight\">Value</td>                   \r\n                    <td>&nbsp;</td>\r\n                </tr>\r\n                    ");
 Iterator<ShipmentInfoVO> itr = form.getVo().getShipments().iterator(); 
                        while(itr.hasNext()){
                            ShipmentInfoVO siVO = itr.next();
                            String fontStart = "";
                            String fontEnd = "";
                            boolean showCopyResolution = siVO.checkAnyShipmentsIncomplete();
                            if(store.isStateContext() && showCopyResolution && form.checkForUnresolvedShipment(siVO.getShipmentVO().getShipmentID())) {
                                fontStart = "<font color=\"#CC0000\">";
                                fontEnd = "</font>";
                            }
                    
          out.write("\r\n                <tr ");
          out.print((flipper++%2==0)?("bgcolor=\"" + FlipperTag.ROW_GRAY)+ "\"":"");
          out.write(" class=\"ColRow\">\r\n                    <td id=\"");
          out.print(OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_SHIPMENT + siVO.getShipmentVO().getShipmentID() );
          out.write('"');
          out.write('>');
          out.print( fontStart + lh.formatDate(siVO.getShipmentVO().getCreated()) + fontEnd );
          out.write("</td>\r\n                    ");
if(store.isStateRepositoryRunning()){ 
          out.write("\r\n                        <td>");
          out.print( fontStart + JSPHelper.filterHtmlAndNulls(siVO.getCarrierName(),true) + fontEnd );
          out.write("</td>\r\n                        <td>");
          out.print( fontStart + JSPHelper.filterHtmlAndNulls(siVO.getShipmentVO().getTrackingNumber(),true) + fontEnd );
          out.write("</td>\r\n                        <td>");
          out.print( fontStart + JSPHelper.filterHtmlAndNulls(siVO.getShipmentVO().getWeight(),true) + fontEnd );
          out.write("</td>\r\n                     ");
} else { 
          out.write("\r\n                        <td>&nbsp;</td>\r\n                        <td>&nbsp;</td>\r\n                        <td>&nbsp;</td>\r\n                     ");
 } 
          out.write("\r\n                    <td class=\"tdAlignRight\">");
          out.print( fontStart + lh.formatCurrency(new CurrencyValue(new Long(siVO.getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) + fontEnd );
          out.write("</td>\r\n                    <td class=\"ColRow tdAlignRight\" width=\"200\"> \r\n                        ");
if(siVO.getShipmentVO().getShipmentID().equals(form.getShowMoreID())){ 
          out.write("\r\n                            <a class=\"DetailLink\" id=\"");
          out.print(OrderViewShipmentsForm.LINK_SHOW_LESS);
          out.write("\" \r\n                                href=\"/cataloging/servlet/handleorderviewshipmentsform.do?showMoreTransferID=&showMoreBibID=&showMoreID=\">\r\n                                Show Less&nbsp;<img src='");
          out.print(lh.getLocalizedImagePath("/icons/general/showless.gif"));
          out.write("' border=\"0\">\r\n                             </a>\r\n                        ");
} else { 
          out.write("                        \r\n                            <a class=\"DetailLink\" id=\"");
          out.print(OrderViewShipmentsForm.LINK_SHOW_MORE_PREFIX + siVO.getShipmentVO().getShipmentID());
          out.write("\" \r\n                                href=\"/cataloging/servlet/handleorderviewshipmentsform.do?showMoreID=");
          out.print(siVO.getShipmentVO().getShipmentID() );
          out.write("#anchorShipment\" >\r\n                                Show More&nbsp;<img src='");
          out.print(lh.getLocalizedImagePath("/icons/general/showmore.gif"));
          out.write("' border=\"0\">\r\n                            </a>\r\n                        ");
} 
          out.write("\r\n                    ");
 if (store.isAtDistrictWarehouse()) { 
          out.write("\r\n                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(268,59) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setName(OrderViewShipmentsForm.BUTTON_PRINT_PACKING_LIST + siVO.getShipmentVO().getShipmentID() );
          // /cataloging/orderviewshipments.jsp(268,59) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setSrc("/icons/general/runrma.gif");
          // /cataloging/orderviewshipments.jsp(268,59) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f0.setAlt("Print Packing List");
          int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
          out.write("\r\n                    ");
 } 
          out.write("\r\n                </tr>\r\n                ");
if(siVO.getShipmentVO().getShipmentID().equals(form.getShowMoreID())){
          out.write("\r\n                    <tr>\r\n                        <td colspan=\"6\" align=\"center\">\r\n                            <a name=\"anchorShipment\"></a>\r\n                            <table cellspacing=\"0\" cellpadding=\"3\" id=\"");
          out.print(OrderViewShipmentsForm.TABLE_SHOW_MORE );
          out.write("\" width=\"95%\">\r\n                                <tr class=\"SmallColHeading\">\r\n                                   <td colspan=\"3\">&nbsp;</td>\r\n                                   <td colspan=\"2\" align=\"center\"><nobr>-- Shipped/Received --</nobr></td>\r\n                                   <td>&nbsp;</td>\r\n                                </tr>\r\n                                <tr valign=\"top\" class=\"SmallColHeading\">\r\n                                   <td>\r\n                                   ");
          out.print(form.getCollectionType() == CollectionType.ASSET ? "Resource/Price" : "Title/Price" );
          out.write("\r\n                                   </td>\r\n                                   <td align=\"center\" >Ordered</td>\r\n                                   ");
 if (store.isStateRepositoryRunning()) { 
          out.write("\r\n                                    <td align=\"center\" >Canceled</td>\r\n                                   ");
 } else { 
          out.write("\r\n                                    <td >&nbsp;</td>\r\n                                   ");
 } 
          out.write("\r\n                                   <td align=\"center\" >Barcoded</td>\r\n                                   <td align=\"center\" >Unbarcoded</td>\r\n                                   <td class=\"tdAlignRight\">Value</td>\r\n                                </tr>\r\n                                \r\n                                ");
Iterator<OrderBibShipmentVO> itr2 = siVO.getOrderBibShipmentList().iterator();
                                int flipper2 = 0;
                                boolean showIncompleteButton = false;
                                while(itr2.hasNext()){
                                    OrderBibShipmentVO bibVO = itr2.next();
          out.write("\r\n                                    <tr ");
          out.print((flipper2%2==0)?("bgcolor=\"" + FlipperTag.ROW_GRAY)+ "\"":"");
          out.write(" class=\"ColRow\" valign=\"top\">\r\n                                        <td>\r\n                                        ");
 if(form.getCollectionType() == CollectionType.TEXTBOOK || bibVO.isTextbookResource()) {
          out.write("\r\n                                            ");
          out.print( BibType.getBibTypeIcon(store.isStateRepositoryRunning(), bibVO.getBibType(), null, form.getCollectionType(), null, null) );
          out.write("\r\n                                        ");
 } 
          out.write("\r\n                                        <a id=\"");
          out.print(OrderViewShipmentsForm.LINK_ID_VIEW_TITLE + bibVO.getBibID() );
          out.write("\" href=\"/cataloging/servlet/");
          out.print(form.getCollectionType() == CollectionType.ASSET ? "presentassetdescriptiondetailform.do" : "presenttextbookdetailform.do" );
          out.write("?bibID=");
          out.print(bibVO.getBibID());
          out.write("\">\r\n                                            ");
          out.print(JSPHelper.filterHtmlAndNulls(bibVO.getTitle()));
          out.write("</a>\r\n                                            ");
 if (!StringHelper.isEmpty(bibVO.getStateTextbookID())) { 
          out.write("\r\n                                            ");
          out.print( "(State ID: " + bibVO.getStateTextbookID() + ")" );
          out.write("\r\n                                            ");
 } 
          out.write("\r\n                                            <br/>\r\n                                            ");
          out.print(lh.formatCurrency(new CurrencyValue(bibVO.getReplacementPrice(), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_ZERO_BECOMES_BLANK) );
          out.write("\r\n                                        </td>\r\n                                        <td align=\"center\" >");
          out.print(lh.formatNumber(bibVO.getQuantityOrdered()) );
          out.write("</td>\r\n                                        ");
 if (store.isStateRepositoryRunning()) { 
          out.write("\r\n                                            <td align=\"center\" >");
          out.print(lh.formatNumber(bibVO.getQuantityCancelled()) );
          out.write("</td>\r\n                                        ");
 } else { 
          out.write("\r\n                                            <td >&nbsp;</td>\r\n                                        ");
 } 
          out.write("\r\n                                        <td align=\"center\" >\r\n                                            ");
          out.print(lh.formatNumber(bibVO.getQuantityShipped()));
          out.write('/');
          out.print(lh.formatNumber(bibVO.getQuantityReceived()));
          out.write("<br/>\r\n                                            ");
 if (form.showIncompleteBarcodedMessage(bibVO)) { 
          out.write("\r\n                                                <nobr><font color=\"#cc0000\">");
          out.print(bibVO.getQuantityIncomplete() );
          out.write(" missing</font>\r\n                                            ");
 } else if (form.showReceiveBarcodedCopies(bibVO)) { 
          out.write("\r\n                                                ");
 showIncompleteButton = true; 
          out.write("\r\n                                                ");
 if (store.isStateRepositoryRunning()){ 
          out.write("\r\n                                                    <a href='");
          out.print( "/cataloging/servlet/presenttransferreceiveunknownbarcodeform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&bibID=" + bibVO.getBibID());
          out.write("' id=\"");
          out.print(OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_BARCODED_COPIES + bibVO.getBibID());
          out.write("\">\r\n                                                ");
 } else { 
          out.write("\r\n                                                    <a href='");
          out.print( "/cataloging/servlet/presenttransfertrackviewform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&transferType=0");
          out.write("' id=\"");
          out.print(OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_BARCODED_COPIES + bibVO.getBibID());
          out.write("\">\r\n                                                 ");
} 
          out.write("\r\n                                                ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(331,48) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlign("absbottom");
          // /cataloging/orderviewshipments.jsp(331,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setSrc("/buttons/small/receivesmall.gif");
          // /cataloging/orderviewshipments.jsp(331,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f2.setAlt(OrderViewShipmentsForm.ALT_RECEIVE);
          int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
          if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
          out.write("\r\n                                                </a>\r\n                                            ");
 } 
          out.write("\r\n                                        </td>\r\n                                        <td align=\"center\" >\r\n                                            ");
          out.print(lh.formatNumber(bibVO.getQuantityShippedNoBarcode()));
          out.write('/');
          out.print(lh.formatNumber(bibVO.getQuantityReceivedNoBarcode()));
          out.write("<br/>\r\n                                            ");
 if (form.showIncompleteUnbarcodedMessage(bibVO)) { 
          out.write("\r\n                                                <nobr><font color=\"#cc0000\">");
          out.print(bibVO.getQuantityIncompleteNoBarcode() );
          out.write(" missing</font>\r\n                                            ");
 } else if (form.showReceiveUnbarcodedCopies(bibVO)) { 
          out.write("\r\n                                                ");
 showIncompleteButton = true; 
          out.write("\r\n                                                <a href='");
          out.print( "/cataloging/servlet/presenttransferreceiveform.do?transferID=" + bibVO.getTransferID() + "&collectionType=" + String.valueOf(form.getCollectionType()) + "&bibID=" + bibVO.getBibID());
          out.write("' id=\"");
          out.print(OrderViewShipmentsForm.TABLE_CELL_ID_PREFIX_RECEIVE_UNBARCODED_COPIES + bibVO.getBibID());
          out.write("\">\r\n                                                ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(342,48) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlign("absbottom");
          // /cataloging/orderviewshipments.jsp(342,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setSrc("/buttons/small/receivesmall.gif");
          // /cataloging/orderviewshipments.jsp(342,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f3.setAlt(OrderViewShipmentsForm.ALT_RECEIVE);
          int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
          if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
          out.write("\r\n                                                </a>\r\n                                            ");
 } 
          out.write("\r\n                                        </td>\r\n                                        <td class=\"tdAlignRight\">\r\n                                            ");
          out.print(lh.formatCurrency(new CurrencyValue(new Long(bibVO.getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
          out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    ");
 if (bibVO.getQuantityReceivedWhichNowHaveBarcodes() != null && bibVO.getQuantityReceivedWhichNowHaveBarcodes().longValue() > 0) { 
          out.write("\r\n                                    <tr bgcolor=\"");
          out.print((flipper2%2==0)?(FlipperTag.ROW_GRAY):"");
          out.write("\">\r\n                                        <td class=\"SmallColHeading\" nowrap=\"nowrap\">\r\n                                            Received - Barcodes (");
          out.print( bibVO.getQuantityReceivedWhichNowHaveBarcodes() );
          out.write(")\r\n                                        </td> \r\n                                        <td colspan=\"5\">\r\n                                            <table>\r\n                                                <tr>\r\n                                                    ");
if(bibVO.getTransferID() != null && bibVO.getTransferID().equals(form.getShowMoreTransferID()) && bibVO.getBibID().equals(form.getShowMoreBibID())) { 
          out.write("\r\n                                                        <td align=\"center\" class=\"SmallColHeading\"><a class=\"DetailLink\" id=\"");
          out.print(OrderViewShipmentsForm.LINK_SHOW_LESS_BARCODES);
          out.write("\" href=\"/cataloging/servlet/handleorderviewshipmentsform.do?showMoreTransferID=&showMoreBibID=&showMoreID=");
          out.print(form.getShowMoreID() );
          out.write("\">Show Less&nbsp;<img src='");
          out.print(lh.getLocalizedImagePath("/icons/general/showless.gif"));
          out.write("' border=\"0\"></a></td>\r\n                                                    ");
} else { 
          out.write("                        \r\n                                                        <td align=\"center\" class=\"SmallColHeading\"><a class=\"DetailLink\" id=\"");
          out.print(OrderViewShipmentsForm.LINK_SHOW_MORE_BARCODES_PREFIX + bibVO.getBibID());
          out.write("\" href=\"/cataloging/servlet/handleorderviewshipmentsform.do?showMoreID=");
          out.print(form.getShowMoreID() );
          out.write("&showMoreTransferID=");
          out.print(bibVO.getTransferID());
          out.write("&showMoreBibID=");
          out.print(bibVO.getBibID());
          out.write("#anchorBarcodes\">Show More&nbsp;<img src='");
          out.print(lh.getLocalizedImagePath("/icons/general/showmore.gif"));
          out.write("' border=\"0\"></a></td>\r\n                                                    ");
} 
          out.write("\r\n                                                </tr>\r\n                                            </table>\r\n                                        </td>\r\n                                    </tr>\r\n                                    ");
 } 
          out.write("\r\n                                    ");
 if(bibVO.getTransferID() != null && bibVO.getTransferID().equals(form.getShowMoreTransferID()) && bibVO.getBibID().equals(form.getShowMoreBibID())) { 
          out.write("\r\n                                        ");
 flipper2++; 
          out.write("\r\n                                        <tr bgcolor=\"\">\r\n                                            <td><a name=\"anchorBarcodes\"></a>\r\n                                                <table id=\"");
          out.print(OrderViewShipmentsForm.TABLE_BARCODES );
          out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr bgcolor=\"");
          out.print((flipper2%2==0)?(FlipperTag.ROW_GRAY):"");
          out.write("\">\r\n                                                        <td class=\"SmallColHeading\">Barcodes</td>\r\n                                                    </tr>\r\n                                                ");
 List<String> receivedBarcodes = form.getReceivedBarcodedItems(bibVO.getTransferID(), bibVO.getBibID()); 
          out.write("\r\n                                                ");
 for (Iterator iter = receivedBarcodes.iterator(); iter.hasNext();) { 
          out.write("\r\n                                                    ");
 flipper2++; 
          out.write("\r\n                                                    <tr bgcolor=\"");
          out.print((flipper2%2==0)?(FlipperTag.ROW_GRAY):"#FFFFFF");
          out.write("\">\r\n                                                        <td class=\"ColRow\">\r\n                                                            ");
          out.print(ResponseUtils.filter((String)iter.next()) );
          out.write("\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                ");
 } 
          out.write("\r\n                                                </table>\r\n                                            </td>\r\n                                            <td colspan=\"5\">&nbsp;</td>\r\n                                        </tr>\r\n                                    ");
 } 
          out.write("\r\n                                    ");
 flipper2++; 
          out.write("\r\n                                ");
 } 
          out.write("\r\n                                ");
 if(showIncompleteButton) { 
          out.write("\r\n                                    ");
 if(store.isStateRepositoryRunning()) { 
          out.write("\r\n                                    <tr>\r\n                                        <td colspan=\"5\">\r\n                                            <span class=\"TableHeading2\">Missing copies from this shipment?</span><br/>\r\n                                            <span class=\"ColRow\">Click Incomplete to close this shipment and record the discrepancy.\r\n                                            ");
          out.print(form.getIncompleteMessage() );
          out.write("\r\n                                        </td>\r\n                                        <td>\r\n                                            ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(401,44) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/large/incomplete.gif");
          // /cataloging/orderviewshipments.jsp(401,44) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setName( OrderViewShipmentsForm.BUTTON_INCOMPLETE );
          // /cataloging/orderviewshipments.jsp(401,44) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f1.setAlt("Incomplete Shipment");
          int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
          out.write("\r\n                                        </td>\r\n                                    </tr>\r\n                                    ");
 } 
          out.write("\r\n                                ");
 } else if (showCopyResolution || form.checkDisplayCopiesDeletedOrLost()) { 
          out.write("\r\n                                    ");
 if(!StringHelper.isEmpty(form.gimmeTransferResolutionMessage())) { 
          out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"6\" class=\"TableHeading2\">\r\n                                                <font color=\"#cc0000\">");
          out.print(form.gimmeTransferResolutionMessage());
          out.write("</font>\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
 } else if (store.isStateContext()) { 
          out.write("\r\n                                        <tr>\r\n                                            <td colspan=\"6\" class=\"TableHeading2\">\r\n                                                Resolve Missing Copies: \r\n                                                ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(416,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setName(OrderViewShipmentsForm.BUTTON_DELETE_ALL );
          // /cataloging/orderviewshipments.jsp(416,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/large/deleteall.gif");
          // /cataloging/orderviewshipments.jsp(416,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setAlt("Delete All Missing Copies");
          // /cataloging/orderviewshipments.jsp(416,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
          int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
          out.write("                                        \r\n                                                ");
 if (!form.isAllConsumables() ) { 
          out.write("\r\n                                                    ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(418,52) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setName(OrderViewShipmentsForm.BUTTON_MARK_LOST );
          // /cataloging/orderviewshipments.jsp(418,52) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setSrc("/buttons/large/marklost.gif");
          // /cataloging/orderviewshipments.jsp(418,52) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setAlt("Mark Missing Copies Lost");
          // /cataloging/orderviewshipments.jsp(418,52) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f3.setAbsbottom(true);
          int _jspx_eval_base_005fgenericButton_005f3 = _jspx_th_base_005fgenericButton_005f3.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f3);
          out.write("\r\n                                                ");
 } 
          out.write("\r\n                                                ");
          //  base:genericButton
          com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f4 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
          _jspx_th_base_005fgenericButton_005f4.setPageContext(_jspx_page_context);
          _jspx_th_base_005fgenericButton_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /cataloging/orderviewshipments.jsp(420,48) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setName(OrderViewShipmentsForm.BUTTON_REVIVE_SHIPMENT );
          // /cataloging/orderviewshipments.jsp(420,48) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setSrc("/buttons/large/revive.gif");
          // /cataloging/orderviewshipments.jsp(420,48) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setAlt("Revive Shipment");
          // /cataloging/orderviewshipments.jsp(420,48) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fgenericButton_005f4.setAbsbottom(true);
          int _jspx_eval_base_005fgenericButton_005f4 = _jspx_th_base_005fgenericButton_005f4.doStartTag();
          if (_jspx_th_base_005fgenericButton_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f4);
          out.write("\r\n                                            </td>\r\n                                        </tr>\r\n                                    ");
 } 
          out.write("\r\n                                ");
 } 
          out.write("\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                    ");
 flipper = flipper2; 
          out.write("\r\n                    ");
} 
          out.write("\r\n                ");
} 
          out.write("\r\n                <tr>\r\n                    <td colspan=\"6\">\r\n                        <IMG height=\"1\" vspace=\"1\" src=\"/images/icons/general/line.gif\" width=\"100%\">\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td colspan=\"4\" class=\"ColRowBold tdAlignRight\">Order Total</td>\r\n                    <td class=\"ColRow tdAlignRight\" width=\"10%\">\r\n                        ");
          out.print(lh.formatCurrency(new CurrencyValue(new Long(form.getVo().getValueAmount()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
          out.write("\r\n                    </td>\r\n                    <td>&nbsp;</td>\r\n                </tr>                                \r\n            </table>\r\n        </td>\r\n    </tr>\r\n     ");
} else {
          out.write("\r\n     <tr>\r\n        <td align=\"center\" class=\"ColRowBold\">\r\n            There are no shipments to report.\r\n        </td>\r\n    </tr>\r\n    ");
 } 
          out.write("\r\n    \r\n\t</table>                          \r\n");
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
    // /cataloging/orderviewshipments.jsp(35,55) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f0);
    // /cataloging/orderviewshipments.jsp(56,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f0.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f0 = _jspx_th_base_005fyesButton_005f0.doStartTag();
    if (_jspx_th_base_005fyesButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f1);
    // /cataloging/orderviewshipments.jsp(77,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f1.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f1 = _jspx_th_base_005fyesButton_005f1.doStartTag();
    if (_jspx_th_base_005fyesButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f2);
    // /cataloging/orderviewshipments.jsp(97,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f2.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f2 = _jspx_th_base_005fyesButton_005f2.doStartTag();
    if (_jspx_th_base_005fyesButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005fyesButton_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fshowHideTag_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:yesButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag _jspx_th_base_005fyesButton_005f3 = (com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag) _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.YesButtonTag.class);
    _jspx_th_base_005fyesButton_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fyesButton_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fshowHideTag_005f3);
    // /cataloging/orderviewshipments.jsp(131,28) name = onclick type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fyesButton_005f3.setOnclick("hideElementonYes()");
    int _jspx_eval_base_005fyesButton_005f3 = _jspx_th_base_005fyesButton_005f3.doStartTag();
    if (_jspx_th_base_005fyesButton_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fyesButton_005fonclick_005fnobody.reuse(_jspx_th_base_005fyesButton_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fcloseButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:closeButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag _jspx_th_base_005fcloseButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag) _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.CloseButtonTag.class);
    _jspx_th_base_005fcloseButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fcloseButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/orderviewshipments.jsp(167,16) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fcloseButton_005f0.setAbsbottom(true);
    int _jspx_eval_base_005fcloseButton_005f0 = _jspx_th_base_005fcloseButton_005f0.doStartTag();
    if (_jspx_th_base_005fcloseButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fcloseButton_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fcloseButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/orderviewshipments.jsp(174,16) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setName("instructionalImage");
    // /cataloging/orderviewshipments.jsp(174,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/caution.gif");
    // /cataloging/orderviewshipments.jsp(174,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Attention");
    // /cataloging/orderviewshipments.jsp(174,16) name = align type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlign("absbottom");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fname_005falt_005falign_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /cataloging/orderviewshipments.jsp(182,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/icons/general/notetransfer.gif");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }
}
