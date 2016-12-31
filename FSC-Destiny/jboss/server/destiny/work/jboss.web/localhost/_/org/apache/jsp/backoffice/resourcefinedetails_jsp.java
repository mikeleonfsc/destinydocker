package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.circulation.ejb.data.FineDistrictDetailResult;
import com.follett.fsc.destiny.client.backoffice.servlet.*;
import java.util.List;
import com.follett.fsc.destiny.entity.ejb3.FineSpecs;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.CurrencyValue;

public final class resourcefinedetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
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

    ResourceFineDetailsForm form = (ResourceFineDetailsForm) request.getAttribute(ResourceFineDetailsForm.FORM_NAME);
    List<FineDistrictDetailResult> list = form.getResult();
    
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    
    int tableWidth = form.isLostReport() ? 6 : 7;

      out.write("\r\n\r\n\r\n\r\n<table width=\"100%\" id=\"");
      out.print(ResourceFineDetailsForm.TABLE_MAIN );
      out.write("\">\r\n    <tr>\r\n        <td colspan=\"");
      out.print(tableWidth-1 );
      out.write("\" class=\"TableHeading\">");
      out.print(form.getReportHeader()  );
      out.write("</td>\r\n        <td class=\"tdAlignRight\">\r\n            ");
 if (!form.isPrinterFriendly()) { 
      out.write("\r\n                ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/resourcefinedetails.jsp(31,16) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage(form.getPrinterFriendlyLink() );
      // /backoffice/resourcefinedetails.jsp(31,16) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
      // /backoffice/resourcefinedetails.jsp(31,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(ResourceFineDetailsForm.ID_PRINTER_FRIENDLY );
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005flink_005f0, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.reuse(_jspx_th_base_005flink_005f0);
      out.write("\r\n            ");
 } else { 
      out.write("\r\n                &nbsp;\r\n            ");
 } 
      out.write("\r\n        </td>\r\n    </tr>\r\n    <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");

    Long oldBibID = null;
    Long lostFineAmount = new Long(0);
    Long lostPaidAmount = new Long(0);
    Long lostWaivedAmount = new Long(0);
    Long lostOutstandingAmount = new Long(0);
    Long damagedFineAmount = new Long(0);
    Long damagedPaidAmount = new Long(0);
    Long damagedWaivedAmount = new Long(0);
    Long damagedOutstandingAmount = new Long(0);
    
    for (int index = 0; index < list.size(); index ++) {
        FineDistrictDetailResult row = list.get(index);

        int fineType = form.isLostReport() ? FineSpecs.INT_FINE_LOST : row.getFineType().intValue();
        String fineDesc = "";
        switch (fineType) {
            case FineSpecs.INT_FINE_LOST:
                fineDesc = "Lost";
                if (row.getFineAmount() != null) {
                    lostFineAmount = new Long(lostFineAmount.longValue() + row.getFineAmount().longValue());
                }
                if (row.getPaidAmount() != null) {
                    lostPaidAmount = new Long(lostPaidAmount.longValue() + row.getPaidAmount().longValue());
                }
                if (row.getWaivedAmount() != null) {
                    lostWaivedAmount = new Long(lostWaivedAmount.longValue() + row.getWaivedAmount().longValue());
                }
                if (row.getOutstandingAmount() != null) {
                    lostOutstandingAmount = new Long(lostOutstandingAmount.longValue() + row.getOutstandingAmount().longValue());
                }
                break;
            case FineSpecs.INT_FINE_DAMAGED:
                fineDesc = "Damaged";
                if (row.getFineAmount() != null) {
                    damagedFineAmount = new Long(damagedFineAmount.longValue() + row.getFineAmount().longValue());
                }
                if (row.getPaidAmount() != null) {
                    damagedPaidAmount = new Long(damagedPaidAmount.longValue() + row.getPaidAmount().longValue());
                }
                if (row.getWaivedAmount() != null) {
                    damagedWaivedAmount = new Long(damagedWaivedAmount.longValue() + row.getWaivedAmount().longValue());
                }
                if (row.getOutstandingAmount() != null) {
                    damagedOutstandingAmount = new Long(damagedOutstandingAmount.longValue() + row.getOutstandingAmount().longValue());
                }
                break;
            default:
                fineDesc = "Unknown";
                break;
        }
    
        if ( row.getBibID() == null || !row.getBibID().equals(oldBibID)) {

      out.write("\r\n        <tr>\r\n            <td colspan=\"");
      out.print(tableWidth );
      out.write("\" class=\"ColRowBold\">\r\n                ");
      out.print(row.getTitle() );
      out.write("\r\n                ");
 if (row.getIsbn() != null) { 
      out.write("\r\n                &nbsp;&nbsp;&nbsp; ");
      out.print(row.getIsbn() );
      out.write("&nbsp;\r\n                ");
 } 
      out.write("\r\n                ");
 if (row.getReplacementPrice() != null) { 
      out.write("\r\n                ");
      out.print("(" + lh.formatCurrency(row.getReplacementPriceCurrencyValue(), LocaleHelper.CURRENCY_OPTION_DEFAULT) + ")");
      out.write("\r\n                ");
 } 
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"SmallColHeading tdAlignRight\">Fine Date</td>\r\n            ");
 if (!form.isLostReport()) { 
      out.write("\r\n            <td class=\"SmallColHeading tdAlignRight\">Fine Type</td>\r\n            ");
 } 
      out.write("\r\n            <td class=\"SmallColHeading tdAlignRight\">Item Barcode</td>\r\n            <td class=\"SmallColHeading tdAlignRight\">Fine Amount</td>\r\n            <td class=\"SmallColHeading tdAlignRight\">Paid</td>\r\n            <td class=\"SmallColHeading tdAlignRight\">Waived</td>\r\n            <td class=\"SmallColHeading tdAlignRight\">Outstanding</td>\r\n        </tr>\r\n");
            
        }

      out.write("\r\n    <tr>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatDate(row.getFineDate() ));
      out.write("</td>\r\n        ");
 if (!form.isLostReport()) { 
      out.write("\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(fineDesc );
      out.write("</td>\r\n        ");
 } 
      out.write("\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(row.getItemBarcodeOrDeleted());
      out.write("</td>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(row.getFineAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
      out.write("</td>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(row.getPaidAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
      out.write("</td>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(row.getWaivedAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
      out.write("</td>\r\n        <td class=\"ColRow tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(row.getOutstandingAmount(), lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
      out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n        <td class=\"ColRow\" colspan=\"6\">");
      out.print( form.getPatronLostInfo(row) );
      out.write("</td>\r\n    </tr>\r\n");
       
        oldBibID = row.getBibID();
    }

      out.write("\r\n    <tr>\r\n        <td colspan=\"");
      out.print(tableWidth );
      out.write('"');
      out.write('>');
      if (_jspx_meth_base_005fimageLine_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n    </tr>\r\n    ");

        Long totalFineAmount = new Long(lostFineAmount.longValue() + damagedFineAmount.longValue());
        Long totalPaidAmount = new Long(lostPaidAmount.longValue() + damagedPaidAmount.longValue());
        Long totalWaivedAmount = new Long(lostWaivedAmount.longValue() + damagedWaivedAmount.longValue());
        Long totalOutstandngAmount = new Long(lostOutstandingAmount.longValue() + damagedOutstandingAmount.longValue());
    
      out.write("\r\n    ");
 if (!form.isLostReport()) { 
      out.write("\r\n    <tr>\r\n        <td colspan=\"3\" class=\"ColRowBold tdAlignRight\">Lost Fines</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(lostFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(lostPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(lostWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(lostOutstandingAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"3\" class=\"ColRowBold tdAlignRight\">Damaged Fines</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(damagedFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(damagedPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(damagedWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(damagedOutstandingAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n    </tr>\r\n    ");
 } 
      out.write("\r\n    <tr>\r\n        ");
 if (form.isLostReport()) { 
      out.write("\r\n        <td colspan=\"2\" class=\"ColRowBold tdAlignRight\">Totals</td>\r\n        ");
 } else { 
      out.write("\r\n        <td colspan=\"3\" class=\"ColRowBold tdAlignRight\">Total Assessed Fines*</td>\r\n        ");
 } 
      out.write("\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(totalFineAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(totalPaidAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(totalWaivedAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n        <td class=\"ColRowBold tdAlignRight\">");
      out.print(lh.formatCurrency(new CurrencyValue(totalOutstandngAmount, lh.getFineCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
      out.write("</td>\r\n    </tr>\r\n    <tr>\r\n        <td colspan=\"3\" class=\"ColRow\">*Based on user permissions and deleted resources, totals may not match the summary page.</td>\r\n    </tr>\r\n</table>        \r\n");
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

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005flink_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
    // /backoffice/resourcefinedetails.jsp(31,150) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
    // /backoffice/resourcefinedetails.jsp(31,150) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Printer Friendly");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageLine_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageLine
    com.follett.fsc.destiny.client.common.jsptag.ImageLineTag _jspx_th_base_005fimageLine_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageLineTag) _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageLineTag.class);
    _jspx_th_base_005fimageLine_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageLine_005f0.setParent(null);
    int _jspx_eval_base_005fimageLine_005f0 = _jspx_th_base_005fimageLine_005f0.doStartTag();
    if (_jspx_th_base_005fimageLine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.reuse(_jspx_th_base_005fimageLine_005f0);
    return false;
  }
}
