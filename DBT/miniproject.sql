create database Mproject;

use Mproject;

/* This table is for part description*/

create table part(
p_id varchar(10) primary key,
p_name varchar(10),
p_rate float(2.2),
No_operation int);

/* This table is for employee details working in production Department*/

create table employee(
emp_id varchar(10)primary key,
emp_name varchar(10),
emp_contact int (10)unique,
emp_job varchar(10),
emp_join_date date not null,
emp_sal int not null ,
emp_location varchar(20));

/* This table is for machine description*/

create table machine(
m_id varchar(5)primary key,
m_name varchar(15),
m_work varchar(25));


 /*This table is for  supplier details */
 
 create table supplier(
 sup_name varchar(15),
 sup_location varchar(20),
 sup_contact int(10)unique);
 alter table supplier
 
 modify sup_name varchar(15) primary key;
 
 /* This table is used for Stock maintain */
 create table stock(
 p_id varchar(10),
 sup_name varchar(15),
 Qty int,
 constraint fk_p_id foreign key (p_id) references part(p_id),
 constraint fkk_sup_name foreign key (sup_name) references supplier(sup_name));
 # table daily production report
 
 create table DPR(
 emp_id varchar(15),
 p_id varchar(15),
 m_id varchar(15),
 pr_qty int,
 pr_date date,
 constraint fk_emp_id foreign key(emp_id)references employee(emp_id),
 constraint fkk_p_id foreign key(p_id)references part(p_id),
 constraint fk_m_id foreign key(m_id)references machine(m_id));
 
 use mproject;
 
 show tables;
 desc employee;
 desc part;
 desc stock;
 desc dpr;
 desc machine;
 
 alter table employee
 modify emp_contact bigint(10);
 
 insert into employee(emp_id,emp_name,emp_contact,emp_job,emp_join_date,emp_sal,emp_location)
 values('EMP001','SACHIN','8237470315','SUPERVISOR','2017-07-15',7000,'AURANGABAD'),
 ('EMP002','SANDIP','7234577315','OPERATOR','2015-05-23',3000,'PUNE'),
 ('EMP003','AMOL','9257775315','OPERATOR','2014-06-14',3500,'AKOLA'),
 ('EMP004','ALTAB','9037470315','OPERATOR','2020-03-24',2500,'AMRAVATI'),
 ('EMP005','RAJU','7837470315','PRO HEAD','2015-08-21',6000,'PUNE');
 
 select *from employee;
 use mproject;
 
 show tables;
 desc part;
 insert into part(p_id,p_name,p_rate,No_operation)
 values('AF101138','SPACER-11',20.24,3),
 ('AA102147','HOOK PIN',12.25,1),
 ('AF101487','JOINTER',18.67,2),
 ('AA102387','SPILTTER',30.24,3),
 ('AA102482','LPG PLUG',40.67,3),
 ('JD591022','RING',10.24,3);
 
 use mproject;
 
 desc machine;
 insert into machine(m_id,m_name,m_work)
 values('M01','BAND SAW','CUTTING'),
('M02','CNC MACHINE','TURNNING'),
('M03','GRINDING','FINISHING'),
('M04','LATHE MACHINE','ROUGH TURNNING'),
('M05','DRILL MACHINE','BORING');

select * from machine;
ALTER TABLE MACHINE
MODIFY M_NAME VARCHAR(45);
update machine set m_name='GRINDING MACHINE' where M_ID='M03';

select * from employee;
select * from machine;
select * from part;
select * from stock;
select *from supplier;
select * from dpr;


desc supplier;
ALTER TABLE SUPPLIER modify SUP_CONTACT bigint(10)unique;

insert into stock(p_id,sup_name,Qty)
values ('AF101138','DIVYA TOOLS',450),
('AA102387','DIVYA TOOLS',550),
('AF101138','LARGE SCALE',850),
('AF101138','ALL IN ONE',750),
('AF101138','RP ENGINEERING',650);

select * FROM STOCK;


insert into supplier(sup_name,sup_location,sup_contact)
values('DIVYA TOOLS','PUNE','7875346494'),
('RP ENGINEERING','MUMBAI','8875346494'),
('LARGE SCALE','SANGLI','9870246494'),
('ALL IN ONE','DELHI','7785378494');

select * FROM SUPPLIER;
desc dpr;

insert into dpr(emp_id,p_id,m_id,pr_qty,pr_date)
values('EMP002','AF101138','M01',650,'2021-07-01'),
('EMP003','AA102387','M02',550,'2021-07-01'),
('EMP004','AA102482','M03',450,'2021-07-01'),
('EMP002','AA102147','M02',650,'2021-07-02'),
('EMP003','AF101487','M01',550,'2021-07-02'),
('EMP004','AA102482','M03',450,'2021-07-02'),
('EMP002','AF101138','M01',650,'2021-07-03'),
('EMP003','AA102387','M02',550,'2021-07-03'),
('EMP004','AA102482','M03',450,'2021-07-03'),
('EMP002','AF101138','M01',650,'2021-07-04'),
('EMP003','AA102387','M02',550,'2021-07-04'),
('EMP004','AA102482','M03',450,'2021-07-04');

DESC DPR;
DESC machine;
DESC part;
DESC stock;
DESC employee;
DESC supplier;
