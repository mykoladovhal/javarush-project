-- Запит для посторінкового виводу даних з таблиці students
-- Пропускаємо перший рядок за допомогою OFFSET і обмежуємо результат двома рядками за допомогою LIMIT
select student_id, name, age from students offset 1 limit 2