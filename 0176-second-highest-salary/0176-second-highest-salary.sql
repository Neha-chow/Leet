# Write your MySQL query statement below
SELECT (select distinct(salary)
from EMployee
ORDER BY salary desc
limit 1 offset  1) 
as SecondHighestSalary;