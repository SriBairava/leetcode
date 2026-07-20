-- Last updated: 20/07/2026, 11:09:31
# Write your MySQL query statement below
SELECT DISTINCT author_id as id
FROM Views
WHERE viewer_id = author_id
ORDER BY id ASC;