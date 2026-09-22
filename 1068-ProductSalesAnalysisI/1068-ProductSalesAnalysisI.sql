-- Last updated: 22/09/2026, 09:19:42
# Write your MySQL query statement below
SELECT product_name, year, price 
FROM Sales
LEFT JOIN Product ON Sales.product_id = Product.product_id;