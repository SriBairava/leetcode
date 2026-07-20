-- Last updated: 20/07/2026, 11:08:52
# Write your MySQL query statement below
# Write your MySQL query statement below
select teacher_id, count(distinct(subject_id)) as cnt
from Teacher
group by teacher_id