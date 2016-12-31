
<script language="JavaScript">
<!--
    var firstChar = true;

    function trapBarcodeScan(e) {
      var whichCode = (window.Event) ? e.which : e.keyCode;
      var passCharOn = false;

      if(e.keyCode == 13) {
        if(firstChar) {
            passCharOn = true;
        } else {
            firstChar = true;
            var thissound= eval("document.errorSound");
            thissound.play();
        }
      } else {
        firstChar = false;
      }
      return passCharOn;
    }
//-->
</script>


