drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table CUSTOMERS (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);

create table AUDIT_LOGS(
   ID bigint auto_increment not null,
   ENTITY_ID bigint not null,
   ENTITY_CLASS varchar(128) not null,
   MESSAGE varchar(255) not null,
   CREATED timestamp not null,
   primary key (ID)
);
