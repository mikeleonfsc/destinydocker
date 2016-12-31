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
echo The format for dbupgrade is:
echo.
echo   dbupgrade  CIRC_CAT_ADMIN_LOGIN  CIRC_CAT_ADMIN_PASSWORD  SA_PASSWORD [skipViews] [specificDbName]
echo.
goto :end

:begin

if not %1! == ! SET ANT_OPTS=%ANT_OPTS% -DDB_USER_ARG=%1
if not %2! == ! SET ANT_OPTS=%ANT_OPTS% -DDB_PASSWORD_ARG=%2
if not %3! == ! SET ANT_OPTS=%ANT_OPTS% -DSA_PASSWORD_ARG=%3
if not %4! == ! SET ANT_OPTS=%ANT_OPTS% -DSKIP_VIEWS=%4
if not %5! == ! SET ANT_OPTS=%ANT_OPTS% -DCONSORTIUM_DB_NAME=%5


:defaults

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin
call ant -f utils.xml db-upgrade
popd
goto :end

:end

endlocal
@ECHO ON
