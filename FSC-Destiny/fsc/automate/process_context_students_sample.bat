@echo off
setlocal

REM ********************************************************************************
REM * process_%CONTEXT%_students.bat
REM *
REM * 08/31/2007 - Created by Don Lazov @ Follett Software dlazov@fsc.follett.com
REM * 09/20/2007 - Fixed the log error on exit.
REM * 10/9/2007 - Fixed all logging issues, added in logic if no patron data changes have been detected
REM * 10/11/2007 - Added start times to the log, added 7 generations of archives for log files
REM * 11/15/2007 - Changed the path from the bin folder to the patdata folder and added new expansion variables
REM * 01/18/2008 - Added the new command line parameters for updatepatrons.exe per development changes:
REM *              updatepatrons.exe <properties file> <xml file>
REM * 01/28/2008 - Fixed the NOLOAD function to check prior to running updatepatrons.exe.
REM * 02/15/2008 - Added archiving of the sorted xml and the final xml files for 7 generations.
REM * 04/29/2008 - Added CONTEXT variable for processes set up for consortium members. Change the other expansion
REM *              variables as needed for the member (i.e. file names...process_<context>_students.bat;
REM *              destiny_<context>_students.xml, etc...)
REM * 07/08/2008 - Tested and updated for Destiny 8.5 rc8
REM * 09/29/2008 - Added the removable of the delta file after running the NOCOMPARE
REM * 10/03/2008 - Changed the NOCOMPARE to delete the delta file and also create a new delta for next run.
REM * 10/14/2008 - Added the /Y to the copy command to supress the warning and overwrite the file anyway.
REM * 11/14/2008 - Removed the deletion of the wild card delta file and used full name of delta file.
REM * 01/12/2009 - Fixed the deletion of the delta file.
REM * 02/24/2009 - Fixed the copying of the CSV file to now have the context name.
REM * 08/19/2009 - Customized for South Carolina Dept of Ed. - DGL
REM * 08/20/2009 - Set the above customization as the default standard for all consortium installations. - DGL
REM * 10/26/2009 - AB (Development) - Modified the batch file to allow for environment
REM *                      settings instead of passing in the variables.
REM * 10/07/2010 - AB (Development) - Modified based on changes requested from technical support for JTRAC: DESTINY-1705
REM *
REM * This batch file is designed to be run as a scheduled task.
REM *
REM * Usage:
REM * By default, no commandline arguments are necessary.
REM * 
REM * Valid commandline syntax is:
REM * 
REM *  process_context_students [intputfile] [NOCOMPARE] [NOLOAD]
REM * 
REM * inputfile - Name of an alternate input file to process. Must be first argument.
REM *             (Must not be one of the destiny_ archive files. They are renamed during this process).
REM * NOCOMPARE - Don't run a delta compare (Process the full file)
REM * NOLOAD    - Perform all preprocessing but don't load into Destiny
REM *  
REM ********************************************************************************


REM ********************************************************************************
REM * CUSTOMER-SPECIFIC CONFIGURATION: SET DEFAULT GLOBAL VALUES
REM *
REM * Set the following expansion varablies as needed 
REM * (can be remote if this job is run as a user with rights to the remote server)
REM *
REM ********************************************************************************
REM REQUIRED VARIABLES

IF "%SOURCEDIR%"=="" SET SOURCEDIR=E:\ftproot\follett
IF "%SOURCEFILE%"=="" SET SOURCEFILE=students.csv
IF "%CONTEXT%"=="" SET CONTEXT=

REM OPTIONAL VARIABLES USING DEFAULT VAULES
IF "%SOURCEFULLFILE%"=="" SET SOURCEFULLFILE=%SOURCEDIR%\%SOURCEFILE%
IF "%LOGFILE%"=="" SET LOGFILE=..\automate\%CONTEXT%\process_%CONTEXT%_students.log
IF "%FINAL%"=="" SET FINAL=..\patdata\%CONTEXT%\destiny_%CONTEXT%_students.xml
IF "%PROP%"=="" SET PROP=.\%CONTEXT%\map_%CONTEXT%_students.properties
IF "%UPDATE%"=="" SET UPDATE=.\%CONTEXT%\update_%CONTEXT%_students.properties
IF "%SORTED%"=="" SET SORTED=..\patdata\%CONTEXT%\sorted_%CONTEXT%_students.csv
IF "%NOCHGXML%"=="" SET NOCHGXML=..\patdata\destiny_students_nochange.xml
IF "%NOCHGUPD%"=="" SET NOCHGUPD=.\%CONTEXT%\update_%CONTEXT%_no_change.properties
IF "%RAWFILE%"=="" SET RAWFILE=..\patdata\destiny_%CONTEXT%_students.csv

REM ********************************************************************************
REM * ONLY USE IF MULITPLE COPIES OF THE CSV FILE CONTAIN THE SAME OUTPUT
REM * (Uncomment the below lines if needed)
REM ********************************************************************************
REM cd %SOURCEDIR%
REM copy /Y *.csv students.csv
REM SET SOUREFILE=students.csv
REM SET SOURCEFULLFILE=%SOURCEDIR%\%SOURCEFILE%
REM cd ..\FSC-Destiny\fsc\automate

REM ********************************************************************************
REM * START THE LOG FILE
REM ********************************************************************************
echo Patron data process beginning %date% %time%   >%LOGFILE%


REM ********************************************************************************
REM * PROCESS COMMANDLINE ARGUMENTS
REM ********************************************************************************
SET NOCOMPARE=FALSE
SET NOLOAD=FALSE

REM Process the first argument which can be NOLOAD, NOCOMPARE, otherwise an override filename
if "%1"=="NOCOMPARE" SET NOCOMPARE=TRUE
if "%1"=="nocompare" SET NOCOMPARE=TRUE
if "%1"=="NOLOAD"    SET NOLOAD=TRUE
if "%1"=="noload"    SET NOLOAD=TRUE

REM If the first argument was NOLOAD or NOCOMPARE, then it wasn't a filename
if "%NOCOMPARE%"=="TRUE" goto AFTER_ARG1
if "%NOLOAD%"=="TRUE" goto AFTER_ARG1

REM Otherwise arg1 was a filename
if not "%1"=="" SET SOURCEFULLFILE=%1
if not "%1"=="" echo Override inputfile specified as %SOURCEFULLFILE%   >>%LOGFILE%


REM ********************************************************************************
REM * AFTER THE ARGS ARE PASSED IN CHECK AND LOG THEM
REM ********************************************************************************
:AFTER_ARG1
if "%2"=="NOCOMPARE" SET NOCOMPARE=TRUE
if "%3"=="NOCOMPARE" SET NOCOMPARE=TRUE
if "%2"=="NOLOAD"    SET NOLOAD=TRUE
if "%3"=="NOLOAD"    SET NOLOAD=TRUE
if "%2"=="nocompare" SET NOCOMPARE=TRUE
if "%3"=="nocompare" SET NOCOMPARE=TRUE
if "%2"=="noload"    SET NOLOAD=TRUE
if "%3"=="noload"    SET NOLOAD=TRUE
if "%NOCOMPARE%"=="TRUE" echo NOCOMPARE specified   >>%LOGFILE%
if "%NOLOAD%"=="TRUE" echo NOLOAD specified   >>%LOGFILE%


REM ********************************************************************************
REM * OBTAIN NEW PATRON DATA FILE
REM ********************************************************************************
if not exist %SOURCEFULLFILE% goto NO_DATA
echo Copying patron data file from %SOURCEFULLFILE% to ..\patdata\destiny_%CONTEXT%_students.csv   >>%LOGFILE%
copy /Y %SOURCEFULLFILE% %RAWFILE% >>%LOGFILE%
cd ..\bin


REM ********************************************************************************
REM * KEEP 7 ARCHIVED GENERATIONS OF SOURCE DATA
REM ********************************************************************************
echo Saving %RAWFILE% to %RAWFILE%.001 >>%LOGFILE%
if exist %RAWFILE%.007  del %RAWFILE%.007
if exist %RAWFILE%.006  copy /Y %RAWFILE%.006  %RAWFILE%.007
if exist %RAWFILE%.005  copy /Y %RAWFILE%.005  %RAWFILE%.006
if exist %RAWFILE%.004  copy /Y %RAWFILE%.004  %RAWFILE%.005
if exist %RAWFILE%.003  copy /Y %RAWFILE%.003  %RAWFILE%.004
if exist %RAWFILE%.002  copy /Y %RAWFILE%.002  %RAWFILE%.003
if exist %RAWFILE%.001  copy /Y %RAWFILE%.001  %RAWFILE%.002
if exist %RAWFILE%  copy /Y %RAWFILE% %RAWFILE%.001   >>%LOGFILE%


REM ********************************************************************************
REM * SKIP THE COMPARE?
REM ********************************************************************************
if "%NOCOMPARE%"=="FALSE" goto BEGIN_COMPARE
echo Skipping the delta compare   >>%LOGFILE%
cd ..\patdata
echo Deleting the delta file...   >>%LOGFILE%
del %SORTED%.delta
cd ..\bin
goto BEGIN_COMPARE


REM ********************************************************************************
REM * SORT AND CONVERT THEM
REM ********************************************************************************
:BEGIN_COMPARE
echo Sorting patron data...   >>%LOGFILE%
patronimportconverter.exe %RAWFILE% %SORTED%  /d   >>%LOGFILE%
echo Checking if no changes...   >>%LOGFILE%
if not exist %SORTED% goto NO_DELTA
echo Converting patron data...   >>%LOGFILE%
patronimportconverter.exe %SORTED% %FINAL% %PROP%   >>%LOGFILE%
if "%NOLOAD%"=="TRUE" goto NOLOAD
echo Updating patron data...   >>%LOGFILE%
updatepatrons.exe %UPDATE% %FINAL% %CONTEXT%  >>%LOGFILE%
echo Patron data upload submitted...   >>%LOGFILE%
goto end


REM ********************************************************************************
REM * NO PATRON DATA CHANGE
REM ********************************************************************************
:NO_DELTA
echo Updating patron data with no changes...   >>%LOGFILE%
if "%NOLOAD%"=="TRUE" goto NOLOAD
updatepatrons.exe %NOCHGUPD% %NOCHGXML% %CONTEXT%  >>%LOGFILE%
echo Patron data upload submitted...   >>%LOGFILE%
goto end


:NOLOAD
REM ********************************************************************************
REM * SKIP THE LOAD INTO DESTINY?
REM ********************************************************************************
if "%NOLOAD%"=="TRUE" echo Skipping load into Destiny   >>%LOGFILE%
goto end


REM ********************************************************************************
REM * NO PATRON DATA FOUND
REM ********************************************************************************
:NO_DATA
echo ERROR - No Patron data found in %SOURCEFULLFILE%   >>%LOGFILE%
goto :end


:end
echo Patron data process ended %date% %time%   >>%LOGFILE%
echo >>%LOGFILE%

REM ********************************************************************************
REM KEEP 7 ARCHIVED GENERATIONS OF SORTED FILES
REM ********************************************************************************
echo Saving %SORTED% to sorted_students.csv.001   >>%LOGFILE%
if exist %SORTED%.007  del %SORTED%.007
if exist %SORTED%.006  copy /Y %SORTED%.006  %SORTED%.007
if exist %SORTED%.005  copy /Y %SORTED%.005  %SORTED%.006
if exist %SORTED%.004  copy /Y %SORTED%.004  %SORTED%.005
if exist %SORTED%.003  copy /Y %SORTED%.003  %SORTED%.004
if exist %SORTED%.002  copy /Y %SORTED%.002  %SORTED%.003
if exist %SORTED%.001  copy /Y %SORTED%.001  %SORTED%.002
if exist %SORTED%  copy /Y %SORTED% %SORTED%.001   >>%LOGFILE%


REM ********************************************************************************
REM KEEP 7 ARCHIVED GENERATIONS OF FINAL FILES
REM ********************************************************************************
echo Saving %FINAL% to destiny_students.xml.001   >>%LOGFILE%
if exist %FINAL%.007  del %FINAL%.007
if exist %FINAL%.006  copy /Y %FINAL%.006  %FINAL%.007
if exist %FINAL%.005  copy /Y %FINAL%.005  %FINAL%.006
if exist %FINAL%.004  copy /Y %FINAL%.004  %FINAL%.005
if exist %FINAL%.003  copy /Y %FINAL%.003  %FINAL%.004
if exist %FINAL%.002  copy /Y %FINAL%.002  %FINAL%.003
if exist %FINAL%.001  copy /Y %FINAL%.001  %FINAL%.002
if exist %FINAL%  copy /Y %FINAL% %FINAL%.001   >>%LOGFILE%


REM ********************************************************************************
REM * KEEP 7 ARCHIVED GENERATIONS OF THE LOG FILES
REM ********************************************************************************
echo Saving %LOGFILE% to process_students.log.001   >>%LOGFILE%
if exist %LOGFILE%.007  del %LOGFILE%.007
if exist %LOGFILE%.006  copy /Y %LOGFILE%.006  %LOGFILE%.007
if exist %LOGFILE%.005  copy /Y %LOGFILE%.005  %LOGFILE%.006
if exist %LOGFILE%.004  copy /Y %LOGFILE%.004  %LOGFILE%.005
if exist %LOGFILE%.003  copy /Y %LOGFILE%.003  %LOGFILE%.004
if exist %LOGFILE%.002  copy /Y %LOGFILE%.002  %LOGFILE%.003
if exist %LOGFILE%.001  copy /Y %LOGFILE%.001  %LOGFILE%.002
if exist %LOGFILE%  copy /Y %LOGFILE% %LOGFILE%.001   >>%LOGFILE%

cd ..\automate
echo EOF >>%LOGFILE%
endlocal
REM EoF