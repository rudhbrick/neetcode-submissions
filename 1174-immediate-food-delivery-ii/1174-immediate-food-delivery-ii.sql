SELECT ROUND(
    COUNT(
        CASE
            WHEN d.order_date = d.customer_pref_delivery_date THEN 1
        END
    ) * 100.0 / COUNT(d.delivery_id),
    2
) AS immediate_percentage
FROM Delivery d
JOIN (
    SELECT customer_id, MIN(order_date) AS first_order_date
    FROM Delivery
    GROUP BY customer_id
) first
    ON d.customer_id = first.customer_id
   AND d.order_date = first.first_order_date;