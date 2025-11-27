-- Запит для отримання поточного порту, який використовує сервер PostgreSQL
SELECT name, setting
FROM pg_settings
WHERE name = 'port';
