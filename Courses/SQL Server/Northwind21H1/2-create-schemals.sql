/* Purpose : create the database Northwind21H1
	Script Date: February 5, 2021
	Developed by : W.L
*/

/* add a statement that specifieds the script
runs in the context of the master database */

-- switch to the master database
-- user database_name

use Northwind21H1
;
go

/* partial Syntax:
create schema  schema_name 
*/

/* create schema and set the owner to each of them
1. Sales
2. Production
3. Human Resours
4. person
*/

-- 1) create Person schema
create schema Person authorization dbo
;
go

-- 2) create Production schema
create schema Production authorization dbo
;
go

-- 3) create Human Resources schema
create schema HumanResources authorization dbo
;
go

-- 4) create Sales schema
create schema Sales authorization dbo
;
go



