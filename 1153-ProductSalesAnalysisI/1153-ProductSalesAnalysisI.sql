-- Last updated: 20/07/2026, 11:09:42
# Write your MySQL query statement below
SELECT product_name, year, price 
FROM Sales
LEFT JOIN Product ON Sales.product_id = Product.product_id;