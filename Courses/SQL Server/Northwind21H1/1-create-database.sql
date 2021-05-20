/* Purpose : create the database Northwind21H1
	Script Date: February 5, 2021
	Developed by : W.L
*/

/* add a statement that specifieds the script
runs in the context of the master database */

-- switch to the master database
-- user database_name
use master
;
go -- include end of the batch marker

/* Partial syntax to create a database
create object_type object_name
create database database_name
*/

-- create Northwind21H1 database
create database Northwind21H1
on primary -- main data file
(
	-- 1) row data logical filename
	name = 'Northwind21H1',
	-- 2)row data initial file size
	size = 12MB, 
	-- 3) rows data auto growth size
	filegrowth = 10MB,
	-- 4) rows data maximum file size
	maxsize = 500MB, -- unlimited
	-- 5) rows data path and file name
	FILENAME = 'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Northwind21H1.mdf'
)
log on  -- log.file
(
	-- 1) log logical filename
	name = 'Northwind21H1_log',
	-- 2) log initial file size (1/4 of data file size)
	size = 3MB,
	-- 3) log auto growth size
	filegrowth = 10%,
	-- 4) log maximum file size
	maxsize = 25MB,
	-- 5) log path and file name
	filename = 'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Northwind21H1_log.ldf'
)
;
go

/* return information about the Northwind database using
system stored procedure.

Syntax:
exec(ute) procedure_name

execute(ute) procedure_name
;
*/

execute sp_helpdb 'Northwind21H1'
;
go

/* increase the maxsize of the Northwind21H1_log
to 100MB
*/

-- switch to the master database
use master;
go

alter database Northwind21H1
	modify file
	( 
		name = 'Northwind21H1_log',
		maxsize = 100MB
	)
;
go

/* return the SQL Server version we are running */
select @@VERSION -- @@
;
go

/* using some of system function */
/* return the connection,database context, and
   server information */
 select
	user_name() as 'User Name',  -- '' or []
	DB_NAME()   as 'Database Name',
	@@SERVERNAME as 'Server Name'
;
go



