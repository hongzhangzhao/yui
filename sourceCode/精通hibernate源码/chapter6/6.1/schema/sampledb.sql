alter table ORDERS drop foreign key FK8B7256E516B4891C;
drop table if exists CUSTOMERS;
drop table if exists ORDERS;
create table CUSTOMERS (
   ID int not null,
   NAME varchar(50),
   primary key (ID)
);
create table ORDERS (
   ID int not null,
   ORDER_NUMBER varchar(50),
   CUSTOMER_ID int not null,
   primary key (ID)
);
alter table ORDERS add index FK8B7256E516B4891C (CUSTOMER_ID), add constraint FK8B7256E516B4891C foreign key (CUSTOMER_ID) references CUSTOMERS (ID);
