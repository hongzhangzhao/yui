drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table DICTIONARIES (
   ID bigint not null,
   TYPE varchar(15),
   TYPE_KEY varchar(15),
   VALUE varchar(128),
   primary key (ID)
);
create table ORDERS (
   ID bigint not null,
   ORDER_NUMBER varchar(15),
   PRICE double precision,
   CUSTOMER_ID bigint not null,
   primary key (ID)
);
create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   SEX char(1),
   `CUSTOMER  DESCRIPTION` text,
   primary key (id)
);
alter table ORDERS add index IDX_CUSTOMER (CUSTOMER_ID), add constraint FK_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS (id);
