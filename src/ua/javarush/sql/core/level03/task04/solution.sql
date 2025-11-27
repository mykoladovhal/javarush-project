-- Запит для стандартизації email-адрес:
-- функція LOWER() переводить рядок у нижній регістр,
-- функція UPPER() переводить рядок у верхній регістр.
select email, lower(email) as email_lower, upper(email) as email_upper
from customers