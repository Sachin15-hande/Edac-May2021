use mproject;
#1.display no of operation of parts.
select p_id ,NO_operation from part group by p_id;

#2.display production qty from date 2021-07-01 to current date of diffrent parts.
 select part.p_id ,p_name,sum(pr_qty) from part,dpr where part.p_id=dpr.p_id group by p_id ;

#3.display e_name whose salary is greater than 5000?
 select emp_name, emp_sal from employee where emp_sal >5000 order by emp_sal;
 
 #4.display total production qty of all parts? 
 select p_id,sum(pr_qty) from dpr group by p_id;

 # 5.display average production of parts?
 select p_id, round(avg(pr_qty)) from dpr group by p_id;
 
 # 6.display e_name ,salary and HRA of employees(HRA=20% )
 select emp_name,emp_sal,(emp_sal*0.2) as 'HRA' from employee;
 
# 7.display e_name and working days of employees?
select emp_name ,datediff(sysdate(),emp_join_date) as 'Working days' from employee;

 #8.display e_name,p_id and p_name of employees who works on more than one machine? 
 
   select dpr.emp_id,emp_name,m_id,dpr.p_id,p_name from dpr,employee,part 
   where dpr.emp_id=employee.emp_id and dpr.p_id=part.p_id group by dpr.emp_id,m_id;
  
  alter table employee add HRA float;
  select * from employee;
-- write procedure using cursor to calculate HRA (20%) of employees ?

desc employee;

delimiter //
create procedure HRA_cal()
begin
declare a varchar(10);
declare b varchar(10);
declare c bigint;
declare d varchar(10);
declare e date;
declare f int;
declare g varchar(20);
declare hr float;
declare x int default 1;
declare c1 cursor for select * from employee;
open c1;
while x<6 do
fetch c1 into a,b,c,d,e,f,g,hr;
update employee set HRA=f*0.2 where emp_id=a;
set x=x+1;
end while;
close c1;
end;//
delimiter ;
drop procedure HRA_cal;
call HRA_cal;

select * from employee;





