# Write your MySQL query statement below
select u.unique_id as unique_id, e.name as name
from Employees e left join EmployeeUNI u
on e.id = u.id

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna