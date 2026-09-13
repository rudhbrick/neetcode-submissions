SELECT p.product_id,
       CASE
           WHEN latest.latest_date IS NULL THEN 10
           ELSE actual.new_price
       END AS price
FROM (SELECT product_id FROM Products GROUP BY product_id) p
LEFT JOIN (
    SELECT product_id,
           MAX(change_date) AS latest_date
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
) latest
    ON p.product_id = latest.product_id
LEFT JOIN Products actual ON actual.product_id=latest.product_id AND actual.change_date=latest.latest_date;