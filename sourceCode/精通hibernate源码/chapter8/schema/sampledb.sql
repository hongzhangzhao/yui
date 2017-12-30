alter table COMPUTERS drop foreign key FK52FE749835384956;
drop table if exists VENDORS;
drop table if exists COMPUTERS;
drop table if exists CUSTOMERS;
create table VENDORS (
   ID bigint not null,
   TYPE varchar(15),
   primary key (ID)
);
create table COMPUTERS (
   ID bigint not null,
   COMPUTER_TYPE varchar(15),
   CPUBOX_TYPE varchar(15),
   GRAPHICSCARD_TYPE varchar(15),
   CPUBOX_VENDOR_ID bigint not null,
   primary key (ID)
);
create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   HOME_PROVINCE varchar(255),
   HOME_CITY varchar(255),
   HOME_STREET varchar(255),
   HOME_ZIPCODE varchar(255),
   COM_PROVINCE varchar(255),
   COM_CITY varchar(255),
   COM_STREET varchar(255),
   COM_ZIPCODE varchar(255),
   primary key (ID)
);
alter table COMPUTERS add index FK52FE749835384956 (CPUBOX_VENDOR_ID), add constraint FK52FE749835384956 foreign key (CPUBOX_VENDOR_ID) references VENDORS (ID);
