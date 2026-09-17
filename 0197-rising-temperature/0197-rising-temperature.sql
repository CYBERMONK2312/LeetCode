# Write your MySQL query statement below
SELECT W.id FROM Weather W
JOIN Weather Wt 
-- ON W.recordDate - Wt.recordDate = 1
ON DATEDIFF(W.recordDate, Wt.recordDate) = 1
WHERE W.temperature > Wt.temperature
