package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;
import com.follett.fsc.destiny.client.circulation.servlet.BasePatronListForm;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.LocaleHelper;
import org.apache.struts.util.ResponseUtils;
import java.util.List;
import com.follett.fsc.destiny.session.backoffice.data.SitePatronDisplayInfoVO;
import com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue;

public final class patronlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fflipper_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n<table id=\"");
      out.print( BasePatronListForm.TABLE_PATRON_HITLIST );
      out.write("\" width=\"95%\" align=\"center\" cellspacing=\"0\" cellpadding=\"4\">\r\n\r\n");

	String formName = request.getParameter("formName");
	boolean districtSearch = "true".equals(request.getParameter("districtSearch"));
	BasePatronListForm form = (BasePatronListForm)request.getAttribute(formName);
    SessionStoreProxy store = SessionStoreProxy.getSessionStore(session, request);

      out.write('\r');
      out.write('\n');

	boolean labelOption = form.loadConfigSite(store);
    List listOfPatrons = form.getList();
	boolean isMedia = store.isMediaBookingUser();
    boolean isMiniDestiny = store.isMiniDestiny();

      out.write("\r\n\r\n\r\n\r\n\r\n    ");
      out.print( BasePatronListForm.buildPatronListHeader(store, districtSearch) );
      out.write("\r\n\r\n    ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005ftype_005fproperty_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      // /circulation/patronlist.jsp(35,4) name = indexId type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setIndexId("flipper");
      // /circulation/patronlist.jsp(35,4) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setId("row");
      // /circulation/patronlist.jsp(35,4) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setName( formName );
      // /circulation/patronlist.jsp(35,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setProperty("list");
      // /circulation/patronlist.jsp(35,4) name = type type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fiterate_005f0.setType("com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue row = null;
        java.lang.Integer flipper = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
        flipper = (java.lang.Integer) _jspx_page_context.findAttribute("flipper");
        do {
          out.write("\r\n        ");
          //  base:flipper
          com.follett.fsc.destiny.client.common.jsptag.FlipperTag _jspx_th_base_005fflipper_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FlipperTag) _005fjspx_005ftagPool_005fbase_005fflipper_005fkey.get(com.follett.fsc.destiny.client.common.jsptag.FlipperTag.class);
          _jspx_th_base_005fflipper_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fflipper_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          // /circulation/patronlist.jsp(37,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fflipper_005f0.setKey("newStyle");
          int _jspx_eval_base_005fflipper_005f0 = _jspx_th_base_005fflipper_005f0.doStartTag();
          if (_jspx_eval_base_005fflipper_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n            ");
 SitePatronDisplayInfoVO dispVO = row.getSitePatronInfo().get(0);
                FindSitePatronValue copyOfRow = row;
                
                if (store.getSiteID().equals(dispVO.getSiteID())) {
                    dispVO.setSiteShortName("");
                }
                
            
              out.write("\r\n            <td class=\"ColRow\">");
              out.print( form.buildPatronLink(form.getURLAction(), copyOfRow, request, response) );
              out.write("</td>\r\n            ");
              //  base:td
              com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f0 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
              _jspx_th_base_005ftd_005f0.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftd_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
              // /circulation/patronlist.jsp(47,12) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f0.setClazz("ColRow");
              // /circulation/patronlist.jsp(47,12) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f0.setFiltered(true);
              int _jspx_eval_base_005ftd_005f0 = _jspx_th_base_005ftd_005f0.doStartTag();
              if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005ftd_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005ftd_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005ftd_005f0.doInitBody();
                }
                do {
                  out.print(dispVO.getPatronBarcode());
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
              out.write("\r\n            ");

                if (!isMiniDestiny) {
            
              out.write("\r\n                ");

                    if (!isMedia) {
                
              out.write("  \r\n                   ");
              //  base:td
              com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f1 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
              _jspx_th_base_005ftd_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftd_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
              // /circulation/patronlist.jsp(54,19) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f1.setClazz("ColRow");
              // /circulation/patronlist.jsp(54,19) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f1.setFiltered(true);
              int _jspx_eval_base_005ftd_005f1 = _jspx_th_base_005ftd_005f1.doStartTag();
              if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005ftd_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005ftd_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005ftd_005f1.doInitBody();
                }
                do {
                  out.print(districtSearch ? dispVO.getHomeroom() : (labelOption ? dispVO.getUserField1() : dispVO.getHomeroom()));
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
              out.write("\r\n                   ");
              //  base:td
              com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f2 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
              _jspx_th_base_005ftd_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftd_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
              // /circulation/patronlist.jsp(55,19) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f2.setClazz("ColRow");
              // /circulation/patronlist.jsp(55,19) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f2.setFiltered(true);
              int _jspx_eval_base_005ftd_005f2 = _jspx_th_base_005ftd_005f2.doStartTag();
              if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005ftd_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005ftd_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005ftd_005f2.doInitBody();
                }
                do {
                  out.print(districtSearch ? dispVO.getSiteShortName() : (labelOption ? dispVO.getUserField2() : copyOfRow.getGradeLevel()));
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
              out.write("\r\n                ");

                    } else {
                
              out.write("\r\n                    ");
              //  base:td
              com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f3 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
              _jspx_th_base_005ftd_005f3.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftd_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
              // /circulation/patronlist.jsp(59,20) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f3.setClazz("ColRow");
              // /circulation/patronlist.jsp(59,20) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f3.setFiltered(true);
              int _jspx_eval_base_005ftd_005f3 = _jspx_th_base_005ftd_005f3.doStartTag();
              if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005ftd_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005ftd_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005ftd_005f3.doInitBody();
                }
                do {
                  out.print(dispVO.getUserField1());
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
              out.write("\r\n                    ");
              //  base:td
              com.follett.fsc.destiny.client.common.jsptag.TDTag _jspx_th_base_005ftd_005f4 = (com.follett.fsc.destiny.client.common.jsptag.TDTag) _005fjspx_005ftagPool_005fbase_005ftd_005ffiltered_005fclazz.get(com.follett.fsc.destiny.client.common.jsptag.TDTag.class);
              _jspx_th_base_005ftd_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005ftd_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fflipper_005f0);
              // /circulation/patronlist.jsp(60,20) name = clazz type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f4.setClazz("ColRow");
              // /circulation/patronlist.jsp(60,20) name = filtered type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005ftd_005f4.setFiltered(true);
              int _jspx_eval_base_005ftd_005f4 = _jspx_th_base_005ftd_005f4.doStartTag();
              if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_base_005ftd_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_base_005ftd_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_base_005ftd_005f4.doInitBody();
                }
                do {
                  out.print(districtSearch ? dispVO.getSiteShortName() : dispVO.getUserField2());
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
              out.write("\r\n                ");
 } 
              out.write("\r\n            ");
 } 
              out.write("\r\n        ");
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
          row = (com.follett.fsc.destiny.session.backoffice.data.FindSitePatronValue) _jspx_page_context.findAttribute("row");
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
      out.write("\r\n</table>\r\n\r\n\r\n");
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
