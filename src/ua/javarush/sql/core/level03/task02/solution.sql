-- Запит для перетворення числового значення total_amount у рядок з додаванням тексту " USD"
-- і формування нового стовпця formatted_amount
select sale_id, product_name, total_amount::text || ' USD' as formatted_amount
from sales