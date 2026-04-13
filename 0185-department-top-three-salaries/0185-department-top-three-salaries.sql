# Write your MySQL query statement below
select d.name as Department,
       e.name as Employee ,
        e.Salary
from (
    select * ,
   DENSE_RANK()  over (PARTITION  by departmentId
    order by salary desc )as  r
    from employee 
) e
join department as d
on e.departmentId=d.id
where r <= 3;
