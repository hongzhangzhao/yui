drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table TABLE_A (
   ID bigint not null,
   A1 varchar(15),
   C1 varchar(15),
   D1 varchar(15),
   G1 varchar(15),
   H1 varchar(15),
   A_TYPE char(1),
   primary key (ID)
);

create table TABLE_B (
   ID bigint not null,
   B1 varchar(15),
   primary key (ID)
);
create table TABLE_E (
   B_ID bigint not null,
   E1 varchar(15),
   E2 varchar(15),
   E3 varchar(15),
   E4 varchar(15),
   E5 varchar(15),
   E6 varchar(15),
   primary key (B_ID)
);

create table TABLE_F (
   B_ID bigint not null,
   F1 varchar(15),
   F2 varchar(15),
   F3 varchar(15),
   F4 varchar(15),
   F5 varchar(15),
   F6 varchar(15),
   F7 varchar(15),
   primary key (B_ID)
);

alter table TABLE_E add index IDX_B1(B_ID), add constraint FK_B1 foreign key (B_ID) references TABLE_B(ID);

alter table TABLE_F add index IDX_B2(B_ID), add constraint FK_B2 foreign key (B_ID) references TABLE_B(ID);
