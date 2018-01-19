drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
shop_name varchar(50),
insert_date datetime,
update_date datetime
);

drop table if exists shop_login_transaction;

create table shop_login_transaction(
id int not null primary key auto_increment,
shop_id varchar(16) unique,
shop_pass varchar(16),
shop_name varchar(50),
create_date datetime,
updated_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_item_price int,
total_count int,
user_master_id varchar(16),
total_price int,
pay varchar(30),
order_num varchar(8),
insert_date datetime,
delete_date datetime
);

INSERT INTO shop_login_transaction(shop_id, shop_pass, shop_name) VALUES("1","1","Internous");
INSERT INTO item_info_transaction(item_name, item_price, item_stock,shop_name,insert_date) VALUES("NoteBook", 100, 50,"Internous","2018-01-01 00:00:00");
INSERT INTO item_info_transaction(item_name, item_price, item_stock,shop_name,insert_date) VALUES("MacBook", 500, 50,"Internous","2018-01-01 00:00:00");
INSERT INTO item_info_transaction(item_name, item_price, item_stock,shop_name,insert_date) VALUES("TextBook", 250, 50,"Internous","2018-01-01 00:00:00");
INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01", "test");