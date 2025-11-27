-- Витягування поточного року та місяця з використанням функції DATE_PART
select date_part('year', current_date) as current_year, date_part('month', current_date) as current_month;