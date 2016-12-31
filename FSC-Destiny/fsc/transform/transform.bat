@echo off

rem Verify Java is accessible
if not exist ..\..\java\bin\java.exe goto installdir


SET TRANSFORM_TEMPRAW=tempcsv.xml
SET JAVA=..\..\java\bin\java -Xmx256m -Xms256m -Xbootclasspath/p:./lib/xerces.jar;./lib/xalan.jar;./lib/xml-apis.jar -cp .;./%3.jar;./transform.jar;./lib/bsh-1.2b7.jar

if "%1"=="csvxml" goto csvxml
if "%1"=="CSVXML" goto csvxml
if "%1"=="xmlxml" goto xmlxml
if "%1"=="XMLXML" goto xmlxml
if "%1"=="csvxmlxml" goto csvxmlxml
if "%1"=="CSVXMLXML" goto csvxmlxml
if "%1"=="" goto usage
goto usage




:csvxml
rem Check for sufficient number of parameters
if %3.==. goto usage
%JAVA% com.follett.fsc.datautil.Transform CSVXML %2 %3 %4 %5
goto end


:xmlxml
rem Check for sufficient number of parameters
if %4.==. goto usage
if exist %3.jar del %3.jar /q
%JAVA% org.apache.xalan.xsltc.cmdline.Compile -j %3.jar %3.xsl
%JAVA% org.apache.xalan.xsltc.cmdline.Transform %2 %3 >%4
goto end


:csvxmlxml
rem Check for sufficient number of parameters
if %4.==. goto usage
if exist %TRANSFORM_TEMPRAW% del %TRANSFORM_TEMPRAW% /q
%JAVA% com.follett.fsc.datautil.Transform CSVXML %2 %TRANSFORM_TEMPRAW%
%JAVA% org.apache.xalan.xsltc.cmdline.Compile -j %3.jar %3.xsl
%JAVA% org.apache.xalan.xsltc.cmdline.Transform %TRANSFORM_TEMPRAW% %3 >%4
goto end


:installdir
echo Unable to locate ..\..\java\bin\java.exe. 
echo Please make sure this batch file is installed in the following directory:
echo  \FSC-Destiny\fsc\transform
goto end


:usage
cls
echo Transform v2.0
echo Usage:
echo CSVXML - Transform CSV to XML
echo    Transform CSVXML csvInFile xmlOutFile [HEADER] [SEPARATOR]
echo                                                                               .
echo XMLXML - Transform XML using an XSL stylesheet
echo    Transform XMLXML xmlInFile xslStyleNoExtn xmlOutFile
echo                                                                               .
echo CSVXMLXML - Transform CSV to XML using an XSL stylesheet
echo    Transform CSVXMLXML csvInFile xslStyleNoExtn xmlOutFile [HEADER] [SEPARATOR]
echo                                                                               .
echo Notes:
echo    DO NOT INCLUDE the extension (".xsl") on the XSL stylesheet
echo                                                                               .
echo    HEADER values (defaults to HEADER_NONE):
echo       HEADER_FSC     - CSV has FSC Patron export header
echo       HEADER_IGNORE  - CSV header can't be processed - skip it
echo       HEADER_NAMES   - CSV header contains field names
echo       HEADER_NONE    - CSV has no header - process as a data line
echo                                                                               .
echo    SEPARATOR values  - Delimiter character to use. \t=TAB (defaults to comma)
goto end


:end
SET JAVA=
