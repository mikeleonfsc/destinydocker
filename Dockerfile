
FROM microsoft/windowsservercore
RUN NET USER mike "P@ssword" /add
RUN NET LOCALGROUP Administrators /add mike
RUN ipconfig
#COPY Fsc-destiny c:\Fsc-destiny
 #RUN c:\Fsc-destiny\fsc\bin\rundestiny.bat