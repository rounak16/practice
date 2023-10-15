SELECT s1.score, count(s2.score) AS 'rank'
FROM scores s1, (SELECT DISTINCT score FROM scores) s2
WHERE s2.score>=s1.Score
GROUP BY s1.Id 
ORDER BY s1.score DESC;