-- 이름이 있는 동물의 ID를 조회
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL ORDER BY ANIMAL_ID;