drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table COMPANIES1 (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);
create table HOURLY_EMPLOYEES1 (
   ID bigint not null,
   NAME varchar(15),
   RATE double precision,
   COMPANY_ID bigint,
   primary key (ID)
);
create table SALARIED_EMPLOYEES1 (
   ID bigint not null,
   NAME varchar(15),
   SALARY double precision,
   COMPANY_ID bigint,
   primary key (ID)
);
alter table HOURLY_EMPLOYEES1 add index IDX1_COMPANY(COMPANY_ID), add constraint FK1_COMPANY foreign key (COMPANY_ID) references COMPANIES1 (ID);
alter table SALARIED_EMPLOYEES1 add index IDX2_COMPANY(COMPANY_ID), add constraint FK2_COMPANY foreign key (COMPANY_ID) references COMPANIES1 (ID);

insert into COMPANIES1(ID,NAME) values(1,'ABC Company');

insert into HOURLY_EMPLOYEES1(ID,NAME,RATE,COMPANY_ID) values(1,'Tom',100,1);

insert into HOURLY_EMPLOYEES1(ID,NAME,RATE,COMPANY_ID) values(2,'Mike',200,1);

insert into SALARIED_EMPLOYEES1(ID,NAME,SALARY,COMPANY_ID)
values(1,'Jack',5000,1);

insert into SALARIED_EMPLOYEES1(ID,NAME,SALARY,COMPANY_ID)
values(2,'Linda',6000,1);
