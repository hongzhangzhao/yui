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
   PRICE double precision,
   CUSTOMER_ID bigint,
   primary key (ID)
);
alter table ORDERS add index IDX_CUSTOMER(CUSTOMER_ID), 
add constraint FK_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS (ID); 
