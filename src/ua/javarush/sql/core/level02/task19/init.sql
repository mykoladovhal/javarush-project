-- Створення таблиці students з необхідними полями
DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    full_name TEXT NOT NULL,
    age INTEGER NOT NULL,
    grade INTEGER NOT NULL
);

-- Вставка тестових даних
INSERT INTO students (full_name, age, grade) VALUES
    ('Ivan Ivanov',      15, 10),
    ('Olga Smirnova',    16, 10),
    ('Piotr Petrov',     14,  9),
    ('Anna Kuznetsova',  17, 11),
    ('Serhii Sidorov',   15, 10);