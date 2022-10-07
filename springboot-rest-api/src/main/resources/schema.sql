create table product(pid int primary key, name varchar(200),description varchar(200),price double, quantity int);
create table role(roleid int primary key, rolename varchar(200));

create table user_tbl(id int primary key, username varchar(200), password varchar(255), fullname varchar(200));

create table user_roles(user_id int ,foreign key(user_id) references user_tbl(id),roles_roleid int, foreign key(roles_roleid) references role(roleid));