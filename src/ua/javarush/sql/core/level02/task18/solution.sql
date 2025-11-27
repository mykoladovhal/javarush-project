-- Вибір імен та віку студентів старше 21 року з оцінками A або B
-- Результати сортуються за віком у порядку зростання
select name, age from students
where age > 21 and (grade = 'A' or grade = 'B')
order by age
