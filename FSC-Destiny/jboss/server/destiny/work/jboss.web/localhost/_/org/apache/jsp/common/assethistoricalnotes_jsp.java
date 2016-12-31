package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.cataloging.servlet.AssetItemEditForm;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm;
import com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO;
import com.follett.fsc.destiny.client.common.servlet.NotesListForm;
import com.follett.fsc.destiny.session.common.HTMLHelper;
import com.follett.fsc.destiny.client.cataloging.servlet.CopyEditForm;
import com.follett.fsc.destiny.util.CollectionType;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class assethistoricalnotes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_005fdefine_005f0 = (org.apache.struts.taglib.bean.DefineTag) _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_005fdefine_005f0.setPageContext(_jspx_page_context);
      _jspx_th_bean_005fdefine_005f0.setParent(null);
      // /common/assethistoricalnotes.jsp(24,0) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setId("form");
      // /common/assethistoricalnotes.jsp(24,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setName( request.getParameter(CopyStatusForm.PARAM_FORM_NAME) );
      // /common/assethistoricalnotes.jsp(24,0) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_bean_005fdefine_005f0.setType("java.lang.Object");
      int _jspx_eval_bean_005fdefine_005f0 = _jspx_th_bean_005fdefine_005f0.doStartTag();
      if (_jspx_th_bean_005fdefine_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbean_005fdefine_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_bean_005fdefine_005f0);
      java.lang.Object form = null;
      form = (java.lang.Object) _jspx_page_context.findAttribute("form");
      out.write("\r\n\r\n<table id=\"");
      out.print( CopyStatusForm.TABLE_COPY_HIST_NOTES );
      out.write("\" cellSpacing=\"0\" cellPadding=\"2\" width=\"81%\">\r\n\r\n    ");
      out.write('\r');
      out.write('\n');
      //  logic:notPresent
      org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter.get(org.apache.struts.taglib.logic.NotPresentTag.class);
      _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotPresent_005f0.setParent(null);
      // /common/assethistoricalnotes.jsp(33,0) name = parameter type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fnotPresent_005f0.setParameter( NotesListForm.PARAM_SUPRESS_DEFAULT_HEADER );
      int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n    <tr>\r\n        <td class=\"ColRowBold\" colspan=\"2\">");
          out.print( MessageHelper.formatMessage("assethistoricalnotes_HistoricalNotes"));
          out.write("</td>\r\n    </tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter.reuse(_jspx_th_logic_005fnotPresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotPresent_005fparameter.reuse(_jspx_th_logic_005fnotPresent_005f0);
      out.write("\r\n\r\n    ");

    boolean hasNotes = false;
    if(request.getParameter(CopyStatusForm.PARAM_FORM_NAME).equals(AssetItemEditForm.FORM_NAME)){
        hasNotes = ((AssetItemEditForm)form).getAssetHistoricalNotesForViewing().size()==0;
    }else{
        hasNotes = ((com.follett.fsc.destiny.client.circulation.servlet.CopyStatusForm)form).getAssetHistoricalNotesForViewing().size()==0;
    }
   if (hasNotes) {
      out.write("\r\n    <tr>\r\n        <td valign=\"top\" align=\"center\" class=\"SmallColHeading\" colspan=\"3\">\r\n            ");
      out.print( MessageHelper.formatMessage("assethistoricalnotes_ThereAreNoHistoricalNotesForThisItem") );
      out.write("\r\n        </td>\r\n    </tr>\r\n    ");
} else {
      out.write("\r\n        <tr>\r\n            <td valign=\"top\" class=\"ColRowBold tdAlignLeft\">Date</td>\r\n            <td valign=\"top\" class=\"ColRowBold tdAlignLeft\">User</td>\r\n            <td valign=\"top\" class=\"ColRowBold tdAlignLeft\">Note</td>\r\n        </tr>\r\n    ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /common/assethistoricalnotes.jsp(58,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName("form");
      // /common/assethistoricalnotes.jsp(58,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("assetHistoricalNotesForViewing");
      // /common/assethistoricalnotes.jsp(58,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("note");
      // /common/assethistoricalnotes.jsp(58,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO note = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        note = (com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO) _jspx_page_context.findAttribute("note");
        do {
          out.write("\r\n        ");
          //  base:flipper
          com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
          _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /common/assethistoricalnotes.jsp(59,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fflipper_005f0.setKey("shownotes");
          int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
          if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            <td valign=\"top\" class=\"ColRow tdAlignLeft\" style=\"width:120px\">\r\n                ");
              out.print( HTMLHelper.filterHTMLConvertLineBreaks(note.getDisplayableDate()) );
              out.write("\r\n            </td>\r\n            <td valign=\"top\" class=\"ColRow tdAlignLeft\" style=\"width:200px\">\r\n                ");
              out.print( HTMLHelper.filterHTMLConvertLineBreaks(note.getUserName()+" ["+AssetItemEditForm.getSiteShortName(note.getUserSiteID())+"]") );
              out.write("\r\n            </td>\r\n            <td valign=\"top\" class=\"ColRow tdAlignLeft\">\r\n                ");
              out.print( HTMLHelper.filterHTMLConvertLineBreaks(note.getNote()) );
              out.write("\r\n            </td>\r\n        ");
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
          out.write("\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          note = (com.follett.fsc.destiny.session.circulation.data.HistoricalNoteViewVO) _jspx_page_context.findAttribute("note");
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
      out.write('\r');
      out.write('\n');

    }

      out.write("\r\n</table>\r\n \r\n\r\n");
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
