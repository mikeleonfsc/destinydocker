@ECHO OFF

setlocal
rem This is a customer batch file that is deployed with the application.

if x%1x==x?x goto usage
if x%1x==x-?x goto usage
if x%1x==x-helpx goto usage
if x%1x==xhelpx goto usage
if x%1x==x-hx goto usage
set ANT_OPTS=%ANT_OPTS% -DSERVERLOG_FILE=%1
goto begin

:usage

echo.
echo The format for indexcompare is:
echo.
echo   indexcompare
echo.
echo   This batch file will compare actual Destiny db indices against the expected indices
echo   which were generated at original DB creation.
echo.
goto :end

:begin

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin

rem Don't want to use any existing pathing infomation
set path=%FSC_DESTINY_HOME%/ant/bin

call ant -f utils.xml index-compare
popd
goto :end

:end
endlocal

@ECHO ON
