drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

drop table if exists  ACCOUNTS ;
create table ACCOUNTS1 (
   ID bigint not null,
   NAME varchar(15),
   BALANCE decimal(10,2),
   primary key (ID) 
)  type=INNODB;

delete from ACCOUNTS;
insert into ACCOUNTS1(ID,NAME,BALANCE) values(1,'Tom',1000);
