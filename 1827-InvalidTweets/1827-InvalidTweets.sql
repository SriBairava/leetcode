-- Last updated: 20/07/2026, 11:09:09
# Write your MySQL query statement below
SELECT tweet_id 
FROM Tweets
WHERE LENGTH(Content) > 15;