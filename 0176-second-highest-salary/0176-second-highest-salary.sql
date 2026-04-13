# Write your MySQL query statement below
-- select salary  as SecondHighestSalary
--  from (
--     select salary ,
--     DENSE_RANK() OVER (order by salary  desc ) as ran
--     from employee
--  )e
--  where ran=2;\
SELECT (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;
