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
echo  Command:       Action:
echo  destinykeyword console    startup DestinyKeyword in a command window (default function)
echo  destinykeyword register   Register DestinyKeyword as a service
echo  destinykeyword unregister Unregister the DestinyKeyword service
echo  destinykeyword start      Start the DestinyKeyword service
echo  destinykeyword stop       Stop the DestinyKeyword service
goto END

:CONSOLE
start wrapper -c keyword.wrapper.conf
goto END

:REGISTER
wrapper -i keyword.wrapper.conf
goto END

:UNREGISTER
wrapper -r keyword.wrapper.conf
goto END

:START
wrapper -t keyword.wrapper.conf
goto END

:STOP
wrapper -p keyword.wrapper.conf
goto END

:END

