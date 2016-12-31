@echo off

setlocal

set CLASSPATH=

set path=..\..\ant\bin
set JAVA_HOME=..\..\java
set FSC_DESTINY_HOME=..\..\
SET ANT_HOME=..\..\ant
SET CMDP1=%1
SET CMDP2=%2
SET CMDP3=%3

if .%1==. goto DOIT

:DO_SA
rem Insert SA password into config.properties before running config
ant -f config.xml insertSaPassword
REM does not return

:DOIT
ant -f config.xml encryptDbPassword
REM does not return

endlocal