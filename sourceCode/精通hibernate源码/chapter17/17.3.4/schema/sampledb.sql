drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table ORDERS(
   ID bigint not null,
   ORDER_NUMBER varchar(15),
   primary key (ID)
);

create table ITEMS(
  ID bigint not null,
  NAME varchar(15),
  BASE_PRICE double precision,
  primary key(ID)
);

create table LINEITEMS(
  ID bigint not null,
  ORDER_ID bigint not null,
  ITEM_ID bigint not null,
  BASE_PRICE double precision,
  QUANTITY  int,
  primary key(ID)
);

alter table LINEITEMS add index IDX_ORDER(ORDER_ID), 
add constraint FK_ORDER foreign key (ORDER_ID) references ORDERS(ID);

alter table LINEITEMS add index IDX_ITEM(ITEM_ID), 
add constraint FK_ITEM foreign key (ITEM_ID) references ITEMS(ID);
