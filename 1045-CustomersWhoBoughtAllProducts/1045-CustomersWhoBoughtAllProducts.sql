-- Last updated: 22/09/2026, 09:19:45
SELECT 
    customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT(product_key))=(
    SELECT COUNT(*) FROM Product
);