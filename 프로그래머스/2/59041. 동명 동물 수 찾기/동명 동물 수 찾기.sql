-- 코드를 입력하세요
-- SELECT * FROM(
-- SELECT NAME,COUNT(NAME) AS COUNT
-- FROM ANIMAL_INS
-- WHERE NAME IS NOT NULL
-- GROUP BY NAME
-- ORDER BY NAME)
-- WHERE COUNT >1

SELECT NAME, COUNT(NAME) AS COUNT
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME) > 1
ORDER BY NAME