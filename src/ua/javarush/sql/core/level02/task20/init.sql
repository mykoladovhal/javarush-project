-- Створення таблиці students у контексті бази даних school
DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id SERIAL PRIMARY KEY,      -- унікальний ідентифікатор студента
    full_name TEXT NOT NULL,    -- повне ім'я студента
    age INTEGER NOT NULL,       -- вік студента
    grade TEXT,                 -- клас навчання студента
    city TEXT                   -- місто проживання студента
);

-- Вставка тестових даних у таблицю students
INSERT INTO students (full_name, age, grade, city) VALUES
    ('Mariia Dzhonson',    13, '8A', 'New York'),
    ('Dzhek Smit',         14, '9B', 'New York'),
    ('Oleksandr Ivanov',   12, '6C', 'Boston'),
    ('Yelena Petrova',     15, '10A','New York'),
    ('Ivan Kuznetsov',     11, '5B', 'New York'),
    ('Sofiia Li',          16, '11C','Los Angeles'),
    ('Lukas Honsales',     17, '12A','New York');