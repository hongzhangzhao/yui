use j2ee;

CREATE TABLE book_table (
book_id int auto_increment,
book_name varchar(255),
book_author varchar(255),
primary key (book_id));

INSERT INTO book_table VALUES (null , 'Spring2.0宝典' , '李刚');
INSERT INTO book_table VALUES (null , '轻量级J2EE企业应用实战' , '李刚');
INSERT INTO book_table VALUES (null , '基于J2EE的Ajax宝典' , '李刚');