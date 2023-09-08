create schema manage_student;

use manage_student;

create table student
(	id int not null ,
	first_name nvarchar(100)  null,
    last_name nvarchar(100) null,
    address nvarchar(100) null,
    email nvarchar(100),
    constraint PK_student primary key (id));

create table subject
(id int not null,
name nvarchar(100) null,
constraint PK_subject primary key (id));

create table student_subject
(
id_student int not null,
id_subject int not null,
constraint FK_student_subject1 foreign key (id_student) references student(id),
constraint FK_student_subject2 foreign key (id_subject) references subject(id)
);
    
    


