package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.common.servlet.MiniSiteMenuForm;
import com.follett.fsc.destiny.util.Permission;
import com.follett.fsc.destiny.session.common.SessionStoreProxy;

public final class minisitemenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<table id=\"");
      out.print(MiniSiteMenuForm.TABLE_NAME);
      out.write("\" cellpadding=\"2\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n\r\n");

    SessionStoreProxy store = SessionStoreProxy.getSessionStore( session, request );
 
      out.write('\r');
      out.write('\n');
 if (!store.isStateContext()) { 
      out.write(' ');
      out.write('\r');
      out.write('\n');
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f0.setParent(null);
      // /common/minisitemenu.jsp(18,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setName(MiniSiteMenuForm.FORM_NAME);
      // /common/minisitemenu.jsp(18,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setProperty("mediaSite");
      // /common/minisitemenu.jsp(18,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f0.setValue("true");
      int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
      if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  base:spanIfAllowed
          com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f0 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
          _jspx_th_base_005fspanIfAllowed_005f0.setPageContext(_jspx_page_context);
          _jspx_th_base_005fspanIfAllowed_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
          // /common/minisitemenu.jsp(19,0) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fspanIfAllowed_005f0.setPermissions( new Permission[] {Permission.CIRC_CHECKIN, Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} );
          int _jspx_eval_base_005fspanIfAllowed_005f0 = _jspx_th_base_005fspanIfAllowed_005f0.doStartTag();
          if (_jspx_eval_base_005fspanIfAllowed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n       <td>\r\n           <table id=\"");
              out.print(MiniSiteMenuForm.TABLE_LIBRARY);
              out.write("\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n               <tr>\r\n                  <td class=\"ColRowBold\">");
              if (_jspx_meth_base_005fimage_005f0(_jspx_th_base_005fspanIfAllowed_005f0, _jspx_page_context))
                return;
              out.write("Media Manager</td>\r\n               </tr>\r\n               <tr>\r\n                  <td class=\"ColRow\">\r\n                     <ul>\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f1 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f1.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
              // /common/minisitemenu.jsp(29,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f1.setPermissions( new Permission[] {Permission.CIRC_CHECKIN} );
              int _jspx_eval_base_005fspanIfAllowed_005f1 = _jspx_th_base_005fspanIfAllowed_005f1.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <li>");
                  if (_jspx_meth_base_005flink_005f0(_jspx_th_base_005fspanIfAllowed_005f1, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f1);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f2 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f2.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
              // /common/minisitemenu.jsp(32,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f2.setPermissions( new Permission[] {Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} );
              int _jspx_eval_base_005fspanIfAllowed_005f2 = _jspx_th_base_005fspanIfAllowed_005f2.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f2);
                  // /common/minisitemenu.jsp(33,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f1.setPage( "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&uploadFile=false&invChooser=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_MEDIA);
                  int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
                  if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f1.doInitBody();
                    }
                    do {
                      out.write("Inventory");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f1);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f2);
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
              // /common/minisitemenu.jsp(35,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setName(MiniSiteMenuForm.FORM_NAME);
              // /common/minisitemenu.jsp(35,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setProperty("canUploadMediaFiles");
              // /common/minisitemenu.jsp(35,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f1.setValue("true");
              int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
              if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
                  // /common/minisitemenu.jsp(36,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f2.setPage("/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_MEDIA);
                  int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
                  if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f2.doInitBody();
                    }
                    do {
                      out.write("Upload File");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f2.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f2);
                  out.write("</li>\r\n                        ");
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
              out.write("\r\n                     </ul>\r\n                  </td>\r\n               </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fspanIfAllowed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f0);
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
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f2.setParent(null);
      // /common/minisitemenu.jsp(46,0) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setName(MiniSiteMenuForm.FORM_NAME);
      // /common/minisitemenu.jsp(46,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setProperty("mediaSite");
      // /common/minisitemenu.jsp(46,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f2.setValue("false");
      int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
      if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                \r\n");
          //  base:spanIfAllowed
          com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f3 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
          _jspx_th_base_005fspanIfAllowed_005f3.setPageContext(_jspx_page_context);
          _jspx_th_base_005fspanIfAllowed_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /common/minisitemenu.jsp(47,0) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fspanIfAllowed_005f3.setPermissions( new Permission[] {Permission.CIRC_CHECKOUT, Permission.CIRC_CHECKIN, Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} );
          int _jspx_eval_base_005fspanIfAllowed_005f3 = _jspx_th_base_005fspanIfAllowed_005f3.doStartTag();
          if (_jspx_eval_base_005fspanIfAllowed_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n       <td>\r\n           <table id=\"");
              out.print(MiniSiteMenuForm.TABLE_LIBRARY);
              out.write("\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n               <tr>\r\n                  <td class=\"ColRowBold\">");
              if (_jspx_meth_base_005fimage_005f1(_jspx_th_base_005fspanIfAllowed_005f3, _jspx_page_context))
                return;
              out.write("Library Manager</td>\r\n               </tr>\r\n               <tr>\r\n                  <td class=\"ColRow\">\r\n                     <ul>\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f4 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f4.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
              // /common/minisitemenu.jsp(57,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f4.setPermissions( new Permission[] {Permission.CIRC_CHECKOUT} );
              int _jspx_eval_base_005fspanIfAllowed_005f4 = _jspx_th_base_005fspanIfAllowed_005f4.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <li>");
                  if (_jspx_meth_base_005flink_005f3(_jspx_th_base_005fspanIfAllowed_005f4, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f4);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f5 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f5.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
              // /common/minisitemenu.jsp(60,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f5.setPermissions( new Permission[] {Permission.CIRC_CHECKIN} );
              int _jspx_eval_base_005fspanIfAllowed_005f5 = _jspx_th_base_005fspanIfAllowed_005f5.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <li>");
                  if (_jspx_meth_base_005flink_005f4(_jspx_th_base_005fspanIfAllowed_005f5, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f5);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f6 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f6.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
              // /common/minisitemenu.jsp(63,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f6.setPermissions( new Permission[] {Permission.BACK_OFFICE_INVENTORY_LIBRARY_COLLECTION} );
              int _jspx_eval_base_005fspanIfAllowed_005f6 = _jspx_th_base_005fspanIfAllowed_005f6.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f5 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f6);
                  // /common/minisitemenu.jsp(64,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f5.setPage( "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_LIBRARY);
                  int _jspx_eval_base_005flink_005f5 = _jspx_th_base_005flink_005f5.doStartTag();
                  if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f5.doInitBody();
                    }
                    do {
                      out.write("Inventory");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f5);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f6);
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
              // /common/minisitemenu.jsp(66,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setName(MiniSiteMenuForm.FORM_NAME);
              // /common/minisitemenu.jsp(66,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setProperty("canUploadLibraryFiles");
              // /common/minisitemenu.jsp(66,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f3.setValue("true");
              int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
              if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f6 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
                  // /common/minisitemenu.jsp(67,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f6.setPage( "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_LIBRARY );
                  int _jspx_eval_base_005flink_005f6 = _jspx_th_base_005flink_005f6.doStartTag();
                  if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f6.doInitBody();
                    }
                    do {
                      out.write("Upload File");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f6);
                  out.write("</li>\r\n                        ");
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
              out.write("\r\n                     </ul>\r\n                  </td>\r\n               </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fspanIfAllowed_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f3);
          out.write('\r');
          out.write('\n');
          //  base:spanIfAllowed
          com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f7 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
          _jspx_th_base_005fspanIfAllowed_005f7.setPageContext(_jspx_page_context);
          _jspx_th_base_005fspanIfAllowed_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /common/minisitemenu.jsp(76,0) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fspanIfAllowed_005f7.setPermissions( new Permission[] {Permission.CIRC_CHECKOUT_TEXTBOOK, Permission.CIRC_CHECKIN_TEXTBOOK, Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION, Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} );
          int _jspx_eval_base_005fspanIfAllowed_005f7 = _jspx_th_base_005fspanIfAllowed_005f7.doStartTag();
          if (_jspx_eval_base_005fspanIfAllowed_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n       <td>\r\n           <table id=\"");
              out.print(MiniSiteMenuForm.TABLE_TEXTBOOK);
              out.write("\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n               <tr>\r\n                  <td class=\"ColRowBold\">");
              if (_jspx_meth_base_005fimage_005f2(_jspx_th_base_005fspanIfAllowed_005f7, _jspx_page_context))
                return;
              out.write("Textbook Manager</td>\r\n               </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                       <ul>\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f8 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f8.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(86,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f8.setPermissions( new Permission[] {Permission.CIRC_CHECKOUT_TEXTBOOK} );
              int _jspx_eval_base_005fspanIfAllowed_005f8 = _jspx_th_base_005fspanIfAllowed_005f8.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  if (_jspx_meth_base_005flink_005f7(_jspx_th_base_005fspanIfAllowed_005f8, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                          <li>");
                  if (_jspx_meth_base_005flink_005f8(_jspx_th_base_005fspanIfAllowed_005f8, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                          <li>");
                  if (_jspx_meth_base_005flink_005f9(_jspx_th_base_005fspanIfAllowed_005f8, _jspx_page_context))
                    return;
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f8);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f9 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f9.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(91,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f9.setPermissions( new Permission[] {Permission.CIRC_CHECKIN_TEXTBOOK} );
              int _jspx_eval_base_005fspanIfAllowed_005f9 = _jspx_th_base_005fspanIfAllowed_005f9.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f10 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f9);
                  // /common/minisitemenu.jsp(92,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f10.setPage("/circulation/servlet/presentcheckinform.do?l2m=Check%20In%20Text&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_base_005flink_005f10 = _jspx_th_base_005flink_005f10.doStartTag();
                  if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f10.doInitBody();
                    }
                    do {
                      out.write("Check In");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f10.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f10);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f9);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f10 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f10.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(94,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f10.setPermissions( new Permission[] {Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION} );
              int _jspx_eval_base_005fspanIfAllowed_005f10 = _jspx_th_base_005fspanIfAllowed_005f10.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f11 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f11.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f10);
                  // /common/minisitemenu.jsp(95,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f11.setPage( "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_base_005flink_005f11 = _jspx_th_base_005flink_005f11.doStartTag();
                  if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f11.doInitBody();
                    }
                    do {
                      out.write("Inventory");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f11.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f11);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f10.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f10);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f10);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f11 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f11.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(97,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f11.setPermissions( new Permission[] {Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} );
              int _jspx_eval_base_005fspanIfAllowed_005f11 = _jspx_th_base_005fspanIfAllowed_005f11.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f12 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f12.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f11);
                  // /common/minisitemenu.jsp(98,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f12.setPage( "/cataloging/servlet/presenttransferform.do?barcodeListOnly=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_base_005flink_005f12 = _jspx_th_base_005flink_005f12.doStartTag();
                  if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f12.doInitBody();
                    }
                    do {
                      out.write("Transfer Textbooks");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f12.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f12);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f11.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f11);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f11);
              out.write("\r\n                        ");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f12 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f12.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(100,24) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f12.setPermissions( new Permission[] {Permission.CAT_TRANSFER_RECEIVE_TEXTBOOK_COPIES} );
              int _jspx_eval_base_005fspanIfAllowed_005f12 = _jspx_th_base_005fspanIfAllowed_005f12.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f13 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f13.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f12);
                  // /common/minisitemenu.jsp(101,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f13.setPage( "/cataloging/servlet/presentreceiveitemstrackform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_base_005flink_005f13 = _jspx_th_base_005flink_005f13.doStartTag();
                  if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f13.doInitBody();
                    }
                    do {
                      out.write("Receive Textbooks");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f13.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f13);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f13);
                  out.write("</li>\r\n                        ");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f12.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f12);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f12);
              out.write("\r\n                        ");
              //  logic:equal
              org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
              _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
              // /common/minisitemenu.jsp(103,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setName(MiniSiteMenuForm.FORM_NAME);
              // /common/minisitemenu.jsp(103,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setProperty("canUploadTextbookFiles");
              // /common/minisitemenu.jsp(103,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_logic_005fequal_005f4.setValue("true");
              int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
              if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f14 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f14.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f4);
                  // /common/minisitemenu.jsp(104,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f14.setPage( "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
                  int _jspx_eval_base_005flink_005f14 = _jspx_th_base_005flink_005f14.doStartTag();
                  if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f14.doInitBody();
                    }
                    do {
                      out.write("Upload File");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f14.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f14);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f14);
                  out.write("</li>\r\n                        ");
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
              out.write("\r\n                       </ul>            \r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fspanIfAllowed_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f7);
          out.write("   \r\n");
          //  base:spanIfAllowed
          com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f13 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
          _jspx_th_base_005fspanIfAllowed_005f13.setPageContext(_jspx_page_context);
          _jspx_th_base_005fspanIfAllowed_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f2);
          // /common/minisitemenu.jsp(113,0) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005fspanIfAllowed_005f13.setPermissions( new Permission[] {Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION, Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.CIRC_ASSET_CHECKOUT, Permission.CIRC_ASSET_CHECKIN} );
          int _jspx_eval_base_005fspanIfAllowed_005f13 = _jspx_th_base_005fspanIfAllowed_005f13.doStartTag();
          if (_jspx_eval_base_005fspanIfAllowed_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n   <tr>\r\n       <td>\r\n           <table id=\"");
              out.print(MiniSiteMenuForm.TABLE_ASSET);
              out.write("\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n               <tr>\r\n                  <td class=\"ColRowBold\">");
              if (_jspx_meth_base_005fimage_005f3(_jspx_th_base_005fspanIfAllowed_005f13, _jspx_page_context))
                return;
              out.write("Resource Manager</td>\r\n               </tr>\r\n                <tr>\r\n                    <td class=\"ColRow\">\r\n                       <ul>\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f14 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f14.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(123,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f14.setPermissions( new Permission[] {Permission.CIRC_ASSET_CHECKOUT} );
              int _jspx_eval_base_005fspanIfAllowed_005f14 = _jspx_th_base_005fspanIfAllowed_005f14.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t\t\t\t<li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f15 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f15.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f14);
                  // /common/minisitemenu.jsp(124,11) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f15.setPage("/circulation/servlet/presentcheckoutform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f15 = _jspx_th_base_005flink_005f15.doStartTag();
                  if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f15.doInitBody();
                    }
                    do {
                      out.write("Check Out to Patron");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f15.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f15);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f15);
                  out.write("</li>\r\n\t\t\t\t\t\t\t<li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f16 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f16.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f14);
                  // /common/minisitemenu.jsp(125,11) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f16.setPage("/circulation/servlet/presentcheckouttodepartmentform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f16 = _jspx_th_base_005flink_005f16.doStartTag();
                  if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f16.doInitBody();
                    }
                    do {
                      out.write("Check Out to Department");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f16.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f16);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f16);
                  out.write("</li>\r\n\t\t\t\t\t\t\t<li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f17 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f17.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f14);
                  // /common/minisitemenu.jsp(126,11) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f17.setPage("/circulation/servlet/presentcheckouttolocationform.do?l2m=Check%20Out&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f17 = _jspx_th_base_005flink_005f17.doStartTag();
                  if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f17.doInitBody();
                    }
                    do {
                      out.write("Check Out to Location");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f17.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f17);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f17);
                  out.write("</li>\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f14.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f14);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f14);
              out.write("\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f15 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f15.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(128,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f15.setPermissions( new Permission[] {Permission.CIRC_ASSET_CHECKIN} );
              int _jspx_eval_base_005fspanIfAllowed_005f15 = _jspx_th_base_005fspanIfAllowed_005f15.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t\t\t\t\t\t<li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f18 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f18.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f15);
                  // /common/minisitemenu.jsp(129,11) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f18.setPage("/circulation/servlet/presentcheckinform.do?l2m=Check%20In&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f18 = _jspx_th_base_005flink_005f18.doStartTag();
                  if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f18.doInitBody();
                    }
                    do {
                      out.write("Check In");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f18.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f18);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f18);
                  out.write("</li>\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f15.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f15);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f15);
              out.write("\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f16 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f16.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(131,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f16.setPermissions( new Permission[] {Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION} );
              int _jspx_eval_base_005fspanIfAllowed_005f16 = _jspx_th_base_005fspanIfAllowed_005f16.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f19 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f19.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f16);
                  // /common/minisitemenu.jsp(132,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f19.setPage( "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f19 = _jspx_th_base_005flink_005f19.doStartTag();
                  if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f19.doInitBody();
                    }
                    do {
                      out.write("Inventory");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f19.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f19);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f19);
                  out.write("</li>\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f16.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f16);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f16);
              out.write("\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f17 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f17.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(134,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f17.setPermissions( new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS} );
              int _jspx_eval_base_005fspanIfAllowed_005f17 = _jspx_th_base_005fspanIfAllowed_005f17.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                            <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f20 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f20.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f17);
                  // /common/minisitemenu.jsp(135,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f20.setPage( "/cataloging/servlet/presenttransferform.do?barcodeListOnly=true&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f20 = _jspx_th_base_005flink_005f20.doStartTag();
                  if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f20.doInitBody();
                    }
                    do {
                      out.write("Transfer Resources");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f20.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f20);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f20);
                  out.write("</li>\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f17.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f17);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f17);
              out.write("\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f18 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f18.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(137,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f18.setPermissions( new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.CAT_MANAGE_RECEIVE_ASSET_ITEMS_WITHOUT_BARCODES} );
              int _jspx_eval_base_005fspanIfAllowed_005f18 = _jspx_th_base_005fspanIfAllowed_005f18.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                          <li>");
                  //  base:link
                  com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f21 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                  _jspx_th_base_005flink_005f21.setPageContext(_jspx_page_context);
                  _jspx_th_base_005flink_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f18);
                  // /common/minisitemenu.jsp(138,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_base_005flink_005f21.setPage( "/cataloging/servlet/presentreceiveitemstrackform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                  int _jspx_eval_base_005flink_005f21 = _jspx_th_base_005flink_005f21.doStartTag();
                  if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_base_005flink_005f21.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_base_005flink_005f21.doInitBody();
                    }
                    do {
                      out.write("Receive Resources");
                      int evalDoAfterBody = _jspx_th_base_005flink_005f21.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_base_005flink_005f21 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_base_005flink_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f21);
                    return;
                  }
                  _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f21);
                  out.write("</li>\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f18.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f18);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f18);
              out.write("\r\n\t\t\t\t\t\t");
              //  base:spanIfAllowed
              com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag _jspx_th_base_005fspanIfAllowed_005f19 = (com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag) _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.get(com.follett.fsc.destiny.client.common.jsptag.SpanIfAllowedTag.class);
              _jspx_th_base_005fspanIfAllowed_005f19.setPageContext(_jspx_page_context);
              _jspx_th_base_005fspanIfAllowed_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
              // /common/minisitemenu.jsp(140,6) name = permissions type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_base_005fspanIfAllowed_005f19.setPermissions( new Permission[] {Permission.CAT_TRANSFER_RECEIVE_ASSET_ITEMS, Permission.BACK_OFFICE_INVENTORY_ASSET_COLLECTION} );
              int _jspx_eval_base_005fspanIfAllowed_005f19 = _jspx_th_base_005fspanIfAllowed_005f19.doStartTag();
              if (_jspx_eval_base_005fspanIfAllowed_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n                        ");
                  //  logic:equal
                  org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
                  _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f19);
                  // /common/minisitemenu.jsp(141,24) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setName(MiniSiteMenuForm.FORM_NAME);
                  // /common/minisitemenu.jsp(141,24) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setProperty("canUploadAssetFiles");
                  // /common/minisitemenu.jsp(141,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_logic_005fequal_005f5.setValue("true");
                  int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
                  if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    do {
                      out.write("\r\n                          <li>");
                      //  base:link
                      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f22 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
                      _jspx_th_base_005flink_005f22.setPageContext(_jspx_page_context);
                      _jspx_th_base_005flink_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
                      // /common/minisitemenu.jsp(142,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_base_005flink_005f22.setPage( "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_ASSET);
                      int _jspx_eval_base_005flink_005f22 = _jspx_th_base_005flink_005f22.doStartTag();
                      if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_base_005flink_005f22.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_base_005flink_005f22.doInitBody();
                        }
                        do {
                          out.write("Upload File");
                          int evalDoAfterBody = _jspx_th_base_005flink_005f22.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_base_005flink_005f22 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_base_005flink_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f22);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f22);
                      out.write("</li>\r\n                        ");
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
                  out.write("\r\n\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f19.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_base_005fspanIfAllowed_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f19);
                return;
              }
              _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f19);
              out.write("\r\n\t\t\t\t\t\t\r\n                       </ul>            \r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n");
              int evalDoAfterBody = _jspx_th_base_005fspanIfAllowed_005f13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_base_005fspanIfAllowed_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f13);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005fspanIfAllowed_005fpermissions.reuse(_jspx_th_base_005fspanIfAllowed_005f13);
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
 } else { 
      out.write("\r\n    ");
 if (store.canViewAny(new Permission[] { Permission.BACK_OFFICE_INVENTORY_TEXTBOOK_COLLECTION })) { 
      out.write("\r\n       <tr>\r\n           <td>\r\n               <table id=\"");
      out.print(MiniSiteMenuForm.TABLE_TEXTBOOK);
      out.write("\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n                   <tr>\r\n                      <td class=\"ColRowBold\">");
      if (_jspx_meth_base_005fimage_005f4(_jspx_page_context))
        return;
      out.write("Textbook Manager</td>\r\n                   </tr>\r\n                    <tr>\r\n                        <td class=\"ColRow\">\r\n                           <ul>\r\n                            <li>");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f23 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f23.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f23.setParent(null);
      // /common/minisitemenu.jsp(165,32) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f23.setPage( "/backoffice/servlet/presentinventoryform.do?l2m=Inventory&invChooser=true&uploadFile=false&collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
      int _jspx_eval_base_005flink_005f23 = _jspx_th_base_005flink_005f23.doStartTag();
      if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f23.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f23.doInitBody();
        }
        do {
          out.write("Inventory");
          int evalDoAfterBody = _jspx_th_base_005flink_005f23.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_base_005flink_005f23 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_base_005flink_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f23);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f23);
      out.write("</li>\r\n                            ");
      //  logic:equal
      org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
      _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fequal_005f6.setParent(null);
      // /common/minisitemenu.jsp(166,28) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setName(MiniSiteMenuForm.FORM_NAME);
      // /common/minisitemenu.jsp(166,28) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setProperty("canUploadTextbookFiles");
      // /common/minisitemenu.jsp(166,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_logic_005fequal_005f6.setValue("true");
      int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
      if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                                <li>");
          //  base:link
          com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f24 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
          _jspx_th_base_005flink_005f24.setPageContext(_jspx_page_context);
          _jspx_th_base_005flink_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
          // /common/minisitemenu.jsp(167,36) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_base_005flink_005f24.setPage( "/common/servlet/presentuploadfilemenuminiform.do?collectionType=" + BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK);
          int _jspx_eval_base_005flink_005f24 = _jspx_th_base_005flink_005f24.doStartTag();
          if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_base_005flink_005f24.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_base_005flink_005f24.doInitBody();
            }
            do {
              out.write("Upload File");
              int evalDoAfterBody = _jspx_th_base_005flink_005f24.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_base_005flink_005f24 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_base_005flink_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f24);
            return;
          }
          _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f24);
          out.write("</li>\r\n                            ");
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
      out.write("\r\n                           </ul>            \r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    ");
 } else { 
      out.write("\r\n        <tr><td class=\"ColRowBold\">You do not have permission to access this application.</td></tr>\r\n    ");
 } 
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n</table>\r\n");
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
    // /common/minisitemenu.jsp(10,75) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f0);
    // /common/minisitemenu.jsp(24,41) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/home.gif");
    // /common/minisitemenu.jsp(24,41) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setWidth(18);
    // /common/minisitemenu.jsp(24,41) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setHeight(16);
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f1);
    // /common/minisitemenu.jsp(30,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f0.setPage("/circulation/servlet/presentcheckinform.do?l2m=Check%20In");
    int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
    if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f0.doInitBody();
      }
      do {
        out.write("Check In");
        int evalDoAfterBody = _jspx_th_base_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f3);
    // /common/minisitemenu.jsp(52,41) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/icons/general/home.gif");
    // /common/minisitemenu.jsp(52,41) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setWidth(18);
    // /common/minisitemenu.jsp(52,41) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setHeight(16);
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f3 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f4);
    // /common/minisitemenu.jsp(58,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f3.setPage("/circulation/servlet/presentcheckoutform.do?l2m=Check%20Out");
    int _jspx_eval_base_005flink_005f3 = _jspx_th_base_005flink_005f3.doStartTag();
    if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f3.doInitBody();
      }
      do {
        out.write("Check Out");
        int evalDoAfterBody = _jspx_th_base_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f4 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f5);
    // /common/minisitemenu.jsp(61,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f4.setPage("/circulation/servlet/presentcheckinform.do?l2m=Check%20In");
    int _jspx_eval_base_005flink_005f4 = _jspx_th_base_005flink_005f4.doStartTag();
    if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f4.doInitBody();
      }
      do {
        out.write("Check In");
        int evalDoAfterBody = _jspx_th_base_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f2 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f7);
    // /common/minisitemenu.jsp(81,41) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f2.setSrc("/icons/general/home.gif");
    // /common/minisitemenu.jsp(81,41) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f2.setWidth(18);
    // /common/minisitemenu.jsp(81,41) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f2.setHeight(16);
    int _jspx_eval_base_005fimage_005f2 = _jspx_th_base_005fimage_005f2.doStartTag();
    if (_jspx_th_base_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f2);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f7 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f7.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f8);
    // /common/minisitemenu.jsp(87,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f7.setPage("/circulation/servlet/presentcheckoutform.do?collectionType=1");
    int _jspx_eval_base_005flink_005f7 = _jspx_th_base_005flink_005f7.doStartTag();
    if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f7.doInitBody();
      }
      do {
        out.write("Check Out to Patron");
        int evalDoAfterBody = _jspx_th_base_005flink_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f7);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f8 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f8.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f8);
    // /common/minisitemenu.jsp(88,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f8.setPage("/circulation/servlet/presentcheckoutform.do?collectionType=1&toClassMode=true");
    int _jspx_eval_base_005flink_005f8 = _jspx_th_base_005flink_005f8.doStartTag();
    if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f8.doInitBody();
      }
      do {
        out.write("Check Out by Class");
        int evalDoAfterBody = _jspx_th_base_005flink_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f8);
    return false;
  }

  private boolean _jspx_meth_base_005flink_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:link
    com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f9 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
    _jspx_th_base_005flink_005f9.setPageContext(_jspx_page_context);
    _jspx_th_base_005flink_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f8);
    // /common/minisitemenu.jsp(89,30) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005flink_005f9.setPage("/circulation/servlet/presentcheckoutform.do?collectionType=1&toTeacherMode=true");
    int _jspx_eval_base_005flink_005f9 = _jspx_th_base_005flink_005f9.doStartTag();
    if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_base_005flink_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_base_005flink_005f9.doInitBody();
      }
      do {
        out.write("Check Out to Teacher");
        int evalDoAfterBody = _jspx_th_base_005flink_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_base_005flink_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_base_005flink_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f9);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fspanIfAllowed_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f3 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fspanIfAllowed_005f13);
    // /common/minisitemenu.jsp(118,41) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f3.setSrc("/icons/general/home.gif");
    // /common/minisitemenu.jsp(118,41) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f3.setWidth(18);
    // /common/minisitemenu.jsp(118,41) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f3.setHeight(16);
    int _jspx_eval_base_005fimage_005f3 = _jspx_th_base_005fimage_005f3.doStartTag();
    if (_jspx_th_base_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f3);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f4 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f4.setParent(null);
    // /common/minisitemenu.jsp(160,45) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setSrc("/icons/general/home.gif");
    // /common/minisitemenu.jsp(160,45) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setWidth(18);
    // /common/minisitemenu.jsp(160,45) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f4.setHeight(16);
    int _jspx_eval_base_005fimage_005f4 = _jspx_th_base_005fimage_005f4.doStartTag();
    if (_jspx_th_base_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005fnobody.reuse(_jspx_th_base_005fimage_005f4);
    return false;
  }
}
