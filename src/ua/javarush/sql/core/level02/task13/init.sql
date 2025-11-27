-- Створення таблиці students зі стовпцями id, name та age
DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю students
INSERT INTO students (name, age) VALUES
('Ivan', 20),
('Anna', 22),
('Aleksandr', 19),
('Mariia', 21),
('Oleh', 23),
('Ekaterina', 24),
('Dmytrii', 18);