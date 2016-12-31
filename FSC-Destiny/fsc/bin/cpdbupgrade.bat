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
echo   cpdbupgrade CIRC_CAT_ADMIN_LOGIN  CIRC_CAT_ADMIN_PASSWORD  SA_PASSWORD [consortiumContext]
echo.
goto :end

:begin

if not %1! == ! set ANT_OPTS=-DDB_USER_ARG=%1
if not %2! == ! set ANT_OPTS=%ANT_OPTS% -DDB_PASSWORD_ARG=%2
if not %3! == ! set ANT_OPTS=%ANT_OPTS% -DSA_PASSWORD_ARG=%3
SET ANT_OPTS=%ANT_OPTS% -DDESTINY_CONSORTIUM_CONTEXT=%4

:defaults

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin
set path=%FSC_DESTINY_HOME%\ant\bin
call ant -f utils.xml cp-db-upgrade
popd
goto :end

:end

endlocal
@ECHO ON
