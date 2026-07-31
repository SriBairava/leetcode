-- Last updated: 31/07/2026, 09:33:40
# Write your MySQL query statement below
select name 
from SalesPerson 
where sales_id Not in (select o.sales_id 
from Orders o
join company c
on o.com_id=c.com_id
where c.name ='Red')