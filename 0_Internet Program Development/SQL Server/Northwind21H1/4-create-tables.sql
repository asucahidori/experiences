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

-- CREATE NORTHWIND21H1 TABLES 
=====================
/***** Table No. 1 - Sales.Customers ****/
if OBJECT_ID('Sales.Customers','U')
is not null drop table Sales.Customers
create table Sales.Customers
(
	customerid  nchar(5) not null,
	companyname nvarchar(40) not null,
	contactname nvarchar(30) not null,
	contattilte nvarchar(30) not null,
	address     nvarchar(60) not null,
	city        nvarchar(15) not null,
	region      nvarchar(15) not null,
	postalcode  nvarchar(10) not null,
	country     nvarchar(15) not null,
	phone       nvarchar(24) not null,
	fax         nvarchar(24) null,
	constraint pk_customerid primary key(customerid)
);
go

/***** Table No. 2 - Sales.Orders ****/ 
if OBJECT_ID('Sales.Orders','U')
is not null drop table Sales.Orders
create table Sales.Orders
(
	orderid int identity(1,1) not null,
	customerid   nchar(5)     not null,
	employeeid   int          not null,
	orderdate    datetime     not null,
	requireddate datetime     not null,
	shipdate     datetime     null,
	shipvia      int          not null,
	freight      money        not null,
	shipname     nvarchar(40) not null,
	shipaddress  nvarchar(60) not null,
	shipcity     nvarchar(15) not null,
	shipregion   nvarchar(15) not null,
	constraint pk_orderid primary key(orderid)
);
go

/***** Table No. 3 - Production.Products ****/ 
if OBJECT_ID('Production.Products','U')
is not null drop table Production.Products
create table Production.Products
(
	productid int identity(1,1)  not null,
	productname    nvarchar(40)  not null,
	supplierid     int           not null,
	categoryid     int           not null,
	quantityperunit nvarchar(40) null,
	unitprice      decimal(8,2)  null,
	unitsinstock   smallint      null,
	unitsonorder   smallint      null,
	reorderlevel   smallint      null,
	discontinued   bit           not null,
	constraint pk_products primary key(productid)
);
go

/***** Table No. 4 - Sales.[Order Details] ****/ 
if OBJECT_ID('Sales.[Order Details]','U')
is not null drop table Sales.[Order Details]
create table Sales.[Order Details]
(
	OrderID   int identity(1,1)  not null,
	ProductID int not null,
	UnitPrice decimal(5,2)       null,
	Quantity  decimal(5,2)       null,
	Discount  decimal(5,2)       not null,
	constraint pk_OrderDetails primary key(OrderID,ProductID)
);
go

/***** Table No. 5 - Production.Suppliers ****/
if OBJECT_ID('Production.Suppliers','U')
is not null drop table Production.Suppliers
create table Production.Suppliers
(
	SupplierID   int identity (1, 1)   not null,
	CompanyName  nvarchar(50)     not null,
	ContactName  nvarchar(50)     not null,
	ContactTitle nvarchar(30)     not null,
	Address      nvarchar(30)     not null,
	City         nvarchar(10)     not null,
	Region       nvarchar(30)     null,
	PostalCode   nchar(6)         not null,
	Country      nvarchar(10)     not null,
	Phone        nchar(15)        not null,
	Fax          nchar(15)        not null,
	HomePage     nchar(10)        not null
	constraint pk_Suppliers primary key(SupplierID)
);
go
/***** Table No. 6 - Production.Categories ****/ 
if OBJECT_ID('Production.Categories','U')
is not null drop table Production.Categories
create table Production.Categories
(
	CategoryID int identity (1, 1) not null,
	CatagrotyName nvarchar(50)     not null,
	Description   nvarchar(30)     not null,
	Picture       image            null,
	constraint pk_Categories primary key clustered (CategoryID)
);
go
/***** Table No. 7 - Production.Shippers ****/
if OBJECT_ID('Production.Shippers','U')
is not null drop table Production.Shippers
create table Production.Shippers
(
	ShipperID  int identity (1, 1) not null,
	CatagrotyName nvarchar(50)     not null,
	Phone        nchar(15)        not null,
	constraint pk_Shippers primary key clustered (ShipperID)
)
;
go

/***** Table No. 8 - HumanResources.Employees ****/
if OBJECT_ID('HumanResources.Employees','U')
is not null drop table HumanResources.Employees
create table HumanResources.Employees
(
	EmployeeID int identity (1, 1)  not null,
	LastName    nvarchar(35)  not null,
	FirstName   nvarchar(35)  not null,
	Title       nvarchar(35)  not null,
	TitleOfCourtesy nvarchar(20)  not null,
	BirthDate	date not null,
	HireDate	date not null,
	Address	    nvarchar(35)  not null,
	City        nvarchar(35)  not null,
	Region      nchar(2)  null,
	PostalCode  nchar(6)  not null,
	Country     nchar(2)  not null,
	HomePhone   nvarchar(15)  not null,
	Extension   nvarchar(35)  not null,
	Photo       image     not null,
	Notes       nvarchar(20)  not null,
	ReportsTo   int  not null,
	PhotoPath   nvarchar(50)  not null,
	constraint pk_employee primary key clustered (EmployeeID)
);
go
/***** Table No. 9 - HumanResources.Region ****/
if OBJECT_ID('HumanResources.Region','U')
is not null drop table HumanResources.Region
create table HumanResources.Region
(
	RegionID  int  not null,
	RegionDescription nvarchar(50) not null,
	constraint pk_Region primary key clustered(RegionID)
)
;
go
/***** Table No. 10 - HumanResources.Territories ****/
if OBJECT_ID('HumanResources.Territories','U')
is not null drop table HumanResources.Territories
create table HumanResources.Territories
(
	TerritorieID  nvarchar(10)  not null,
	TerritorieDescription nvarchar(50) not null,
	RegionID  int  not null,
	constraint pk_Territories primary key clustered(RegionID)
)
;
go
/***** Table No. 11 - HumanResources.EmployeeTerritories ****/
if OBJECT_ID('HumanResources.EmployeeTerritories','U')
is not null drop table HumanResources.EmployeeTerritories
create table HumanResources.EmployeeTerritories
(
	EmployeeID int    not null,
	TerritorieID  nvarchar(10)  not null,
	constraint pk_EmployeeTerritories primary key clustered(EmployeeID,TerritorieID)
)
;
go

/***** Table No. 12 - Sales.CustomerCustomerDemo ****/
if OBJECT_ID('Sales.CustomerCustomerDemo ','U')
is not null drop table Sales.CustomerCustomerDemo 
create table Sales.CustomerCustomerDemo
(
	CustomerID      int    not null,
	CustomerTypeID  int    not null,
	constraint pk_EmployeeTerritories primary key clustered(CustomerID,CustomerTypeID)
)
;
go

/***** Table No. 13 - Sales.CustomerDemographics ****/
if OBJECT_ID('Sales.CustomerDemographics','U')
is not null drop table Sales.CustomerDemographics
create table Sales.CustomerDemographics
(
	CustomerTypeID  nvarchar(10)    not null,
	CustomerDesc    nvarchar(50)    not null,
	constraint pk_CustomerDemographics primary key clustered(CustomerTypeID)
)
;
go