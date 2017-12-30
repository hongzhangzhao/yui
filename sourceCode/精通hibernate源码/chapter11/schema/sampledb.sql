drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   AGE int,
   primary key (ID)
);
create table ORDERS (
   ID bigint not null,
   ORDER_NUMBER varchar(15),
   PRICE DECIMAL(10,2),
   CUSTOMER_ID bigint,
   primary key (ID)
);
alter table ORDERS add index FK8B7256E516B4891C (CUSTOMER_ID), add constraint FK8B7256E516B4891C foreign key (CUSTOMER_ID) references CUSTOMERS (ID);

insert into CUSTOMERS(ID,NAME,AGE) values(1,'Tom',21);
insert into CUSTOMERS(ID,NAME,AGE) values(2,'Mike',24);
insert into CUSTOMERS(ID,NAME,AGE) values(3,'Jack',30);
insert into CUSTOMERS(ID,NAME,AGE) values(4,'Linda',25);
insert into CUSTOMERS(ID,NAME,AGE) values(5,'Tom',25);


insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(1,'Tom_Order001',100,1);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(2,'Tom_Order002',200,1);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(3,'Tom_Order003',300,1);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(4,'Mike_Order001',100,2);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(5,'Jack_Order001',200,3);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(6,'Linda_Order001',100,4);
insert into ORDERS(ID,ORDER_NUMBER,PRICE,CUSTOMER_ID) values(7,'UnknownOrder',200,null);

