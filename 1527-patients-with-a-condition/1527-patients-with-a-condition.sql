# Write your MySQL query statement below
SELECT *
FROM patients
where conditions like 'DIAB1%'or conditions like '% DIAB1%'
-- WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'