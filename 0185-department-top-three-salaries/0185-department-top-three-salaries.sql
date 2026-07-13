# Write your MySQL query statement below
with unique_salary as (
    select d.name as Department,
        e.name as Employee,
        e.salary as Salary,
        dense_rank() over(partition by d.id order by e.salary desc ) as rank_salary
    from Employee as e
    join Department as d
    on e.departmentId=d.id
)
select Department,
    Employee,
    Salary
from unique_salary
where rank_salary <=3;