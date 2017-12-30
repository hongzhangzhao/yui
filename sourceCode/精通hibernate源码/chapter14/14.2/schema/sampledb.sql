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
   EMPLOYEE_TYPE varchar(2),
   RATE double precision,
   SALARY double precision,
   COMPANY_ID bigint,
   primary key (ID)
);

alter table EMPLOYEES add index IDX_COMPANY(COMPANY_ID), add constraint FK_COMPANY foreign key (COMPANY_ID) references COMPANIES (ID);

insert into COMPANIES(ID,NAME) values(1,'ABC Company');

insert into EMPLOYEES(ID,EMPLOYEE_TYPE,NAME,RATE,SALARY,COMPANY_ID) values(1,'HE','Tom',100,null,1);

insert into EMPLOYEES(ID,EMPLOYEE_TYPE,NAME,RATE,SALARY,COMPANY_ID) values(2,'HE','Mike',200,null,1);

insert into EMPLOYEES(ID,EMPLOYEE_TYPE,NAME,RATE,SALARY,COMPANY_ID) values(3,'SE','Jack',null,5000,1);

insert into EMPLOYEES(ID,EMPLOYEE_TYPE,NAME,RATE,SALARY,COMPANY_ID) values(4,'SE','Linda',null,6000,1);



