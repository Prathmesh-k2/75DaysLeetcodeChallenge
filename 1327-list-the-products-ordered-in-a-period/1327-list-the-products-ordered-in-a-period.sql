# Write your MySQL query statement below
Select p.product_name, sum(o.unit) as unit
From Products AS p
join orders AS o
on o.product_id = p.product_id
where  o.order_date  between   "2020-02-01" AND "2020-02-29"
group by p.product_name
having sum(o.unit)>=100;