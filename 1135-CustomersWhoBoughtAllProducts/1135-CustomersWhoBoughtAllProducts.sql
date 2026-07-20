-- Last updated: 20/07/2026, 11:09:43
SELECT 
    customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT(product_key))=(
    SELECT COUNT(*) FROM Product
);