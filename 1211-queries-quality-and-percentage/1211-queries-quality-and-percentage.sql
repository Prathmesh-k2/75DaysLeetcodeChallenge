# Write your MySQL query statement below
Select query_name ,
round(sum(rating/position)/count(query_name),2) as quality,
round(AVG(If(rating < 3 ,1 ,0))*100,2) as poor_query_percentage

FROM Queries
group by query_name;