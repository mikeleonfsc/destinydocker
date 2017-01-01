<%@ 
    page language="java"%><%@ 
    page import="com.follett.fsc.destiny.client.common.servlet.*"%><%@ 
    page import="com.follett.fsc.destiny.session.common.SessionStoreProxy"%><%@ 
    page import="com.follett.fsc.common.MessageHelper"%><%@ 
    page import="com.follett.fsc.common.LocaleHelper"%><%  
    OverdriveIntegrationForm form = (OverdriveIntegrationForm)request.getAttribute(OverdriveIntegrationForm.FORM_NAME); %><%= 
        form.generateOverdriveIntegrationInformation() %>
