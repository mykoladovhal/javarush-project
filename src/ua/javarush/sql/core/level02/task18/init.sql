-- Створення таблиці students з колонками id, name, age та grade
DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER NOT NULL,
    grade CHAR(1) NOT NULL
);

-- Вставка початкових даних у таблицю students
INSERT INTO students (name, age, grade) VALUES
('Mariia', 22, 'A'),
('Dmytrii', 25, 'B'),
('Oleksii', 20, 'C'),
('Olha', 23, 'A'),
('Ivan', 21, 'B'),
('Olena', 24, 'C');