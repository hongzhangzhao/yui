drop table if exists CUSTOMERS;
create table CUSTOMERS (
   ID bigint not null,
   FIRSTNAME varchar(15),
   LASTNAME varchar(15),
   HOME_STREET varchar(15),
   HOME_CITY varchar(15),
   HOME_PROVINCE varchar(15),
   HOME_ZIPCODE varchar(6),
   COM_STREET varchar(15),
   COM_CITY varchar(15),
   COM_PROVINCE varchar(15),
   COM_ZIPCODE varchar(6),
   SEX char(1),
   PHONE varchar(8),
   primary key (ID)
);
