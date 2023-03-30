show databases;

use jdbc;

create table student(
	reg_id int primary key, 
	sname varchar(30)
);

desc student;

insert into student(reg_id, sname) values
	(1, "Pratham"),
    (2, "Rushil"),
    (3, "Chirag");
    
select * from student;