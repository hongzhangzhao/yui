drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CATEGORIES(
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);

create table ITEMS(
  ID bigint not null,
  NAME varchar(15),
  BASE_PRICE double precision,
  primary key(ID)
);

create table CATEGORY_ITEM(
  POSITION bigint not null,
  CATEGORY_ID bigint not null,
  ITEM_ID bigint not null,
  primary key(POSITION,CATEGORY_ID)
);

alter table CATEGORY_ITEM add index IDX_CATEGORY(CATEGORY_ID), 
add constraint FK_CATEGORY foreign key (CATEGORY_ID) references CATEGORIES(ID);

alter table CATEGORY_ITEM add index IDX_ITEM(ITEM_ID), 
add constraint FK_ITEM foreign key (ITEM_ID) references ITEMS(ID);
