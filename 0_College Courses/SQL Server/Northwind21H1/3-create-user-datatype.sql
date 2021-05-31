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
go -- include end of the batch marker

/* Partial Syntax:
create type [schema_name].type_name
from system_data_type
*/

/* create BusinessAddress data type*/
create type BusinessAddresss
from nvarchar(40) not null
;
go

/* create RegionCode(state or province) data type*/
create type dbo.RegionCode
from nchar(2) null
;
go

/* Create Social Insurance Number data type */
create type SocialInsuranceNo
from nchar(11) not null

/* create contacts table */
create table Person.Contacts  -- drop type RegionCode; go
(
	ContactID nchar(5) ,
	FirstName  nvarchar(15) not null,
	LastName   nvarchar(15) not null,
	SocialNumber SocialInsuranceNo,
	Address  BusinessAddresss,
	Region   RegionCode
)
;
go

/* create contacts table */
create table Person.Contacts  -- drop type RegionCode; go
(
	ContactID nchar(5) ,
	FirstName  nvarchar(15) not null,
	LastName   nvarchar(15) not null,
	SocialNumber SocialInsuranceNo,
	Address  BusinessAddresss,
	Region   RegionCode
)
;
go

/* return the definition of Contacts tables */
execute sp_help 'Person.Contacts'
;
go
