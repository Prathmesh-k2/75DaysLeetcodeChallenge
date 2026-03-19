# Write your MySQL query statement b
Select class 
From Courses 
Group by class
Having count(class)>4;