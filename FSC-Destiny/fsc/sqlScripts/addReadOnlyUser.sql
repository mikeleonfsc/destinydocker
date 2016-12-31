
-- run as sa

-- Add SQL user for destiny database
-- user name "readonlyuser" with password "readonly"

use [destiny]
go

if not exists (select * from master.dbo.syslogins where loginname LIKE N'readonlyuser')
BEGIN
   exec sp_addlogin 'readonlyuser', 'readonly', 'destiny';
END

go
sp_grantdbaccess 'readonlyuser', 'readonlyuser'
go
sp_addrolemember 'db_datareader', 'readonlyuser'
go
sp_change_users_login 'auto_fix', 'readonlyuser'
go
