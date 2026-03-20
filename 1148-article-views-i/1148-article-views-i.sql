# Write your MySQL query statement below
Select author_id as id
from views
where author_id=viewer_id
group by author_id
order by id ;