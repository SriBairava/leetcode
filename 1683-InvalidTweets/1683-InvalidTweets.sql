-- Last updated: 22/09/2026, 09:18:25
# Write your MySQL query statement below
SELECT tweet_id 
FROM Tweets
WHERE LENGTH(Content) > 15;