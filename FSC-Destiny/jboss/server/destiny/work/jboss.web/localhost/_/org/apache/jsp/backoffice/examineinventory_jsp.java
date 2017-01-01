package org.apache.jsp.backoffice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.URLHelper;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.backoffice.servlet.ExamineInventoryForm;
import com.follett.fsc.destiny.session.backoffice.data.EstimatedBillingRowVO;
import com.follett.fsc.common.LocaleHelper;
import com.follett.fsc.common.consortium.UserContext;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.CurrencyValue;

public final class examineinventory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.release();
    _005fjspx_005ftagPool_005fbase_005fimageLine_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n");

    ExamineInventoryForm form = (ExamineInventoryForm)request.getAttribute(ExamineInventoryForm.FORM_NAME);
    LocaleHelper lh = UserContext.getMyContextLocaleHelper();
    String printerLink = "/backoffice/servlet/presentexamineinventoryform.do?useArchived="+form.isUseArchived() + "&partialID=" + form.getPartialID() + "&printerFriendly=true";
    String borderColor = !form.isPrinterFriendly() ? "#C0C0C0" : "#FFFFFF"; 

      out.write("\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");

if (!form.isPrinterFriendly()) {

      out.write("\r\n<table border=\"0\" width=\"95%\">\r\n<tr>\r\n    <td class=\"tdAlignRight\">\r\n    ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005ftarget_005fpage_005fid.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /backoffice/examineinventory.jsp(36,4) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage( printerLink );
      // /backoffice/examineinventory.jsp(36,4) name = target type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setTarget("printerFriendly");
      // /backoffice/examineinventory.jsp(36,4) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setId(ExamineInventoryForm.ID_PRINTER_FRIENDLY );
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005flink_005f0);
          // /backoffice/examineinventory.jsp(36,118) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/buttons/small/printerfriendly.gif");
          // /backoffice/examineinventory.jsp(36,118) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt( MessageHelper.formatMessage("printable"));
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
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
      out.write("\r\n    </td>\r\n</tr>\r\n</table>\r\n");

}

      out.write("\r\n\r\n");
      //  base:outlinedTable
      com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag _jspx_th_base_005foutlinedTable_005f0 = (com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag) _005fjspx_005ftagPool_005fbase_005foutlinedTable_005fid_005fborderColor.get(com.follett.fsc.destiny.client.common.jsptag.OutlinedTableTag.class);
      _jspx_th_base_005foutlinedTable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005foutlinedTable_005f0.setParent(null);
      // /backoffice/examineinventory.jsp(44,0) name = borderColor type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setBorderColor(borderColor );
      // /backoffice/examineinventory.jsp(44,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005foutlinedTable_005f0.setId(ExamineInventoryForm.TABLE_MAIN );
      int _jspx_eval_base_005foutlinedTable_005f0 = _jspx_th_base_005foutlinedTable_005f0.doStartTag();
      if (_jspx_eval_base_005foutlinedTable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n<tr>\r\n    <td colspan=\"6\" class=\"TableHeading\">\r\n        ");
          out.print(ResponseUtils.filter(form.getReportVO().getInventoryName()) );
          out.write("\r\n        ");
 if (form.getStore().isStateContext()) { 
          out.write("\r\n        (");
          out.print(ResponseUtils.filter(form.getReportVO().getDistrictName()) );
          out.write(' ');
          out.write('/');
          out.write(' ');
          out.print(ResponseUtils.filter(form.getReportVO().getSiteName()) );
          out.write(")\r\n        ");
 } 
          out.write("\r\n    </td>\r\n</tr>\r\n<tr>\r\n    ");
 if ( form.isPrinterFriendly() ) { 
          out.write("\r\n    <td colspan=\"6\"><hr></td>\r\n    ");
 } else { 
          out.write("\r\n    <td colspan=\"6\">");
          if (_jspx_meth_base_005fimageLine_005f0(_jspx_th_base_005foutlinedTable_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n    ");
 } 
          out.write("\r\n</tr>\r\n<tr>\r\n    <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("examineinventory_Title") );
          out.write("</td>\r\n    <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("examineinventory_StateID") );
          out.write("</td>\r\n    <td class=\"SmallColHeading\">");
          out.print( MessageHelper.formatMessage("examineinventory_ISBN") );
          out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("examineinventory_Expected") );
          out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("examineinventory_Short") );
          out.write("</td>\r\n    <td class=\"SmallColHeading tdAlignRight\">");
          out.print( MessageHelper.formatMessage("examineinventory_EstimatedBill") );
          out.write("</td>\r\n</tr>\r\n");
 for (int index = 0; index < form.getReportVO().getTitles().size(); index ++) {
    EstimatedBillingRowVO row = form.getReportVO().getTitles().get(index);
    
          out.write("\r\n\r\n");
          //  base:flipper
          com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
          _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005foutlinedTable_005f0);
          // /backoffice/examineinventory.jsp(72,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fflipper_005f0.setKey("examineForm");
          int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
          if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n    <td valign=\"top\" class=\"ColRow\">\r\n        ");
 if (row.isConsumable()) { 
              out.write("\r\n            ");
              out.print( MessageHelper.formatMessage("examineinventory_0Consumable", ResponseUtils.filter(row.getTitle())) );
              out.write("\r\n        ");
 } else { 
              out.write("\r\n            ");
              out.print( ResponseUtils.filter(row.getTitle()));
              out.write("\r\n        ");
 } 
              out.write("\r\n    </td>\r\n    <td valign=\"top\" class=\"ColRow\">");
              out.print( row.getTextID() != null ? ResponseUtils.filter(row.getTextID()) : "" );
              out.write("</td>\r\n    <td valign=\"top\" class=\"ColRow\">");
              out.print( row.getIsbn() != null ? row.getIsbn() : "" );
              out.write("</td>\r\n    <td valign=\"top\" class=\"ColRow tdAlignRight\">");
              out.print( lh.formatNumber(row.getCopiesExpected()));
              out.write("</td>\r\n    <td valign=\"top\" class=\"ColRow tdAlignRight\">");
              out.print( lh.formatNumber(row.getCopiesShort()));
              out.write("</td>\r\n    <td valign=\"top\" class=\"ColRow tdAlignRight\">\r\n        ");
              out.print( lh.formatCurrency(new CurrencyValue(new Long(row.getAmountBilled()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT));
              out.write("\r\n    </td>\r\n");
              int evalDoAfterBody = _jspx_th_base_005fflipper_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fflipper_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.reuse(_jspx_th_base_005fflipper_005f0);
          out.write('\r');
          out.write('\n');
 }
          out.write("\r\n<tr>\r\n    <td colspan=\"4\" class=\"ColRowBold tdAlignRight\">");
          out.print( MessageHelper.formatMessage("examineinventory_Total") );
          out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
          out.print(lh.formatNumber(form.getReportVO().getTotalCopiesShort()) );
          out.write("</td>\r\n    <td class=\"ColRowBold tdAlignRight\">");
          out.print(lh.formatCurrency(new CurrencyValue(new Long(form.getReportVO().getTotalBilled()), lh.getRegionFormatCurrencyCharacterCode()), LocaleHelper.CURRENCY_OPTION_DEFAULT) );
          out.write("</td>\r\n</tr>\r\n\r\n<tr>\r\n    <td colspan=\"3\"  class=\"Instruction\">");
          out.print( MessageHelper.formatMessage("examineinventory_ShortMayIncludeCopies") );
          out.write("</td>\r\n</tr>\r\n\r\n\r\n");
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
    // /backoffice/examineinventory.jsp(28,55) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
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
}
