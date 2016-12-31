@echo off
cd ..
copy .\demo\style.xsl
call transform csvxml .\demo\demopatrons.csv .\demo\demoraw.xml
call transform xmlxml .\demo\demoraw.xml style .\demo\demopatrons.xml
del style.xsl
del style.jar
cd .\demo
echo Opening demopatrons.xml...
pause
start demopatrons.xml