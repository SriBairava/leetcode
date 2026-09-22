-- Last updated: 22/09/2026, 09:19:29
# Write your MySQL query statement below
SELECT player_id,min(event_date)as first_login
FROM Activity
GROUP BY player_id