insert into product(pid,name,description,price,quantity) values(10101,'Pen','Parker',100,5);
insert into product(pid,name,description,price,quantity) values(10102,'DeskTop','Lenovo',30000,3);
insert into product(pid,name,description,price,quantity) values(10103,'Laptop','Dell I7',60000,3);
insert into product(pid,name,description,price,quantity) values(10104,'RAM',' 4 gb',15000,10);

insert into role(roleid,rolename) values(1,'ADMIN');
insert into role(roleid,rolename) values(2,'USER');
insert into role(roleid,rolename) values(3,'MANAGER');

insert into user_tbl(id, username,password,fullname) values(101,'krishna123', '$2a$12$xrTZhyQMcZa4vwxc269eTOfhmZSxyowWkAuixY/Ics9jOE/lmXWau','krishna kumar');
insert into user_tbl(id, username,password,fullname) values(102,'ankit123', '$2a$12$xrTZhyQMcZa4vwxc269eTOfhmZSxyowWkAuixY/Ics9jOE/lmXWau','ankith choudary');
insert into user_tbl(id, username,password,fullname) values(103,'rahul2233', '$2a$12$xrTZhyQMcZa4vwxc269eTOfhmZSxyowWkAuixY/Ics9jOE/lmXWau','rahul');

insert into user_roles values(101,1);
insert into user_roles values(101,2);
insert into user_roles values(102,2);
insert into user_roles values(103,3);
