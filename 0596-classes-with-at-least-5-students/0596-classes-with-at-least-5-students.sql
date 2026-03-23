# Write your MySQL query statement b
select class 
from courses
group by class
having count(class)>=5;