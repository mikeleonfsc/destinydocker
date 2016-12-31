package org.apache.jsp.cataloging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.follett.fsc.destiny.client.cataloging.servlet.*;
import com.follett.fsc.destiny.client.common.servlet.GenericForm;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import com.follett.fsc.destiny.client.common.jsptag.FlipperTag;
import com.follett.fsc.destiny.util.HTMLFilterHelper;
import com.follett.fsc.destiny.client.common.JSPHelper;
import com.follett.fsc.destiny.entity.ejb3.OrdersSpecs;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.client.common.jsptag.buttons.CancelButtonTag;
import com.follett.fsc.destiny.session.cataloging.data.KeywordSearchRecord;
import java.util.Iterator;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.util.lookup.LongLongLookup;
import com.follett.fsc.destiny.util.Barcode;
import com.follett.fsc.destiny.client.common.jsptag.BarcodeListTag;
import com.follett.fsc.destiny.session.cataloging.data.OrderTitleSearchVO;
import com.follett.fsc.destiny.session.cataloging.data.OrderTitleVO;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.common.TimestampHelper;
import com.follett.fsc.destiny.entity.data.ProgramLineVO;
import com.follett.fsc.destiny.session.backoffice.data.ManageProgramsVO;

public final class orderrequestedit_005fprogramlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");

    OrderRequestEditForm form = (OrderRequestEditForm) request.getAttribute(OrderRequestEditForm.FORM_NAME);
    SessionStoreProxy store = form.getStore();
    String bgColor = "#FFFFFF";
    if (!form.isPrinterFriendly()) {
        bgColor = FlipperTag.ROW_GRAY;
    }
    ManageProgramsVO vo = form.getProgramList();

      out.write('\r');
      out.write('\n');
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f0.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(42,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f0.setProperty(OrderRequestEditForm.PARAM_SHOW_MORE_ID);
      int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
      if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      out.write("\r\n\r\n    <tr>\r\n        <td colspan = \"2\">\r\n            <table width = \"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"3\" id=\"");
      out.print(OrderRequestEditForm.TABLE_PROGRAM_RESULTS);
      out.write("\">\r\n                ");
 if (vo == null || vo.getProgramLine() == null || vo.getProgramLine().size() == 0) { 
      out.write("\r\n                <tr>\r\n                    <td class=\"ColRow\">No programs defined.</td>\r\n                </tr>\r\n                ");
 } else { 
      out.write("\r\n                <tr>\r\n                  <td class=\"SmallColHeading\">\r\n                      Program\r\n                  </td>\r\n                </tr>\r\n                    ");

                       Iterator<ProgramLineVO> iter = form.getProgramList().getProgramLine().iterator();
                       int counter = 0;
                       while (iter.hasNext()) {
                       boolean preOrder = false;
                       ProgramLineVO rec = iter.next();
                           String additionalFontData = "";
                           String additionalEndFontData = "";
                           if (counter % 2 == 0) {
                    
      out.write("\r\n                    <tr bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY);
      out.write("\" width=\"100%\">\r\n                    ");
     } else { 
      out.write(" \r\n                    <tr width=\"100%\">\r\n                    ");
     } 
      out.write("\r\n                        <td class=\"ColRow\">\r\n                            ");
      out.print( ResponseUtils.filter(rec.getProgramName()) );
      out.write("\r\n                            ");

                                if (rec.getProgramID().equals(form.getShowMoreID()) && rec.getNumberOfTitles() > 0) {
                            
      out.write("\r\n                                ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f0.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(76,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setSrc("/buttons/small/showless.gif");
      // /cataloging/orderrequestedit_programlist.jsp(76,32) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setAbsbottom(true);
      // /cataloging/orderrequestedit_programlist.jsp(76,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setAlt("Show less");
      // /cataloging/orderrequestedit_programlist.jsp(76,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f0.setName(OrderRequestEditForm.BUTTON_SHOW_LESS_PREFIX + rec.getProgramID());
      int _jspx_eval_base_005fgenericButton_005f0 = _jspx_th_base_005fgenericButton_005f0.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f0);
      out.write("\r\n                            ");

                                } else if (rec.getNumberOfTitles() > 0) {
                            
      out.write("\r\n                                ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f1 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f1.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(83,32) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setSrc("/buttons/small/showmore.gif");
      // /cataloging/orderrequestedit_programlist.jsp(83,32) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setAbsbottom(true);
      // /cataloging/orderrequestedit_programlist.jsp(83,32) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setAlt("Show more");
      // /cataloging/orderrequestedit_programlist.jsp(83,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f1.setName(OrderRequestEditForm.BUTTON_SHOW_MORE_PREFIX + rec.getProgramID());
      int _jspx_eval_base_005fgenericButton_005f1 = _jspx_th_base_005fgenericButton_005f1.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f1);
      out.write("\r\n                            ");

                                }
                            
      out.write("                             \r\n                        </td>\r\n                        \r\n                </tr>    \r\n                ");

                     if (rec.getProgramID().equals(form.getShowMoreID())) {
                 
      out.write("\r\n                    <tr><td colspan=\"2\">\r\n                    <table width=\"95%\" align=\"center\" id=\"");
      out.print(OrderRequestEditForm.TABLE_ASSIGNED_TITLES);
      out.write("\" cellpadding=\"3\" cellspacing=\"0\">\r\n                        ");

                            int innerCounter = 0;
                            if (innerCounter % 2 == 0) {
                        
      out.write("\r\n                        <tr width=\"100%\">\r\n                        ");

                            } else {
                        
      out.write(" \r\n                        <tr width=\"100%\">\r\n                        ");

                            }
                        
      out.write("\r\n                            <td class=\"SmallColHeading\" valign=\"top\">\r\n                            <A name='");
      out.print("anchor_" + rec.getProgramID());
      out.write("'></A>\r\n                                Title        \r\n                            </td>\r\n                            <td class=\"SmallColHeading\" valign=\"top\">\r\n                                Grade        \r\n                            </td>\r\n                            <td class=\"SmallColHeading\" valign=\"top\">\r\n                                ISBN<br>Edition        \r\n                            </td>\r\n                            <td class=\"SmallColHeading\" valign=\"top\">\r\n                                State/Textbook ID        \r\n                            </td>\r\n                            <td class=\"SmallColHeading\" valign=\"top\" align=\"center\">\r\n                                Estimated<br>Enrollment        \r\n                            </td>\r\n                            ");
if(!form.allProgramTitlesSelected()) { 
      out.write("\r\n                                <td class=\"SmallColHeading\" valign=\"top\" align=\"center\">\r\n                                    Quantity<br>");
      out.print((store.isStateContext() ? "Ordered" : "Requested"));
      out.write("       \r\n                                </td>\r\n                                <td align=\"center\" valign=\"top\">\r\n                                    ");
      //  base:genericButton
      com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag _jspx_th_base_005fgenericButton_005f2 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag) _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GenericButtonTag.class);
      _jspx_th_base_005fgenericButton_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005fgenericButton_005f2.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(131,36) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setSrc("/buttons/small/select.gif");
      // /cataloging/orderrequestedit_programlist.jsp(131,36) name = absbottom type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setAbsbottom(true);
      // /cataloging/orderrequestedit_programlist.jsp(131,36) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setAlt(OrderRequestEditForm.ALT_SELECT);
      // /cataloging/orderrequestedit_programlist.jsp(131,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fgenericButton_005f2.setName(OrderRequestEditForm.BUTTON_PREORDER_SELECT);
      int _jspx_eval_base_005fgenericButton_005f2 = _jspx_th_base_005fgenericButton_005f2.doStartTag();
      if (_jspx_th_base_005fgenericButton_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fgenericButton_005fsrc_005fname_005falt_005fabsbottom_005fnobody.reuse(_jspx_th_base_005fgenericButton_005f2);
      out.write("\r\n                                </td>                            \r\n                            ");
 } else { 
      out.write("\r\n                                <td class=\"SmallColHeading\" valign=\"top\" colspan=\"2\" align=\"center\">\r\n                                    Quantity<br>");
      out.print((store.isStateContext() ? "Ordered" : "Requested"));
      out.write("       \r\n                                </td>\r\n                            ");
 } 
      out.write("\r\n                        </tr>\r\n                        ");

                            Iterator<ManageProgramsVO.ProgramTitleInfo> innerIter = form.getProgramList()
                                                    .getTitleInfo().iterator();
                            while (innerIter.hasNext()) {
                                ManageProgramsVO.ProgramTitleInfo info = innerIter.next();
                                if (form.isQuantityInvalid(info.getBibID()) || (form.isPreorder() && form.isEstimatedEnrollmentInvalid(info.getBibID()))) {
                                    additionalFontData = "<font color=\"#CC0000\">";
                                    additionalEndFontData = "</font>";
                                } else {
                                    additionalFontData = "";
                                    additionalEndFontData = "";
                                }
                                if (++innerCounter % 2 == 1) {
                        
      out.write("\r\n                        <tr bgcolor=\"");
      out.print(FlipperTag.ROW_GRAY);
      out.write("\" width=\"100%\">\r\n                        ");

                            } else {
                        
      out.write(" \r\n                        <tr width=\"100%\">\r\n                        ");

                            }
                        
      out.write("\r\n                            <td class=\"ColRow\" valign=\"baseline\">\r\n                            \r\n                           ");
      out.print( form.getTitleIconInfomation(info) );
      out.write("\r\n                                <a href=\"javascript:viewTitle(");
      out.print(info.getBibID());
      out.write(");\">\r\n                            ");
      out.print(additionalFontData);
      out.write("\r\n                            ");
      out.print(StringHelper.isEmptyOrWhitespace(info.getTitle()) ? "&nbsp;" : ResponseUtils.filter(info.getTitle()));
      out.write("\r\n                            ");
      out.print(additionalEndFontData);
      out.write("\r\n                        </a>  \r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"baseline\">\r\n                                ");
      out.print(additionalFontData);
      out.write("\r\n                                ");
      out.print(StringHelper.isEmptyOrWhitespace(info.getGrade()) ? "&nbsp;" : info.getGrade());
      out.write("        \r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"middle\">\r\n                                ");
      out.print(additionalFontData);
      out.write("\r\n                                ");
      out.print(StringHelper.isEmptyOrWhitespace(info.getIsbnEdition())
                                        ? "&nbsp;"
                                        : info.getIsbnEdition());
      out.write("     \r\n                                ");
      out.print(additionalEndFontData);
      out.write("\r\n                            </td>\r\n                            <td class=\"ColRow\" valign=\"baseline\">\r\n                                ");
      out.print(additionalFontData);
      out.write("\r\n                                ");
      out.print(StringHelper.isEmptyOrWhitespace(info.getStateTextbookID())
                                        ? "&nbsp;"
                                        : ResponseUtils.filter(info.getStateTextbookID()));
      out.write("       \r\n                                ");
      out.print(additionalEndFontData);
      out.write("\r\n                            </td>\r\n                            \r\n                            ");
 if (form.getOrderVO().lookupBibID(info.getBibID()) == null) { 
      out.write("\r\n                                <td class=\"ColRow\" valign=\"baseline\" align=\"center\">\r\n                                ");
 if (store.isStateContext() || info.isRestricted()) { 
      out.write("\r\n                                    0\r\n                                    ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f1.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(194,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setProperty(OrderRequestEditForm.FIELD_ESTIMATED_ENROLLMENT_PREFIX + info.getBibID());
      // /cataloging/orderrequestedit_programlist.jsp(194,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f1.setValue("0");
      int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
      if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      out.write("\r\n                                ");
 } else { 
      out.write("\r\n                                    <input type=\"text\" name=\"");
      out.print(OrderRequestEditForm.FIELD_ESTIMATED_ENROLLMENT_PREFIX + info.getBibID());
      out.write("\" \r\n                                        onkeypress=\"trapEnterKey(event, ");
      out.print(info.getBibID());
      out.write(")\" size=\"4\" maxlength=\"");
      out.print(String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_ENROLLMENT));
      out.write("\" \r\n                                        value='");
      out.print(form.gimmePreOrderEstimatedEnrollment(info.getBibID(), ""));
      out.write("'/>                            \r\n                                ");
 } 
      out.write("\r\n                                </td>\r\n                                <td class=\"ColRow\" valign=\"baseline\" align=\"center\">\r\n                                ");
 if (!info.isRestricted()) { 
      out.write("\r\n                                ");
 if (store.isStateContext()) { 
      out.write("\r\n                                    <input type=\"text\" name=\"");
      out.print(OrderRequestEditForm.FIELD_QUANTITY_ORDERED_PREFIX + info.getBibID());
      out.write("\" \r\n                                        onkeypress=\"trapEnterKey(event, ");
      out.print(info.getBibID());
      out.write(")\" size=\"4\" maxlength=\"");
      out.print(String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY));
      out.write("\" \r\n                                        value=\"");
      out.print(form.gimmePreOrderQuantityRequested(info.getBibID()));
      out.write("\"/>\r\n                                ");
 } else { 
      out.write("                    \r\n                                    <input type=\"text\" name=\"");
      out.print(OrderRequestEditForm.FIELD_QUANTITY_REQUESTED_PREFIX + info.getBibID());
      out.write("\" \r\n                                        onkeypress=\"trapEnterKey(event, ");
      out.print(info.getBibID());
      out.write(")\" size=\"4\" maxlength=\"");
      out.print(String.valueOf(OrdersSpecs.MAX_LENGTH_ORDER_QUANTITY));
      out.write("\" \r\n                                        value=\"");
      out.print(form.gimmePreOrderQuantityRequested(info.getBibID()));
      out.write("\"/>\r\n                                ");
 } 
      out.write("                \r\n                                ");
 } else { 
      out.write("  \r\n                                    ");
 if (store.isStateContext()) { 
      out.write("\r\n                                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f2.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(214,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f2.setProperty(OrderRequestEditForm.FIELD_QUANTITY_ORDERED_PREFIX + info.getBibID());
      // /cataloging/orderrequestedit_programlist.jsp(214,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f2.setValue("0");
      int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
      if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      out.write("              \r\n                                    ");
 } else { 
      out.write("\r\n                                        ");
      //  html:hidden
      org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
      _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhidden_005f3.setParent(null);
      // /cataloging/orderrequestedit_programlist.jsp(216,40) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f3.setProperty(OrderRequestEditForm.FIELD_QUANTITY_REQUESTED_PREFIX + info.getBibID());
      // /cataloging/orderrequestedit_programlist.jsp(216,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_html_005fhidden_005f3.setValue("0");
      int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
      if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      out.write("\r\n                                    ");
 } 
      out.write("\r\n                                    <font color = \"#CC0000\">Restricted</font>\r\n                                ");
 } 
      out.write("\r\n                                </td>\r\n                            ");
 } else { 
      out.write("\r\n                                <td class=\"SmallColHeading\" valign=\"top\" align=\"center\" colspan=\"2\">\r\n                                    Currently Selected\r\n                                </td>\r\n                            ");
 } 
      out.write("\r\n                            <td align=\"center\" valign=\"top\">\r\n                                &nbsp;\r\n                            </td>\r\n                        </tr>\r\n                        ");

                            }   
                        
      out.write("                        \r\n                    </table>\r\n                    </td></tr>  \r\n                    ");

                          }
                      
      out.write("                \r\n                ");

                           counter++;
                       } 
                    } 
      out.write(" \r\n                   \r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
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
