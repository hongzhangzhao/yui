drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   AGE int, 
   primary key (ID)
);

create table IMAGES(
   ID bigint not null,
   CUSTOMER_ID bigint not null,
   FILENAME varchar(15) not null,
   primary key (ID)
);

alter table IMAGES add index IDX_CUSTOMER(CUSTOMER_ID), add constraint FK_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS(ID);

