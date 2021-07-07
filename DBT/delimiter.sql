use cdacmumbaiedacmay2021;

create table temp(
fir int,
sec char(15));

delimiter //
create procedure abc()
begin 
insert into temp values(1,'inside abc');
end;//
delimiter ;

call abc();

select * from temp;

delimiter //
create procedure abcc()
begin 
declare x int;
set x=10;
insert into temp values(x,'inside abc');
end;//
delimiter ;

call abcc();

drop procedure abc;
drop procedure abcc;

create table emp(ename varchar(15),salary float,job varchar(20));
insert into emp(ename ,salary ,job)
values('sachin',3400,'clerk'),
('sanket',4400,'manager'),
('sandeep',6400,'marketing');

delimiter //
create procedure abc()
begin 
declare x int;
declare hra float;
select salary into x from emp 
where ename='sachin';
insert into temp values(x,'sandeep');
set hra=0.4*x;
insert into temp values(hra,'HRA');
end;//
delimiter ;

call abc();

select *from temp;

delimiter //
create procedure pr()
begin
declare x int;
select salary into x from emp
where ename='sandeep';
if x>2000 then
insert into temp values(x,'high salary');
end if;
end;//
delimiter ;




