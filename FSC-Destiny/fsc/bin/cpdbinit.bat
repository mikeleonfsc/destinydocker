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
if x%2x==xx goto usage

goto begin

:usage

echo.
echo The format for dbinit is:
echo.
echo   cpdbinit SQL_LOGIN, SQL_PASSWORD, {LOG_PROP_FILE}
echo.
echo   {LOG_PROP_FILE} log4j property file - needed for installer
echo     to log detailed message to a log file

goto :end

:begin

set ANT_OPTS=-DDB_USER_ARG=%1 -DDB_PASSWORD_ARG=%2 -DLOG_PROP_FILE=%3

:defaults

set CLASSPATH=

set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin
call ant -f utils.xml cp-db-init


goto :end

:end
endlocal
@ECHO ON
