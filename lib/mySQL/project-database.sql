-- create table registerProduct (
-- 	id int primary key,
--     productAmount int,
--     productName varchar(250),
--     productCategory varchar(30),
--     purchaseValue numeric,
-- 	saleValue numeric,
--     productRegisterDate date

-- );

-- this table is not being used

create table registerProduct (
    id varchar(30) primary key,
    productAmount varchar(30),
    productName varchar(250),
    productCategory varchar(30),
    purchaseValue varchar(30),
    saleValue varchar(30),
    productRegisterDate date

);