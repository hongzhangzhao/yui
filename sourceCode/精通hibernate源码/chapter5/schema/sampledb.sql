drop table if exists HILO_TESTER;
drop table if exists IDENTITY_TESTER;
drop table if exists NATIVE_TESTER;
drop table if exists INCREMENT_TESTER;
drop table if exists hi_value;
create table HILO_TESTER (
   ID bigint not null,
   name varchar(15),
   primary key (ID)
);
create table IDENTITY_TESTER (
   ID bigint not null auto_increment,
   name varchar(15),
   primary key (ID)
);
create table NATIVE_TESTER (
   ID bigint not null auto_increment,
   name varchar(15),
   primary key (ID)
);
create table INCREMENT_TESTER (
   ID bigint not null,
   NAME varchar(15),
   primary key (ID)
);
create table hi_value (
    next_value integer 
);
insert into hi_value values ( 0 );
