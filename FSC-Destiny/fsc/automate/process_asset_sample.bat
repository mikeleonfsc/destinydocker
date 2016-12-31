@echo off
setlocal

REM ********************************************************************************
REM * process_assets.bat
REM *
REM * Usage:
REM *
REM * This batch file is designed to be run as a scheduled task.
REM * It must be run in FSC-Destiny\fsc\automate directory.
REM * In order to use this batch file you must place the asset(s) csv file in the 
REM * assetdata folder, along with the asset(s) config file and the asset template
REM * tree that you are importing into.
REM * 
REM * Usage:
REM * By default, no commandline arguments are necessary.
REM * 
REM * 08/01/2012 - Created by Don Lazov @ Follett Software
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
REM * Set your destiny installation directory here (must place files in the assetdata directory)
IF "%SOURCEDIR%"=="" SET SOURCEDIR=G:\FSC-Destiny\fsc\assetdata
REM * Set the name of your CSVFile to transform here
IF "%SOURCEFILE%"=="" SET SOURCEFILE=SampleAssetList.csv
REM * Set the name of your ConfigFile here
IF "%CONFIG%"=="" SET CONFIG=..\assetdata\SampleAssetSoftwareLicense.config

REM OPTIONAL VARIABLES USING DEFAULT VAULES
REM * This creates a default XML output file for importing into destiny
IF "%FINAL%"=="" SET FINAL=..\assetdata\destiny_asset_import_final.xml
REM This creates a copy of your asset CSV file for importing
IF "%TEMPCSVFILE%"=="" SET TEMPCSVFILE=..\assetdata\destiny_assets.csv
REM * This is the full path of your original asset CSV file
IF "%SOURCEFULLFILE%"=="" SET SOURCEFULLFILE=%SOURCEDIR%\%SOURCEFILE%
REM * This creates a log for for logging results of the asset import process
IF "%LOGFILE%"=="" SET LOGFILE=..\automate\process_asset_import.log
REM * This points to the config file for ImportAssets.exe (in the bin folder)
REM * NOTE: This user must have Import asset/items permisssions set!
IF "%UPDATE%"=="" SET UPDATE=.\update_asset_import.properties
REM * Please see online documentation for assetMatching, itemMatching and CSV Encoding criteria using default
IF "%assetMatch%"=="" SET assetMatch=SKIP
IF "%itemMatch%"=="" SET itemMatch=SKIP
IF "%CSVEncoding%"=="" SET CSVEncoding=
REM * This creates a raw data file for processing
IF "%RAWFILE%"=="" SET RAWFILE=..\assetdata\destiny_asset_import.csv


REM ********************************************************************************
REM * START THE LOG FILE
REM ********************************************************************************
echo Asset Import data process beginning %date% %time%   >%LOGFILE%


REM ********************************************************************************
REM * OBTAIN NEW ASSET IMPORT DATA FILE
REM ********************************************************************************
if not exist %SOURCEFULLFILE% goto :nodata
echo Copying Asset Import data file from %SOURCEFULLFILE% to ..\assetdata\%TEMPCSVFILE%   >>%LOGFILE%
copy /Y %SOURCEFULLFILE% %TEMPCSVFILE%   >>%LOGFILE%
SET RAWFILE=%TEMPCSVFILE%


REM ********************************************************************************
REM * KEEP 7 ARCHIVED GENERATIONS OF SOURCE DATA
REM ********************************************************************************
echo Saving %RAWFILE% to destiny_asset_import.001   >>%LOGFILE%
if exist %RAWFILE%.007  del %RAWFILE%.007
if exist %RAWFILE%.006  copy /Y %RAWFILE%.006  %RAWFILE%.007
if exist %RAWFILE%.005  copy /Y %RAWFILE%.005  %RAWFILE%.006
if exist %RAWFILE%.004  copy /Y %RAWFILE%.004  %RAWFILE%.005
if exist %RAWFILE%.003  copy /Y %RAWFILE%.003  %RAWFILE%.004
if exist %RAWFILE%.002  copy /Y %RAWFILE%.002  %RAWFILE%.003
if exist %RAWFILE%.001  copy /Y %RAWFILE%.001  %RAWFILE%.002
if exist %RAWFILE%  copy /Y %RAWFILE% %RAWFILE%.001   >>%LOGFILE%


REM ********************************************************************************
REM * CONVERT ASSETS
REM * AssetImportConverter CSVFile OutputXMLFile ConfigFile [CSV encoding]
REM ********************************************************************************
cd ..\bin
if exist %FINAL%   del %FINAL%
echo Transforming from destiny_asset_import_raw.csv to destiny_asset_import.xml  >>%LOGFILE%
AssetImportConverter %TEMPCSVFILE% %FINAL% %CONFIG%     >>%LOGFILE%
cd ..\automate
if not exist %FINAL% echo ERROR: %FINAL% was not created    >>%LOGFILE%
if not exist %FINAL% GOTO :end
echo Asset data transformed to %FINAL%   >>%LOGFILE%


REM ********************************************************************************
REM * LOAD THE XML DATA TO DESTINY
REM * ImportAssets configurationFile assetFileName assetMatching itemMatching
REM * NOTE: Comment out the following 3 lines if you use the Schedule Import Assets
REM *       from the Destiny application.
REM ********************************************************************************
cd ..\bin
call ImportAssets.exe %UPDATE% %FINAL% %assetMatch% %itemMatch%  >>%LOGFILE%
echo Asset XML upload submitted   >>%LOGFILE%


REM ********************************************************************************
REM Keep 7 archived generations of final files
REM ********************************************************************************
echo Saving destiny_asset_import_final.xml to destiny_asset_import_final.001   >>%LOGFILE%
if exist %FINAL%.007  del %FINAL%.007
if exist %FINAL%.006  copy /Y %FINAL%.006  %FINAL%.007
if exist %FINAL%.005  copy /Y %FINAL%.005  %FINAL%.006
if exist %FINAL%.004  copy /Y %FINAL%.004  %FINAL%.005
if exist %FINAL%.003  copy /Y %FINAL%.003  %FINAL%.004
if exist %FINAL%.002  copy /Y %FINAL%.002  %FINAL%.003
if exist %FINAL%.001  copy /Y %FINAL%.001  %FINAL%.002
if exist %FINAL%  copy /Y %FINAL% %FINAL%.001   >>%LOGFILE%

cd ..\automate
goto :end


:nodata
REM ********************************************************************************
REM * NO ASSET DATA FOUND
REM ********************************************************************************
echo ERROR - No Asset data found in %SOURCEFULLFILE%   >>%LOGFILE%
goto :end


:end
echo Asset data process ended %date% %time%   >>%LOGFILE%
endlocal
REM EoF
