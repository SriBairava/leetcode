-- Last updated: 22/09/2026, 09:17:47
# Write your MySQL query statement below
# Write your MySQL query statement below
select teacher_id, count(distinct(subject_id)) as cnt
from Teacher
group by teacher_id