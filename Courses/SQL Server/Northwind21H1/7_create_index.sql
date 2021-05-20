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

/* Syntax:
	1. create a non-clustered index on table_name
		create object_type object_name on table_name(column_name)
		create nonclusterd index index_name on table_name(column_name)
	2. create a clusterd index index_name on table_name
*/

/* retriece index infromation on table Sales.Customer */
execute sp_helpindex 'Sales.Orders'
;
go

/* using the system */
select * 
from sys.indexes
;
go


