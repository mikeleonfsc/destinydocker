<%@ page language="java" %>
<%@ page import="com.follett.fsc.destiny.client.common.HTTPHelper" %>
<%@ page import="com.follett.fsc.destiny.util.data.RemoteLatch" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%-- I18n Support --%>
<%@ page import="com.follett.fsc.common.MessageHelper"%>
<%@ page import="com.follett.fsc.common.LocaleHelper"%>


<HTML>
<HEAD>
<TITLE>
<%= MessageHelper.formatMessage("sleep_DestinySecuritySleeper") %>
</TITLE>
</HEAD>
<BODY>
<H1><%= MessageHelper.formatMessage("sleep_DestinySecuritySleeper") %></H1>

        <%
            if (HTTPHelper.isInternalToFSC()) {
                String sleepTime =request.getParameter("sleep");
                String latchID = request.getParameter("latchID");
                String connectLatchID = request.getParameter("connectLatchID");
                
                if (connectLatchID != null) {
                    RemoteLatch latch = RemoteLatch.getLatch(new Long(connectLatchID));
                    if (latch != null) {
                        latch.countDown();
                    }
                }
                
                if (latchID != null) {
                    RemoteLatch latch = RemoteLatch.getLatch(new Long(latchID));
                    if (latch != null) {
                        latch.await();
                        out.println(MessageHelper.formatMessage("sleep_SuccessLatch"));
                    } else {
                        out.println(MessageHelper.formatMessage("sleep_NoSleepyNoLatchWithID") + latchID);
                    }
                } else {
                    if (com.follett.fsc.common.StringHelper.isNumber(sleepTime)) {
                        Thread.sleep(Long.parseLong(sleepTime));
                        out.println(MessageHelper.formatMessage("sleep_Success"));
                    } else {
                        out.println(MessageHelper.formatMessage("sleep_NoSleepyCouldNotFindSleepParameter"));
                    }
                }
            } else {
               out.println(MessageHelper.formatMessage("sleep_NoSleepy"));
            }
        %>

</BODY>
</HTML>
