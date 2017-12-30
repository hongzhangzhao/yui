drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);

create table ADDRESSES(
   ID bigint not null,
   STREET varchar(128),
   CITY varchar(128),
   PROVINCE varchar(128),
   ZIPCODE varchar(6),
   primary key (ID)
);

alter table ADDRESSES add index IDX_CUSTOMER(ID), add constraint FK_CUSTOMER foreign key (ID) references CUSTOMERS(ID);

