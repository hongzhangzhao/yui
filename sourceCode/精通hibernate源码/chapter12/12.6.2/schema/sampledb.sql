drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

drop table if exists  ACCOUNTS ;
create table ACCOUNTS2 (
   ID bigint not null,
   NAME varchar(15),
   BALANCE decimal(10,2),
   VERSION integer,
   primary key (ID) 
)  type=INNODB;
