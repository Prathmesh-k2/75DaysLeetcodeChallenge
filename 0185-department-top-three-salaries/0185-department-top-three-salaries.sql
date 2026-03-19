# Write your MySQL query statement below
Select d.name as Department ,
e1.name AS Employee ,
e1.salary
From Employee AS e1
join Department as D
on d.id=e1.departmentID

where
3 >(
    Select Count(Distinct e2.salary)
    from Employee e2
    where e2.salary > e1.salary ANd e1.departmentid= e2.departmentid
)
