package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.follett.fsc.destiny.client.common.servlet.ConnectivityTestForm;
import com.follett.fsc.common.StringHelper;

public final class connectivitytest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /common/connectivitytest.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setVar("form");
      // /common/connectivitytest.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_c_005fset_005f0.setValue(request.getAttribute(ConnectivityTestForm.FORM_NAME) );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\r\n<html>\r\n<head>\r\n<title>Server Connectivity Test</title>\r\n<script src=\"/common/prototype.js\" type=\"text/javascript\"></script>\r\n<script src=\"/common/builder.js\" type=\"text/javascript\"></script>\r\n<script type=\"text/javascript\">\r\nvar SpeedTester = Class.create({\r\n\r\ninitialize: function() {\r\n    this.testRuns = [\"50k\", \"50k\", \"50k\", \"50k\", \"50k\",\r\n                     \"200k\", \"200k\", \"200k\", \"200k\", \"200k\",\r\n                     \"500k\", \"500k\", \"500k\", \"500k\", \"500k\"];\r\n    $(\"results\").update(\"\");\r\n    $(\"statisticsRow\").hide();\r\n    $(\"statisticsRowHeaderRow\").hide();\r\n    $(\"last10HeaderRow\").hide();\r\n    this.minTime = -1;\r\n    this.maxTime = -1;\r\n    this.avgTotal = 0;\r\n    this.avgCount = 0;\r\n},\r\n\r\nstartNewTest: function() {\r\n    this.runCounter = 0;\r\n    this.runTest();\r\n},\r\n\r\nrunTest: function() {\r\n    this.createTime = -1;\r\n    this.loadTime = -1;\r\n    this.completeTime = -1;\r\n    \r\n    var cacheBlaster = this.runCounter + \"-\" + new Date().getTime();\r\n");
      out.write("    new Ajax.Request(\"/common/servlet/presentconnectivitytestform.do\", {\r\n        method: \"get\",\r\n        parameters: {testFile: this.testRuns[this.runCounter], cb: cacheBlaster},\r\n        onCreate: this.createHandler.bind(this),\r\n        onLoaded: this.loadedHandler.bind(this),\r\n        onSuccess: this.successHandler.bind(this),\r\n        onFailure: this.failureHandler.bind(this)\r\n    });\r\n},\r\n\r\nreport: function(reportData) {\r\n    var cacheBlaster = this.runCounter + \"-\" + new Date().getTime();\r\n    new Ajax.Request(\"/common/servlet/presentconnectivitytestform.do\", {\r\n        method: \"post\",\r\n        parameters: Object.extend(reportData, {cb: cacheBlaster})\r\n    });\r\n},\r\n\r\ncreateHandler: function() {\r\n    this.createTime = (new Date()).getTime();\r\n    $(\"currentStatus\").update(\"Running test \" + (this.runCounter+1) + \" of \" + this.testRuns.length + \" <img src=\\\"/images/en/quest/themes/base3/loading_small.gif\\\">\");\r\n    $(\"statusRow\").show();\r\n    $(\"resultTable\").show();\r\n},\r\n\r\nloadedHandler: function() {\r\n    this.loadTime = (new Date()).getTime();\r\n");
      out.write("},\r\n\r\nfailureHandler: function() {\r\n    this.stop();\r\n    alert(\"Failed to connect to server.  Please ensure the server is available and try again\");\r\n},\r\n\r\nsuccessHandler: function(transport, json) {\r\n    if (transport && transport.status != 200) {\r\n        this.failureHandler();\r\n        return;\r\n    }\r\n  \r\n    if (! this.stopped) {\r\n        this.completeTime = (new Date()).getTime();\r\n    \r\n        var connectTime;\r\n        if (this.loadTime > 0) {\r\n            connectTime = ((this.loadTime - this.createTime)/1000.0) + \"s\"; \r\n        } else {\r\n            connectTime = \"N/A\";\r\n            this.loadTime = this.createTime;\r\n        }\r\n    \r\n        var downloadTime = ((this.completeTime - this.loadTime)/1000.0) + \"s\";\r\n        var totalTime = ((this.completeTime - this.createTime)/1000.0) + \"s\";\r\n\r\n        var ratingClass = this.getSpeedRating();\r\n        var serverTime = transport.getHeader(\"Date\");\r\n    \r\n        var resultRow = Builder.node(\"tr\", {\"class\": ratingClass}, [\r\n                Builder.node(\"td\", {\"align\": \"center\"}, this.testRuns[this.runCounter]),\r\n");
      out.write("                Builder.node(\"td\", {\"align\": \"center\"}, serverTime),\r\n                Builder.node(\"td\", {\"align\": \"center\"}, connectTime),\r\n                Builder.node(\"td\", {\"align\": \"center\"}, downloadTime),\r\n                Builder.node(\"td\", {\"align\": \"center\"}, totalTime)]);\r\n\r\n        if (this.periodicalExecuter) {\r\n            if ($(\"results\").rows.length == 10) {\r\n                $(\"results\").rows[9].remove();\r\n            }\r\n            $(\"last10HeaderRow\").show();\r\n            $(\"results\").insert({top: resultRow});\r\n            this.addStat(this.completeTime - this.createTime);\r\n        } else {\r\n            $(\"results\").insert(resultRow);\r\n        }\r\n\r\n        var reportData = {\"workstationIP\": \"");
      out.print(request.getRemoteAddr());
      out.write("\",\r\n                \"reportFileSize\": this.testRuns[this.runCounter],\r\n                \"reportConnectTime\": connectTime,\r\n                \"reportDownloadTime\": downloadTime,\r\n                \"reportTotalTime\": totalTime};\r\n        var summaryData;\r\n        if (this.periodicalExecuter) {\r\n            summaryData = {\r\n                    reportMinTime: (this.minTime/1000.0) + \"s\",\r\n                    reportMaxTime: (this.maxTime/1000.0) + \"s\",\r\n                    reportAvgTime: ((this.avgTotal/this.avgCount).round())/1000.0 + \"s\"\r\n            };\r\n        }\r\n        this.report(Object.extend(reportData, summaryData));\r\n    \r\n        this.runCounter++;\r\n    \r\n        if (this.runCounter < this.testRuns.length) {\r\n            this.runTest();\r\n        } else {\r\n            if (this.periodicalExecuter) {\r\n                $(\"currentStatus\").update(\"Waiting for next test run... <img src=\\\"/images/en/quest/themes/base3/loading_small.gif\\\">\");\r\n            } else {\r\n                $(\"startTestButton\").show();\r\n                $(\"stopTestButton\").hide();\r\n");
      out.write("                if ($(\"scheduleCheckbox\") && $(\"scheduleMinutes\") && $(\"schedulePayload\")) {\r\n                    $(\"scheduleCheckbox\").enable();\r\n                    $(\"scheduleMinutes\").enable();\r\n                    $(\"schedulePayload\").enable();\r\n                }\r\n                $(\"statusRow\").hide();\r\n            }\r\n        }\r\n    }\r\n},\r\n\r\ngetSpeedRating: function() {\r\n    var okThreshold;\r\n    var badThreshold;\r\n    \r\n    switch(this.testRuns[this.runCounter]) {\r\n    case \"50k\":\r\n        okThreshold = 250;   // 200kb/sec\r\n        badThreshold = 500; // 100kb/sec\r\n        break;\r\n    case \"200k\":\r\n        okThreshold = 1000;  // 200kb/sec\r\n        badThreshold = 2000; // 100kb/sec\r\n        break;\r\n    case \"500k\":\r\n        okThreshold = 2500;   // 200kb/sec\r\n        badThreshold = 5000;  // 100kb/sec\r\n        break;\r\n    }\r\n\r\n    var result;\r\n    var totalTime = this.completeTime - this.createTime;\r\n\r\n    if (totalTime >= badThreshold) {\r\n        result = \"badSpeed\";\r\n    } else if (totalTime >= okThreshold) {\r\n");
      out.write("        result = \"okSpeed\";\r\n    } else {\r\n        result = \"goodSpeed\";\r\n    }\r\n\r\n    return result;\r\n},\r\n\r\nstartPeriodical: function(scheduleMinutes, payloadSize) {\r\n    this.scheduleMinutes = scheduleMinutes;\r\n    this.testRuns = [payloadSize];\r\n    this.periodicalExecuter = new PeriodicalExecuter(this.startNewTest.bind(this), this.scheduleMinutes * 60);\r\n},\r\n\r\nstop: function() {\r\n    this.stopped = true;\r\n    this.scheduledMinutes = null;\r\n    if (this.periodicalExecuter) {\r\n        this.periodicalExecuter.stop();\r\n    }\r\n\r\n    $(\"startTestButton\").show();\r\n    $(\"stopTestButton\").hide();\r\n    if ($(\"scheduleCheckbox\") && $(\"scheduleMinutes\") && $(\"schedulePayload\")) {\r\n        $(\"scheduleCheckbox\").enable();\r\n        $(\"scheduleMinutes\").enable();\r\n        $(\"schedulePayload\").enable();\r\n    }\r\n    $(\"statusRow\").hide();\r\n},\r\n\r\naddStat: function(totalTime) {\r\n    this.avgTotal += totalTime;\r\n    this.avgCount++;\r\n\r\n    if (this.minTime == -1 || totalTime < this.minTime) {\r\n        this.minTime = totalTime;\r\n");
      out.write("    }\r\n\r\n    if (this.maxTime == -1 || totalTime > this.maxTime) {\r\n        this.maxTime = totalTime;\r\n    }\r\n\r\n    var minClass = this.getSpeedRating(this.minTime);\r\n    var maxClass = this.getSpeedRating(this.maxTime);\r\n    var avgClass = this.getSpeedRating((this.avgTotal/this.avgCount).round());\r\n\r\n    var statisticMin = $(\"statisticMin\");\r\n    statisticMin.update((this.minTime/1000.0) + \"s\");\r\n    statisticMin.removeClassName(\"goodSpeed\");\r\n    statisticMin.removeClassName(\"badSpeed\");\r\n    statisticMin.removeClassName(\"okSpeed\");\r\n    statisticMin.addClassName(minClass);\r\n\r\n    var statisticMax = $(\"statisticMax\");\r\n    statisticMax.update((this.maxTime/1000.0) + \"s\");\r\n    statisticMax.removeClassName(\"goodSpeed\");\r\n    statisticMax.removeClassName(\"badSpeed\");\r\n    statisticMax.removeClassName(\"okSpeed\");\r\n    statisticMax.addClassName(maxClass);\r\n\r\n    var statisticAvg = $(\"statisticAvg\");\r\n    statisticAvg.update(((this.avgTotal/this.avgCount).round()/1000.0) + \"s\");\r\n    statisticAvg.removeClassName(\"goodSpeed\");\r\n");
      out.write("    statisticAvg.removeClassName(\"badSpeed\");\r\n    statisticAvg.removeClassName(\"okSpeed\");\r\n    statisticAvg.addClassName(avgClass);\r\n\r\n    $(\"statisticsRow\").show();\r\n    $(\"statisticsRowHeaderRow\").show();\r\n}\r\n\r\n});\r\n\r\nfunction startSpeedTest() {\r\n    if (window.speedTester) {\r\n        window.speedTester.stop();\r\n    }\r\n\r\n\r\n    window.speedTester = new SpeedTester();\r\n\r\n    if ($(\"scheduleCheckbox\")) {\r\n        var scheduleRun = ($(\"scheduleCheckbox\").getValue() == \"on\");\r\n        if (scheduleRun) {\r\n            var scheduleMinutes;\r\n            var schedulePayload = $(\"schedulePayload\").getValue();\r\n            try {\r\n                scheduleMinutes = eval($(\"scheduleMinutes\").getValue());\r\n                if (scheduleMinutes >= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.minimumIntervalInMinutes}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n                    if (Object.isNumber(scheduleMinutes)) {\r\n                        window.speedTester.startPeriodical(scheduleMinutes, schedulePayload);\r\n                    }\r\n                } else {\r\n                    alert(\"Please enter a value greater than or equal to ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.minimumIntervalInMinutes}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n                    return;\r\n                }\r\n            } catch (e) {\r\n                alert(\"Please enter a numeric value for number of minutes\");\r\n                return;\r\n            }\r\n        }\r\n    }\r\n\r\n    $(\"startTestButton\").hide();\r\n    $(\"stopTestButton\").show();\r\n    if ($(\"scheduleCheckbox\") && $(\"scheduleMinutes\") && $(\"schedulePayload\")) {\r\n        $(\"scheduleCheckbox\").disable();\r\n        $(\"scheduleMinutes\").disable();\r\n        $(\"schedulePayload\").disable();\r\n    }\r\n\r\n    window.speedTester.startNewTest();\r\n}\r\n\r\nfunction stopSpeedTest() {\r\n    if (window.speedTester) {\r\n        window.speedTester.stop();\r\n    }\r\n}\r\n\r\nfunction changeIntervalOption() {\r\n    if ($(\"scheduleCheckbox\") && $(\"scheduleCheckbox\").getValue() == \"on\") {\r\n        $(\"optionRow1\").show();\r\n        $(\"optionRow2\").show();\r\n    } else {\r\n        $(\"optionRow1\").hide();\r\n        $(\"optionRow2\").hide();\r\n    }\r\n}\r\n\r\n</script>\r\n</head>\r\n<body>\r\n    <style type=\"text/css\">\r\n        body {\r\n            font-family: helvetica, arial, sans-serif;\r\n");
      out.write("        }\r\n        \r\n        h2 {\r\n            margin: 5px;\r\n        }\r\n        \r\n        h3 {\r\n            margin: 0px;\r\n            background-color: #005555;\r\n            color: #ffffff;\r\n        }\r\n        \r\n        #statisticsTable,\r\n        #resultTable {\r\n            border: 1px solid black;\r\n        }\r\n        \r\n        #statisticsTable td,\r\n        #statisticsTable th,\r\n        #resultTable th,\r\n        #resultTable td {\r\n            border: 1px solid black;\r\n        }\r\n        \r\n        .goodSpeed {\r\n            background-color: #017201;\r\n            color: #ffffff;\r\n        }\r\n        \r\n        .okSpeed {\r\n            background-color: #FFEC43;\r\n            color: #000000;\r\n        }\r\n        \r\n        .badSpeed {\r\n            background-color: #CC0000;\r\n            color: #ffffff;\r\n        }\r\n    </style>\r\n    <table width=\"100%\">\r\n        <tbody>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\"><h3>Server Connectivity Test</h3></td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                Workstation IP: ");
      out.print(request.getRemoteAddr() );
      out.write("\r\n                ");

                if (!StringHelper.isEmpty(request.getHeader("X-Forwarded-For"))){ 
      out.write("\r\n                    <br>External IP: ");
      out.print(request.getHeader("X-Forwarded-For"));
      out.write("                \r\n                ");
                
                }                
                
      out.write("\r\n            </td>\r\n            <td class=\"tdAlignRight\">\r\n                <a href=\"javascript:window.close();\" class=\"detailLink\">");
      if (_jspx_meth_base_005fimage_005f0(_jspx_page_context))
        return;
      out.write("</a>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\">\r\n                ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n            </td>\r\n        </tr>\r\n        <tr id=\"statusRow\" style=\"display: none\">\r\n            <td colspan=\"2\" align=\"center\" id=\"currentStatus\" align=\"center\">\r\n            </td>\r\n        </tr>\r\n        <tr id=\"last10HeaderRow\" style=\"display: none\">\r\n            <td colspan=\"2\" align=\"center\"><h4>Last 10 Results</h4></td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\">\r\n                <table id=\"resultTable\" style=\"display: none\" width=\"50%\" cellspacing=\"0\">\r\n                    <thead>\r\n                        <tr>\r\n                            <th>File size</th>\r\n                            <th>Server time</th>\r\n                            <th>Connect time</th>\r\n                            <th>Download time</th>\r\n                            <th>Total</th>\r\n                        </tr>\r\n                    </thead>\r\n                    <tbody id=\"results\">\r\n                    </tbody>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr id=\"statisticsRowHeaderRow\" style=\"display: none\">\r\n");
      out.write("            <td colspan=\"2\" align=\"center\"><h4>Current Run Statistics</h4></td>\r\n        </tr>\r\n        <tr id=\"statisticsRow\" style=\"display: none\">\r\n            <td colspan=\"2\" align=\"center\">\r\n                <table id=\"statisticsTable\" cellspacing=\"0\" cellpadding=\"3\"> \r\n                    <tr>\r\n                        <th class=\"tdAlignRight\">Min response time</th>\r\n                        <td id=\"statisticMin\">&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <th class=\"tdAlignRight\">Max response time</th>\r\n                        <td id=\"statisticMax\">&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <th class=\"tdAlignRight\">Average response time</th>\r\n                        <td id=\"statisticAvg\">&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        </tbody>\r\n    </table>\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_base_005fimage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  base:image
    com.follett.fsc.destiny.client.common.jsptag.ImageTag _jspx_th_base_005fimage_005f0 = (com.follett.fsc.destiny.client.common.jsptag.ImageTag) _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.get(com.follett.fsc.destiny.client.common.jsptag.ImageTag.class);
    _jspx_th_base_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_base_005fimage_005f0.setParent(null);
    // /common/connectivitytest.jsp(371,72) name = src type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setSrc("/buttons/large/close.gif");
    // /common/connectivitytest.jsp(371,72) name = alt type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_base_005fimage_005f0.setAlt("Close");
    int _jspx_eval_base_005fimage_005f0 = _jspx_th_base_005fimage_005f0.doStartTag();
    if (_jspx_th_base_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbase_005fimage_005fsrc_005falt_005fnobody.reuse(_jspx_th_base_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /common/connectivitytest.jsp(377,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${form.canScheduleTest}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        <table width=\"50%\">\r\n                            <tr>\r\n                                <td>\r\n                                    <input type=\"button\" id=\"startTestButton\" value=\"Start Test\" onclick=\"startSpeedTest()\">\r\n                                    <input type=\"button\" id=\"stopTestButton\" value=\"Stop Test\" onclick=\"stopSpeedTest()\" style=\"display: none\">\r\n                                </td>\r\n                                <td class=\"tdAlignRight\">\r\n                                    <input type=\"checkbox\" id=\"scheduleCheckbox\" onclick=\"changeIntervalOption()\"> Enable interval testing\r\n                                </td>\r\n                            </tr>\r\n                            <tr id=\"optionRow1\" style=\"display: none\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"tdAlignRight\" width=\"100%\">\r\n                                    Interval time (in minutes) <input type=\"text\" size=\"4\" maxlength=\"4\" id=\"scheduleMinutes\" value=\"1\">\r\n");
        out.write("                                </td>\r\n                            </tr>\r\n                            <tr id=\"optionRow2\" style=\"display: none\">\r\n                                <td>&nbsp;</td>\r\n                                <td class=\"tdAlignRight\" width=\"100%\">                                \r\n                                    Packet size\r\n                                    <select id=\"schedulePayload\">\r\n                                        <option value=\"50k\">50KB</option>\r\n                                        <option value=\"200k\">200KB</option>\r\n                                        <option value=\"500k\">500KB</option>\r\n                                    </select>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                        <input type=\"button\" id=\"startTestButton\" value=\"Start Test\" onclick=\"startSpeedTest()\">\r\n                        <input type=\"button\" id=\"stopTestButton\" value=\"Stop Test\" onclick=\"stopSpeedTest()\" style=\"display: none\">\r\n                    ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
