-- Створення таблиці students з трьома колонками
DROP TABLE IF EXISTS students;
CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю students
INSERT INTO students (name, age) VALUES
('Alisa', 21),
('Bob', 22),
('Klara', 23),
('Danil', 24),
('Eva', 25);