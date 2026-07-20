-- Last updated: 20/07/2026, 11:11:05
SELECT
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
    -- Note: SQL Server Use `[rank]` instead of `rank`.
FROM Scores
ORDER BY score DESC;