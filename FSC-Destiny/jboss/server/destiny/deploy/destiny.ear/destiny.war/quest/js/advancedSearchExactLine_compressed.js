Class.create(AdvancedSearchBaseLine,{getLabel:function(){return MessageHelper.format("advancedSearchDataValue_thisExact")},_buildSelectNode:function(){return Builder.node("select",{},[Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_KEYWORD},MessageHelper.format("advancedSearchDataValue_keyword")),Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_TITLE},MessageHelper.format("advancedSearchDataValue_title")),Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_AUTHOR},MessageHelper.format("advancedSearchDataValue_author")),Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_NOTE},MessageHelper.format("advancedSearchDataValue_note")),Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_SERIES},MessageHelper.format("advancedSearchDataValue_series")),Builder.node("option",{value:AdvancedSearchController_AS_SEARCH_TYPE_SUBJECT},MessageHelper.format("advancedSearchDataValue_subject"))])},getQueryString:function(c){var a="";
var b=this.getValue();b=this.lowerBooleans(b);if(!b.strip().empty()){if(c==AdvancedSearchController_AS_QUERY_OUTPUT_HIGHLIGHTED){b='<span class="queryQuotes">"</span><span class="queryValue">'+b+'</span><span class="queryQuotes">"</span>'}else{b='"'+b+'"'}a=this.buildDQLComponent(b,c,false)}return a},getLineType:function(){return AdvancedSearchController_AS_LINE_TYPE_EXACT}});