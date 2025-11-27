-- Створення таблиці employees з трьома колонками: id, name, salary
DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    salary INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю employees
INSERT INTO employees (name, salary) VALUES
('Olha', 150000),
('Ivan', 120000),
('Mariia', 110000),
('Petr', 100000),
('Anastasiia', 95000),
('Dmytro', 90000),
('Olena', 85000),
('Oleksii', 80000),
('Serhii', 75000),
('Nataliia', 70000);