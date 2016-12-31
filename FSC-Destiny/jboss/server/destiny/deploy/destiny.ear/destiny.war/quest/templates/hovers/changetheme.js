/* changetheme.js */
Class.create(BaseController, {
	init: function() {

	},
	
	registerEvents: function() {
		for (var i=0; i < this.data.themes.length; i++) {
			Event.observe(this.elementMap.get("theme_" + i), "mousedown", this.changeTheme.bind(this, this.data.themes[i].cssFolder));
		}
		//prolly should try to do this w/ elementMap
		Event.observe($("changeThemeOuter"), "mouseover", this.themeMouseOver.bindAsEventListener(this));	
	},
	
	setPosition: function(hover) {
		// position is CSS driven
	},
	
	changeTheme: function(cssFolder) {
		DAO.load({endpoint:"MenuBarController.ChangeTheme", container:null}, cssFolder);
	},
	
	themeMouseOver: function(event) {
		var eventSource = Event.element(event);
		if (eventSource && eventSource.hasClassName("themeDisplay")) {
			var themes = $("changeThemeWindow").select(".themeDisplay");
			for (var index = 0; index < themes.length; index ++) {
				var theme = themes[index];
				if (theme.hasClassName("themeDisplayHighlight") && theme != eventSource) {
					theme.removeClassName("themeDisplayHighlight");
				}
			}
			eventSource.addClassName("themeDisplayHighlight");
		}
	}

});
