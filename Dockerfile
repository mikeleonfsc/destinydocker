
FROM microsoft/windowsservercore
RUN Net user administrator P@ssword 
COPY Fsc-destiny c:\Fsc-destiny
#RUN c:\Fsc-destiny\fsc\bin\rundestiny.bat
RUN cd Fsc-destiny/jboss/bin
RUN destiny register
RUN destiny start