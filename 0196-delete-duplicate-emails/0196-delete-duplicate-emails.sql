-- # Write your MySQL query statement below
DELETE FROM Person
WHERE id NOT IN (
    SELECT id FROM (
        SELECT MIN(id) AS id
        FROM Person
        GROUP BY email
    ) AS temp
);

-- delete p1
-- from person  p1
-- join person  p2
-- on p1.email=p2.email
-- and p1 .id>p2.id;

