# Write your MySQL query statement below
Select eu.unique_id , e.name
From Employees AS e
Left join EmployeeUNI AS eu
on e.id=eu.id;  