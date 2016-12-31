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
goto begin

:usage

echo.
echo The format for cpdbcreate is:
echo.
echo   cpdbcreate SA_PASSWORD DATA_DIR LOG_DIR, {LOG_PROP_FILE}
echo     or just: cpdbcreate
echo.
echo   {LOG_PROP_FILE} log4j property file - needed for installer
echo     to log detailed message to a log file
goto :end

:begin

set ANT_OPTS=-DSA_PASSWORD_ARG=%1 -DDATAFILE_DIR_ARG=%2 -DLOGFILE_DIR_ARG=%3 -DLOG_PROP_FILE=%4

:defaults

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin
call ant -f utils.xml cpdb-create
popd

goto :end

:end
endlocal
@ECHO ON
