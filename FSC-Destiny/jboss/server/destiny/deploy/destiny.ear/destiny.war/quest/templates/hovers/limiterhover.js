/* limiterhover.js */
Class.create(BaseController, {
	init: function() {
		this.type = this.data.type + "";
		
		if (! this.data.readyToDisplay) {
			this.reloadLimiters();
		} else {
			switch(this.type) {
				case LimiterController_LIMITER_TYPE_GENRE:
				case LimiterController_LIMITER_TYPE_SUBJECT:
				case LimiterController_LIMITER_TYPE_AUTHOR:
				case LimiterController_LIMITER_TYPE_SERIES:
				case LimiterController_LIMITER_TYPE_LANGUAGE:
				case LimiterController_LIMITER_TYPE_AWARD:
				case LimiterController_LIMITER_TYPE_LOCATION:
				case LimiterController_LIMITER_TYPE_WPE_DOMAIN:
				case LimiterController_LIMITER_TYPE_WPE_FORMAT_TYPE:
				case LimiterController_LIMITER_TYPE_WPE_SOURCE_TYPE:
				case LimiterController_LIMITER_TYPE_WPE_TOPIC:
				case LimiterController_LIMITER_TYPE_WPE_LANGUAGE:
				case LimiterController_LIMITER_TYPE_FORMAT:
					if (! this.hasNextPage()) {
						this.elementMap.get(LimiterController_DIV_LIMITER_CONTROLS_NEXT).setStyle("visibility: hidden");
					}
					
					if (! this.hasPreviousPage()) {
						this.elementMap.get(LimiterController_DIV_LIMITER_CONTROLS_PREV).setStyle("visibility: hidden");
					}
					break;
				case LimiterController_LIMITER_TYPE_AR:
				case LimiterController_LIMITER_TYPE_RC:
					var readingLevelControlID = (this.type == LimiterController_LIMITER_TYPE_AR) ? LimiterController_LIMITER_CONTROL_AR_READING_LEVEL : LimiterController_LIMITER_CONTROL_RC_READING_LEVEL;
					var pointsControlID = (this.type == LimiterController_LIMITER_TYPE_AR) ? LimiterController_LIMITER_CONTROL_AR_POINTS : LimiterController_LIMITER_CONTROL_RC_POINTS;
					this.readingLevelSlider = new this.LimiterSlider(this.data.readingLevelRange, readingLevelControlID);
					this.pointSlider = new this.LimiterSlider(this.data.pointsRange, pointsControlID);
					this.readingLevelSlider.setSibling(this.pointSlider);
					this.pointSlider.setSibling(this.readingLevelSlider);
					break;
				case LimiterController_LIMITER_TYPE_LEXILE:
					if (this.data.measureRange) {
						this.measureSlider = new this.LimiterSlider(this.data.measureRange, LimiterController_LIMITER_CONTROL_LEXILE_MEASURE);
						this.measureSlider.setSibling(this.elementMap.get(LimiterController_LIMITER_CONTROL_LEXILE_CODE));
					}
					break;
				case LimiterController_LIMITER_TYPE_INTEREST_LEVEL:
					this.interestLevelSlider = new this.LimiterSlider(this.data.interestLevelRange, LimiterController_LIMITER_CONTROL_INTEREST_LEVEL);
					break;
				case LimiterController_LIMITER_TYPE_READING_LEVEL:
					this.readingLevelSlider = new this.LimiterSlider(this.data.readingLevelRange, LimiterController_LIMITER_CONTROL_READING_LEVEL);
					break;
				case LimiterController_LIMITER_TYPE_PUB_YEAR:
					this.pubYearSlider = new this.LimiterSlider(this.data.pubYearRange, LimiterController_LIMITER_CONTROL_PUB_YEAR);
					break;
				case LimiterController_LIMITER_TYPE_PAGES:
					this.extentPagesSlider = new this.LimiterSlider(this.data.pagesRange, LimiterController_LIMITER_CONTROL_PAGES);
					break;
				case LimiterController_LIMITER_TYPE_MINUTES:
					this.extentMinutesSlider = new this.LimiterSlider(this.data.minutesRange, LimiterController_LIMITER_CONTROL_MINUTES);
					break;
				case LimiterController_LIMITER_TYPE_FP:
					this.fountasPinnellSlider = new this.LimiterSlider(this.data.fountasPinnellRange, LimiterController_LIMITER_CONTROL_FP_LEVEL);
					break;
				case LimiterController_LIMITER_TYPE_WPE_LEXILE:
					this.wpeLexileSlider = new this.LimiterSlider(this.data.wpeLexileRange, LimiterController_LIMITER_CONTROL_WPE_LEXILE);
					break;
			}
		}
	},
	
	registerEvents: function() {
		Event.observe(this.elementMap.get(LimiterController_LIMITER_CLOSE), "mousedown", this.closeHover.bind(this));
		
		if (this.data.readyToDisplay) {
			switch(this.type) {
				case LimiterController_LIMITER_TYPE_SUBJECT:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applySubjectLimiter.bind(this, rowData.value.vopacHeadingID, rowData.value.subjectDisplayable);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_GENRE:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyGenreLimiter.bind(this, rowData.value.vopacHeadingID, rowData.value.subjectDisplayable);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_AUTHOR:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyAuthorLimiter.bind(this, rowData.value.stringCode, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_SERIES:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applySeriesLimiter.bind(this, rowData.value.stringCode, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_LOCATION:
					this.registerPagingControls();
					var rowCount = 0;
					for (var i=0; i < this.data.pageData.length; i++) {
						rowCount++;
						var rowData = this.data.pageData[i];
						if (rowData.value.siteID) {
							if (this.data.pageNumber > 0 && i == 0) {
								rowCount++;
							}
							var boundApply = this.applyLocationLimiter.bind(this, rowData.value.siteID, rowData.value.siteNameDisplayable);
							Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + rowCount), "mousedown", boundApply);
						}
					}
					break;
				case LimiterController_LIMITER_TYPE_LANGUAGE:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyLanguageLimiter.bind(this, rowData.value.stringCode, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_AWARD:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowCount = i+1;
						var rowData = this.data.pageData[i];
						var boundApply = this.applyAwardLimiter.bind(this, this.data.awardGroupHeading, rowData.value.longID, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + rowCount), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_REVIEW:
					for (var i=0; i < this.data.reviewData.values.length; i++) {
						var rowData = this.data.reviewData.values[i];
						var boundApply = this.applyReviewLimiter.bind(this, rowData.value);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_GRADE_LEVEL:
					console.log("attempting to bind the grade level to its hover");
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPEGradeLevelLimiter.bind(this, rowData.value.stringCode);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_DOMAIN:
					console.log("attempting to bind GRADE LEVEL...");
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPEDomainLimiter.bind(this, rowData.value);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_TOPIC:
					console.log("attempting to bind TOPIC...");
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPETopicLimiter.bind(this, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_LANGUAGE:
					console.log("attempting to bind LANGUAGE...");
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPELanguageLimiter.bind(this, rowData.value.stringDesc);
						console.log("got here");
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_LEXILE:
					console.log("attempting to bind WPE Lexile...");
					var boundApply = this.applyWPELexileLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_WPE_FORMAT_TYPE:
					console.log("attempting to bind FORMAT TYPE...");
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPEFormatTypeLimiter.bind(this, rowData.value);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_WPE_SOURCE_TYPE:
					console.log("attempting to bind SOURCE TYPE...");
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowData = this.data.pageData[i];
						var boundApply = this.applyWPESourceTypeLimiter.bind(this, rowData.value);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + i), "mousedown", boundApply);
						console.log("binding complete");
					}
					break;
				case LimiterController_LIMITER_TYPE_AR:
				case LimiterController_LIMITER_TYPE_RC:
					var boundApply = this.applyReadingProgramLimiter.bind(this, this.type);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_LEXILE:
					var boundApply = this.applyLexileLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					if (Object.isElement(this.elementMap.get(LimiterController_LIMITER_CONTROL_LEXILE_CODE))) {
						Event.observe(this.elementMap.get(LimiterController_LIMITER_CONTROL_LEXILE_CODE), "change", this.updateLexileCodeCounts.bind(this));
					}
					break;
				case LimiterController_LIMITER_TYPE_INTEREST_LEVEL:
					var boundApply = this.applyInterestLevelLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_READING_LEVEL:
					var boundApply = this.applyReadingLevelLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_PUB_YEAR:
					var boundApply = this.applyPubYearLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_PAGES:
					var boundApply = this.applyExtentPagesLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_MINUTES:
					var boundApply = this.applyExtentMinutesLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_FP:
					var boundApply = this.applyFountasPinnellLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_ONE_SEARCH_DATABASE:
					var boundApply = this.applyOneSearchLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_DIGITAL_CONTENT_PROVIDER:
					var boundApply = this.applyDigitalResourceLimiter.bind(this);
					Event.observe(this.elementMap.get(LimiterController_BUTTON_APPLY_LIMITER), "mousedown", boundApply);
					break;
				case LimiterController_LIMITER_TYPE_FORMAT:
					this.registerPagedLimiterEvents();
					for (var i=0; i < this.data.pageData.length; i++) {
						var rowCount = i+1;
						var rowData = this.data.pageData[i];
						var boundApply = this.applyFormatLimiter.bind(this, rowData.value.longID, this.data.formatGroupHeading, rowData.value.stringDesc);
						Event.observe(this.elementMap.get(LimiterController_LI_LIMITER_ROW_PREFIX + rowCount), "mousedown", boundApply);
					}
					break;
			}
		}
	},
	
	registerPagedLimiterEvents: function() {
		var boundUpdateSort = this.updateSort.bind(this);
		if (this.data.pageData.length > 1) {
			(this.data.currentSort != LimiterController_NARROWING_SORT_ALPHA) && Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_SORT_ALPHA), "mousedown", boundUpdateSort.curry(LimiterController_NARROWING_SORT_ALPHA));
			(this.data.currentSort != LimiterController_NARROWING_SORT_REVERSE_ALPHA) && Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_SORT_REVERSE_ALPHA), "mousedown", boundUpdateSort.curry(LimiterController_NARROWING_SORT_REVERSE_ALPHA));
			(this.data.currentSort != LimiterController_NARROWING_SORT_MOST_HITS) && Event.observe(this.elementMap.get(LimiterController_LINK_NARROWING_SORT_MOST_HITS), "mousedown", boundUpdateSort.curry(LimiterController_NARROWING_SORT_MOST_HITS));
		}
		this.registerPagingControls();
	},
	
	registerPagingControls: function() {
		Event.observe(this.elementMap.get(LimiterController_LINK_LIMITER_CONTROLS_PREV), "mousedown", this.previousPage.bind(this));
		Event.observe(this.elementMap.get(LimiterController_LINK_LIMITER_CONTROLS_NEXT), "mousedown", this.nextPage.bind(this));
	},
	
	reloadLimiters: function() {
		var searchType = Registry.lookup("SearchTypeController.Selector");
		if (! DAO.load({endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, this.data.type,null, searchType.getSearchType())) {
			var retry = this.reloadLimiters.bind(this);
			retry.delay(0.5);
		}
	},
	
	updateSort: function(sortOption) {
		var searchType = Registry.lookup("SearchTypeController.Selector");
		DAO.load({endpoint: "LimiterController.Limiters", container: $(LimiterController_DIV_LIMITER_OUTER)}, null, sortOption, searchType.getSearchType());
	},
	
	closeHover: function() {
		if (this.hover && Object.isFunction(this.hover.close)) {
			this.hover.close();
		}
	},
	
	prepareForRefresh: function() {
		var searchMaster = Registry.lookup("SearchController.SearchMaster");
		searchMaster.prepareForRefresh();
		if (this.hover && Object.isFunction(this.hover.close)) {
			this.hover.close();
		}
		Registry.unregister("LimiterController.Limiters");
	},
	
	prepareForRefresh_OneSearch: function() {
		var searchMaster = Registry.lookup("OneSearchController.SearchMaster");
		searchMaster.prepareForRefresh();
		if (this.hover && Object.isFunction(this.hover.close)) {
			this.hover.close();
		}
		Registry.unregister("LimiterController.Limiters");
	},
	
	prepareForRefresh_DCPI: function() {
		var searchMaster = Registry.lookup("SearchController.SearchMaster");
		searchMaster.prepareForRefresh_DCPI();
		if (this.hover && Object.isFunction(this.hover.close)) {
			this.hover.close();
		}
		Registry.unregister("LimiterController.Limiters");
	},
	
	
	applyAuthorLimiter: function(authorSortable, authorDisplayable) {
		if (DAO.load({endpoint: "LimiterController.AuthorApplicator", appendTo: "SearchController.SearchResults"}, authorSortable, authorDisplayable)) {
			this.prepareForRefresh();
		}
	},

	applySeriesLimiter: function(seriesSortable, seriesDisplayable) {
		if (DAO.load({endpoint: "LimiterController.SeriesApplicator", appendTo: "SearchController.SearchResults"}, seriesSortable, seriesDisplayable)) {
			this.prepareForRefresh();
		}
	},
	
	applyLocationLimiter: function(siteID, siteName) {
		if (DAO.load({endpoint: "LimiterController.LocationApplicator", appendTo: "SearchController.SearchResults"}, siteID, siteName)) {
			this.prepareForRefresh();
		}
	},
	
	applyLanguageLimiter: function(languageSortable, languageDisplayable) {
		if (DAO.load({endpoint: "LimiterController.LanguageApplicator", appendTo: "SearchController.SearchResults"}, languageSortable, languageDisplayable)) {
			this.prepareForRefresh();
		}
	},
	
	applyAwardLimiter: function(awardHeading, awardID, awardName) {
		if (DAO.load({endpoint: "LimiterController.AwardsApplicator", appendTo: "SearchController.SearchResults"}, awardHeading, awardID, awardName)) {
			this.prepareForRefresh();
		}
	},

	applySubjectLimiter: function(vopacHeadingID, subjectDisplayable) {
		if (DAO.load({endpoint: "LimiterController.SubjectApplicator", appendTo: "SearchController.SearchResults"}, vopacHeadingID, subjectDisplayable)) {
			this.prepareForRefresh();
		}
	},
	
	applyGenreLimiter: function(vopacHeadingID, subjectDisplayable) {
		if (DAO.load({endpoint: "LimiterController.GenreApplicator", appendTo: "SearchController.SearchResults"}, vopacHeadingID, subjectDisplayable)) {
			this.prepareForRefresh();
		}
	},

	applyReviewLimiter: function(reviewRating) {
		if (DAO.load({endpoint: "LimiterController.ReviewsApplicator", appendTo: "SearchController.SearchResults"}, reviewRating)) {
			this.prepareForRefresh();
		}
	},

	applyWPEGradeLevelLimiter: function(gradeLevel) {
		if (DAO.load({endpoint: "LimiterController.WPEGradeLevelApplicator", appendTo: "SearchController.SearchResults"}, gradeLevel)) {
			this.prepareForRefresh();
		}
	},

	applyWPEDomainLimiter: function(domain) {
		if (DAO.load({endpoint: "LimiterController.WPEDomainApplicator", appendTo: "SearchController.SearchResults"}, domain)) {
			this.prepareForRefresh();
		}
	},
	
	applyWPEFormatTypeLimiter: function(format_type) {
		if (DAO.load({endpoint: "LimiterController.WPEFormatTypeApplicator", appendTo: "SearchController.SearchResults"}, format_type)) {
			this.prepareForRefresh();
		}
	},
	
	applyWPESourceTypeLimiter: function(source_type) {
		if (DAO.load({endpoint: "LimiterController.WPESourceTypeApplicator", appendTo: "SearchController.SearchResults"}, source_type)) {
			this.prepareForRefresh();
		}
	},
	
	applyWPETopicLimiter: function(topic) {
		if (DAO.load({endpoint: "LimiterController.WPETopicApplicator", appendTo: "SearchController.SearchResults"}, topic)) {
			this.prepareForRefresh();
		}
	},

	applyWPELanguageLimiter: function(language) {
		if (DAO.load({endpoint: "LimiterController.WPELanguageApplicator", appendTo: "SearchController.SearchResults"}, language)) {
			this.prepareForRefresh();
		}
	},
	
	applyWPELexileLimiter: function(wpeLexile) {
		var minWPELexile = "";
		var maxWPELexile = "";
		
		if (this.wpeLexileSlider) {
			minWPELexile = this.wpeLexileSlider.getLowHandleValue();
			maxWPELexile = this.wpeLexileSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.WPELexileApplicator", appendTo: "SearchController.SearchResults"}, minWPELexile, maxWPELexile)) {
			this.prepareForRefresh();
		}
	},
	
	// TODO: add handlers for source type and format type, use domain as the template.
	
	applyInterestLevelLimiter: function() {
		var minInterestLevel = "";
        var maxInterestLevel = "";
        
        if (this.interestLevelSlider) {
        	minInterestLevel = this.interestLevelSlider.getLowHandleValue();
        	maxInterestLevel = this.interestLevelSlider.getHighHandleValue();
        }
		if (DAO.load({endpoint: "LimiterController.InterestLevelApplicator", appendTo: "SearchController.SearchResults"}, minInterestLevel, maxInterestLevel)) {
			this.prepareForRefresh();
		}
	},
	
	applyReadingLevelLimiter: function() {
		var minReadingLevel = "";
		var maxReadingLevel = "";
		
		if (this.readingLevelSlider) {
			minReadingLevel = this.readingLevelSlider.getLowHandleValue();
			maxReadingLevel = this.readingLevelSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.ReadingLevelApplicator", appendTo: "SearchController.SearchResults"}, minReadingLevel, maxReadingLevel)) {
			this.prepareForRefresh();
		}
	},
	
	applyPubYearLimiter: function() {
		var minPubYearLevel = "";
		var maxPubYearLevel = "";
		
		if (this.pubYearSlider) {
			minPubYearLevel = this.pubYearSlider.getLowHandleValue();
			maxPubYearLevel = this.pubYearSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.PubYearApplicator", appendTo: "SearchController.SearchResults"}, minPubYearLevel, maxPubYearLevel)) {
			this.prepareForRefresh();
		}
	},

	applyExtentPagesLimiter: function() {
		var minPageLevel = "";
		var maxPageLevel = "";
		
		if (this.extentPagesSlider) {
			minPageLevel = this.extentPagesSlider.getLowHandleValue();
			maxPageLevel = this.extentPagesSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.ExtentPagesApplicator", appendTo: "SearchController.SearchResults"}, minPageLevel, maxPageLevel)) {
			this.prepareForRefresh();
		}
	},

	applyExtentMinutesLimiter: function() {
		var minMinutesLevel = "";
		var maxMinutesLevel = "";
		
		if (this.extentMinutesSlider) {
			minMinutesLevel = this.extentMinutesSlider.getLowHandleValue();
			maxMinutesLevel = this.extentMinutesSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.ExtentMinutesApplicator", appendTo: "SearchController.SearchResults"}, minMinutesLevel, maxMinutesLevel)) {
			this.prepareForRefresh();
		}
	},
	
	applyFountasPinnellLimiter: function() {
		var minFPLevel = "";
		var maxFPLevel = "";
		
		if (this.fountasPinnellSlider) {
			minFPLevel = this.fountasPinnellSlider.getLowHandleValue();
			maxFPLevel = this.fountasPinnellSlider.getHighHandleValue();
		}
		if (DAO.load({endpoint: "LimiterController.FountasPinnellApplicator", appendTo: "SearchController.SearchResults"}, minFPLevel, maxFPLevel)) {
			this.prepareForRefresh();
		}
	},

	applyOneSearchLimiter: function() {
		var groupName = this.data.title;
		var databases = [];
		for (var i = 0; i < this.data.databases.length; i ++) {
			var t = $("os" + this.data.databases[i].groupNumber + "_db" + i);
			if (t.checked) {
				databases.push(t.name);
			}
		}
		if (DAO.load({endpoint: "LimiterController.OneSearchApplicator", appendTo: "OneSearchController.SearchResults"}, groupName, databases)) {
			this.prepareForRefresh_OneSearch();
		}
	},
	
	applyDigitalResourceLimiter: function() {
		var providers = [];
		for (var i = 0; i < this.data.providers.length; i ++) {
			var t = $("dcpi_" + i);
			if (t.checked) {
				providers.push(t.name);
			}
		}
		if (DAO.load({endpoint: "LimiterController.DcpiSearchApplicator", appendTo: "DCPISearchController.SearchResults"}, providers, providers.length == 0)) {
			this.prepareForRefresh_DCPI();
		}
	},
	
	applyLexileLimiter: function() {
		var minMeasure = "";
        var maxMeasure = "";
        var code = "";
        
        if (this.measureSlider) {
            minMeasure = this.measureSlider.getLowHandleValue();
            maxMeasure = this.measureSlider.getHighHandleValue();
        }

        var codeSelect = this.elementMap.get(LimiterController_LIMITER_CONTROL_LEXILE_CODE);
        if (Object.isElement(codeSelect)) {
            code = codeSelect.getValue().split(".")[0];
        }
        
		if (DAO.load({endpoint: "LimiterController.LexileApplicator", appendTo: "SearchController.SearchResults"}, code, minMeasure, maxMeasure)) {
			this.prepareForRefresh();
		}
	},
	
	applyFormatLimiter: function(formatHeadingID, formatGroupHeading, formatDisplayable) {
		if (formatGroupHeading) {
			if (DAO.load({endpoint: "LimiterController.FormatApplicator", appendTo: "SearchController.SearchResults"}, null, formatHeadingID, formatDisplayable)) {
				this.prepareForRefresh();
			}
		} else {
			if (DAO.load({endpoint: "LimiterController.FormatApplicator", appendTo: "SearchController.SearchResults"}, formatHeadingID, null, formatDisplayable)) {
				this.prepareForRefresh();
			}
		}
	},

	updateLexileCodeCounts: function() {
		if (this.measureSlider && Object.isFunction(this.measureSlider.disableSelf)) {
			this.measureSlider.disableSelf();
		}
		
		var countDiv = this.elementMap.get(LimiterController_DIV_TOTAL_COUNT);
		var codeDropDown = this.elementMap.get(LimiterController_LIMITER_CONTROL_LEXILE_CODE);
		if (Object.isElement(countDiv) && Object.isElement(codeDropDown) && Object.isFunction(codeDropDown.getValue)) {
			countDiv.update(codeDropDown.getValue().split(".")[1]);
		}
	},
	
	applyReadingProgramLimiter: function(type) {
		var minReadingLevel = null;
        var maxReadingLevel = null;
        if (this.readingLevelSlider) {
            minReadingLevel = this.readingLevelSlider.getLowHandleValue();
            maxReadingLevel = this.readingLevelSlider.getHighHandleValue();
        }
        
        var minPoints = null;
        var maxPoints = null;
        if (this.pointSlider) {
            minPoints = this.pointSlider.getLowHandleValue();
            maxPoints = this.pointSlider.getHighHandleValue();
        }
        var endpointName = (type == LimiterController_LIMITER_TYPE_AR) ? "LimiterController.ARApplicator" : "LimiterController.RCApplicator";
		if (DAO.load({endpoint: endpointName, appendTo: "SearchController.SearchResults"}, minReadingLevel, maxReadingLevel, minPoints, maxPoints)) {
			this.prepareForRefresh();
		}
	},
	
    setPosition: function(hover) {
        if (! hover.visible()) {
            // need this to be able to tell the positioning of the hover arrow
            hover.setStyle({visibility: "hidden"});
            hover.show(); 
        }
        
        var activatorOffset = this.activator.positionedOffset();
        var activatorWidth = this.activator.getWidth();
        var activatorHeight = this.activator.getHeight();
        
        var narrowingDiv = $("narrowingLimiters");
        var narrowingDivWidth = narrowingDiv.getWidth();
        
        // figure out the distance from the top of the hover to the top of the arrow
        var hoverOffset = hover.cumulativeOffset();
        var arrow = $(window.isRTL ? "narrowFilterModuleArrowRight" : "narrowFilterModuleArrowLeft");
        var arrowOffset = arrow.cumulativeOffset();
        var arrowDif = arrowOffset.top - (arrow.getHeight() / 2) - hoverOffset.top;
        
        var hoverLeft = 0 + (arrow.getWidth() / 2);
        var hoverTop = activatorOffset.top - arrowDif;
        var hoverWidth = hover.getWidth();
        var hoverHeight = hover.getHeight();
        
        var params = {
            position: "absolute",
            top: hoverTop + "px",
            left: hoverLeft + "px",
            zIndex: 1000,
            visibility: "inherit"
	        };
        if (window.isRTL) {
        	params.right = params.left;
        	params.left = null;
        	
        }
        hover.setStyle(params);
    },
    
    LimiterSlider: Class.create(Control.Slider, {
    	initialize: function($super, sliderData, id) {
    		if (! Object.isFunction(String.prototype.parseInt)) {
    			String.prototype.parseFloat = function() { return parseFloat(this); };
    		}
    	
    		var sliderHandleID = [id + LimiterController_LIMITER_SLIDER_LOW_HANDLE, id + LimiterController_LIMITER_SLIDER_HIGH_HANDLE]; 
    		var sliderTrackID = id;
    		var optionsArray = {
    				id: id,
    		        restricted: true,
    		        sliderValue: [sliderData.numericMinimum, sliderData.numericMaximum],
    		        range: $R(parseFloat(sliderData.numericMinimum), parseFloat(sliderData.numericMaximum), false),
    		        myValues: sliderData.valuesArray.invoke("parseFloat"),
    		        valueCounts: sliderData.valueCountsArray.invoke("parseFloat"),
    		        translationArray: sliderData.translationArray,
    		        forceDecimal: sliderData.forceDecimal,
    		        rangedValueCounts: sliderData.rangedValueCounts
    		};
    		
    	    var sliderOptions = Object.extend({
    	        id: null,
    	        valueCounts: null,
    	        onSlide: this.handleSlide.bind(this),
    	        onChange: this.handleChange.bind(this),
    	        translationArray: null,
    	        forceDecimal: false
    	    }, optionsArray);
    	    if ($(sliderTrackID)) {
    		    if (optionsArray.myValues.length > 1) {
    		    	var hover = Utility.upToClass($(sliderOptions.id),"hover");
    		    	if (hover) {
    		    		hover.setStyle("visibility: hidden");
    		    		hover.show();
    		    	}
    			    $super(sliderHandleID, sliderTrackID, sliderOptions);
    			    if (hover) {
    			    	hover.hide();
    			    }
    			    
    			    for(var i=0; i < this.handles.length; i++) {
    			        this.handles[i].addClassName("enabledSliderHandle");
    			    }
    			    this.background = Utility.upToClass(this.track, "sliderBackground");
    			    this.background.addClassName("enabledSliderBackground");
    			    
    			    this.sliderValueLow = $(this.options.id + "SliderValueLow");
    			    this.sliderValueHigh = $(this.options.id + "SliderValueHigh");
    		    } else {
    		    	this.options = optionsArray;
    		    }
    	    }
    	},

    	getLowNumericValue: function() {
    		var value = this.options.myValues[0];
    		if (this.options.myValues.length > 1) {
    			value = (this.options.forceDecimal) ? this.values[0].toFixed(1) : this.values[0].toFixed(0);
    		}
    		
    		return value;
    	},

    	getHighNumericValue: function() {
    		var value = this.options.myValues[0];
    		if (this.options.myValues.length > 1) {
    			value = (this.options.forceDecimal) ? this.values[1].toFixed(1) : this.values[1].toFixed(0);
    		}
    		
    		return value;
    	},

    	getLowHandleValue: function() {
    		return this.translateValue(this.getLowNumericValue());
    	},

    	getHighHandleValue: function() {
    		return this.translateValue(this.getHighNumericValue());
    	},

    	translateValue: function(value) {
    		var translated = value;
    		if (this.options.translationArray) {
    			translated = this.options.translationArray[value];
    		}
    		
    		return translated;
    	},

    	updateValueCountsTotal: function() {
    	    var total = 0;
    	    
    	    if (this.options.myValues.length == 1) {
    	    	total = this.options.valueCounts[0];
    	    } else {
    	    	var lowHandle = (this.options.forceDecimal) ? this.values[0].toFixed(1) : this.values[0].toFixed(0); 
    	    	var highHandle = (this.options.forceDecimal) ? this.values[1].toFixed(1) : this.values[1].toFixed(0);
    	    	
    	    	if (this.options.rangedValueCounts) {
    	    		var map = this.options.rangedValueCounts;
    	    		for(var i=0; i < map.length; i++) {
    	    			if (map[i].min <= highHandle && map[i].max >= lowHandle) {
    	    				total += map[i].count;
    	    			}
    	    		}
    	    	} else {
    	    		for(var i=0; i < this.options.myValues.length; i++) {
    	    			if(this.options.myValues[i] >= lowHandle && this.options.myValues[i] <= highHandle) {
    	    				total += this.options.valueCounts[i];
    	    			}
    	    		}
    	    	}
    	    }
    	    
    	    if (! this.totalCountDiv) {
    	    	this.totalCountDiv = $("totalCount");
    	    }
    	    if (this.totalCountDiv) {
    	        this.totalCountDiv.innerHTML = total;
    	    }
    	},

    	showSliderValue: function() {
    	    if (this.activeHandle) {
    	        var value = this.getHighHandleValue();
    	        var valueDiv = this.sliderValueHigh;
    	        if (this.activeHandle == this.handles[0]) {
    	            value = this.getLowHandleValue();
    		        valueDiv = this.sliderValueLow;
    	        }
    	        
    	        if (this.options.forceDecimal && Object.isNumber(value) && (value == value.floor())) {
    	        	value = value + ".0";
    	        }
    	        valueDiv.update(value);
    	    }
    	},

    	setSibling: function(sibling) {
    		this.sibling = sibling;
    	},
    	
    	disableSiblings: function() {
    		if (! this.siblingsDisabled) {
    			if (this.sibling) {
    				if(Object.isFunction(this.sibling.disableSelf)) {
    					this.sibling.disableSelf();
    				} else if (Object.isElement(this.sibling) && Object.isFunction(this.sibling.disable)) {
    					this.sibling.disable();
    				}
    			}
    			this.siblingsDisabled = true;
    		}
    	},

    	disableSelf: function() {
    	   this.disabled = true;
    	   if (this.options.myValues.length > 1) {
    		    for(var i=0; i < this.handles.length; i++) {
    		        this.handles[i].removeClassName("enabledSliderHandle");
    		        this.handles[i].addClassName("disabledSliderHandle");
    		    }
    		    this.background.removeClassName("enabledSliderBackground");
    		    this.background.addClassName("disabledSliderBackground");
    	   }
    	},

    	handleSlide: function(value) {
    		this.disableSiblings();
    	    this.updateValueCountsTotal();
    	    this.showSliderValue();
    	},

    	handleChange: function(value) {
    	    this.disableSiblings();		
    	    this.updateValueCountsTotal();
    	    this.showSliderValue();
    	},
    	
		maximumOffset: function(){
		    return this.isVertical() ? $j(this.track).height() : $j(this.track).width();
		}
    })
});