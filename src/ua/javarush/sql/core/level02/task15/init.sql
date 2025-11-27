-- Створення таблиці products
DROP TABLE IF EXISTS products;
CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    price INTEGER NOT NULL
);

-- Вставка початкових даних у таблицю products
INSERT INTO products (name, price) VALUES
('Telefon', 15000),
('Noutbuk', 45000),
('Planshet', 25000),
('Kamera', 30000),
('Chasy', 10000);