DROP database IF exists reg_login;

CREATE database reg_login;

use reg_login

--”√ªß±Ì
create table user_table(
  user_id  int(11) auto_increment,
  user_name varchar(50) not null,
  user_pass varchar(50) not null,
  email varchar(100),
  primary key(user_id),
  unique(user_name)
);
