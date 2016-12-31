package org.apache.jsp.consortium;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.consortium.servlet.*;
import com.follett.fsc.destiny.session.consortium.data.*;
import com.follett.fsc.destiny.client.common.*;
import java.util.*;
import com.follett.fsc.destiny.session.consortium.ejb.ConsortiumFacadeSpecs;
import org.apache.struts.util.ResponseUtils;
import com.follett.fsc.common.consortium.*;
import com.follett.fsc.common.*;
import com.follett.fsc.destiny.util.DestinyColors;

public final class listconsortiummembers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005flink_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005flink_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005flink_005fpage.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<script language=\"JavaScript\" type=\"Text/Javascript\">\r\n<!--\r\nfunction addToFavorites(pagename, urladdress) {\r\n   var startingURL = window.document.URL;\r\n   for(x = 1; x < startingURL.length - 1; x++) {\r\n      if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {\r\n         startingURL = startingURL.substring(0, x);\r\n         break;\r\n      }\r\n   }\r\n   if(startingURL.charAt(startingURL.length - 1) == '/') {\r\n       startingURL = startingURL.substring(0, startingURL.length - 1);\r\n   }\r\n   startingURL = startingURL + urladdress;\r\n   \r\n   if(window.sidebar) {\r\n      window.sidebar.addPanel(pagename, startingURL, \"\");\r\n   } else if (window.external) {\r\n      window.external.AddFavorite(startingURL, pagename)\r\n   } else {\r\n      alert(\"Sorry! Your browser doesn't support this function.\");\r\n   }\r\n}\r\n// --></script>\r\n\r\n");
      if (_jspx_meth_base_005fmessageBox_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    DistrictContext dc = ContextManager.getContextManager().getDefaultDistrictContext();
    String contextName = dc.getContextName();
    ListConsortiumMembersForm form = (ListConsortiumMembersForm)request.getAttribute("consortium_servlet_ListConsortiumMembersForm");


      out.write("\r\n\r\n\r\n\r\n<table border=\"0\" cellspacing=\"0\" cellpadding=\"3\"  id=\"consortiumList\" width=\"100%\">\r\n<tr>\r\n    ");

        boolean showFSCOnlyOptions = HTTPHelper.isInternalToFSC();
    
      out.write("\r\n    <td col class=\"MainHeader\" align=\"center\">Welcome to ");
      out.print( ResponseUtils.filter(ListConsortiumMembersForm.getConsortiumName(request, session)) );
      out.write("</td>    \r\n</tr>\r\n");
 if (showFSCOnlyOptions) { 
      out.write("\r\n<tr>\r\n    <td class=\"ColRow\" align=\"center\" colspan=\"3\">\r\n        ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f0 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f0.setParent(null);
      // /consortium/listconsortiummembers.jsp(63,8) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f0.setPage( "/consortium/servlet/handleconsortiumloginform.do?consortiumContextMode=true&loginName=superadmin&password=password&context=" + contextName );
      int _jspx_eval_base_005flink_005f0 = _jspx_th_base_005flink_005f0.doStartTag();
      if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f0.doInitBody();
        }
        do {
          out.write("\r\n            Login as SuperAdmin\r\n        ");
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
        return;
      }
      _005fjspx_005ftagPool_005fbase_005flink_005fpage.reuse(_jspx_th_base_005flink_005f0);
      out.write("\r\n        \r\n    </td>\r\n</tr>\r\n");
 } 
      out.write("\r\n<tr>\r\n<td align=\"center\" colspan=\"3\">\r\n\r\n<table id=\"");
      out.print(ListConsortiumMembersForm.TABLE_MASTER);
      out.write("\" cellpadding=\"3\" cellspacing=\"0\" align=\"center\" width=\"85%\">\r\n<tr valign=\"top\">\r\n\r\n");

    //Get both lists here so that we can test the sizes
    List leftList = form.getWelcomeTree().getLeftSiteTypeList();
    List rightList = form.getWelcomeTree().getRightSiteTypeList();
    String theWidth = "50%"; //Default 2 columns, 50% it
    if (rightList.size() == 0) {
        //If there is no right list, make the width 100%
        theWidth = "100%";
    }

if ( leftList.size() > 0 )  { 
      out.write("\r\n\r\n<td width=\"");
      out.print( theWidth );
      out.write("\">\r\n\r\n");

    ConsortiumMemberClientValue dtr;
    Iterator leftIterator = leftList.iterator();
    int index = 0;

    while ( leftIterator.hasNext() ) {
        List currentList = (List)leftIterator.next();

        Iterator leftSideIterator = currentList.iterator();
        boolean first = true;
        while ( leftSideIterator.hasNext() ) {
            dtr = (ConsortiumMemberClientValue) leftSideIterator.next();
            if ( first ) {
                first = false;

                out.println("<TABLE border=\"1\" id=\"" + ListConsortiumMembersForm.TABLE_LEFT_GROUP + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                out.println("<FONT color=\"#FFFFFF\">");
                out.println(ResponseUtils.filter(dtr.getGroupName()) );
                out.println("</FONT>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\">");
                out.println("<table id=\"" + ListConsortiumMembersForm.TABLE_LEFT_MEMBER + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
            }

      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\">\r\n                        <ul><li>\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f1 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f1.setParent(null);
      // /consortium/listconsortiummembers.jsp(121,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f1.setPage( "/common/welcome.jsp?context=" + dtr.getConsortiumContextName() );
      int _jspx_eval_base_005flink_005f1 = _jspx_th_base_005flink_005f1.doStartTag();
      if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f1.doInitBody();
        }
        do {
          out.write("\r\n                                ");
          out.print( ResponseUtils.filter(dtr.getName()) );
          out.write("\r\n                            ");
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
      out.write("\r\n                        </li></ul>\r\n                        </td>\r\n                        <td valign=\"absbottom\">\r\n                           <a href=\"javascript:addToFavorites('Destiny District - ");
      out.print(ResponseUtils.filter(StringHelper.removeChars(dtr.getName(), "\'")) );
      out.write("', '");
      out.print(form.gimmeUrlForBookmark(dtr.getConsortiumContextName()) );
      out.write("')\">");
      if (_jspx_meth_base_005fimage_005f0(_jspx_page_context))
        return;
      out.write("</a>\r\n                        </td>\r\n                    </tr>\r\n                ");

            }
            
      out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        </table>\r\n        <br>\r\n    ");

    index++;
    } 
      out.write("\r\n</td>\r\n\r\n");
 } 
      out.write("\r\n\r\n\r\n\r\n");
 if ( rightList.size() > 0 )  { 
      out.write("\r\n\r\n<td>");
      if (_jspx_meth_base_005fimageSpacer_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n<td width=\"50%\">\r\n\r\n");

    ConsortiumMemberClientValue dtr;
    Iterator rightIterator = rightList.iterator();
    int index = 0;

    while ( rightIterator.hasNext() ) {
        List currentList = (List)rightIterator.next();
        Iterator rightSideIterator = currentList.iterator();
        boolean first = true;
        while ( rightSideIterator.hasNext() ) {
            dtr = (ConsortiumMemberClientValue) rightSideIterator.next();
            if ( first ) {
                first = false;

                out.println("<TABLE border=\"1\" id=\"" + ListConsortiumMembersForm.TABLE_RIGHT_GROUP + "_" + index + "\" cellpadding=\"2\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"" + DestinyColors.BACKGROUND + "\" width=\"100%\">");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\" class=\"ColRowBold\" bgcolor=\"" + DestinyColors.BACKGROUND + "\">");
                out.println("<FONT color=\"#FFFFFF\">");
                out.println(ResponseUtils.filter(dtr.getGroupName()));
                out.println("</FONT>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width=\"100%\" align=\"center\">");
                out.println("<table id=\"" + ListConsortiumMembersForm.TABLE_RIGHT_MEMBER + "_" + index + "\" cellPadding=\"2\" cellspacing=\"0\">");
            }
            
        
      out.write("\r\n                    <tr>\r\n                        <td class=\"ColRow\">\r\n                        <ul><li>\r\n                            ");
      //  base:link
      com.follett.fsc.destiny.client.common.jsptag.LinkTag _jspx_th_base_005flink_005f2 = (com.follett.fsc.destiny.client.common.jsptag.LinkTag) _005fjspx_005ftagPool_005fbase_005flink_005fpage.get(com.follett.fsc.destiny.client.common.jsptag.LinkTag.class);
      _jspx_th_base_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_base_005flink_005f2.setParent(null);
      // /consortium/listconsortiummembers.jsp(183,28) name = page type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005flink_005f2.setPage( "/common/welcome.jsp?context=" + dtr.getConsortiumContextName() );
      int _jspx_eval_base_005flink_005f2 = _jspx_th_base_005flink_005f2.doStartTag();
      if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_base_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_base_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_base_005flink_005f2.doInitBody();
        }
        do {
          out.write("                        \r\n                                ");
          out.print( ResponseUtils.filter(dtr.getName()) );
          out.write("\r\n                            ");
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
      out.write("\r\n                        </li></ul>\r\n                        </td>\r\n                        <td valign=\"absbottom\">\r\n                           <a href=\"javascript:addToFavorites('Destiny District - ");
      out.print(ResponseUtils.filter(StringHelper.removeChars(dtr.getName(), "\'")) );
      out.write("', '");
      out.print(form.gimmeUrlForBookmark(dtr.getConsortiumContextName()) );
      out.write("')\">");
      if (_jspx_meth_base_005fimage_005f1(_jspx_page_context))
        return;
      out.write("</a>\r\n                        </td>\r\n                    </tr>\r\n\r\n                ");

            }
            
      out.write("\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        </table>\r\n        <br>\r\n    ");

    index++;
    } 
      out.write("\r\n\r\n</td>\r\n\r\n");
 } 
      out.write("\r\n\r\n</tr>\r\n</table>\r\n\r\n</td>\r\n</tr>\r\n<tr>\r\n    <td align=\"center\" > \r\n    ");
      out.print(  form.getWelcomeImage() );
      out.write("\r\n    </td>\r\n</tr>\r\n</table>\r\n");
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
    // /consortium/listconsortiummembers.jsp(43,0) name = strutsErrors type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fmessageBox_005f0.setStrutsErrors(true);
    int _jspx_eval_base_005fmessageBox_005f0 = _jspx_th_base_005fmessageBox_005f0.doStartTag();
    if (_jspx_th_base_005fmessageBox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fmessageBox_005fstrutsErrors_005fnobody.reuse(_jspx_th_base_005fmessageBox_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent(null);
    // /consortium/listconsortiummembers.jsp(127,225) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/icons/general/bookmark.gif");
    // /consortium/listconsortiummembers.jsp(127,225) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setWidth(16);
    // /consortium/listconsortiummembers.jsp(127,225) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setHeight(16);
    // /consortium/listconsortiummembers.jsp(127,225) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Bookmark this Member");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimageSpacer_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:imageSpacer
    com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag _jspx_th_base_005fimageSpacer_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag) _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageSpacerTag.class);
    _jspx_th_base_005fimageSpacer_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimageSpacer_005f0.setParent(null);
    // /consortium/listconsortiummembers.jsp(149,4) name = width type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setWidth(20);
    // /consortium/listconsortiummembers.jsp(149,4) name = height type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimageSpacer_005f0.setHeight(1);
    int _jspx_eval_base_005fimageSpacer_005f0 = _jspx_th_base_005fimageSpacer_005f0.doStartTag();
    if (_jspx_th_base_005fimageSpacer_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimageSpacer_005fwidth_005fheight_005fnobody.reuse(_jspx_th_base_005fimageSpacer_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f1 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f1.setParent(null);
    // /consortium/listconsortiummembers.jsp(189,225) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setSrc("/icons/general/bookmark.gif");
    // /consortium/listconsortiummembers.jsp(189,225) name = width type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setWidth(16);
    // /consortium/listconsortiummembers.jsp(189,225) name = height type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setHeight(16);
    // /consortium/listconsortiummembers.jsp(189,225) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f1.setAlt("Bookmark this Member");
    int _jspx_eval_base_005fimage_005f1 = _jspx_th_base_005fimage_005f1.doStartTag();
    if (_jspx_th_base_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fwidth_005fsrc_005fheight_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f1);
    return false;
  }
}
