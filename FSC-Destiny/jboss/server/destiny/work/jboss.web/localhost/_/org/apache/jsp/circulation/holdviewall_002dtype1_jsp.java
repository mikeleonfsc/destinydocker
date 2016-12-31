package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.circulation.data.HoldDeclinedNoteVO;
import java.util.List;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.util.URLHelper;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.entity.ejb3.HoldSpecs;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.destiny.session.circulation.ejb.HoldFacadeSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class holdviewall_002dtype1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.release();
    _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    String type = request.getParameter("type");
    HoldViewAllForm form = (HoldViewAllForm)request.getAttribute(HoldViewAllForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    Long siteID = store.getSiteID();
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();

      out.write("\r\n\r\n<tr class=\"SmallColHeading\">\r\n    <td>");
      out.print( MessageHelper.formatMessage("holdviewall-type1_Status") );
      out.write("</td>\r\n    <td>");
      out.print( MessageHelper.formatMessage("holdviewall-type1_Title") );
      out.write("</td>\r\n    ");
 if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) { 
      out.write("\r\n    <td align=\"center\">Quantity</td>\r\n    ");
 } 
      out.write("\r\n    <td>");
      out.print( MessageHelper.formatMessage("holdviewall-type1_Patron") );
      out.write("</td>\r\n    <td>");
      out.print( MessageHelper.formatMessage("holdviewall-type1_Requested") );
      out.write("</td>\r\n    <td>");
      out.print( MessageHelper.formatMessage("holdviewall-type1_Expires") );
      out.write("\r\n    <td>&nbsp;</td>\r\n</tr>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /circulation/holdviewall-type1.jsp(45,0) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
      // /circulation/holdviewall-type1.jsp(45,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("row");
      // /circulation/holdviewall-type1.jsp(45,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName( HoldViewAllForm.FORM_NAME );
      // /circulation/holdviewall-type1.jsp(45,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty( type );
      // /circulation/holdviewall-type1.jsp(45,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.circulation.data.HoldInfoVO");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.circulation.data.HoldInfoVO row = null;
        java.lang.Integer flipper = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        row = (com.follett.fsc.destiny.session.circulation.data.HoldInfoVO) _jspx_page_context.findAttribute("row");
        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
        do {
          out.write('\r');
          out.write('\n');

    String bgColor = "";
    if (flipper.intValue() % 2 == 0) {
        bgColor = "#E8E8E8";
    }
    
    String gotoApprovalURL = "/circulation/servlet/handleholdviewallform.do";
    gotoApprovalURL = URLHelper.addHREFParam(gotoApprovalURL, HoldViewAllForm.PARAM_ACTION, HoldViewAllForm.ACTION_GOTO_APPROVAL);
    gotoApprovalURL = URLHelper.addHREFParam(gotoApprovalURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
    gotoApprovalURL = form.appendFormParameters(gotoApprovalURL);
    
    String approveLinkID = HoldViewAllForm.ID_PREFIX_APPROVE + row.getHoldID();
    
    String viewPatronURL = "/circulation/servlet/handlepatroninfoform.do";
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "patronID", row.getPatronID());
    viewPatronURL = URLHelper.addHREFParam(viewPatronURL, "refresh", "x");
    
    String holdQueueURL = "/circulation/servlet/presentholdqueueform.do";
    holdQueueURL = URLHelper.addHREFParam(holdQueueURL, "bibID", row.getBibID());
    
    String reserveInfo = "";
    if (row.getReserveStartDate() != null) {
        if (row.getDateExpired() != null) { 
	        reserveInfo = MessageHelper.formatMessage("holdviewall-type1_Reserved_start_date_To_expired_date_Copies", 
                row.getReserveStartDate(), row.getDateExpired(), new Long(row.getQuantity()));
        } else { 
            reserveInfo = MessageHelper.formatMessage("holdviewall-type1_Reserved_start_date_Copies", 
                lh.formatDate(row.getReserveStartDate()), new Long(row.getQuantity())) ;
        }
    }

          out.write("\r\n<tr class=\"ColRow\" bgColor='");
          out.print( bgColor );
          out.write("'>\r\n\r\n\r\n");
          out.write(" \r\n<td valign=\"top\">\r\n    ");

        boolean renderApprovalLink = false;
        boolean renderDeclineBookingLink = false;
        boolean renderDeclineILLLink = false;
    
        if (!form.isPrinterFriendly() &&
            HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) {
            renderApprovalLink = true;
            renderDeclineBookingLink = false;
        }
       
       if (!form.isPrinterFriendly() && 
            HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {

            if (!StringHelper.isEmpty(row.getDeclineNote())) {
                renderDeclineBookingLink = true;
            }
       }
       
       if (!form.isPrinterFriendly() && 
            HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)) {

            renderDeclineILLLink = row.isHasDeclinedILLNotes();
       }
       
       if (renderApprovalLink) {
    
          out.write("\r\n        ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(109,8) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setShowTextAlways(true);
          // /circulation/holdviewall-type1.jsp(109,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setHref( gotoApprovalURL );
          // /circulation/holdviewall-type1.jsp(109,8) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setPermission(Permission.CIRC_AED_HOLDS);
          // /circulation/holdviewall-type1.jsp(109,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f0.setId(approveLinkID );
          int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
          if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f0.doInitBody();
            }
            do {
              out.write("\r\n            ");
              out.print( HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) );
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fshowTextAlways_005fpermission_005fid_005fhref.reuse(_jspx_th_base_005flink_005f0);
          out.write("\r\n    ");
 
       } else if (renderDeclineBookingLink) {
           
        String declineBookingNoteURL = DeclinedNoteForm.FORM_URL_DECLINED_BOOKING;
        declineBookingNoteURL = URLHelper.addHREFParam(declineBookingNoteURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
    
    
          out.write("\r\n        ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(119,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setTarget( DeclinedNoteForm.TARGET_DECLINED);
          // /circulation/holdviewall-type1.jsp(119,8) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setShowTextAlways(true);
          // /circulation/holdviewall-type1.jsp(119,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f1.setHref( declineBookingNoteURL );
          int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
          if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f1.doInitBody();
            }
            do {
              out.write("\r\n            ");
              out.print( HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) );
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.reuse(_jspx_th_base_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.reuse(_jspx_th_base_005flink_005f1);
          out.write("\r\n    ");

       } else if (renderDeclineILLLink) {
           
        String declineILLNoteURL = DeclinedNoteForm.FORM_URL_DECLINED_ILL;
        declineILLNoteURL = URLHelper.addHREFParam(declineILLNoteURL, HoldViewAllForm.PARAM_HOLD_ID, row.getHoldID());
           
    
          out.write("\r\n        ");
          out.print( HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) );
          out.write("&nbsp;\r\n        ");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(130,8) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f2.setTarget( DeclinedNoteForm.TARGET_DECLINED);
          // /circulation/holdviewall-type1.jsp(130,8) name = showTextAlways type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f2.setShowTextAlways(true);
          // /circulation/holdviewall-type1.jsp(130,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f2.setHref( declineILLNoteURL );
          int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
          if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f2.doInitBody();
            }
            do {
              out.write("\r\n            ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f2);
              // /circulation/holdviewall-type1.jsp(131,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/icons/general/balloon-box-left.gif");
              // /circulation/holdviewall-type1.jsp(131,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("holdviewall-type1_Notes") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              out.write("\r\n        ");
              int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.reuse(_jspx_th_base_005flink_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fshowTextAlways_005fhref.reuse(_jspx_th_base_005flink_005f2);
          out.write("\r\n    ");

       } else {
    
          out.write("\r\n            ");
          out.print( HoldFacadeSpecs.getHoldStatusDisplayable(row.getHoldStatusID()) );
          out.write("\r\n    ");
 } 
          out.write("\r\n</td>            \r\n            \r\n");
          out.write("\r\n<td valign=\"top\">\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(142,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName(HoldViewAllForm.FORM_NAME);
          // /circulation/holdviewall-type1.jsp(142,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setProperty("printerFriendly");
          // /circulation/holdviewall-type1.jsp(142,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("true");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
                return;
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
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(145,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setName(HoldViewAllForm.FORM_NAME);
          // /circulation/holdviewall-type1.jsp(145,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setProperty("printerFriendly");
          // /circulation/holdviewall-type1.jsp(145,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f1.setValue("false");
          int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
          if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
 if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {
              out.write("    \r\n            ");
              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
                return;
              out.write("\r\n        ");
}else{
              out.write("\r\n            ");
              out.print(form.getTitleDetailLink(row.getTitle(), row.getBibID()));
              out.write("\r\n        ");
}
              out.write("\r\n    ");
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
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(152,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setName("row");
          // /circulation/holdviewall-type1.jsp(152,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setProperty("temporary");
          // /circulation/holdviewall-type1.jsp(152,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f2.setValue("true");
          int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
          if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
              // /circulation/holdviewall-type1.jsp(153,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(HoldViewAllForm.FORM_NAME);
              // /circulation/holdviewall-type1.jsp(153,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty("printerFriendly");
              // /circulation/holdviewall-type1.jsp(153,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("true");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write('[');
                  out.print( MessageHelper.formatMessage("holdviewall-type1_Temporary") );
                  out.write(']');
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
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
              // /circulation/holdviewall-type1.jsp(154,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName(HoldViewAllForm.FORM_NAME);
              // /circulation/holdviewall-type1.jsp(154,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("printerFriendly");
              // /circulation/holdviewall-type1.jsp(154,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("false");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /circulation/holdviewall-type1.jsp(155,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setSrc("/icons/materialtype/temp.gif");
                  // /circulation/holdviewall-type1.jsp(155,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setWidth(19);
                  // /circulation/holdviewall-type1.jsp(155,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setHeight(16);
                  // /circulation/holdviewall-type1.jsp(155,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f1.setAlt( MessageHelper.formatMessage("holdviewall-type1_Temporary") );
                  int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
                  if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
                  out.write("\r\n        ");
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
              out.write("\r\n    ");
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
          out.write("      \r\n    \r\n    ");
String copyInfoStr= ""; 
          out.write("\r\n    ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(160,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setName("row");
          // /circulation/holdviewall-type1.jsp(160,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f0.setProperty("copyBarcode");
          int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    ");
 
        if (!StringHelper.isEmpty(row.getCopyCallNumber())) {
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type1_Copy0CallNumber1", row.getCopyBarcodeDisplayable(), row.getCopyCallNumber());
        } else {
            copyInfoStr = MessageHelper.formatMessage("holdviewall-type1_Copy0", row.getCopyBarcodeDisplayable());
        }
    
              out.write("\r\n    ");
              out.print(org.apache.struts.util.ResponseUtils.filter(copyInfoStr) );
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
          out.write("\r\n    \r\n    ");
 if (StringHelper.isEmpty(copyInfoStr) && !StringHelper.isEmpty(row.getCopyCallNumber())) {
            copyInfoStr = " / " + MessageHelper.formatMessage("holdviewall-type1_CallNumber0", row.getCopyCallNumber()); 
       } else {
            copyInfoStr = "";
       }
    
          out.write("\r\n    ");
 if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type)) {
           reserveInfo = (reserveInfo.length() > 0) ? (" / " + reserveInfo) : reserveInfo; 
    
          out.write("\r\n\t<font color=\"#CC0000\">\r\n\t\t");
          out.print(MessageHelper.formatMessage("holdviewall-type1_ForSpace_site_reserveInfo_copyInfoStr", row.getRequestingSiteName()+reserveInfo+copyInfoStr ));
          out.write("\r\n        </font>\r\n    ");
 } else if (HoldViewAllForm.LIST_TYPE_FILL_BY_OTHER_SITE.equals(type)
                && !StringHelper.isEmpty(row.getLendingSiteName())) { 
          out.write("\r\n        ");
 reserveInfo = (reserveInfo.length() > 0) ? (" / " + reserveInfo) : reserveInfo; 
          out.write("\r\n        <font color=\"#CC0000\">\r\n            ");
          out.print(MessageHelper.formatMessage("holdviewall-type1_FromSpace_site_reserveInfo_copyInfoStr", row.getLendingSiteName()+reserveInfo+copyInfoStr) );
          out.write("\r\n        </font>\r\n    ");
 } else if (reserveInfo.length() > 0) { 
          out.write("\r\n        <font color=\"#CC0000\">\r\n        ");
 if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) {
            if ( row.getDeliveryMethod() == HoldSpecs.DELIVERY_METHOD_PATRON_PICKUP ) {
                if (!form.isPrinterFriendly()) { 
                    reserveInfo += "&nbsp;" + JSPHelper.renderImage("/icons/general/patron.gif", 13, 18, MessageHelper.formatMessage("holdviewall-type1_Pickup"));
                } else {
                    reserveInfo += "&nbsp;" + MessageHelper.formatMessage("holdviewall-type1_Pickup");      
                }
            } else if ( row.getDeliveryMethod() == HoldSpecs.DELIVERY_METHOD_SHIP_IT){
                if (!form.isPrinterFriendly()) { 
                    reserveInfo += "&nbsp;" + JSPHelper.renderImage("/icons/general/truck.gif", 17, 14, MessageHelper.formatMessage("holdviewall-type1_Ship"));
                } else {
                    reserveInfo += "&nbsp;" + MessageHelper.formatMessage("holdviewall-type1_Ship");      
                }
            }
       } 
          out.write("\r\n        \r\n        ");
          out.print( "(" + reserveInfo + (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type) ? "" : copyInfoStr) + ")" );
          out.write("\r\n        </font>\r\n    ");
 } 
          out.write("\r\n\r\n    ");
 if (HoldViewAllForm.LIST_TYPE_FILL_BY_LOCAL_SITE.equals(type) ||
           HoldViewAllForm.LIST_TYPE_UNAPPROVED.equals(type)) { 
          out.write("\r\n    ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(213,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setName(HoldViewAllForm.FORM_NAME);
          // /circulation/holdviewall-type1.jsp(213,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setProperty("printerFriendly");
          // /circulation/holdviewall-type1.jsp(213,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f5.setValue("false");
          int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
          if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  base:link
              com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
              _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
              // /circulation/holdviewall-type1.jsp(214,8) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f3.setHref(holdQueueURL);
              // /circulation/holdviewall-type1.jsp(214,8) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005flink_005f3.setPermission(Permission.CIRC_VIEW_COPY_STATUS);
              int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
              if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005flink_005f3.doInitBody();
                }
                do {
                  out.write("\r\n            ");
                  //  base:image
                  com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                  _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f3);
                  // /circulation/holdviewall-type1.jsp(217,12) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setSrc("/icons/general/view.gif");
                  // /circulation/holdviewall-type1.jsp(217,12) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setWidth(19);
                  // /circulation/holdviewall-type1.jsp(217,12) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setHeight(16);
                  // /circulation/holdviewall-type1.jsp(217,12) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005fimage_005f2.setAlt(MessageHelper.formatMessage("holdviewall_ViewHoldsForThisTitle") );
                  int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
                  if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.reuse(_jspx_th_base_005flink_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.reuse(_jspx_th_base_005flink_005f3);
              out.write("\r\n    ");
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
          out.write("\r\n    ");
 } 
          out.write(" \r\n</td>\r\n            \r\n");
          out.write("\r\n    ");
 if (HoldViewAllForm.LIST_TYPE_MEDIA.equals(type)) { 
          out.write("\r\n    <td align=\"center\" valign=\"top\">");
          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n    ");
 } 
          out.write("\r\n    \r\n");
          out.write("\r\n<td valign=\"top\">\r\n    ");
          if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n    ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f1 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(231,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f1.setName("row");
          // /circulation/holdviewall-type1.jsp(231,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fnotEmpty_005f1.setProperty("patronName");
          int _jspx_eval_logic_005fnotEmpty_005f1 = _jspx_th_logic_005fnotEmpty_005f1.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f1);
              // /circulation/holdviewall-type1.jsp(232,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setName(HoldViewAllForm.FORM_NAME);
              // /circulation/holdviewall-type1.jsp(232,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setProperty("printerFriendly");
              // /circulation/holdviewall-type1.jsp(232,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f6.setValue("false");
              int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
              if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
                  // /circulation/holdviewall-type1.jsp(233,12) name = href type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setHref( viewPatronURL);
                  // /circulation/holdviewall-type1.jsp(233,12) name = permission type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f4.setPermission(Permission.CIRC_VIEW_PATRON_STATUS);
                  int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
                  if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f4.doInitBody();
                    }
                    do {
                      out.write("\r\n                ");
                      //  base:image
                      com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
                      _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
                      _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f4);
                      // /circulation/holdviewall-type1.jsp(236,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setSrc("/icons/general/view.gif");
                      // /circulation/holdviewall-type1.jsp(236,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setWidth(19);
                      // /circulation/holdviewall-type1.jsp(236,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setHeight(16);
                      // /circulation/holdviewall-type1.jsp(236,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005fimage_005f3.setAlt(MessageHelper.formatMessage("holdviewall-type1_View0", row.getPatronName()));
                      int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
                      if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
                      out.write("\r\n            ");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.reuse(_jspx_th_base_005flink_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpermission_005fhref.reuse(_jspx_th_base_005flink_005f4);
                  out.write("\r\n        ");
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
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f1);
          out.write("\r\n</td>\r\n            \r\n");
          out.write("\r\n<td valign=\"top\">\r\n    ");
          //  base:localeDateTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag _jspx_th_base_005flocaleDateTag_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag) _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag.class);
          _jspx_th_base_005flocaleDateTag_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleDateTag_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(244,4) name = timestamp type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleDateTag_005f0.setTimestamp(row.getDateRequested());
          int _jspx_eval_base_005flocaleDateTag_005f0 = _jspx_th_base_005flocaleDateTag_005f0.doStartTag();
          if (_jspx_th_base_005flocaleDateTag_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.reuse(_jspx_th_base_005flocaleDateTag_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.reuse(_jspx_th_base_005flocaleDateTag_005f0);
          out.write("\r\n</td>\r\n\r\n");
          out.write("\r\n<td valign=\"top\">\r\n    ");
          //  base:localeDateTag
          com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag _jspx_th_base_005flocaleDateTag_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag) _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.LocaleDateTag.class);
          _jspx_th_base_005flocaleDateTag_005f1.setPageContext(_jspx_page_context);
          _jspx_th_base_005flocaleDateTag_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(249,4) name = timestamp type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flocaleDateTag_005f1.setTimestamp(row.getDateExpired());
          int _jspx_eval_base_005flocaleDateTag_005f1 = _jspx_th_base_005flocaleDateTag_005f1.doStartTag();
          if (_jspx_th_base_005flocaleDateTag_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.reuse(_jspx_th_base_005flocaleDateTag_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flocaleDateTag_005ftimestamp_005fnobody.reuse(_jspx_th_base_005flocaleDateTag_005f1);
          out.write("\r\n</td>\r\n            \r\n");
          out.write("\r\n\r\n");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/holdviewall-type1.jsp(254,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setName(HoldViewAllForm.FORM_NAME);
          // /circulation/holdviewall-type1.jsp(254,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setProperty("printerFriendly");
          // /circulation/holdviewall-type1.jsp(254,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f7.setValue("false");
          int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
          if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <td valign=\"top\" class=\"tdAlignRight\" nowrap=\"nowrap\">\r\n        ");
              //  base:holdViewAllButtons
              com.follett.fsc.destiny.client.circulation.jsptag.HoldViewAllButtonTag _jspx_th_base_005fholdViewAllButtons_005f0 = (com.follett.fsc.destiny.client.circulation.jsptag.HoldViewAllButtonTag) _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody.get(com.follett.fsc.destiny.client.circulation.jsptag.HoldViewAllButtonTag.class);
              _jspx_th_base_005fholdViewAllButtons_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fholdViewAllButtons_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
              // /circulation/holdviewall-type1.jsp(256,8) name = row type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fholdViewAllButtons_005f0.setRow(row);
              // /circulation/holdviewall-type1.jsp(256,8) name = type type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fholdViewAllButtons_005f0.setType(type);
              int _jspx_eval_base_005fholdViewAllButtons_005f0 = _jspx_th_base_005fholdViewAllButtons_005f0.doStartTag();
              if (_jspx_th_base_005fholdViewAllButtons_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody.reuse(_jspx_th_base_005fholdViewAllButtons_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fholdViewAllButtons_005ftype_005frow_005fnobody.reuse(_jspx_th_base_005fholdViewAllButtons_005f0);
              out.write("\r\n    </td>\r\n");
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
          out.write("            \r\n</tr>\r\n \r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          row = (com.follett.fsc.destiny.session.circulation.data.HoldInfoVO) _jspx_page_context.findAttribute("row");
          flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    // /circulation/holdviewall-type1.jsp(143,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setName("row");
    // /circulation/holdviewall-type1.jsp(143,8) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f0.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    // /circulation/holdviewall-type1.jsp(147,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setName("row");
    // /circulation/holdviewall-type1.jsp(147,12) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f1.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /circulation/holdviewall-type1.jsp(225,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setName("row");
    // /circulation/holdviewall-type1.jsp(225,36) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f2.setProperty("quantity");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /circulation/holdviewall-type1.jsp(230,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setName("row");
    // /circulation/holdviewall-type1.jsp(230,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_bean_005fwrite_005f3.setProperty("patronName");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }
}
