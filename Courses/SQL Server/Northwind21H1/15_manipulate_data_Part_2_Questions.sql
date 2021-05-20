/* Manipulate data in the Northwind database 
Script Date: February 15, 2021
Developed by: Li Wang
*/

/* add a statement that specifies the script runs in the context of the master database */

-- switch to Northwind database 
use NorthWind21H1
;
go -- include end of batch markers (go statement)

/* Partial syntax:
select <select_list< [ into new_table]
[From object_name]
[Where search_condition]
[Group by group_by_condition]
[Having search_condition]
[Order by oreder_expression [asc] | [desc] ]
*/

/* 
1) Read the question
2) find the object(s) - table or a view that answer your question
3) list the column(s) - fields from each object
4) define the criteria(s) 
5) run one criteria after another
*/

/* Example 11
Suppose that you want to select a list of countries where Northwind suppliers are located. Create this view and save it as vDistinctSuppliersCountry. 
*/
create view vDistinctSuppliersCountry
as
select 
	   S.SupplierID   as 'Supplier ID',	
	   S.CompanyName  as 'Supplier names',
	   S.Address      as 'Supplier address',
	   S.City         as 'City     names',
	   S.Region       as 'Region   names',
	   S.PostalCode   as 'Postal   Code',
	   S.Country      as 'Country  names'
from   Production.Suppliers as S
;
go


/* Example 12
Suppose you remember that a customer's company name starts with "The", but you can't remember the rest of the name. Find all the company names starting with "The". Create this view and save it as 12_vCompanyNameStartingWithThe.
*/
create view vCompanyNameStartingWithThe
as
select 
	   S.SupplierID   as 'Supplier ID',	
	   S.CompanyName  as 'Supplier names',
	   S.Address      as 'Supplier address',
	   S.City         as 'City     names',
	   S.Region       as 'Region   names',
	   S.PostalCode   as 'Postal   Code',
	   S.Country      as 'Country  names'
from   Production.Suppliers as S
where  S.CompanyName like 'The%'
;
go

/* Example 13
Create a view that returns the employee id, employee full name, full address, home phone, and extension. Save this view as 13_vEmployeeFullName.
*/
create view vEmployeeFullName
as
select 
	   E.EmployeeID                                                    as 'Supplier ID',	
	   CONCAT_WS(' ',E.FirstName,E.LastName)                           as 'employee full name',
	   CONCAT_WS(',',E.Address,E.City,E.Region,E.Country,E.PostalCode) as 'employee full address',
	   E.HomePhone                                                     as 'employee Home Phone',
	   E.Extension                                                     as 'employee extension'
from   HumanResources.Employees as E
;
go

/*
calculated_field_name:expression
EmployeeName:[First Name] & " " & [LastName] as "Employee"

Example 14
Suppose you want to find out what all your confection products (CategoryID = 3) would cost if you raised price by 25 percent. Add a calculated field and name it NewPrice. Create this view and save it as 14_vNewPriceForConfectionProducts. 
*/
/* => create a function ....*/
create view vNewPriceForConfectionProducts
as
select 
	   P.productid			as 'Product ID',
	   P.productname		as 'Product Name',
	   P.unitprice * 1.25   as 'Product Unit Price'	   
from   Production.Products as P
where  CategoryID = 3
;
go

/* Example 15
Suppose you want to calculate the total number of Northwind products. Create this view and save it as 15_vTotalNumberOfProducts. 
*/ 
create view vTotalNumberOfProducts
as
select count(P.productid)  as  'The total number of Northwind products'	   
from   Production.Products as  P
group by P.productid
;
go

/* Example 16
Suppose you want to find the total number of product ordered that come from each supplier (company name). Create this view and save it as 16_vTotalNumberOfProductsFromEachSupplier. 
*/ 
create view vTotalNumberOfProductsFromEachSupplier
as
select 
	   count(OD.productid)   as 'The total number of product ordered',
	   S.CompanyName		 as 'Supplier name'	   
from   Sales.[Order Details] as OD
	inner join  Production.Products  as  P
		ON OD.ProductID = P.productid
	inner join  Production.Suppliers as  S
		ON S.SupplierID = P.supplierid
group by (P.supplierid)
-- order by count(P.productid) desc
;
go

/* Example 17
How many products each category (category Name) contains. Create this view and save it as 17_vTotalNumberOfProductsPerCategory.
*/
create view vTotalNumberOfProductsPerCategory
as
select 
	   count(P.productid)    as 'The total number of product',
	   C.CatagrotyName		 as 'Category Name'	   
from   Production.Products   as  P
	inner join  Production.Categories   as  C
		ON P.categoryid = C.CategoryID
group by P.categoryid,C.CatagrotyName
;
go

/* Example 18
What is the perecentage of UnitsInStock comparing to UnitsOnOrder. Create this view and save it as 18_vUnitPercentage.
*/
create view vUnitPercentage
as
select 
	   P.unitsonorder / (P.unitsinstock + P.unitsonorder)  as  'The perecentage of UnitsInStock comparing to UnitsOnOrder',
	   P.productname									   as  'Product name'
from   Production.Products   as  P
-- order by P.productname asc
where (P.unitsonorder != 0 )
;
go

/* Example 19
Find the ten most expensive products. Create this view and save it as 19_vTenMostExpensiveProducts.
*/
create view vTenMostExpensiveProducts
as
select top(10) with ties P.productname, P.unitprice
from Production.Products   as  P
-- order by unitprice desc
;
go

/* Example 20
calculate the subtotal of each order. Create this view and save it as 20_vOrderSubtotal.
Subtotal = unit price x quantity - discount
*/
create view Sales.vOrderSubtotal
as
select 
	   OD.OrderID                                        as 'Order ID',
	   (P.unitprice * OD.Quantity) * (1 - OD.Discount)   as 'The subtotal of each order' 	   
from   Sales.[Order Details] as OD
	inner join  Production.Products  as  P
		ON OD.ProductID = P.productid
;
go


select * 
from ....
where
;
go