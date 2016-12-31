package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.util.DestinySystemProperties;

public final class setsound_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n\r\n\r\n\r\n<script language=\"JavaScript\">\r\n<!--\r\nfunction setSound(src){\r\n\tdocument.writeln(generateSoundBlock(src));\r\n}\r\nfunction generateSoundBlock(src){\r\n\tvar soundBlock=\"\";\r\n    if ( \r\n        //IE 11 appName is changed to Netscape. previous browsers it was Microsoft Internet Explorer. Cant use Netscape as FF uses it as well. So trident it is.\r\n        ((navigator.appName.indexOf('Microsoft') != -1) || (navigator.userAgent.indexOf('Trident') != -1))  &&\r\n        (navigator.appVersion.indexOf('Windows') != -1) &&\r\n        (parseFloat(navigator.appVersion) >= 4)) {\r\n        soundBlock+='<bgsound src=\"' + src +'\">';\r\n    } else if (navigator.userAgent.indexOf('Safari') != -1 && navigator.userAgent.indexOf('Chrome') == -1) {\r\n        //safari cant play custom sounds using html5- looks like it is not making network call, tries using cache. So use the old way. \r\n         soundBlock+='<embed src=\"' + src + '\" MASTERSOUND width=\"0\" height=\"0\" nosave=\"false\" loop=\"false\" hidden=\"true\" autostart=\"true\" NAME=\"CircSound\">';\r\n");
      out.write("    } else {\r\n        //FF and chrome use HTML5 audio, with embed fallback. fallback is probably not needed, but wont hurt. no specific reason though to keep it.\r\n        soundBlock+='<audio autoplay=\"autoplay\">';\r\n        soundBlock+='<source  type=\"audio/wav\" src=\"' + src + '\">';\r\n         var type='';\r\n         var hasProperty = ");
      out.print( DestinySystemProperties.isChromeWindowsSoundsUsingVLC() );
      out.write(";\r\n         if (hasProperty && navigator.appVersion.indexOf('Windows') != -1 && navigator.userAgent.toLowerCase().indexOf('chrome') > -1) {\r\n             type = 'type=\"application/x-vlc-plugin\" ';\r\n         }\r\n         soundBlock+='<embed src=\"' + src + '\" ' + type + 'MASTERSOUND width=\"0\" height=\"0\" nosave=\"false\" loop=\"false\" hidden=\"true\" autostart=\"true\" NAME=\"CircSound\">';\r\n       soundBlock+='</audio>';\r\n    }\r\n    return(soundBlock);\r\n}\r\n//-->\r\n</script>\r\n\r\n");
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
