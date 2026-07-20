-- Last updated: 20/07/2026, 11:10:02
/* Write your PL/SQL query statement below */
SELECT * FROM Cinema WHERE MOD( id, 2) = 1 AND 

description <> 'boring' ORDER BY rating DESC