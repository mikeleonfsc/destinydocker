@ECHO OFF

rem This is a customer batch file that is deployed with the application.

setlocal

set CLASSPATH=
set FSC_DESTINY_HOME=..\..

REM  If you change this, you must change ntservice/shutdown

if "%JAVA_HOME%a"=="a" set JAVA_HOME=..\..\java

call ..\..\ant\bin\ant -f utils.xml stop-jboss


endlocal

