<script language="JavaScript">
<!--
        function enHex(aDigit) {
            return("0123456789ABCDEF".substring(aDigit, aDigit+1))
        }
        function toHex8bit(n) {
            return (enHex((0x0000f0 & n) >>  4) +
                    enHex((0x00000f & n) >>  0))
        }

        function destinyEscape(string) {
            var result = "";
            var i = 0;
            for (i = 0; i < string.length; i++) {
                c = string.charCodeAt(i);
                if (c < 48 || (c >= 58 && c < 65)) {
                    result = result + "%" + toHex8bit(c);
                } else {
                    result = result + String.fromCharCode(c);
                }
            }
            return result;
        }
//        function destinyEscape2(string) {
//            string = string.replace("%", "%25");    // important, always translate the percent char first
//            string = string.replace("=", "%3D");
//            string = string.replace("&", "%26");
//            return string;
//        }
//-->
</script>


