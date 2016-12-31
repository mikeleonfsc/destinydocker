package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.util.*;
import com.follett.fsc.common.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;

public final class circdesktitlelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.release();
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
      out.write("\r\n\r\n\r\n\r\n\r\n");

	String formName = request.getParameter("formName");
	ICircDeskTitleList form = (ICircDeskTitleList)request.getAttribute(formName);

      out.write("\r\n\r\n\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /circulation/circdesktitlelist.jsp(23,1) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
      // /circulation/circdesktitlelist.jsp(23,1) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("row");
      // /circulation/circdesktitlelist.jsp(23,1) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName( formName );
      // /circulation/circdesktitlelist.jsp(23,1) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("list");
      // /circulation/circdesktitlelist.jsp(23,1) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.circulation.data.CircDeskTitleVO");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.circulation.data.CircDeskTitleVO row = null;
        java.lang.Integer flipper = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        row = (com.follett.fsc.destiny.session.circulation.data.CircDeskTitleVO) _jspx_page_context.findAttribute("row");
        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
        do {
          out.write("\r\n\t  ");
          //  logic:equal
          org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
          _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/circdesktitlelist.jsp(24,3) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setName("flipper");
          // /circulation/circdesktitlelist.jsp(24,3) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_logic_005fequal_005f0.setValue("0");
          int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
          if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t            <tr>\r\n\t                <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("circdesktitlelist_Title") );
              out.write("</td>\r\n\t                <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("circdesktitlelist_Site") );
              out.write("</td>\r\n\t\t\t\t");
 if (form.isTextbookMode() || (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET)) { 
              out.write("\r\n\t                <td class=\"SmallColHeading\">Condition</td>\r\n\t                <td class=\"SmallColHeading\">Location</td>\r\n\t\t\t\t");
 } else { 
              out.write("\r\n\t                <td class=\"SmallColHeading\">");
              out.print( MessageHelper.formatMessage("circdesktitlelist_Call") );
              out.write("</td>\r\n\t\t\t\t");
 } 
              out.write("\r\n\t            </tr>\r\n      ");
              int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f0);
          out.write("\r\n\t\t\t\t<tr valign=\"top\" ");
          out.print(( ( (1 & flipper.intValue())==0)? "bgColor=\"#E8E8E8\"" : "" ));
          out.write(" >\r\n\t\t\t\t\t");
          out.write("\r\n\t                <td class=\"ColRow\">\r\n\t\t\t\t\t");
 if (StringHelper.isEmpty(row.getTitle())) { 
          out.write("\r\n\t\t\t\t\t\t&nbsp;</td>\r\n\t\t\t\t\t");
 } else { 
          out.write("\r\n\t\t\t\t\t\t<a href=\"");
          out.print( form.getCircDeskTitleURL(row) );
          out.write('"');
          out.write('>');
          out.print( ResponseUtils.filter(row.getTitle()) );
          out.write("</a></td>\r\n\t                ");
 } 
          out.write("\r\n\t\t\t\t\t");
          out.write("\r\n\t                <td class=\"ColRow\">\r\n\t\t\t\t\t\t");
          out.print( ResponseUtils.filter(row.getSiteName()) );
          out.write("\r\n\t                </td>\r\n \t\t\t\t");
 if (form.isTextbookMode() || (form.getCollectionType() == BibMasterSpecs.COLLECTION_TYPE_ASSET)) { 
          out.write("\r\n\t\t\t\t\t");
          out.write('\r');
          out.write('\n');
          out.write("\r\n\t\t\t\t\t");
          out.write('\r');
          out.write('\n');
          out.write("\r\n\t\t\t\t");
 } else { 
          out.write("\r\n\t\t\t\t\t");
          out.write("\r\n\t\t\t\t\t");
 if(row.getCallNumber()!=null) { 
          out.write("\r\n\t\t                ");
          //  base:td
          com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
          _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/circdesktitlelist.jsp(56,18) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f0.setClazz("ColRow");
          // /circulation/circdesktitlelist.jsp(56,18) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005ftd_005f0.setFiltered(true);
          int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
          if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005ftd_005f0.doInitBody();
            }
            do {
              out.print( row.getCallNumber() );
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
          out.write("\r\n\t\t            ");
 } else { 
          out.write("\r\n\t\t                <td>&nbsp;</td>\r\n\t\t            ");
 } 
          out.write("\r\n\t\t\t\t");
 } 
          out.write("\r\n\t\t\t\t</tr>\r\n    ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          row = (com.follett.fsc.destiny.session.circulation.data.CircDeskTitleVO) _jspx_page_context.findAttribute("row");
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
}
