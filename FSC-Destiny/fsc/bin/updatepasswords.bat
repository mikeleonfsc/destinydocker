@ECHO OFF

setlocal
rem This is a customer batch file that is deployed with the application.

if x%1x==xx goto usage
if x%1x==x?x goto usage
if x%1x==x-?x goto usage
if x%1x==x-helpx goto usage
if x%1x==xhelpx goto usage
if x%1x==x-hx goto usage
if NOT x%1x==xx set ANT_OPTS=-DSA_PASSWORD_ARG=%1
if NOT x%2x==xx set ANT_OPTS=%ANT_OPTS% -DSQL_PASSWORD=%2
if NOT x%3x==xx set ANT_OPTS=%ANT_OPTS% -DSQL_LOGIN=%3
if x%3x==xx set ANT_OPTS=%ANT_OPTS% -DSQL_LOGIN=CircCatAdmin
set ANT_OPTS=%ANT_OPTS% -DCONSORTIUM_DB_NAME=%4
goto begin

:usage

echo.
echo The format for updatepasswords is:
echo.
echo   updatepasswords [^<SA_PASSWORD^>][^<CircCatAdmin_PASSWORD^>][^<CircCatAdmin^>]
echo.
echo   This batch file will update the password of your CircCatAdmin user in the 
echo      Destiny database. It will also set readonyluser passwords in the Destiny
echo      database to the values configured in your config.properties.
echo.
echo   NOTE: it will NOT write the new CircCatAdmin password value to config.properties. 
echo      You must do this AND run config.bat to prepare the system.
echo.
echo   If you do not supply both SA_PASSWORD and CircCatAdmin_PASSWORD, you will be 
echo      prompted for them.
echo.
echo   If you do not supply CircCatAdmin username for Destiny database, the 
echo      default value of "CircCatAdmin" will be used.
echo.
goto :end

:begin

set CLASSPATH=
set FSC_DESTINY_HOME=..\..
set JAVA_HOME=%FSC_DESTINY_HOME%\java
pushd %FSC_DESTINY_HOME%\fsc\bin

rem Don't want to use any existing pathing infomation
set path=%FSC_DESTINY_HOME%/ant/bin

call ant -f utils.xml db-update-passwords
popd
goto :end

:end
endlocal

@ECHO ON
