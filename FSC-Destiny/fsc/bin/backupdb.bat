@echo off

rem backupdb.bat should only be used under the direction of Follett Software.
rem It is intended to backup and sanatize customer data before sending that data to Follett Software for testing purposes.

setlocal

if %1.==. goto usage
if %1.==?. goto usage
if %1.==-?. goto usage
if %1.==-help. goto usage


rem Build command line arguments for utility
:loop
if %1.==. goto exit
  set /A counter += 1
  set ANT_OPTS=%ANT_OPTS% -DARG%counter%=%1
  shift
  goto loop
:exit


set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java

pushd %FSC_DESTINY_HOME%\fsc\bin

rem Don't want to use any existing pathing infomation
set path=%FSC_DESTINY_HOME%/ant/bin

call ant -f utils.xml archive-destiny-database

popd
goto end

:usage
echo BackupDB
echo .
echo Usage: BackupDB mode params
echo   mode = one or more of the following:
echo     -backup (backup and compress db and resources -- required)
echo     -clean  (backup, clean backup, and compress db and resources)
echo     -send   (send backup, restarting if needed, via FTP)
echo     -sendentire (send entire backup via FTP)
echo   params = one or more of the following pairs in any order:
echo     -saPassword password (required)
echo     -dbName name (database to process -- required)
echo     -backupFolder dir (folder to store db backup)
echo.
echo Notes: -clean requires specifying -backup
echo        -send and -sendentire requires specifying -backup or -backup -clean
goto :end


:end
endlocal
