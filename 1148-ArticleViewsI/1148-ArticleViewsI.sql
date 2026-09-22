-- Last updated: 22/09/2026, 09:19:16
# Write your MySQL query statement below
SELECT DISTINCT author_id as id
FROM Views
WHERE viewer_id = author_id
ORDER BY id ASC;