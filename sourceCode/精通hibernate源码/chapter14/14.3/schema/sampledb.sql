drop database if exists SAMPLEDB;
create database SAMPLEDB;
use SAMPLEDB;

create table COMPANIES (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);
create table EMPLOYEES (
   ID bigint not null,
   NAME varchar(15),
   COMPANY_ID bigint,
   primary key (ID)
);

create table HOURLY_EMPLOYEES (
   EMPLOYEE_ID bigint not null,
   RATE double precision,
   primary key (EMPLOYEE_ID)
);

create table SALARIED_EMPLOYEES (
   EMPLOYEE_ID bigint not null,
   SALARY double precision,
   primary key (EMPLOYEE_ID)
);

alter table EMPLOYEES add index IDX_COMPANY(COMPANY_ID), add constraint FK_COMPANY foreign key (COMPANY_ID) references COMPANIES (ID);

alter table HOURLY_EMPLOYEES add index IDX_EMPLOYEE1(EMPLOYEE_ID), add constraint FK_EMPLOYEE1 foreign key (EMPLOYEE_ID) references EMPLOYEES (ID);

alter table SALARIED_EMPLOYEES add index IDX_EMPLOYEE2(EMPLOYEE_ID), add constraint FK_EMPLOYEE2 foreign key (EMPLOYEE_ID) references EMPLOYEES (ID);

insert into COMPANIES(ID,NAME) values(1,'ABC Company');

insert into EMPLOYEES(ID,NAME,COMPANY_ID) values(1,'Tom',1);
insert into HOURLY_EMPLOYEES(EMPLOYEE_ID,RATE) values(1,100);

insert into EMPLOYEES(ID,NAME,COMPANY_ID) values(2,'Mike',1);
insert into HOURLY_EMPLOYEES(EMPLOYEE_ID,RATE) values(2,200);

insert into EMPLOYEES(ID,NAME,COMPANY_ID) values(3,'Jack',1);
insert into SALARIED_EMPLOYEES(EMPLOYEE_ID,SALARY) values(3,5000);

insert into EMPLOYEES(ID,NAME,COMPANY_ID) values(4,'Linda',1);
insert into SALARIED_EMPLOYEES(EMPLOYEE_ID,SALARY) values(4,6000);
