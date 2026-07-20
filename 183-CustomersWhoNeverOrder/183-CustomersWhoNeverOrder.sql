-- Last updated: 20/07/2026, 11:10:57
# Write your MySQL query statement below
SELECT name AS Customers FROM Customers WHERE Customers.id 
NOT IN (SELECT CustomerId FROM Orders);