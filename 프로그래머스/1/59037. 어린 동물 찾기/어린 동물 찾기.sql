-- 젊은 동물 아이디, 이름, 조회
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION NOT LIKE 'Aged'
ORDER BY ANIMAL_ID;