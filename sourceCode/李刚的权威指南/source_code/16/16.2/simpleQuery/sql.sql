use j2ee;

CREATE TABLE book_table (
book_id int auto_increment,
book_name varchar(255),
book_author varchar(255),
primary key (book_id));

INSERT INTO book_table VALUES (null , 'Spring2.0����' , '���');
INSERT INTO book_table VALUES (null , '������J2EE��ҵӦ��ʵս' , '���');
INSERT INTO book_table VALUES (null , '����J2EE��Ajax����' , '���');