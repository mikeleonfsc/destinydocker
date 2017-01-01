package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.circulation.data.*;
import java.util.*;
import com.follett.fsc.destiny.client.circulation.jsptag.CircItemsOutTag;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class renewallsummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n");

    CircItemsOutTag ciot = new CircItemsOutTag();
    String tempImage = "&nbsp;" + ciot.getTEMP_IMAGE();

    RenewAllReturn renewRet = (RenewAllReturn)request.getAttribute(BaseCircForm.RENEW_ALL_ATTRIBUTE);
    if(renewRet != null) {

      out.write("\r\n    ");
      //  base:messageBox
      com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag _jspx_th_base_005fmessageBox_005f0 = (com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag) _005fjspx_005ftagPool_005fbase_005fmessageBox.get(com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag.class);
      _jspx_th_base_005fmessageBox_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fmessageBox_005f0.setParent(null);
      int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
      if (_jspx_eval_base_005fmessageBox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        <tr valign=top>\r\n            <td width= \"31\" valign=\"top\">\r\n                ");
          //  base:image
          com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
          _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fmessageBox_005f0);
          // /circulation/renewallsummary.jsp(40,16) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setSrc("/icons/general/caution.gif");
          // /circulation/renewallsummary.jsp(40,16) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setHeight(16);
          // /circulation/renewallsummary.jsp(40,16) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setWidth(16);
          // /circulation/renewallsummary.jsp(40,16) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fimage_005f0.setAlt(MessageHelper.formatMessage("renewallsummary_PleaseNote") );
          int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
          if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
          out.write("\r\n            </td>\r\n            <td valign=\"top\">\r\n                <table id=\"");
          out.print(BaseCircForm.RENEW_ALL_TABLE_NAME);
          out.write("\" border=\"0\" align=\"center\" width=\"100%\">\r\n\r\n");

        if(renewRet.getSkippedCopies().isEmpty()) {

          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");
          out.print( MessageHelper.formatMessage("renewallsummary_ItemsRenewed") );
          out.write("<br>");
          out.print( MessageHelper.formatMessage("renewallsummary_PleaseMakeNoteOfAllDueDates") );
          out.write("\r\n                </td>\r\n            </tr>\r\n");

        } else {

          out.write("\r\n            <tr>\r\n                <td class=\"ColRowBold\">\r\n                    ");

                    Boolean userEmpowered = (Boolean)request.getAttribute(BaseCircForm.RENEW_ALL_USER_EMPOWERED);
                    if ( userEmpowered == null || !userEmpowered.booleanValue() ) {
                        
                        out.println(
                            MessageHelper.formatMessage("renewallsummary_TheFollowingItemsWereNotRenewed"));
                    } else {
                        
                        out.println(
                            MessageHelper.formatMessage("renewallsummary_TheFollowingItemsWereNotRenewedBecauseOfPolicies"));
                    }
                    
          out.write("\r\n                <BR>\r\n                <table border = \"0\" id=\"");
          out.print(BaseCircForm.TABLE_NOT_RENEWED_COPIES);
          out.write("\">\r\n                ");

                    Iterator iter = renewRet.getSkippedCopies().iterator();
                    while(iter.hasNext()) {
                        CopyInfoBean cib = (CopyInfoBean)iter.next();
                
          out.write("\r\n                            <tr>\r\n                                <td class=\"ColRow\">\r\n                                    <ul><li>\"");
          out.print(ResponseUtils.filter(cib.getCopyTitle()) );
          out.write("\"\r\n                ");

                                            if ( cib.isCopyTemporary() ) {
                                                out.print(tempImage);
                                            }
                
          out.print( MessageHelper.formatMessage("renewallsummary_Barcode", ResponseUtils.filter(cib.getDisplayableBarcode())) );
          out.write("\r\n                \r\n                                    </li></ul>\r\n                       </td>\r\n                    </tr>\r\n");

            }

          out.write("\r\n\r\n                </table>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td class=\"ColRowBold\">");
          out.print( MessageHelper.formatMessage("renewallsummary_PleaseMakeNoteOfAllDueDates") );
          out.write("\r\n                </td>\r\n            </tr>\r\n");

        }

          out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
          int evalDoAfterBody = _jspx_th_base_005fmessageBox_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fmessageBox.reuse(_jspx_th_base_005fmessageBox_005f0);
      out.write("\r\n\r\n");

    }

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
}
