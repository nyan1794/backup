drop database if exists testdb;
create database testdb;
use testdb;
create table table_test(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into table_test values(1,"taro","123");
insert into table_test values(2,"jiro","456");
insert into table_test values(3,"hanako","789");