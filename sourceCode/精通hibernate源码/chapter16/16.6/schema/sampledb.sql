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
  CUSTOMER_ID bigint not null,
  IMAGE_NAME varchar(15) not null,
  FILENAME varchar(15) not null,
  SIZEX int not null,
  SIZEY int not null,
  primary key (CUSTOMER_ID,IMAGE_NAME,FILENAME,SIZEX,SIZEY)
);


alter table IMAGES add index IDX_CUSTOMER(CUSTOMER_ID), add constraint FK_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS(ID);

