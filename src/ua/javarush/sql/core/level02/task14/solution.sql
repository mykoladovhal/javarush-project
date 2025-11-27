-- Запит для відображення топ-5 співробітників за зарплатою
select name, salary from employees order by salary desc limit 5