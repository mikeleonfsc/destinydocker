
FROM microsoft/windowsservercore
RUN NET USER Administrator P@ssword 
RUN ipconfig
#COPY Fsc-destiny c:\Fsc-destiny
 #RUN c:\Fsc-destiny\fsc\bin\rundestiny.bat