@ECHO OFF
setlocal

rem This is a customer batch file that is deployed with the application.

if "%1"=="usage" goto usage
if "%1"=="?" goto usage
if "%1"=="-?" goto usage
if "%1"=="-help" goto usage
if "%1"=="help" goto usage
if "%1"=="-h" goto usage
if "%1a"=="a" goto defaults
if "%4a"=="a" goto usage
goto begin

:usage

echo.
echo The format for dbcreate is:
echo.
echo   dbcreate SA_PASSWORD DATA_DIR LOG_DIR NUM_SITES, {LOG_PROP_FILE}
echo     or just: dbcreate
echo.
echo      NUM_SITES is used to preallocate disk space for an efficient database
echo.
echo   {LOG_PROP_FILE} log4j property file - needed for installer
echo     to log detailed message to a log file
goto :end

:begin

set ANT_OPTS=-DSA_PASSWORD_ARG=%1 -DDATAFILE_DIR_ARG=%2 -DLOGFILE_DIR_ARG=%3 -DNUM_SITES_ARG=%4  -DLOG_PROP_FILE=%5

:defaults

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin
call ant -f utils.xml db-create
popd

goto :end

:end
endlocal
@ECHO ON
