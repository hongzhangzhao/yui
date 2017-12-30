drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);
create table ORDERS (
   ID bigint not null,
   ORDER_NUMBER varchar(15),
   CUSTOMER_ID bigint,
   primary key (ID)
);
alter table ORDERS add index IDX_CUSTOMER(CUSTOMER_ID), add constraint FK_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS (ID);

insert into CUSTOMERS(ID,NAME) values(1,'Tom');
insert into CUSTOMERS(ID,NAME) values(2,'Mike');
insert into CUSTOMERS(ID,NAME) values(3,'Jack');
insert into CUSTOMERS(ID,NAME) values(4,'Linda');


insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(1,'Tom_Order001',1);
insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(2,'Tom_Order001',1);
insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(3,'Mike_Order001',2);
insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(4,'Jack_Order001',3);
insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(5,'Linda_Order001',4);
insert into ORDERS(ID,ORDER_NUMBER,CUSTOMER_ID) values(6,'UnknownOrder',null);
