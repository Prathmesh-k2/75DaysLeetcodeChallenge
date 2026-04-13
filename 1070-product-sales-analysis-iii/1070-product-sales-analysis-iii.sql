# Write your MySQL query statement below
SELECT product_id ,
       year  AS first_year,
        quantity ,price
FROM SALES 
where (product_id ,year )in(
    select product_id ,
       min(year) AS first_year
       from sales
       group by product_id
)
