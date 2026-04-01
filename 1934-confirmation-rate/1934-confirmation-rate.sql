# Write your MySQL query statement below
Select s.user_id ,
ifnull(round( sum(action="confirmed")/count(c.action) ,2),0.00)
 AS confirmation_rate 
from signups s
left join confirmations c
on s.user_id=c.user_id
group by s.user_id;