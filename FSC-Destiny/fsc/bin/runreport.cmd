@ECHO off

rem This is a customer batch file that is deployed with the application.

if "%1"=="usage" goto usage
if "%1"=="?" goto usage
if "%1"=="-?" goto usage
if "%1"=="-help" goto usage
if "%1"=="help" goto usage
if "%1"=="-h" goto usage
if "%1a"=="a" goto usage
goto begin

:usage

echo.
echo -------------------------------------------------------
echo Generates one of several specialized reports and places
echo the resulting PDF file in the current directory. 
echo -------------------------------------------------------
echo The destiny-custom.jar must be in the current directory
echo -------------------------------------------------------
echo   Patron Type Summary by Site....... runreport -1     
echo   Unsynced Patron Detail by Site.... runreport -2
echo   Unsynced Patron Summary by Site... runreport -3
echo   Student Summary................... runreport -4
echo   Future Events..................... runreport -5
goto :end

:begin

if exist destiny-custom.jar goto begin1
echo Required file destiny-custom.jar is not in the current directory.
goto end

:begin1
set ANT_OPTS=-DCUSTOM_EXTRACLASSPATH=./destiny-custom.jar;%FSC_DESTINY_HOME%/jboss/server/destiny/deploy/jbossweb-tomcat50.sar/servlet-api.jar;../../jboss/server/destiny/deploy/jbossweb-tomcat50.sar/servlet-api.jar
set ANT_OPTS=%ANT_OPTS% -DCUSTOM_CLASS=com.follett.fsc.destiny.custom.reports.CustomReporter
set ANT_OPTS=%ANT_OPTS% -DCUSTOM_ARGS=%1

:defaults

setlocal
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin;%FSC_DESTINY_HOME%\java\jre\bin
call ant -f utils.xml run-custom
popd
endlocal
goto :end

:end

@ECHO ON
