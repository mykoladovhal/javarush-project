-- Створення таблиці sales з даними про продажі
DROP TABLE IF EXISTS sales;
CREATE TABLE sales (
    sale_id SERIAL PRIMARY KEY, -- Унікальний ідентифікатор продажу
    product_name TEXT NOT NULL, -- Назва продукту
    total_amount INTEGER NOT NULL -- Сума продажу
);

-- Вставка початкових даних у таблицю sales
INSERT INTO sales (sale_id, product_name, total_amount) VALUES
(1001, 'Televizor', 450),
(1002, 'Kholodylnyk', 670),
(1003, 'Posudomoyka', 520);