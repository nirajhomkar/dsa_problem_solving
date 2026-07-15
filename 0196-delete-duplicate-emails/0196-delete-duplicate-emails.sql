# Write your MySQL query statement below
with cte_Person as (
    select id,
    email,
    row_number() over(partition by email order by id) as row_num
    from Person
)
delete from Person
where id in (
    select id
    from cte_Person
    where row_num > 1
);