-- Створення таблиці products з колонками id, product_name, category та price
DROP TABLE IF EXISTS products;
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    product_name TEXT NOT NULL,
    category TEXT NOT NULL,
    price INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю products
INSERT INTO products (product_name, category, price) VALUES
('Smartfon', 'Electronics', 30000),
('Televizor', 'Electronics', 45000),
('Kholodylnyk', 'Appliances', 50000),
('Pylysos', 'Appliances', 15000),
('Lampochka', 'Lighting', 500);