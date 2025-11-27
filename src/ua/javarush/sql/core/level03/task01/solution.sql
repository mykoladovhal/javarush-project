-- Запит для об'єднання імені та прізвища співробітників в один стовпець full_name
select concat(first_name,' ', last_name) as full_name, employee_id
from employees