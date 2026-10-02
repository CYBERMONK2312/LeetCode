# Write your MySQL query statement below
SELECT E.name FROM Employee E
INNER JOIN Employee B on E.id = B.managerId
GROUP BY B.managerId
HAVING COUNT(B.managerId) >= 5

