SELECT ranked.season,ranked.category,ranked.total_quantity,ranked.total_revenue FROM (SELECT x.season,x.category,x.total_quantity,x.total_revenue,ROW_NUMBER() OVER(PARTITION BY x.season ORDER BY x.total_quantity DESC,x.total_revenue DESC,category ASC) AS rn FROM (SELECT s.season,p.category,SUM(s.quantity) AS total_quantity,SUM(s.quantity*s.price) AS total_revenue FROM (SELECT product_id,CASE
            WHEN MONTH(sale_date) IN (12,1,2) THEN 'Winter'
            WHEN MONTH(sale_date) IN (3,4,5) THEN 'Spring'
            WHEN MONTH(sale_date) IN (6,7,8) THEN 'Summer'
            WHEN MONTH(sale_date) IN (9,10,11) THEN 'Fall'
        END AS season,quantity,price FROM sales) s JOIN products p ON s.product_id=p.product_id GROUP BY s.season,p.category) x) ranked WHERE ranked.rn=1 ORDER BY
        CASE 
            WHEN 'Winter' THEN 1
            WHEN 'Spring' THEN 2
            WHEN 'Summer' THEN 3
            when 'Fall' then 4
        END;