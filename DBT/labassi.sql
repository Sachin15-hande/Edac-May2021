-- 1. Create DEPT table with the following structure:-
-- DEPTNO INT(2)
-- DNAME VARCHAR (14)
-- LOC VARCHAR (13)
-- Insert the following rows in DEPT table:-
-- 10, ACCOUNTING,NEW YORK
-- 20, RESEARCH, DALLAS
-- 30, SALES, CHICAGO
-- 40, OPERATIONS, BOSTON
drop table  if exists DEPT;
create table DEPT (DEPTNO INT(2),DNAME varchar(14),LOC varchar(13));
INSERT INTO DEPT(DEPTNO,DNAME,LOC)
values(10, 'ACCOUNTING','NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');
##################################################################################
#2. Create EMP table with the following structure:-
-- EMPNO INT(4)
-- ENAME VARCHAR (10)
-- JOB VARCHAR (9)
-- HIREDATE DATE
-- SAL FLOAT(7,2)
-- COMM FLOAT(7,2)
-- DEPTNO INT(2)
########################################################################################
drop table IF EXISTS EMP;

create table EMP(EMPNO INT(4),ENAME varchar(10),JOB varchar(9),HIREDATE date,SAL float(7,2),COMM float(7,2),DEPTNO INT(2));

insert INTO EMP(EMPNO ,ENAME ,JOB ,HIREDATE ,SAL ,COMM ,DEPTNO )
values(7369, 'SMITH', 'CLERK', '80-12-17', 800, null, 20),
(7499, 'ALLEN', 'SALESMAN', '81-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', '81-02-22', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', '81-04-2', 2975, null, 20),
(7654, 'MARTIN', 'SALESMAN', '81-09-28', 1250, 1400,30),
(7698, 'BLAKE', 'MANAGER', '81-05-01', 2850, null, 30),
(7782, 'CLARK', 'MANAGER', '81-06-09', 2450, null, 10),
(7788, 'SCOTT', 'ANALYST', '82-12-09', 3000, null, 20),
(7839, 'KING', 'PRESIDENT', '81-11-17', 5000, null, 10),
(7844, 'TURNER', 'SALESMAN', '81-09-08', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', '83-01-12', 1100, null, 20),
(7900, 'JAMES', 'CLERK', '81-12-03', 950, null, 30),
(7902, 'FORD', 'ANALYST', '81-12-03', 3000, null, 20),
(7934, 'MILLER', 'CLERK', '82-01-23', 1300, null, 10);
update emp set hiredate='1982-01-31' where empno=7934;
update emp set hiredate='1982-02-28' where empno=7902;
update emp set hiredate='1982-12-31' where empno=7900;
#####################################################################
select * from dept;
select * from emp;




#Write SELECT statements to achieve the following:-
-- 1. Display only the EMPNO and ENAME columns from EMP table.
select empno,ename from emp;

-- 2. Display all employees who are CLERKs and the MANAGERs.
select * from emp where job='clerk' or job='Manager';

-- 3. Display the ENAME and JOB for all employees who belong to the same DEPTNO as employee ???KING???.
select ename,job deptno from emp where deptno in(select deptno from emp where ename='KING');

-- 4. Find the names of all employees hired in the month of February (of any year).
select ename from emp where monthname(hiredate)='February';

-- 5. Display the employees in descending order of DEPTNO.
select * from emp order by deptno desc ;

-- 6. Display the employee name and employee number of the employees with the
-- headings as NUMBER and NAME.
select empno as 'NUMBER' ,ename as 'NAME' from emp;

-- 7. Find the names of all employees who were hired on the last day of the month.

select * from emp where HIREDATE =any
(select last_day(hiredate) from emp);

select upper(ename) ,sum(sal)
from emp ;
select EMPNO from emp having sum(sal) > 1700;


-- 8. Find the name of the employee who is receiving the maximum salary.
-- 9. Display the sum of SAL for all the employees belonging to DEPTNO 10.
-- 10. Display the rows where JOB column ends with the letter ???T???.





-- Write a stored function by the name of cutomer_search. The stored function should
-- return the maximum creditLimit made by any customer.
create table maxcredit(x float);
drop table maxcredit;
drop function cutomer_search;
delimiter //
create function cutomer_search()
returns float
deterministic
begin
declare a float;
select max(creditlimit) into a from customers;
return a;
end; //
delimiter ;
select cutomer_search() from dual;

delimiter //
create procedure max1()
begin
declare a float;
set a= cutomer_search();
insert into maxcredit values(a);
end ; //
delimiter ; 

call max1;


