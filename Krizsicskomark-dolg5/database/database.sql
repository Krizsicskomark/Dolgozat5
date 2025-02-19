create database cylinders;

grant all privileges 
on cylinders.*
to cylinders@localhost;

use cylinders;

create table cylinder(
id int not null primary key auto_increment,
radius double,
height double,
surface double
);
