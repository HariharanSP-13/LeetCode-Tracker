-- Last updated: 7/9/2026, 9:10:49 AM
# Write your MySQL query statement below
select e.name as Employee from Employee e join Employee m on e.managerId=m.id where e.salary>m.salary;