/** clearSensitiveData.sql inside cursor for all Destiny types **/
CREATE TABLE TempDatabaseNames (DatabaseName VARCHAR(255))
GO

DECLARE @DatabaseName VARCHAR(255);
DECLARE @WorkingDatabaseName VARCHAR(255);
DECLARE @populateTempDatabaseNames VARCHAR(255);

/** Name of the main databaase either a single District, or a Consortium DB **/
/**=========================================================================**/
/**=========================================================================**/
USE saas52_0413269; -- <<---Put your database name here!!!
/**=========================================================================**/
/**=========================================================================**/

IF OBJECT_ID('CircCatAdmin.ConsortiumMember', 'U') IS NOT NULL
BEGIN
	PRINT 'We have a Consortium database';
	EXEC('INSERT INTO dbo.TempDatabaseNames SELECT DatabaseName FROM CircCatAdmin.ConsortiumMember');
END

IF OBJECT_ID('CircCatAdmin.ConsortiumMember', 'U') IS NULL 
BEGIN
	PRINT 'We have a District database';
	EXEC('INSERT INTO dbo.TempDatabaseNames select db_name()');
END

DECLARE member_database_cursor CURSOR FOR
-- This will retrieve each database name for each member in the Consortium
	SELECT DatabaseName FROM TempDatabaseNames

  OPEN member_database_cursor;
	FETCH NEXT FROM member_database_cursor INTO @WorkingDatabaseName
  WHILE (@@FETCH_STATUS <> -1)
  BEGIN	
    /**====================================================================================================**/
	/** Begin clearSensitiveData **/
	PRINT 'Step 1: Beginning to update database : ' + @WorkingDatabaseName;

	EXEC('USE [' + @WorkingDatabaseName + ']');

	PRINT 'Step 2: Fix up the login and database user';
	
	EXEC('[' + @WorkingDatabaseName + ']..sp_change_users_login ''auto_fix'', ''CircCatAdmin''');

	PRINT 'Step 3: Set DestinyAdmin password to "password" and update the customer number to Emil''s test number.';

    EXEC('UPDATE [' + @WorkingDatabaseName + '].CircCatAdmin.ConfigDistrict 
		 SET AdminPassword = ''004001007003001001005001001001002001001004004001'',
		 CustomerNumber = ''1206579'',
		 uploadStats = 0');

	PRINT 'Step 4: Set the rest of the passwords to "password"';
	
	EXEC('UPDATE [' + @WorkingDatabaseName + '].CircCatAdmin.Users SET Password = ''004001007003001001005001001001002001001004004001''');

	PRINT 'Step 6: If they changed the admin100 to something else, reset it back';

	EXEC('
		UPDATE  [' + @WorkingDatabaseName + '].CircCatAdmin.users
		SET loginid = ''admin''+CAST(sp.siteID AS VARCHAR(25)), LoginIDUniqueKey=''ADMIN''+CAST(sp.siteID AS VARCHAR(25))
		FROM [' + @WorkingDatabaseName + '].CircCatAdmin.users u 
		JOIN [' + @WorkingDatabaseName + '].CircCatAdmin.patron p ON u.userID=p.userID
		JOIN [' + @WorkingDatabaseName + '].CircCatAdmin.sitepatron sp ON sp.PatronID = p.PatronID
		WHERE sp.PatronBarcodeSortable = ''SITEADMIN''
	');

	PRINT 'Step 7: Remove or change sensitive data in ConfigDistrict';

	EXEC('
		UPDATE  [' + @WorkingDatabaseName + '].[CircCatAdmin].[ConfigDistrict]
		SET [AdminUserName]=''destinyadmin'', 
			[CustomerNumber]='''', [allowAOLSearch]=''0'', [MarcOrganizationCode]=''USMoc'', 
			[SMTPServer]='''', [SMTPPort]=0, [SMTPUsername]='''', [SMTPPassword]='''', 
			[EmailDefaultReplyName]='''', [EmailDefaultReplyAddress]='''', 
			[destinyAdminContactName]=''DestinyAdmin'',
			[destinyAdminPhoneNumber]=''(815) 555-1212'',
			[destinyAdminEmail]=''destinyadmin@fsc.follett.com''
	');

	PRINT 'Step 8: Remove or change sensitive data in ConfigSite';
	
	EXEC('
		DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SiteShortNameAlias
	');
	EXEC('
		UPDATE [' + @WorkingDatabaseName + '].[CircCatAdmin].[ConfigSite]
		SET [UserField1Prompt]=''User Field 1'', [UserField2Prompt]=''User Field 2'', 
			[UserField3Prompt]=''User Field 3'', [UserField4Prompt]=''User Field 4'', 
			[UserField5Prompt]=''User Field 5'', [DisplayPatronPictures]=0, 
			[ShowUserField1]=0, [ShowUserField2]=0, [ShowUserField3]=0, 
			[ShowUserField4]=0, [ShowUserField5]=0, [UserField1PromptSortKey]=''USER FIELD 0000000001'', [UserField2PromptSortKey]=''USER FIELD 0000000002'', 
			[UserField3PromptSortKey]=''USER FIELD 0000000003'', [UserField4PromptSortKey]=''USER FIELD 0000000004'', 
			[UserField5PromptSortKey]=''USER FIELD 0000000005'', [AddressLine1]=''1391 Corporate Drive'', 
			[AddressLine2]='''', [City]=''McHenry'', [State]=''Illinois'', [Zip]=''60050'', 
			[ReceiptHeader]='''', [ReceiptNote]='''', [EmailHoldsReplyName]='''', 
			[EmailHoldsReplyAddress]='''', [EmailCOOMUFReplyName]='''', [EmailCOOMUFReplyAddress]='''', 
			[CustomerNumber]=''''
	');

	PRINT 'Step 9a: Remove or change sensitive data in Patron.  Randomize patron names.';
	
	EXEC('USE ' + @WorkingDatabaseName + '
		
		CREATE TABLE TempTableName (FirstName VARCHAR(42), LastName VARCHAR(42))

		INSERT INTO TempTableName		VALUES (''Anthony'', ''Zamorano'')
		INSERT INTO TempTableName		VALUES (''Takisha'', ''Hewlett'')
		INSERT INTO TempTableName		VALUES (''Shakira'', ''Jury'')
		INSERT INTO TempTableName		VALUES (''January'', ''Creech'')
		INSERT INTO TempTableName		VALUES (''Reena'', ''Paddock'')
		INSERT INTO TempTableName		VALUES (''Susanne'', ''Walton'')
		INSERT INTO TempTableName		VALUES (''Lashanda'', ''Gravley'')
		INSERT INTO TempTableName		VALUES (''Lila'', ''Casler'')
		INSERT INTO TempTableName		VALUES (''Florida'', ''Ard'')
		INSERT INTO TempTableName		VALUES (''Cortez'', ''Welborn'')
		INSERT INTO TempTableName		VALUES (''Matilda'', ''Fackler'')
		INSERT INTO TempTableName		VALUES (''Elwanda'', ''Abshire'')
		INSERT INTO TempTableName		VALUES (''Alecia'', ''Bannerman'')
		INSERT INTO TempTableName		VALUES (''Lottie'', ''Simmonds'')
		INSERT INTO TempTableName		VALUES (''Tyrell'', ''Casavant'')
		INSERT INTO TempTableName		VALUES (''Regina'', ''Peppler'')
		INSERT INTO TempTableName		VALUES (''Rosalyn'', ''Ottley'')
		INSERT INTO TempTableName		VALUES (''Davis'', ''Preuss'')
		INSERT INTO TempTableName		VALUES (''Dwayne'', ''Bensley'')
		INSERT INTO TempTableName		VALUES (''Virgilio'', ''Zahn'')
		INSERT INTO TempTableName		VALUES (''Edgar'', ''Hunsinger'')
		INSERT INTO TempTableName		VALUES (''Verdell'', ''Coulston'')
		INSERT INTO TempTableName		VALUES (''Latina'', ''Naugle'')
		INSERT INTO TempTableName		VALUES (''Kathy'', ''Morphis'')
		INSERT INTO TempTableName		VALUES (''Elma'', ''Peebles'')
		INSERT INTO TempTableName		VALUES (''Arnulfo'', ''Cappelli'')
		INSERT INTO TempTableName		VALUES (''Doretta'', ''Greenman'')
		INSERT INTO TempTableName		VALUES (''Lisette'', ''Rabello'')
		INSERT INTO TempTableName		VALUES (''Catrice'', ''Casteel'')
		INSERT INTO TempTableName		VALUES (''Toni'', ''Rosenfeld'')
		INSERT INTO TempTableName		VALUES (''Ned'', ''Malbon'')
		INSERT INTO TempTableName		VALUES (''Valeria'', ''Sutherland'')
		INSERT INTO TempTableName		VALUES (''Clark'', ''Haffner'')
		INSERT INTO TempTableName		VALUES (''Anton'', ''Swindler'')
		INSERT INTO TempTableName		VALUES (''Christiana'', ''Goggins'')
		INSERT INTO TempTableName		VALUES (''Lorenzo'', ''Monnier'')
		INSERT INTO TempTableName		VALUES (''Carmelia'', ''Eliason'')
		INSERT INTO TempTableName		VALUES (''Larae'', ''Mireles'')
		INSERT INTO TempTableName		VALUES (''Shirly'', ''Fairclough'')
		INSERT INTO TempTableName		VALUES (''Leland'', ''Rabb'')
		INSERT INTO TempTableName		VALUES (''Terica'', ''Teamer'')
		INSERT INTO TempTableName		VALUES (''Shella'', ''Escalera'')
		INSERT INTO TempTableName		VALUES (''Genny'', ''Yeadon'')
		INSERT INTO TempTableName		VALUES (''Tayna'', ''Emerick'')
		INSERT INTO TempTableName		VALUES (''Spencer'', ''Deas'')
		INSERT INTO TempTableName		VALUES (''Rosaline'', ''Bemis'')
		INSERT INTO TempTableName		VALUES (''Shantay'', ''Villalva'')
		INSERT INTO TempTableName		VALUES (''Galina'', ''Backus'')
		INSERT INTO TempTableName		VALUES (''Jermaine'', ''Avant'')
		INSERT INTO TempTableName		VALUES (''Agatha'', ''Mcilrath'')
		INSERT INTO TempTableName		VALUES (''Leida'', ''Smith'')
		INSERT INTO TempTableName		VALUES (''Kera'', ''Johnson'')
		INSERT INTO TempTableName		VALUES (''Lilia'', ''Williams'')
		INSERT INTO TempTableName		VALUES (''Hee'', ''Brown'')
		INSERT INTO TempTableName		VALUES (''Yen'', ''Jones'')
		INSERT INTO TempTableName		VALUES (''Ricardo'', ''Miller'')
		INSERT INTO TempTableName		VALUES (''Shaunda'', ''Davis'')
		INSERT INTO TempTableName		VALUES (''Clyde'', ''Garcia'')
		INSERT INTO TempTableName		VALUES (''Krystal'', ''Rodriguez'')
		INSERT INTO TempTableName		VALUES (''Joseph'', ''Wilson'')
		INSERT INTO TempTableName		VALUES (''Tonita'', ''Tapscott'')
		INSERT INTO TempTableName		VALUES (''Diana'', ''Lobato'')
		INSERT INTO TempTableName		VALUES (''Georgeanna'', ''Zabala'')
		INSERT INTO TempTableName		VALUES (''Breanne'', ''Asher'')
		INSERT INTO TempTableName		VALUES (''Jack'', ''Hurlburt'')
		INSERT INTO TempTableName		VALUES (''Epifania'', ''MccLoskey'')
		INSERT INTO TempTableName		VALUES (''Freddie'', ''Dunlop'')
		INSERT INTO TempTableName		VALUES (''Belva'', ''Neville'')
		INSERT INTO TempTableName		VALUES (''Lillie'', ''Nygard'')
		INSERT INTO TempTableName		VALUES (''Kalyn'', ''Restrepo'')
		INSERT INTO TempTableName		VALUES (''Wilfredo'', ''Hinson'')
		INSERT INTO TempTableName		VALUES (''Bryanna'', ''Machado'')
		INSERT INTO TempTableName		VALUES (''Israel'', ''Brey'')
		INSERT INTO TempTableName		VALUES (''Isa'', ''Mullaney'')
		INSERT INTO TempTableName		VALUES (''Sade'', ''Kidder'')
		INSERT INTO TempTableName		VALUES (''Cleta'', ''Shehane'')
		INSERT INTO TempTableName		VALUES (''Ellis'', ''Cagle'')
		INSERT INTO TempTableName		VALUES (''Evelia'', ''Fugitt'')
		INSERT INTO TempTableName		VALUES (''Jaye'', ''Hennemann'')
		INSERT INTO TempTableName		VALUES (''Cheryla'', ''Echeverria'')
		INSERT INTO TempTableName		VALUES (''Denise'', ''Shupp'')
		INSERT INTO TempTableName		VALUES (''Rufus'', ''Goetz'')
		INSERT INTO TempTableName		VALUES (''Scarlett'', ''Leibowitz'')
		INSERT INTO TempTableName		VALUES (''Dwight'', ''Maggi'')
		INSERT INTO TempTableName		VALUES (''Raguel'', ''Hennings'')
		INSERT INTO TempTableName		VALUES (''Arlene'', ''Garton'')
		INSERT INTO TempTableName		VALUES (''Jung'', ''Karst'')
		INSERT INTO TempTableName		VALUES (''Elli'', ''Ebarb'')
		INSERT INTO TempTableName		VALUES (''Afton'', ''Blanchette'')
		INSERT INTO TempTableName		VALUES (''Portia'', ''Sautner'')
		INSERT INTO TempTableName		VALUES (''Valentina'', ''Knack'')
		INSERT INTO TempTableName		VALUES (''Marielle'', ''Munsterman'')
		INSERT INTO TempTableName		VALUES (''Joy'', ''Chait'')
		INSERT INTO TempTableName		VALUES (''Halina'', ''Marsico'')
		INSERT INTO TempTableName		VALUES (''Terina'', ''Boor'')
		INSERT INTO TempTableName		VALUES (''Yolanda'', ''Kittel'')
		INSERT INTO TempTableName		VALUES (''Kristie'', ''Firestone'')
		INSERT INTO TempTableName		VALUES (''Earlie'', ''Andrzejewski'')
		INSERT INTO TempTableName		VALUES (''Nathanael'', ''Roose'')
		INSERT INTO TempTableName		VALUES (''Neal'', ''Kiefer'')
		INSERT INTO TempTableName		VALUES (''Jonathan'', ''Amosa'')
		INSERT INTO TempTableName		VALUES (''David'', ''Bakhtiari'')
		INSERT INTO TempTableName		VALUES (''Chris'', ''Banjo'')
		INSERT INTO TempTableName		VALUES (''Don'', ''Barclay'')
		INSERT INTO TempTableName		VALUES (''Sam'', ''Barrington'')
		INSERT INTO TempTableName		VALUES (''Brandon'', ''Bostick'')
		INSERT INTO TempTableName		VALUES (''Josh'', ''Boyd'')
		INSERT INTO TempTableName		VALUES (''Jarrett'', ''Boykin'')
		INSERT INTO TempTableName		VALUES (''Bryan'', ''Bulaga'')
		INSERT INTO TempTableName		VALUES (''Morgan'', ''Burnett'')
		INSERT INTO TempTableName		VALUES (''Jarrett'', ''Bush'')
		INSERT INTO TempTableName		VALUES (''Randall'', ''Cobb'')
		INSERT INTO TempTableName		VALUES (''Mason'', ''Crosby'')
		INSERT INTO TempTableName		VALUES (''Mike'', ''Daniels'')
		INSERT INTO TempTableName		VALUES (''John'', ''Kuhn'')
		INSERT INTO TempTableName		VALUES (''Kyle'', ''Adams'')
		INSERT INTO TempTableName		VALUES (''Armando'', ''Allen'')
		INSERT INTO TempTableName		VALUES (''James'', ''Anderson'')
		INSERT INTO TempTableName		VALUES (''Devin'', ''Aromashodu'')
		INSERT INTO TempTableName		VALUES (''Earl'', ''Bennett'')
		INSERT INTO TempTableName		VALUES (''Matt'', ''Blanchard'')
		INSERT INTO TempTableName		VALUES (''Taylor'', ''Boggs'')
		INSERT INTO TempTableName		VALUES (''Jon'', ''Bostic'')
		INSERT INTO TempTableName		VALUES (''Zack'', ''Bowman'')
		INSERT INTO TempTableName		VALUES (''Cory'', ''Brandon'')
		INSERT INTO TempTableName		VALUES (''Lance'', ''Briggs'')
		INSERT INTO TempTableName		VALUES (''Curtis'', ''Brinkley'')
		INSERT INTO TempTableName		VALUES (''Eben'', ''Britton'')
		INSERT INTO TempTableName		VALUES (''James'', ''Brown'')
		INSERT INTO TempTableName		VALUES (''Michael'', ''Bush'')

		DECLARE @id int

		DECLARE mycursor CURSOR FOR SELECT PatronID FROM CircCatAdmin.Patron
		OPEN mycursor
		FETCH NEXT FROM mycursor INTO @id

		WHILE (@@FETCH_STATUS = 0)
		BEGIN
			UPDATE ' + @WorkingDatabaseName + '.CircCatAdmin.Patron
				SET FirstName = (SELECT TOP 1 FirstName FROM TempTableName
								 ORDER BY NEWID()),
				MiddleName = (SELECT TOP 1 FirstName FROM TempTableName
							  ORDER BY NEWID()),
				LastName = (SELECT TOP 1 LastName FROM TempTableName
							ORDER BY NEWID()),
				NickName = NULL,
				SortableNickName = NULL
			WHERE PatronID = @id

			UPDATE ' + @WorkingDatabaseName + '.CircCatAdmin.Patron
				SET SortableFirstName = UPPER(results.FirstName),
				SortableMiddleName = UPPER(results.MiddleName),
				SortableLastName = UPPER(results.LastName),
				LastFirstMiddleName = (results.LastName + '', '' + results.FirstName + '' '' + results.MiddleName)
				FROM (Select FirstName, MiddleName, LastName
					  FROM CircCatAdmin.Patron
					  WHERE PatronID = @id) results
				WHERE PatronID = @id
				
			FETCH NEXT FROM mycursor INTO @id
		END

		CLOSE mycursor
		DEALLOCATE mycursor;

		DROP TABLE TempTableName
	');
	
	EXEC('
		UPDATE  [' + @WorkingDatabaseName + '].[CircCatAdmin].[Patron] SET
			[BirthDate]=GetDate(), [Updated]=GetDate(), 
			[EmailAddress1]=''info@fsc.follett.com'', 
			[EmailAddress2]='''', [GraduationYear]=2014, [PictureName]=''''
	');

	PRINT 'Step 10: Remove or change sensitive data in SitePatron (userfields MUST be null, not empty)';
	
	EXEC('
		UPDATE  [' + @WorkingDatabaseName + '].[CircCatAdmin].[SitePatron]
		SET [Updated]=GetDate(), 
			[UserField1]=null, [UserField2]=null, [UserField3]=null, 
			[UserField4]=null, [UserField5]=null
	'); 

	PRINT 'Step 11: Remove or change sensitive data in Address';
	
	EXEC('
		UPDATE [' + @WorkingDatabaseName + '].[CircCatAdmin].[Address]
		SET [Line1]=''1391 Corporate Drive'', [Line2]='''', [City]=''McHenry'', 
			[State]=''Illinois'', [ZIP]=''60050'', [PrimaryPhone]=''815-344-8700'', 
			[OtherPhone]=''800-323-3397'', [Updated]=GetDate()
	'); 
	
	PRINT 'Step 12: Clear out Patron Notes';
	
	EXEC('	DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].PatronNote'); 

	PRINT 'Step 13: Clear out job';
	
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].Job');

	PRINT 'Step 14: Clear out SIF tables';

	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifEnrollment'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifEventsQueue'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifFutureEventsQueue'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifRefIds'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifRooms'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifSchools'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SifStaffAssignment'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncErrors'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncPendingMatches'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncRooms'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncSchools');
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncStaff'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncStatus'); 
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SyncStudents'); 
	EXEC('
		update  [' + @WorkingDatabaseName + '].[CircCatAdmin].ConfigDistrict
		set FollettShelfDCPIMemberGUID = NULL, FollettShelfID = NULL, FollettShelfSiteName=NULL, OnFollettShelf = 0, IntegratedShelf = 0,
		TitlewaveLogin = NULL, TitlewavePassword = NULL, 
		AspenGUID = NULL, AspenAccessToken = NULL, AspenKey = NULL
	');

	EXEC('
	update  [' + @WorkingDatabaseName + '].[CircCatAdmin].ConfigSite
	set DCPIAccessControlGUID = NULL, DCPIMemberGUID = NULL, 
	FollettShelfSiteName = NULL, FollettShelfDCPIMemberGUID = NULL, FollettShelfID = NULL, 
	TitlewaveLogin = NULL, TitlewavePassword = NULL
	');
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].SecurityKey');
	EXEC('DELETE FROM  [' + @WorkingDatabaseName + '].[CircCatAdmin].DigitalContentListDetail
	');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].BibReview WHERE DCPIRecordGUID IS NOT NULL');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].QuestAudit	WHERE DCPIRecordGUID IS NOT NULL');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ExcludedDcpiCollection');
	
    EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ZSource');
	
	PRINT 'Remove all user created (scheduled) jobs';
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE UserID IS NOT NULL');

	PRINT 'Remove shelf update jobs and user-definable scheduled jobs for services';
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.cataloging.remote.FollettShelfReconciliationJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.DigitalContentProvidersUpdateJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.LexileServiceUpdateJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.WebPathImportJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.AwardWinnersUpdatejob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.MasterQuizUpdateJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.MasterQuizRCUpdateJob'' ');
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobClassName = ''com.follett.fsc.destiny.session.district.remote.FountasUpdateJob'' ');

	PRINT 'Remove job history - XML parameters could refer to deleted ScheduledJob rows';
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].JobSpec');
	
	PRINT 'Remove scheduled jobs that refer to now removed JobSpec records';
	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE JobParameters like ''%<property><name>JobSpecID</name>%'' ');
	

	EXEC('DELETE FROM [' + @WorkingDatabaseName + '].[CircCatAdmin].ScheduledJob WHERE UserID IS NOT NULL');
	
	PRINT 'Step 15: Clear out misc email addresses.'

	EXEC('UPDATE [' + @WorkingDatabaseName + '].[CircCatAdmin].Orders SET [emailaddress]=''info@fsc.follett.com'' where EmailAddress LIKE ''%@%''');
	EXEC('UPDATE [' + @WorkingDatabaseName + '].[CircCatAdmin].NotificationEmail SET [emailaddress]=''info@fsc.follett.com'' where EmailAddress LIKE ''%@%''');

	PRINT 'End Clear Sensitive Data';
    PRINT '====================================================================================================';
    
    FETCH NEXT FROM member_database_cursor INTO @WorkingDatabaseName
  END

  CLOSE member_database_cursor
  DEALLOCATE member_database_cursor

DROP TABLE TempDatabaseNames
GO