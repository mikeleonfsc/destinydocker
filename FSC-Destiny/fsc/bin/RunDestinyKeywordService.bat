@ECHO OFF
setlocal
rem This is a customer batch file that is deployed with the application.

if "%1"=="usage" goto usage
if "%1"=="?" goto usage
if "%1"=="-?" goto usage
if "%1"=="-help" goto usage
if "%1"=="help" goto usage
if "%1"=="-h" goto usage
goto begin

:usage

echo.
echo The format for RunKeywordService is:
echo.
echo   RunKeywordService
echo.
goto :end

:begin

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
pushd %FSC_DESTINY_HOME%\jboss\bin

DestinyKeyword start

goto :end

:end
endlocal
@ECHO ON
