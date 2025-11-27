-- Запит: вивід повного імені та віку студентів старше 12 років,
--        які проживають у місті New York, з перейменованими стовпцями
--        та сортуванням за віком у порядку зростання.

SELECT
    full_name AS student_name,  -- перейменування full_name у student_name
    age       AS student_age    -- перейменування age у student_age
FROM
    students
WHERE
    age > 12                    -- фільтрація за віком > 12
    and city = 'New York'       -- фільтрація за містом New York
ORDER BY
    student_age  ;           -- сортування за зростанням віку