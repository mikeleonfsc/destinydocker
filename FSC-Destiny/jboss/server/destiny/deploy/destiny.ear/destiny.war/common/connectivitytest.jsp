<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.follett.fsc.destiny.client.common.servlet.ConnectivityTestForm"%>
<%@page import="com.follett.fsc.common.StringHelper"%>
<%@ taglib uri="/WEB-INF/jstl-core.tld" prefix="c" %>
<%@ taglib uri="/WEB-INF/destiny-base.tld" prefix="base" %>

<c:set var="form" value="<%=request.getAttribute(ConnectivityTestForm.FORM_NAME) %>" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Server Connectivity Test</title>
<script src="/common/prototype.js" type="text/javascript"></script>
<script src="/common/builder.js" type="text/javascript"></script>
<script type="text/javascript">
var SpeedTester = Class.create({

initialize: function() {
    this.testRuns = ["50k", "50k", "50k", "50k", "50k",
                     "200k", "200k", "200k", "200k", "200k",
                     "500k", "500k", "500k", "500k", "500k"];
    $("results").update("");
    $("statisticsRow").hide();
    $("statisticsRowHeaderRow").hide();
    $("last10HeaderRow").hide();
    this.minTime = -1;
    this.maxTime = -1;
    this.avgTotal = 0;
    this.avgCount = 0;
},

startNewTest: function() {
    this.runCounter = 0;
    this.runTest();
},

runTest: function() {
    this.createTime = -1;
    this.loadTime = -1;
    this.completeTime = -1;
    
    var cacheBlaster = this.runCounter + "-" + new Date().getTime();
    new Ajax.Request("/common/servlet/presentconnectivitytestform.do", {
        method: "get",
        parameters: {testFile: this.testRuns[this.runCounter], cb: cacheBlaster},
        onCreate: this.createHandler.bind(this),
        onLoaded: this.loadedHandler.bind(this),
        onSuccess: this.successHandler.bind(this),
        onFailure: this.failureHandler.bind(this)
    });
},

report: function(reportData) {
    var cacheBlaster = this.runCounter + "-" + new Date().getTime();
    new Ajax.Request("/common/servlet/presentconnectivitytestform.do", {
        method: "post",
        parameters: Object.extend(reportData, {cb: cacheBlaster})
    });
},

createHandler: function() {
    this.createTime = (new Date()).getTime();
    $("currentStatus").update("Running test " + (this.runCounter+1) + " of " + this.testRuns.length + " <img src=\"/images/en/quest/themes/base3/loading_small.gif\">");
    $("statusRow").show();
    $("resultTable").show();
},

loadedHandler: function() {
    this.loadTime = (new Date()).getTime();
},

failureHandler: function() {
    this.stop();
    alert("Failed to connect to server.  Please ensure the server is available and try again");
},

successHandler: function(transport, json) {
    if (transport && transport.status != 200) {
        this.failureHandler();
        return;
    }
  
    if (! this.stopped) {
        this.completeTime = (new Date()).getTime();
    
        var connectTime;
        if (this.loadTime > 0) {
            connectTime = ((this.loadTime - this.createTime)/1000.0) + "s"; 
        } else {
            connectTime = "N/A";
            this.loadTime = this.createTime;
        }
    
        var downloadTime = ((this.completeTime - this.loadTime)/1000.0) + "s";
        var totalTime = ((this.completeTime - this.createTime)/1000.0) + "s";

        var ratingClass = this.getSpeedRating();
        var serverTime = transport.getHeader("Date");
    
        var resultRow = Builder.node("tr", {"class": ratingClass}, [
                Builder.node("td", {"align": "center"}, this.testRuns[this.runCounter]),
                Builder.node("td", {"align": "center"}, serverTime),
                Builder.node("td", {"align": "center"}, connectTime),
                Builder.node("td", {"align": "center"}, downloadTime),
                Builder.node("td", {"align": "center"}, totalTime)]);

        if (this.periodicalExecuter) {
            if ($("results").rows.length == 10) {
                $("results").rows[9].remove();
            }
            $("last10HeaderRow").show();
            $("results").insert({top: resultRow});
            this.addStat(this.completeTime - this.createTime);
        } else {
            $("results").insert(resultRow);
        }

        var reportData = {"workstationIP": "<%=request.getRemoteAddr()%>",
                "reportFileSize": this.testRuns[this.runCounter],
                "reportConnectTime": connectTime,
                "reportDownloadTime": downloadTime,
                "reportTotalTime": totalTime};
        var summaryData;
        if (this.periodicalExecuter) {
            summaryData = {
                    reportMinTime: (this.minTime/1000.0) + "s",
                    reportMaxTime: (this.maxTime/1000.0) + "s",
                    reportAvgTime: ((this.avgTotal/this.avgCount).round())/1000.0 + "s"
            };
        }
        this.report(Object.extend(reportData, summaryData));
    
        this.runCounter++;
    
        if (this.runCounter < this.testRuns.length) {
            this.runTest();
        } else {
            if (this.periodicalExecuter) {
                $("currentStatus").update("Waiting for next test run... <img src=\"/images/en/quest/themes/base3/loading_small.gif\">");
            } else {
                $("startTestButton").show();
                $("stopTestButton").hide();
                if ($("scheduleCheckbox") && $("scheduleMinutes") && $("schedulePayload")) {
                    $("scheduleCheckbox").enable();
                    $("scheduleMinutes").enable();
                    $("schedulePayload").enable();
                }
                $("statusRow").hide();
            }
        }
    }
},

getSpeedRating: function() {
    var okThreshold;
    var badThreshold;
    
    switch(this.testRuns[this.runCounter]) {
    case "50k":
        okThreshold = 250;   // 200kb/sec
        badThreshold = 500; // 100kb/sec
        break;
    case "200k":
        okThreshold = 1000;  // 200kb/sec
        badThreshold = 2000; // 100kb/sec
        break;
    case "500k":
        okThreshold = 2500;   // 200kb/sec
        badThreshold = 5000;  // 100kb/sec
        break;
    }

    var result;
    var totalTime = this.completeTime - this.createTime;

    if (totalTime >= badThreshold) {
        result = "badSpeed";
    } else if (totalTime >= okThreshold) {
        result = "okSpeed";
    } else {
        result = "goodSpeed";
    }

    return result;
},

startPeriodical: function(scheduleMinutes, payloadSize) {
    this.scheduleMinutes = scheduleMinutes;
    this.testRuns = [payloadSize];
    this.periodicalExecuter = new PeriodicalExecuter(this.startNewTest.bind(this), this.scheduleMinutes * 60);
},

stop: function() {
    this.stopped = true;
    this.scheduledMinutes = null;
    if (this.periodicalExecuter) {
        this.periodicalExecuter.stop();
    }

    $("startTestButton").show();
    $("stopTestButton").hide();
    if ($("scheduleCheckbox") && $("scheduleMinutes") && $("schedulePayload")) {
        $("scheduleCheckbox").enable();
        $("scheduleMinutes").enable();
        $("schedulePayload").enable();
    }
    $("statusRow").hide();
},

addStat: function(totalTime) {
    this.avgTotal += totalTime;
    this.avgCount++;

    if (this.minTime == -1 || totalTime < this.minTime) {
        this.minTime = totalTime;
    }

    if (this.maxTime == -1 || totalTime > this.maxTime) {
        this.maxTime = totalTime;
    }

    var minClass = this.getSpeedRating(this.minTime);
    var maxClass = this.getSpeedRating(this.maxTime);
    var avgClass = this.getSpeedRating((this.avgTotal/this.avgCount).round());

    var statisticMin = $("statisticMin");
    statisticMin.update((this.minTime/1000.0) + "s");
    statisticMin.removeClassName("goodSpeed");
    statisticMin.removeClassName("badSpeed");
    statisticMin.removeClassName("okSpeed");
    statisticMin.addClassName(minClass);

    var statisticMax = $("statisticMax");
    statisticMax.update((this.maxTime/1000.0) + "s");
    statisticMax.removeClassName("goodSpeed");
    statisticMax.removeClassName("badSpeed");
    statisticMax.removeClassName("okSpeed");
    statisticMax.addClassName(maxClass);

    var statisticAvg = $("statisticAvg");
    statisticAvg.update(((this.avgTotal/this.avgCount).round()/1000.0) + "s");
    statisticAvg.removeClassName("goodSpeed");
    statisticAvg.removeClassName("badSpeed");
    statisticAvg.removeClassName("okSpeed");
    statisticAvg.addClassName(avgClass);

    $("statisticsRow").show();
    $("statisticsRowHeaderRow").show();
}

});

function startSpeedTest() {
    if (window.speedTester) {
        window.speedTester.stop();
    }


    window.speedTester = new SpeedTester();

    if ($("scheduleCheckbox")) {
        var scheduleRun = ($("scheduleCheckbox").getValue() == "on");
        if (scheduleRun) {
            var scheduleMinutes;
            var schedulePayload = $("schedulePayload").getValue();
            try {
                scheduleMinutes = eval($("scheduleMinutes").getValue());
                if (scheduleMinutes >= ${form.minimumIntervalInMinutes}) {
                    if (Object.isNumber(scheduleMinutes)) {
                        window.speedTester.startPeriodical(scheduleMinutes, schedulePayload);
                    }
                } else {
                    alert("Please enter a value greater than or equal to ${form.minimumIntervalInMinutes}");
                    return;
                }
            } catch (e) {
                alert("Please enter a numeric value for number of minutes");
                return;
            }
        }
    }

    $("startTestButton").hide();
    $("stopTestButton").show();
    if ($("scheduleCheckbox") && $("scheduleMinutes") && $("schedulePayload")) {
        $("scheduleCheckbox").disable();
        $("scheduleMinutes").disable();
        $("schedulePayload").disable();
    }

    window.speedTester.startNewTest();
}

function stopSpeedTest() {
    if (window.speedTester) {
        window.speedTester.stop();
    }
}

function changeIntervalOption() {
    if ($("scheduleCheckbox") && $("scheduleCheckbox").getValue() == "on") {
        $("optionRow1").show();
        $("optionRow2").show();
    } else {
        $("optionRow1").hide();
        $("optionRow2").hide();
    }
}

</script>
</head>
<body>
    <style type="text/css">
        body {
            font-family: helvetica, arial, sans-serif;
        }
        
        h2 {
            margin: 5px;
        }
        
        h3 {
            margin: 0px;
            background-color: #005555;
            color: #ffffff;
        }
        
        #statisticsTable,
        #resultTable {
            border: 1px solid black;
        }
        
        #statisticsTable td,
        #statisticsTable th,
        #resultTable th,
        #resultTable td {
            border: 1px solid black;
        }
        
        .goodSpeed {
            background-color: #017201;
            color: #ffffff;
        }
        
        .okSpeed {
            background-color: #FFEC43;
            color: #000000;
        }
        
        .badSpeed {
            background-color: #CC0000;
            color: #ffffff;
        }
    </style>
    <table width="100%">
        <tbody>
        <tr>
            <td colspan="2" align="center"><h3>Server Connectivity Test</h3></td>
        </tr>
        <tr>
            <td>
                Workstation IP: <%=request.getRemoteAddr() %>
                <%
                if (!StringHelper.isEmpty(request.getHeader("X-Forwarded-For"))){ %>
                    <br>External IP: <%=request.getHeader("X-Forwarded-For")%>                
                <%                
                }                
                %>
            </td>
            <td class="tdAlignRight">
                <a href="javascript:window.close();" class="detailLink"><base:image src="/buttons/large/close.gif" alt="Close"/></a>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <c:choose>
                    <c:when test="${form.canScheduleTest}">
                        <table width="50%">
                            <tr>
                                <td>
                                    <input type="button" id="startTestButton" value="Start Test" onclick="startSpeedTest()">
                                    <input type="button" id="stopTestButton" value="Stop Test" onclick="stopSpeedTest()" style="display: none">
                                </td>
                                <td class="tdAlignRight">
                                    <input type="checkbox" id="scheduleCheckbox" onclick="changeIntervalOption()"> Enable interval testing
                                </td>
                            </tr>
                            <tr id="optionRow1" style="display: none">
                                <td>&nbsp;</td>
                                <td class="tdAlignRight" width="100%">
                                    Interval time (in minutes) <input type="text" size="4" maxlength="4" id="scheduleMinutes" value="1">
                                </td>
                            </tr>
                            <tr id="optionRow2" style="display: none">
                                <td>&nbsp;</td>
                                <td class="tdAlignRight" width="100%">                                
                                    Packet size
                                    <select id="schedulePayload">
                                        <option value="50k">50KB</option>
                                        <option value="200k">200KB</option>
                                        <option value="500k">500KB</option>
                                    </select>
                                </td>
                            </tr>
                        </table>
                    </c:when>
                    <c:otherwise>
                        <input type="button" id="startTestButton" value="Start Test" onclick="startSpeedTest()">
                        <input type="button" id="stopTestButton" value="Stop Test" onclick="stopSpeedTest()" style="display: none">
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <tr id="statusRow" style="display: none">
            <td colspan="2" align="center" id="currentStatus" align="center">
            </td>
        </tr>
        <tr id="last10HeaderRow" style="display: none">
            <td colspan="2" align="center"><h4>Last 10 Results</h4></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <table id="resultTable" style="display: none" width="50%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>File size</th>
                            <th>Server time</th>
                            <th>Connect time</th>
                            <th>Download time</th>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody id="results">
                    </tbody>
                </table>
            </td>
        </tr>
        <tr id="statisticsRowHeaderRow" style="display: none">
            <td colspan="2" align="center"><h4>Current Run Statistics</h4></td>
        </tr>
        <tr id="statisticsRow" style="display: none">
            <td colspan="2" align="center">
                <table id="statisticsTable" cellspacing="0" cellpadding="3"> 
                    <tr>
                        <th class="tdAlignRight">Min response time</th>
                        <td id="statisticMin">&nbsp;</td>
                    </tr>
                    <tr>
                        <th class="tdAlignRight">Max response time</th>
                        <td id="statisticMax">&nbsp;</td>
                    </tr>
                    <tr>
                        <th class="tdAlignRight">Average response time</th>
                        <td id="statisticAvg">&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
        </tbody>
    </table>
</body>
</html>
