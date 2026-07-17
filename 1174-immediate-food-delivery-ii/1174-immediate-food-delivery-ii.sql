# Write your MySQL query statement below
select round(avg(datediff(min_order_date, min_customer_pref_delivery_date )=0)*100, 2) as immediate_percentage
from
    (select customer_id ,
    min(order_date) as min_order_date ,
    min(customer_pref_delivery_date) as min_customer_pref_delivery_date
    from Delivery
    group by customer_id) as table1