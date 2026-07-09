-- Last updated: 7/9/2026, 9:10:47 AM
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);