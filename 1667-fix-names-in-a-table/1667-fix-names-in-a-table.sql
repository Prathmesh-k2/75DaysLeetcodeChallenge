# Write your MySQL query statement below
Select  user_id ,
concat(
    upper(Left(name,1)), 
     lower(right(name,length(name)-1))
     )  as name
from Users
order by  user_id;