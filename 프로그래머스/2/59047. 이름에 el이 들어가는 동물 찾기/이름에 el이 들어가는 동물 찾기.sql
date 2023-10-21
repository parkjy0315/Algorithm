-- 개 이름에 el이 포함되는 개의 아이디, 이름 조회 (이름 순, 대소문자 구분 x)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE LIKE 'Dog' 
AND NAME LIKE '%el%'
ORDER BY NAME ASC