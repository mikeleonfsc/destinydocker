<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.follett.fsc.destiny.util.DestinySystemProperties" %>

<script language="JavaScript">
<!--
function setSound(src){
	document.writeln(generateSoundBlock(src));
}
function generateSoundBlock(src){
	var soundBlock="";
    if ( 
        //IE 11 appName is changed to Netscape. previous browsers it was Microsoft Internet Explorer. Cant use Netscape as FF uses it as well. So trident it is.
        ((navigator.appName.indexOf('Microsoft') != -1) || (navigator.userAgent.indexOf('Trident') != -1))  &&
        (navigator.appVersion.indexOf('Windows') != -1) &&
        (parseFloat(navigator.appVersion) >= 4)) {
        soundBlock+='<bgsound src="' + src +'">';
    } else if (navigator.userAgent.indexOf('Safari') != -1 && navigator.userAgent.indexOf('Chrome') == -1) {
        //safari cant play custom sounds using html5- looks like it is not making network call, tries using cache. So use the old way. 
         soundBlock+='<embed src="' + src + '" MASTERSOUND width="0" height="0" nosave="false" loop="false" hidden="true" autostart="true" NAME="CircSound">';
    } else {
        //FF and chrome use HTML5 audio, with embed fallback. fallback is probably not needed, but wont hurt. no specific reason though to keep it.
        soundBlock+='<audio autoplay="autoplay">';
        soundBlock+='<source  type="audio/wav" src="' + src + '">';
         var type='';
         var hasProperty = <%= DestinySystemProperties.isChromeWindowsSoundsUsingVLC() %>;
         if (hasProperty && navigator.appVersion.indexOf('Windows') != -1 && navigator.userAgent.toLowerCase().indexOf('chrome') > -1) {
             type = 'type="application/x-vlc-plugin" ';
         }
         soundBlock+='<embed src="' + src + '" ' + type + 'MASTERSOUND width="0" height="0" nosave="false" loop="false" hidden="true" autostart="true" NAME="CircSound">';
       soundBlock+='</audio>';
    }
    return(soundBlock);
}
//-->
</script>

