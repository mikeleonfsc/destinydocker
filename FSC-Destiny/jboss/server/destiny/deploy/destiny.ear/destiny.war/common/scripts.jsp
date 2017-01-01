<%@page import="com.follett.fsc.destiny.client.common.HTTPHelper"%>

<script language="JavaScript">
<!--
    window.name = "Destiny";

    // @todo Focus?
// -->
    
    var isIE = /*@cc_on!@*/false;
    var isChrome = navigator.userAgent.toLowerCase().indexOf('chrome') > -1;
    
    // IE9 does not support console, so we need to create a dummy function.
    if (!window.console) window.console = {};
    if (!window.console.log) window.console.log = function () { };

    function setCookie(c_name,value,exdays)
    {
        console.log('entering setCookie()');
        var exdate=new Date();
        exdate.setDate(exdate.getDate() + exdays);
        var c_value=escape(value) + ((exdays==null) ? "" : "; expires="+exdate.toUTCString());
        
        document.cookie=c_name + "=" + c_value +";destination=127.0.0.1;path=/";        	
        console.log('cookie value: ' + document.cookie);
        
        var cookie = getCookie(c_name);
        console.log(c_name + ' value : ' + cookie);
        
    }

    function getCookie(c_name)
    {
        var i,x,y,ARRcookies=document.cookie.split(";");
        for (i=0;i<ARRcookies.length;i++)
        {
          x=ARRcookies[i].substr(0,ARRcookies[i].indexOf("="));
          y=ARRcookies[i].substr(ARRcookies[i].indexOf("=")+1);
          x=x.replace(/^\s+|\s+$/g,"");
          if (x==c_name)
            {
                console.log('found ' + c_name);
                return unescape(y);
            }
          }
    }
    
    function addToFavorites(pagename, urladdress) {
       var startingURL = window.document.URL;
       for(x = 1; x < startingURL.length - 1; x++) {
          if(startingURL.charAt(x) == '/' && startingURL.charAt(x - 1) != '/' && startingURL.charAt(x + 1) != '/' ) {
             startingURL = startingURL.substring(0, x);
             break;
          }
       }
       if(startingURL.charAt(startingURL.length - 1) == '/') {
           startingURL = startingURL.substring(0, startingURL.length - 1);
       }
       startingURL = startingURL + urladdress;
       
       try {
          window.sidebar.addPanel(pagename, startingURL, "");
       } catch (e) {
    	   try{
          window.external.AddFavorite(startingURL, pagename)
    	   } catch (e) {
    		   alert("Sorry! Your browser doesn't support this function.");
    	   }
       }
    }
    

    function isDevelopmentServer() {
    	  var result = false,
    	      hosts = ["localhost", "127.0.0.1"],
    	      domain = window.location.hostname,
    	      i;

    	  var internalFSC = <%= HTTPHelper.isInternalToFSC() %>;
    	  if( internalFSC) result = true;
    	  else if (window.location !== null) {
    	      if (window.location.hostname !== null) {
    	          for (i = 0; i < hosts.length; i++) {
    	              if (domain.indexOf(hosts[i]) >= 0) {
    	                  result = true;
    	                  break;
    	              }
    	          }
    	      }
    	  }
    	  return result;
    	};
    	
        function getWorkingUrl() {
        	var url = window.location.pathname + window.location.search;
        	if( window.location.search.toLowerCase().indexOf("password=") > -1 ||
        		window.location.search.toLowerCase().indexOf("loginname=") > -1 ||
        	    window.location.search.toLowerCase().indexOf("userloginname=") > -1 ) {
                url = window.location.pathname;
            }
        	return url;
        }
    	
    
</script>
