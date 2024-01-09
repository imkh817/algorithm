-- 코드를 입력하세요
SELECT BOOK_ID,to_char(PUBLISHED_DATE,'yyyy-mm-dd')
FROM BOOK
WHERE extract(year from PUBLISHED_DATE) = '2021' and CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;