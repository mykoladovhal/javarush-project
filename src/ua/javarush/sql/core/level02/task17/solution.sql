-- Вибір назви та ціни товарів з категорії "Appliances", відсортованих за ціною за спаданням
select product_name, price
from products
where category = 'Appliances'
order by price desc