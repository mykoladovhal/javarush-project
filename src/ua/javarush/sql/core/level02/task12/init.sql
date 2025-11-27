-- Створення таблиці products з трьома колонками
DROP TABLE IF EXISTS products;
CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name TEXT NOT NULL,
    price NUMERIC(10, 2) NOT NULL
);

-- Вставка початкових даних у таблицю products
INSERT INTO products (product_name, price) VALUES
('Tovar A', 120.50),
('Tovar B', 200.00),
('Tovar C', 150.75),
('Tovar D', 90.00),
('Tovar E', 180.25);