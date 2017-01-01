
<script language="JavaScript">
<!--
function moveUp(theSelect) {
    var selectBox = document.getElementById(theSelect);
    //Only if there is something in the list
    if (selectBox.length > 1) {
        //Which are selected...
        var selectedIds = new Array ();
        var index = 0;
        for (var i = 1; i < selectBox.length; i++) {
            if (selectBox.options[i].selected) {
                selectedIds[index] = i;
                index++;
            }
        }

        // move each selected option up
        var selID;
        for (var i = 0; i < selectedIds.length; i++) {
            selID = selectedIds[i];
            moveUpHelper(selectBox.options, selID);

            //De-select the old and select the new
            selectBox.options[selID].selected = false;
            selectBox.options[selID-1].selected = true;
        }
    }
}

function moveDown(theSelect) {
    var selectBox = document.getElementById(theSelect);
    //Only if there is something in the list
    if (selectBox.length > 1) {
        //Which are selected...
        var selectedIds = new Array ();
        var index = 0;
        for (var i = selectBox.length-2; i >= 0; i--) {
            if (selectBox.options[i].selected) {
                selectedIds[index] = i;
                index++;
            }
        }

        // move each selected option down
        var selID;
        for (var i = 0; i < selectedIds.length; i++) {
            selID = selectedIds[i];
            moveDownHelper(selectBox.options, selID);

            //De-select the old and select the new
            selectBox.options[selID].selected = false;
            selectBox.options[selID+1].selected = true;
        }
    }
}

function moveTop(theSelect) {
    var selectBox = document.getElementById(theSelect);
    //Only if there is something in the list
    if (selectBox.length > 1) {
        //Which are selected...
        var selectedIds = new Array ();
        var index = 0;
        for (var i = 0; i < selectBox.options.length; i++) {
            if (selectBox.options[i].selected) {
                selectedIds[index] = i;
                index++;
            }
        }

        // Move each selected option up to the topmost available
        // position.  The first one in the selected list gets position 0,
        // second one gets position 1, and so on.
        var selID;
        for (var i = 0; i < selectedIds.length; i++) {
            selID = selectedIds[i];
            // delta is how many positions up to move the selected item
            // to get it into the target position, which is position "i"
            delta = selID-i;
            for (var j = 0 ; j < delta; j++) {
                moveUpHelper(selectBox.options, selID-j);

                selectBox.options[selID-j].selected = false;
                selectBox.options[(selID-j)-1].selected = true;
            }
        }
    }
}

function moveBottom(theSelect) {
    var selectBox = document.getElementById(theSelect);

    if (selectBox.length > 1) {
        // find which ones are selected...
        var selectedIds = new Array ();
        var index = 0;

        for (var i = 0; i < selectBox.length; i++) {
            if (selectBox.options[i].selected) {
                selectedIds[index] = i;
                index++;
            }
        }

        // move each selected option down - starting from the end
        // of the selected items array, we'll move each item down to
        // the next lowest position (i.e., last one in the array ends up at
        // the very bottom, nth one in the array ends up (array length - n) from
        // the bottom
        // targetPos is position the element is moving to
        var targetPos = selectBox.length-1;
        var selID;
        for (var i = selectedIds.length-1; i >= 0 ; i--) {
            selID = selectedIds[i];
            // delta is how much to move down from the current position to get to the target position
            var delta = targetPos-selID;
            for (var j = 0 ; j < delta; j++) {
                moveDownHelper(selectBox.options, selID+j);
                selectBox.options[selID+j].selected = false;
                selectBox.options[(selID+j)+1].selected = true;
            }
            targetPos--;
        }
    }
}

function selectAll(theSelect) {
    var selectBox = document.getElementById(theSelect);
    for (var i = 0; i < selectBox.length; i++) {
        selectBox.options[i].selected = true;
    }
}

/*
 * Do not call this function directly.
 * As it does NO bounds checking.
 * Please use the moveUp or moveTop calls.
 */
function moveUpHelper(options, index) {
    //Create a new option to move it around
    var newOption = new Option (options[index-1].text, options[index-1].value);
    options[index-1].text = options[index].text;
    options[index-1].value = options[index].value;
    options[index].text = newOption.text;
    options[index].value = newOption.value;
}

/*
 * Do not call this function directly.
 * As it does NO bounds checking.
 * Please use the moveDown or moveBottom calls.
 */
function moveDownHelper(options, index) {
    //Create a new option to move it around
    var newOption = new Option (options[index+1].text, options[index+1].value);
    options[index+1].text = options[index].text;
    options[index+1].value = options[index].value;
    options[index].text = newOption.text;
    options[index].value = newOption.value;
}
//-->
</script>
