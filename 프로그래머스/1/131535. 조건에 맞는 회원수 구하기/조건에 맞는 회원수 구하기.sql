SELECT COUNT(USER_ID) AS USER_INFO 
FROM USER_INFO 
WHERE to_char(JOINED,'yyyy') = '2021' AND AGE BETWEEN 20 and 29;
