drop table if exists CUSTOMERS;
create table CUSTOMERS (
   ID bigint not null auto_increment,
   NAME varchar(15) not null unique,
   REGISTERED_TIME timestamp,
   AGE integer not null check(AGE>10),
   SEX char(1),
   IS_MARRIED bit,
   DESCRIPTION text,
   primary key (ID)
);
create index IDX_REGISTERED_TIME on CUSTOMERS (REGISTERED_TIME);
