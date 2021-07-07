use assigenment;
select * from employees;
    # Write a query to find the name (first_name, last_name) and the salary of the employees 
    # who have a higher salary than the employee whose last_name='Bull'
select FIRST_NAME,LAST_NAME ,SALARY from employees where SALARY >(select SALARY from employees where LAST_NAME='bull');

#Write a query to find the name (first_name, last_name) of all employees who works in the IT department.
 select first_name,last_name ,DEPARTMENT_ID from employees where DEPARTMENT_ID =(select DEPARTMENT_ID from departments where DEPARTMENT_NAME='IT');
 
 #Write a query to find the name (first_name, last_name) of the employees 
 #who have a manager and worked in a USA based department.
 select first_name,last_name from employees where manager_id!=0 and manager_id in
 (select MANAGER_ID from departments where LOCATION_ID
 in(select location_id from locations where COUNTRY_ID='US'));
 
 #Write a query to find the name (first_name, last_name) of the employees who are managers. 
  select FIRST_NAME,LAST_NAME from employees where EMPLOYEE_ID in
  (select distinct (manager_id)from employees);
  
  #Write a query to find the name (first_name, last_name), 
  #and salary of the employees whose salary is greater than the average salary.
  
  select first_name,last_name, salary from employees 
  where salary>(select avg(salary) from employees);
  
  #Write a query to find the name (first_name, last_name), and salary of the employees who 
  #earns more than the average salary and works in any of the IT departments.
  
  select first_name, last_name, salary from employees where department_id in 
  (select department_id from departments where 
  department_name like 'IT') and salary >
  (select avg(salary) from employees) ;
  
  #Write a query to find the name (first_name, last_name), and salary of the employees 
  #who earns more than the earning of Mr. Bell.
  
  select first_name, last_name, salary from employees
   where salary >(select salary from employees where last_name = 'bell')
    order by 3;
#Write a query to find the name (first_name, last_name), and salary of the employees who earn 
#the same salary as the minimum salary for all departments.

select * from departments;
select * from employees;
   
   select FIRST_NAME,LAST_NAME,SALARY from employees 
   where SALARY=(select min(salary) from employees);
   
   #Write a query to find the name (first_name, last_name), and salary of the employees whose 
   #salary is greater than the average salary of all departments.
   select FIRST_NAME,LAST_NAME,SALARY from employees
   where SALARY >(select avg(salary) from employees);
   
    #Write a query to find the name (first_name, last_name) and salary of the employees 
   #who earn a salary that is higher than the salary of all the Shipping Clerk (JOB_ID = 'SH_CLERK'). 
   #Sort the results of the salary of the lowest to highest.
   
   select first_name,last_name ,job_id,salary from employees where SALARY >
   all(select salary from employees where JOB_ID='SH_CLERK')order by SALARY;

   