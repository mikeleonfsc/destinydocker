package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderoptionshelper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n<script language=\"JavaScript\">\r\n<!--\r\nfunction moveUp(theSelect) {\r\n    var selectBox = document.getElementById(theSelect);\r\n    //Only if there is something in the list\r\n    if (selectBox.length > 1) {\r\n        //Which are selected...\r\n        var selectedIds = new Array ();\r\n        var index = 0;\r\n        for (var i = 1; i < selectBox.length; i++) {\r\n            if (selectBox.options[i].selected) {\r\n                selectedIds[index] = i;\r\n                index++;\r\n            }\r\n        }\r\n\r\n        // move each selected option up\r\n        var selID;\r\n        for (var i = 0; i < selectedIds.length; i++) {\r\n            selID = selectedIds[i];\r\n            moveUpHelper(selectBox.options, selID);\r\n\r\n            //De-select the old and select the new\r\n            selectBox.options[selID].selected = false;\r\n            selectBox.options[selID-1].selected = true;\r\n        }\r\n    }\r\n}\r\n\r\nfunction moveDown(theSelect) {\r\n    var selectBox = document.getElementById(theSelect);\r\n    //Only if there is something in the list\r\n");
      out.write("    if (selectBox.length > 1) {\r\n        //Which are selected...\r\n        var selectedIds = new Array ();\r\n        var index = 0;\r\n        for (var i = selectBox.length-2; i >= 0; i--) {\r\n            if (selectBox.options[i].selected) {\r\n                selectedIds[index] = i;\r\n                index++;\r\n            }\r\n        }\r\n\r\n        // move each selected option down\r\n        var selID;\r\n        for (var i = 0; i < selectedIds.length; i++) {\r\n            selID = selectedIds[i];\r\n            moveDownHelper(selectBox.options, selID);\r\n\r\n            //De-select the old and select the new\r\n            selectBox.options[selID].selected = false;\r\n            selectBox.options[selID+1].selected = true;\r\n        }\r\n    }\r\n}\r\n\r\nfunction moveTop(theSelect) {\r\n    var selectBox = document.getElementById(theSelect);\r\n    //Only if there is something in the list\r\n    if (selectBox.length > 1) {\r\n        //Which are selected...\r\n        var selectedIds = new Array ();\r\n        var index = 0;\r\n        for (var i = 0; i < selectBox.options.length; i++) {\r\n");
      out.write("            if (selectBox.options[i].selected) {\r\n                selectedIds[index] = i;\r\n                index++;\r\n            }\r\n        }\r\n\r\n        // Move each selected option up to the topmost available\r\n        // position.  The first one in the selected list gets position 0,\r\n        // second one gets position 1, and so on.\r\n        var selID;\r\n        for (var i = 0; i < selectedIds.length; i++) {\r\n            selID = selectedIds[i];\r\n            // delta is how many positions up to move the selected item\r\n            // to get it into the target position, which is position \"i\"\r\n            delta = selID-i;\r\n            for (var j = 0 ; j < delta; j++) {\r\n                moveUpHelper(selectBox.options, selID-j);\r\n\r\n                selectBox.options[selID-j].selected = false;\r\n                selectBox.options[(selID-j)-1].selected = true;\r\n            }\r\n        }\r\n    }\r\n}\r\n\r\nfunction moveBottom(theSelect) {\r\n    var selectBox = document.getElementById(theSelect);\r\n\r\n    if (selectBox.length > 1) {\r\n");
      out.write("        // find which ones are selected...\r\n        var selectedIds = new Array ();\r\n        var index = 0;\r\n\r\n        for (var i = 0; i < selectBox.length; i++) {\r\n            if (selectBox.options[i].selected) {\r\n                selectedIds[index] = i;\r\n                index++;\r\n            }\r\n        }\r\n\r\n        // move each selected option down - starting from the end\r\n        // of the selected items array, we'll move each item down to\r\n        // the next lowest position (i.e., last one in the array ends up at\r\n        // the very bottom, nth one in the array ends up (array length - n) from\r\n        // the bottom\r\n        // targetPos is position the element is moving to\r\n        var targetPos = selectBox.length-1;\r\n        var selID;\r\n        for (var i = selectedIds.length-1; i >= 0 ; i--) {\r\n            selID = selectedIds[i];\r\n            // delta is how much to move down from the current position to get to the target position\r\n            var delta = targetPos-selID;\r\n            for (var j = 0 ; j < delta; j++) {\r\n");
      out.write("                moveDownHelper(selectBox.options, selID+j);\r\n                selectBox.options[selID+j].selected = false;\r\n                selectBox.options[(selID+j)+1].selected = true;\r\n            }\r\n            targetPos--;\r\n        }\r\n    }\r\n}\r\n\r\nfunction selectAll(theSelect) {\r\n    var selectBox = document.getElementById(theSelect);\r\n    for (var i = 0; i < selectBox.length; i++) {\r\n        selectBox.options[i].selected = true;\r\n    }\r\n}\r\n\r\n/*\r\n * Do not call this function directly.\r\n * As it does NO bounds checking.\r\n * Please use the moveUp or moveTop calls.\r\n */\r\nfunction moveUpHelper(options, index) {\r\n    //Create a new option to move it around\r\n    var newOption = new Option (options[index-1].text, options[index-1].value);\r\n    options[index-1].text = options[index].text;\r\n    options[index-1].value = options[index].value;\r\n    options[index].text = newOption.text;\r\n    options[index].value = newOption.value;\r\n}\r\n\r\n/*\r\n * Do not call this function directly.\r\n * As it does NO bounds checking.\r\n * Please use the moveDown or moveBottom calls.\r\n");
      out.write(" */\r\nfunction moveDownHelper(options, index) {\r\n    //Create a new option to move it around\r\n    var newOption = new Option (options[index+1].text, options[index+1].value);\r\n    options[index+1].text = options[index].text;\r\n    options[index+1].value = options[index].value;\r\n    options[index].text = newOption.text;\r\n    options[index].value = newOption.value;\r\n}\r\n//-->\r\n</script>\r\n");
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
