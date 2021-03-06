alter table ORDERS drop foreign key FK8B7256E516B4891C;
drop table if exists CUSTOMERS;
drop table if exists ORDERS;
create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15) not null,
   STREET varchar(128),
   CITY varchar(128),
   PROVINCE varchar(128),
   ZIPCODE varchar(6),
   primary key (ID)
);
create table ORDERS (
   ID bigint not null,
   ORDER_NUMBER varchar(15) not null,
   CUSTOMER_ID bigint not null,
   primary key (ID)
);
alter table ORDERS add index FK8B7256E516B4891C (CUSTOMER_ID), add constraint FK8B7256E516B4891C foreign key (CUSTOMER_ID) references CUSTOMERS (ID);
