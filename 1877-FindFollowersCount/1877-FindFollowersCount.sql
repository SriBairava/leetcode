-- Last updated: 20/07/2026, 11:09:06
# Write your MySQL query statement below
SELECT user_id , COUNT(follower_id) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;