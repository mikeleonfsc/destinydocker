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
if "%2a"=="a" goto usage
goto begin

:usage

echo.
echo The format for StopDestiny is:
echo.
echo   StopDestiny destinyadmin_username destinyadmin_password
echo.
goto :end

:begin

set ANT_OPTS=-DDESTINY_ADMIN_LOGIN=%1 -DDESTINY_ADMIN_PASSWORD=%2

:defaults

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
pushd %FSC_DESTINY_HOME%\jboss\bin

destiny stop

goto :end

:end

endlocal
@ECHO ON
