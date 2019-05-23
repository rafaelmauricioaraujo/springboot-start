create database PRODUCTSERVICE;

use PRODUCTSERVICE;

create table PRODUCT
(
	ID INT primary key,
    PRODUCT_NAME varchar(25)
);

insert into PRODUCT(ID, PRODUCT_NAME) values (1, 'Honey');
insert into PRODUCT(ID, PRODUCT_NAME) values (2, 'Almond');

select * from PRODUCT;