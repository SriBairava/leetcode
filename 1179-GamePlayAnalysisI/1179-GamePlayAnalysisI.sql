-- Last updated: 20/07/2026, 11:09:38
# Write your MySQL query statement below
SELECT player_id,min(event_date)as first_login
FROM Activity
GROUP BY player_id