# Write your MySQL query statement below
Select
          st.student_id,
          st.student_name ,
          sub.subject_name  , 
          count(e.subject_name ) as attended_exams
from students as st
cross join subjects as sub 
left join examinations as e
on st.student_id = e.student_id
AND sub.subject_name = e.subject_name
group by st.student_id,st.student_name ,sub.subject_name 
order by st.student_id ,sub.subject_name;
