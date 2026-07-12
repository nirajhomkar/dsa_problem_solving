# Write your MySQL query statement below
with rise_temperature as (
    select id,
        recordDate,
        lag(recordDate) over(order by recordDate) as previousDate,
        temperature,
        lag(temperature) over(order by recordDate) as previousTemp
    from Weather
)
select id from rise_temperature
where datediff(recordDate,previousDate)=1 and temperature > previousTemp;