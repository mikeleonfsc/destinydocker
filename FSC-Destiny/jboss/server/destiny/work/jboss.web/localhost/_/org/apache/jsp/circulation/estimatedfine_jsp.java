package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.backoffice.data.FineEstimateReturn;
import com.follett.fsc.destiny.session.backoffice.data.FineEstimateResult;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;

public final class estimatedfine_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005faction.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n");

	EstimatedFineForm form = (EstimatedFineForm)request.getAttribute(EstimatedFineForm.FORM_NAME);
    boolean printerFriendly = form.isPrinterFriendly();
    FineEstimateReturn fine = form.getFineEstimateReturn();

      out.write("\r\n\r\n");

    if (printerFriendly) {

      out.write("\r\n    \r\n<script language=\"Javascript\" type=\"text/javascript\">\r\n    <!--\r\n    function submitFormNotPrinterFriendlyForIE() {\r\n        document.forms[\"");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write("\"].elements[\"");
      out.print(EstimatedFineForm.FIELD_PATRON_ID);
      out.write("\"].value=\"");
      out.print(form.getPatronID());
      out.write("\";\r\n        document.forms[\"");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write("\"].elements[\"");
      out.print(EstimatedFineForm.FIELD_PRINTER_FRIENDLY);
      out.write("\"].value=\"false\";\r\n        document.forms[\"");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write("\"].submit();\r\n    }\r\n    //-->\r\n    </script>\r\n");

    }

      out.write("\r\n\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/estimatedfine.jsp(40,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handleestimatedfineform.do");
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <input type=\"hidden\" name=\"");
          out.print(EstimatedFineForm.FIELD_PATRON_ID);
          out.write("\"/>\r\n    <input type=\"hidden\" name=\"");
          out.print(EstimatedFineForm.FIELD_PRINTER_FRIENDLY);
          out.write("\"/>\r\n    ");
          //  base:outlinedTable
          com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fwidth_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
          _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005foutlinedTable_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/estimatedfine.jsp(43,4) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setBorderColor("#C0C0C0");
          // /circulation/estimatedfine.jsp(43,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setId("outlinedTable");
          // /circulation/estimatedfine.jsp(43,4) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005foutlinedTable_005f0.setWidth("98%");
          int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
          if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        <tr>\r\n            <td class=\"TableHeading\">");
              out.print( MessageHelper.formatMessage("estimatedfine_CurrentFineEstimate") );
              out.write("</td>\r\n            <td class=\"tdAlignRight\">\r\n");

            if (!printerFriendly) {

              out.write("\r\n                    <a href=\"/circulation/servlet/presentestimatedfineform.do?patronID=");
              out.print(form.getPatronID());
              out.write("&printerFriendly=true\" id=\"");
              out.print(EstimatedFineForm.ID_PRINT );
              out.write("\">\r\n                        ");
              //  base:image
              com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
              _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/estimatedfine.jsp(51,24) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/printit.gif");
              // /circulation/estimatedfine.jsp(51,24) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("printIt") );
              int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
              if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
              out.write("\r\n                    </a>\r\n");

            }

              out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\">\r\n                <table id=\"");
              out.print(EstimatedFineForm.TABLE_ESTIMATED_FINE_BOX);
              out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                    <tr>\r\n                        <td class=\"ColRowBold\">\r\n\t\t\t\t\t\t");
              out.print( MessageHelper.formatMessage("estimatedfine_OverduesFor",fine.getPatronName(), fine.getPatronBarcode()));
              out.write("\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                            <table id=\"");
              out.print(EstimatedFineForm.TABLE_ESTIMATED_FINE_LIST_BOX);
              out.write("\" width=\"100%\" cellspacing=\"0\" cellpadding=\"2\">\r\n                                <tr valign=\"top\">\r\n                                    <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("estimatedfine_DueDate") );
              out.write("</td>\r\n                                    <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("estimatedfine_Title") );
              out.write("</td>\r\n                                    <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("estimatedfine_Barcode") );
              out.write("</td>\r\n                                    <td class=\"ColRowBold\">");
              out.print( MessageHelper.formatMessage("estimatedfine_Estimated") );
              out.write("</td>\r\n                                </tr>\r\n                                ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
              // /circulation/estimatedfine.jsp(75,32) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setId("fineResult");
              // /circulation/estimatedfine.jsp(75,32) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setName(EstimatedFineForm.FORM_NAME);
              // /circulation/estimatedfine.jsp(75,32) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setProperty("list");
              // /circulation/estimatedfine.jsp(75,32) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fiterate_005f0.setType("FineEstimateResult");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                FineEstimateResult fineResult = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                fineResult = (FineEstimateResult) _jspx_page_context.findAttribute("fineResult");
                do {
                  out.write("\r\n                                    <tr valign=\"top\">\r\n                                        <td class=\"ColRow\">");
                  out.print(form.formattedDate(fineResult.getDueDate()));
                  out.write("</td>\r\n                                        <td class=\"ColRow\">");
                  out.print(fineResult.getTitle());
                  out.write("</td>\r\n                                        <td class=\"ColRow\">");
                  out.print(form.formattedOffsiteShortName(fineResult.getSiteShortName(), fineResult.getSiteID(), printerFriendly));
                  out.write("\r\n                                            ");
                  out.print(fineResult.getDisplayableBarcode());
                  out.write("</td>\r\n                                        <td class=\"ColRow\">");
                  out.print(form.formattedCurrency(fineResult.getAmount(), fineResult.getSiteID()));
                  out.write("</td>\r\n                                    </tr>\r\n                                ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  fineResult = (FineEstimateResult) _jspx_page_context.findAttribute("fineResult");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\r\n                                <tr><td class=\"ColRow\">&nbsp;</td></tr>\r\n                                <tr><td class=\"ColRow\">&nbsp;</td></tr>\r\n                                <tr>\r\n                                    <td class=\"ColRowBold tdAlignRight\" colspan=\"3\">");
              out.print( MessageHelper.formatMessage("estimatedfine_TotalEstimatedFines") );
              out.write("&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n                                    <td class=\"ColRowBold\">");
              out.print(form.formattedCurrency(fine.getTotalAmount(), null));
              out.write("</td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td class=\"tdAlignRight\">\r\n");

                        if (!printerFriendly) {

              out.write("\r\n                                <a href=\"javascript:window.close();\" class=\"detailLink\">\r\n                                    <img src='");
              out.print(UserContext.getMyContextLocaleHelper().getLocalizedImagePath("/buttons/large/close.gif"));
              out.write("' border=\"0\" alt='");
              out.print( MessageHelper.formatMessage("close") );
              out.write("'>\r\n                                </a>\r\n");

                        }

              out.write("\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
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
        _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005faction.reuse(_jspx_th_base_005fform_005f0);
      out.write("\r\n\r\n");

    if (printerFriendly) {

      out.write("\r\n    <script language=\"Javascript\" type=\"text/javascript\">\r\n    <!--\r\n    if (document.all) { //ie\r\n        window.onafterprint=function(){window.submitFormNotPrinterFriendlyForIE(); return false;}\r\n    }\r\n    window.print();\r\n    if (document.all) { //ie\r\n        ; //resubmit done in submitFormNotPrinterFriendlyForIE\r\n    } else if (document.layers) { //netscape\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write('.');
      out.print(EstimatedFineForm.FIELD_PATRON_ID);
      out.write(".value=\"");
      out.print(form.getPatronID());
      out.write("\";\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write('.');
      out.print(EstimatedFineForm.FIELD_PRINTER_FRIENDLY);
      out.write(".value=\"false\";\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write(".submit();\r\n    } else if (document.getElementById) { //other\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write('.');
      out.print(EstimatedFineForm.FIELD_PATRON_ID);
      out.write(".value=\"");
      out.print(form.getPatronID());
      out.write("\";\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write('.');
      out.print(EstimatedFineForm.FIELD_PRINTER_FRIENDLY);
      out.write(".value=\"false\";\r\n        document.");
      out.print(EstimatedFineForm.FORM_NAME);
      out.write(".submit();\r\n    }\r\n    //-->\r\n    </script>\r\n");

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
}
