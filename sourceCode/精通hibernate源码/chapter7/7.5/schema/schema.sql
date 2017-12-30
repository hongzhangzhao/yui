alter table CATEGORIES drop foreign key FK6A31321CDBFCB7FC;
drop table if exists CATEGORIES;
create table CATEGORIES (
   ID bigint not null,
   NAME varchar(15),
   CATEGORY_ID bigint,
   primary key (ID)
);
alter table CATEGORIES add index FK6A31321CDBFCB7FC (CATEGORY_ID), add constraint FK6A31321CDBFCB7FC foreign key (CATEGORY_ID) references CATEGORIES (ID);
