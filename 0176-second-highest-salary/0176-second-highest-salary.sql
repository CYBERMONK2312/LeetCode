# Write your MySQL query statement below
Select (SELECT DISTINCT SALARY AS SecondHighestSalary FROM Employee e
WHERE e.salary IS NOT NULL
ORDER BY e.salary DESC
LIMIT 1 OFFSET 1)  as SecondHighestSalary