# Write your MySQL query statement below
select e.name  as Employee
from Employee e
join Employee m 
on e.managerId = m.id
where(e.salary > m.salary);

-- Select e.name As Employee
-- From Employee as e
-- join Employee as m
-- on e.managerId= m.id
-- where e.salary>m.salary; 