-- Створення таблиці employees з колонками employee_id, name, age, salary
DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER NOT NULL,
    salary INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю employees
INSERT INTO employees (employee_id, name, age, salary) VALUES
(1, 'Ivan',      34, 45000),
(2, 'Olga',     28, 52000),
(3, 'Serhii',    40, 63000),
(4, 'Kateryna', 37, 47000),
(5, 'Vladimir',  30, 55000)