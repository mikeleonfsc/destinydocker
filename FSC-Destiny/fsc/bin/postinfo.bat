@ECHO OFF

setlocal

if x%1x==x?x goto usage
if x%1x==x-?x goto usage
if x%1x==x-helpx goto usage
if x%1x==xhelpx goto usage
if x%1x==x-hx goto usage


goto begin
:usage

echo.
echo The format for postinfo is:
echo.
echo   postinfo [-sapassword] [-serverlogdate] [-reasoncode]
echo.
echo   This batch file will upload information to Follett Software Company
echo   to help troubleshoot and diagnose and issues you might be having.
echo   e.g., postinfo -sapassword=password -reasoncode="support requested it" -serverlogdate=2008-03-26 
echo.
goto :end

:begin

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin

rem Don't want to use any existing pathing infomation
set path=%FSC_DESTINY_HOME%/ant/bin
call ant -f utils.xml post-info -DARG1=%1 -DARG2=%2 -DARG3=%3 -DARG4=%4 -DARG5=%5 -DARG6=%6 -DARG7=%7 -DARG8=%8
popd
goto :end

:end
endlocal

@ECHO ON
