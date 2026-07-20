-- Last updated: 20/07/2026, 11:10:16
# Write your MySQL query statement below
SELECT name 
FROM Employee 
WHERE id IN (
    SELECT managerId 
    FROM Employee 
    GROUP BY managerId 
    HAVING COUNT(*) >= 5
)

-- Low performance. Why? Read below.