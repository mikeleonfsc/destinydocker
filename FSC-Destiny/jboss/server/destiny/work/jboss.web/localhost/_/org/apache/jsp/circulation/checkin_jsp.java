package org.apache.jsp.circulation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.circulation.servlet.*;
import com.follett.fsc.destiny.session.circulation.data.*;
import com.follett.fsc.destiny.entity.ejb3.BibMasterSpecs;
import com.follett.fsc.destiny.client.common.jsptag.MessageBoxTag;
import java.util.*;
import com.follett.fsc.common.MessageHelper;
import com.follett.fsc.common.StringHelper;
import com.follett.fsc.destiny.util.CollectionType;

public final class checkin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/setsound.jsp", out, false);
      out.write("\r\n\r\n");

    CheckinForm form = (CheckinForm)request.getAttribute("circulation_servlet_CheckinForm");
    String focus = "barcode";
    boolean ajaxMode = form.isOperateInAjaxMode();

      out.write("\r\n\r\n");
 if (ajaxMode) {
    String[] staticLibraries=form.getStaticLibraries();

    for (int i=0;i<staticLibraries.length;i++) {
    
      out.write("\r\n            <script type=\"text/javascript\" src=\"");
      out.print(staticLibraries[i] );
      out.write("\"></script>\r\n    ");
 } 
      out.write("\r\n    <script type=\"text/javascript\">\r\n        function blockIsEmpty(block) {\r\n        \tvar result=true;\r\n        \tvar contents = block.text();\r\n        \tif (contents) {\r\n            \tvar m = contents.match(/[^\\s\\r\\n]/m);\r\n                if (m) {result=false;}          \t\r\n        \t}\r\n        \treturn result;\r\n        }\r\n        function captureLinks(e) {\r\n            var url=this.href;\r\n            \r\n            var rep = /handlecheckinform\\.do|presentcheckinform\\.do/;\r\n            \r\n        \tif (url.match(rep)) {\r\n        \t\turl=url.replace(rep,'handlecheckindoprocessing.do');\r\n            \tloadBodyOfData('#");
      out.print(CheckinForm.BLOCK_MESSAGES);
      out.write("',url+\"&\",false);\r\n                $(this).closest('.checkinAjaxMessageBox').remove();\r\n                barcodeFocus();\r\n                return false;\r\n        \t}\r\n        }\r\n        function checkAjaxQueue() {\r\n        \twhile (activeRequests < 2 && ajaxQueue.length > 0) {\r\n        \t\tvar req = ajaxQueue.shift();\r\n        \t\t\r\n                $.get(req.url,function(data) { populateData(req.block,data,req.overwrite); });\r\n                activeRequests++;\r\n        \t}\r\n        }\r\n        function loadBodyOfData(intoBlock,url,overwrite) {\r\n        \tqueuedRequests++;\r\n            ajaxQueue.push({block:intoBlock,url:url,overwrite:overwrite});\r\n            checkAjaxQueue();\r\n        }\r\n        function populateData(intoBlock,data,overwrite) {\r\n            queuedRequests--;\r\n            activeRequests--;\r\n            checkAjaxQueue();\r\n            var closeBoxName;\r\n            var dataEntered;\r\n            \r\n            var c=data.match(/<!-- AJAXMode;ClearPreviousSelection -->/);\r\n            if (c!==null) {\r\n            \t$(\"#");
      out.print(CheckinForm.BLOCK_SELECTIONS);
      out.write("\").closest('.checkinAjaxMessageBox').remove();\r\n            }\r\n            \r\n            c=data.match(/<!-- AJAXMode;Entry=\"([^\"]*)\" -->/);\r\n            if (c!==null) {\r\n                dataEntered=c[1];\r\n            }\r\n            \r\n            c=data.match(/<!-- AJAXMode;Forward=\"([^\"]*)\" -->/);\r\n            if (c!==null) {\r\n                queuedRequests=0;\r\n                window.location.href = c[1];\r\n                return true;\r\n            }\r\n            \r\n            c=data.match(/<!-- AJAXMode;CloseBoxId=\"([^\"]*)\" -->/);\r\n            if (c===null || c.length <= 0) {\r\n            \t// Page is not tagged as Ajax, display full-page\r\n            \tdocument.open();\r\n            \tdocument.write(data);\r\n            \tdocument.close();\r\n            }else{\r\n                closeBoxName=c[1];\r\n                var b=data.match(/<body[^>]*>([\\s\\S]*)<\\/body/im);\r\n                if (b && b.length > 0) {\r\n                    data=b[1];\r\n                }\r\n                if (closeBoxName != \"CloseBoxTransactions\") {\r\n");
      out.write("                    data = '<div id=\"'+closeBoxName+'\" class=\"checkinAjaxMessageBox\">' + data + '</div>';\r\n                }\r\n    \r\n                if (overwrite) {\r\n                    $(intoBlock).html(data);       \r\n                }else{\r\n                    $(intoBlock).prepend(data);       \r\n                }\r\n\r\n                if (blockIsEmpty($(\"#");
      out.print(CheckinForm.BLOCK_SELECTIONS);
      out.write("\"))) {\r\n                \t$(\"#");
      out.print(CheckinForm.BLOCK_SELECTIONS);
      out.write("\").remove();\r\n                }\r\n                if (dataEntered) {\r\n                    $('#'+closeBoxName+' td:first').prepend(\"<div id=\\\"idMessageHeader\\\" class=\\\"SmallColRow checkinEntry\\\">User entered: \"+dataEntered+\"</div>\");\r\n                }\r\n               \t$(\"#\"+closeBoxName+\" a\").bind(\"click\", captureLinks);       \r\n            }\r\n            showHideCloseAll();\r\n        }\r\n        function populateDoProcessing(query) {\r\n        \tloadBodyOfData('#");
      out.print(CheckinForm.BLOCK_MESSAGES);
      out.write("','/circulation/servlet/handlecheckindoprocessing.do'+query,\r\n        \t");
      out.print(String.valueOf(! form.isQueueMessagesOnScreen()));
      out.write(");\r\n        }\r\n        function populateTransactions(query) {\r\n        \tloadBodyOfData('#");
      out.print(CheckinForm.BLOCK_TRANSACTION_LIST);
      out.write("','/circulation/servlet/handlecheckintransactions.do'+query,true);\r\n        }\r\n        function removeClosebox(closeBox,closeIfMessage) {\r\n            var close=true;\r\n        \tif (blockIsEmpty($('#'+closeBox)) || closeIfMessage) {\r\n        \t    $('#'+closeBox).remove();\r\n                showHideCloseAll();\r\n        \t}\r\n        }\r\n        function handlecheckinformonsubmit() {\r\n            var query =\"?\" + $('form[name=\"");
      out.print( CheckinForm.FORM_NAME );
      out.write("\"]').serialize();\r\n            populateDoProcessing(query);\r\n            if (closeBoxAfterOperation) {\r\n                removeClosebox(closeBoxAfterOperation,true);\r\n                closeBoxAfterOperation=null;\r\n            }\r\n            barcodeFocus();\r\n            return false;\r\n        }\r\n        function barcodeFocus() {\r\n            var barcodeField = document.forms[\"circulation_servlet_CheckinForm\"].elements[\"barcode\"];\r\n            barcodeField.value=\"\";\r\n            barcodeField.focus();\r\n        }\r\n        function showHideCloseAll() {\r\n        \tif ($(\"#");
      out.print(CheckinForm.BLOCK_MESSAGES);
      out.write("\").html() != '') {\r\n        \t\t$(\"#");
      out.print(CheckinForm.BLOCK_CLEARBUTTON);
      out.write("\").show();\r\n        \t}else{\r\n        \t\t$(\"#");
      out.print(CheckinForm.BLOCK_CLEARBUTTON);
      out.write("\").hide();\r\n            }\r\n        \tbarcodeFocus();\r\n        }\r\n        function clearAll() {\r\n        \t$('#");
      out.print(CheckinForm.BLOCK_MESSAGES);
      out.write("').html('');\r\n        \tshowHideCloseAll();\r\n        }\r\n        \r\n        var queuedRequests=0;\r\n        var activeRequests=0;\r\n        var closeBoxAfterOperation;\r\n        var ajaxQueue=[];\r\n\r\n        var chkevent = window.attachEvent ? 'onbeforeunload' : 'beforeunload'; /// make IE7, IE8 compitable\r\n        var onExitEvent = window.attachEvent || window.addEventListener;\r\n        \r\n        onExitEvent(chkevent, function(e) { // For >=IE7, Chrome, Firefox\r\n            if (queuedRequests > 0) {\r\n                var confirmationMessage = \"Please note...Check in processing is not yet complete and check ins may be lost. Do you want to continue?\";\r\n                (e || window.event).returnValue = confirmationMessage;\r\n                return confirmationMessage;\r\n            }\r\n        });\r\n       \r\n    \t$(document).ready(function() {\r\n            populateTransactions(location.search);\r\n            barcodeFocus();\r\n      \t});\r\n    </script>\r\n");
 }else{ 
      out.write("\r\n    <script type=\"text/javascript\">\r\n    function handlecheckinformonsubmit() {\r\n    \treturn true;\r\n    }\r\n    </script>\r\n");
 } 
      out.write("\r\n<script language=\"javascript\">\r\n    <!--\r\n    function CopyConditionChanged(copyID) {\r\n        var field = document.");
      out.print(CheckinForm.FORM_NAME);
      out.write('.');
      out.print(CheckinForm.FIELD_CHANGE_CONDITION_COPYID);
      out.write(";\r\n        field.value = copyID;\r\n        ");
 if (ajaxMode) { 
      out.write("\r\n            handlecheckinformonsubmit();\r\n            //$(field).remove();\r\n        ");
 } else { 
      out.write("\r\n            document.");
      out.print(CheckinForm.FORM_NAME);
      out.write(".submit();\r\n        ");
 } 
      out.write("\r\n    }\r\n    function submitEmailCheckin(holdID) {\r\n        var field = document.");
      out.print(CheckinForm.FORM_NAME);
      out.write('.');
      out.print(CheckinForm.PARAMETER_EMAIL_HOLD_ID);
      out.write(";\r\n        field.value = holdID; \r\n        ");
 if (ajaxMode) { 
      out.write("\r\n            handlecheckinformonsubmit();\r\n            //$(field).remove();\r\n        ");
 } else { 
      out.write("\r\n             document.");
      out.print(CheckinForm.FORM_NAME);
      out.write(".submit();\r\n        ");
 } 
      out.write("\r\n    }\r\n    // -->\r\n</script>\r\n\r\n\r\n<!-- Begin form -->\r\n");
      //  base:form
      com.follett.fsc.destiny.client.common.jsptag.FormTag _jspx_th_base_005fform_005f0 = (com.follett.fsc.destiny.client.common.jsptag.FormTag) _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction.get(com.follett.fsc.destiny.client.common.jsptag.FormTag.class);
      _jspx_th_base_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_base_005fform_005f0.setParent(null);
      // /circulation/checkin.jsp(222,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setAction("/circulation/servlet/handlecheckinform.do");
      // /circulation/checkin.jsp(222,0) name = focus type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setFocus(focus );
      // /circulation/checkin.jsp(222,0) name = onsubmit type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setOnsubmit("return handlecheckinformonsubmit();");
      // /circulation/checkin.jsp(222,0) name = disableIntercepter type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_base_005fform_005f0.setDisableIntercepter(true);
      int _jspx_eval_base_005fform_005f0 = _jspx_th_base_005fform_005f0.doStartTag();
      if (_jspx_eval_base_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n\r\n");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_base_005fform_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkin.jsp(225,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f1.setProperty(CheckinForm.FIELD_CHANGE_CONDITION_COPYID);
          int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
          if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
          out.write('\r');
          out.write('\n');
          //  html:hidden
          org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
          _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
          _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          // /circulation/checkin.jsp(226,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_html_005fhidden_005f2.setProperty(CheckinForm.PARAMETER_EMAIL_HOLD_ID);
          int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
          if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
          out.write("\r\n\r\n    ");
 if (! ajaxMode) { 
          out.write("\r\n            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/checkindoprocessing.jsp", out, false);
          out.write("\r\n    ");
 } 
          out.write("\r\n    \r\n    <div id=\"");
          out.print(CheckinForm.BLOCK_SOUNDS);
          out.write("\"></div>\r\n\r\n    ");
          //  c:choose
          org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
          _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
          int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
          if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n        ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /circulation/checkin.jsp(235,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fwhen_005f0.setTest( form.getComponentList() != null && ! form.getComponentList().isEmpty() );
              int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
              if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  if (_jspx_meth_html_005fhidden_005f3(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_html_005fhidden_005f4(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
              out.write("\r\n        ");
              //  c:when
              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
              _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /circulation/checkin.jsp(239,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_c_005fwhen_005f1.setTest( form.getContainerList() != null && ! form.getContainerList().isEmpty() );
              int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
              if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  if (_jspx_meth_html_005fhidden_005f5(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_html_005fhidden_005f6(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
              out.write("\r\n        ");
              //  c:otherwise
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
              _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
              if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"");
                  out.print(CheckinForm.TABLE_HEADER);
                  out.write("\">\r\n                <tr>\r\n                    <td class=\"FormLabel\">\r\n                        ");
                  out.print(form.getFindLabel());
                  out.write("\r\n                    </td>\r\n                    <td>\r\n                        &nbsp;\r\n                        ");
                  if (_jspx_meth_html_005ftext_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                    </td>\r\n                    <td>\r\n                        &nbsp;\r\n                        ");
                  if (_jspx_meth_base_005fgoButton_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n                    </td>\r\n                    <td class=\"ColRow\">\r\n            \r\n                        &nbsp;&nbsp;\r\n                        ");
 if ((form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_TEXTBOOK) && (form.getCollectionType() != BibMasterSpecs.COLLECTION_TYPE_ASSET )) { 
                  out.write("\r\n                            ");
                  //  html:checkbox
                  org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.get(org.apache.struts.taglib.html.CheckboxTag.class);
                  _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
                  // /circulation/checkin.jsp(261,28) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_html_005fcheckbox_005f0.setProperty("inLibraryUse");
                  int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
                  if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_html_005fcheckbox_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_html_005fcheckbox_005f0.doInitBody();
                    }
                    do {
                      //  bean:write
                      org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
                      _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
                      _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fcheckbox_005f0);
                      // /circulation/checkin.jsp(261,67) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setName( CheckinForm.FORM_NAME );
                      // /circulation/checkin.jsp(261,67) name = property type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_bean_005fwrite_005f0.setProperty("inLibraryUsePrompt");
                      int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
                      if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                        return;
                      }
                      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
                      int evalDoAfterBody = _jspx_th_html_005fcheckbox_005f0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_005fcheckbox_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fhtml_005fcheckbox_005fproperty.reuse(_jspx_th_html_005fcheckbox_005f0);
                  out.write("\r\n                        ");
 } 
                  out.write("\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            ");
 if (ajaxMode && form.isQueueMessagesOnScreen()) { 
                  out.write("\r\n\t            <div id=\"");
                  out.print(CheckinForm.BLOCK_CLEARBUTTON);
                  out.write("\">\r\n                \t<a href=\"#\" class=\"checkinAjaxCloseButton\" onClick=\"clearAll();\">\r\n            \t        ");
                  if (_jspx_meth_base_005fimage_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n        \t        </a>\r\n    \t        <br/>\r\n\t            </div>\r\n            ");
 } 
                  out.write("\r\n        ");
                  int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
              out.write("\r\n    ");
              int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
          out.write("\r\n    \r\n    ");
 if (ajaxMode) { 
          out.write("\r\n        <div id=\"");
          out.print(CheckinForm.BLOCK_MESSAGES);
          out.write("\"></div>\r\n    ");
 } else { 
          out.write("\r\n        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/checkinselectionlists.jsp", out, false);
          out.write("\r\n    ");
 } 
          out.write("\r\n\r\n    ");
 if (form.getCollectionType() == CollectionType.LIBRARY) { 
          out.write("\r\n    <span class=\"SmallColRow\">\r\n        <a href=\"/circulation/servlet/presentlibrarystatisticstodayscheckinsform.do?collectionType=");
          out.print(form.getCollectionType());
          out.write("\"   \r\n                target=\"");
          out.print(LibraryStatisticsForm.TARGET_NAME);
          out.write("\" id=\"");
          out.print(LibraryStatisticsForm.ID_TODAYS_STATS_IN );
          out.write("\" >\r\n        View Today's Checkins\r\n        </a>\r\n    </span>\r\n    ");
 } 
          out.write("\r\n\r\n\r\n    \r\n    <div id=\"");
          out.print(CheckinForm.BLOCK_TRANSACTION_LIST);
          out.write("\">\r\n        ");
 if (!ajaxMode) { 
          out.write("\r\n            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/circulation/checkintransactions.jsp", out, false);
          out.write("\r\n        ");
 } 
          out.write("\r\n    </div>\r\n    \r\n");
          int evalDoAfterBody = _jspx_th_base_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_base_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fbase_005fform_005fonsubmit_005ffocus_005fdisableIntercepter_005faction.reuse(_jspx_th_base_005fform_005f0);
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

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_base_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_base_005fform_005f0);
    // /circulation/checkin.jsp(224,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f0.setProperty("collectionType");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /circulation/checkin.jsp(236,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setProperty("barcode");
    // /circulation/checkin.jsp(236,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f3.setValue("");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f4 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /circulation/checkin.jsp(237,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f4.setProperty("inLibraryUse");
    int _jspx_eval_html_005fhidden_005f4 = _jspx_th_html_005fhidden_005f4.doStartTag();
    if (_jspx_th_html_005fhidden_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f5 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /circulation/checkin.jsp(240,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setProperty("barcode");
    // /circulation/checkin.jsp(240,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f5.setValue("");
    int _jspx_eval_html_005fhidden_005f5 = _jspx_th_html_005fhidden_005f5.doStartTag();
    if (_jspx_th_html_005fhidden_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f6 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /circulation/checkin.jsp(241,12) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005fhidden_005f6.setProperty("inLibraryUse");
    int _jspx_eval_html_005fhidden_005f6 = _jspx_th_html_005fhidden_005f6.doStartTag();
    if (_jspx_th_html_005fhidden_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /circulation/checkin.jsp(251,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setProperty("barcode");
    // /circulation/checkin.jsp(251,24) name = maxlength type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_html_005ftext_005f0.setMaxlength("1000");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fgoButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:goButton
    com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag _jspx_th_base_005fgoButton_005f0 = (com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag) _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.buttons.GoButtonTag.class);
    _jspx_th_base_005fgoButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fgoButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    int _jspx_eval_base_005fgoButton_005f0 = _jspx_th_base_005fgoButton_005f0.doStartTag();
    if (_jspx_th_base_005fgoButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fgoButton_005fnobody.reuse(_jspx_th_base_005fgoButton_005f0);
    return false;
  }

  private boolean _jspx_meth_base_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /circulation/checkin.jsp(269,21) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("ClearAll");
    // /circulation/checkin.jsp(269,21) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/ClearAllCheckin.gif");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }
}
