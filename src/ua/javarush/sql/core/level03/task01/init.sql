-- Створення таблиці employees з колонками employee_id, first_name та last_name
DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL
);

-- Вставка початкових даних у таблицю employees
INSERT INTO employees (first_name, last_name) VALUES
('Ivan', 'Ivanov'),
('Anna', 'Smirnova'),
('Petr', 'Sidorov');