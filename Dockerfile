
FROM microsoft/windowsservercore
COPY Fsc-destiny c:\Fsc-destiny
 RUN c:\Fsc-destiny\fsc\bin\rundestiny.bat