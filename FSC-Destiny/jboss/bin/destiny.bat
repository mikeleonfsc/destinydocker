@echo off
rem -------------------------------------------------------------------------
rem JBoss Bootstrap Script for Win32
rem -------------------------------------------------------------------------

if "%1"=="console" goto CONSOLE
if "%1"=="" goto CONSOLE
if "%1"=="register" goto REGISTER
if "%1"=="unregister" goto UNREGISTER
if "%1"=="start" goto START
if "%1"=="stop" goto STOP
if "%1"=="help" goto HELP
if "%1"=="?" goto HELP
if "%1"=="h" goto HELP

:HELP
echo.
echo  Command:           Action:
echo  destiny console    startup Destiny in a command window (default function)
echo  destiny register   Register Destiny as a service
echo  destiny unregister Unregister the Destiny service
echo  destiny start      Start the Destiny service
echo  destiny stop       Stop the Destiny service
goto END

:CONSOLE
start wrapper -c wrapper.conf
goto END

:REGISTER
wrapper -i wrapper.conf
goto END

:UNREGISTER
wrapper -r wrapper.conf
goto END

:START
wrapper -t wrapper.conf
goto END

:STOP
wrapper -p wrapper.conf
goto END

:END

