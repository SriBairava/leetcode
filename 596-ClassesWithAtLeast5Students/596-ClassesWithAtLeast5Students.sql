-- Last updated: 20/07/2026, 11:10:10
# Write your MySQL query statement below
select Class
from Courses group by Class having count(student)>=5;