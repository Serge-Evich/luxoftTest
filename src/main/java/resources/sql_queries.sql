SELECT
  cl.*,
  ord.order_sum
FROM clients cl
  INNER JOIN orders ord ON cl.client_id = ord.client_id
WHERE ord.order_sum > 50;

SELECT
  cl.client_id,
  cl.client_name,
  SUM(order_sum)
FROM clients cl
  INNER JOIN orders ord ON cl.client_id = ord.client_id
GROUP BY client_id, client_name
HAVING SUM(order_sum) > 100