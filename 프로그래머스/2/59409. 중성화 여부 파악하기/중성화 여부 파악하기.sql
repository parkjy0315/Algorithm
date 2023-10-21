-- 동물이 중성화되었는지 아닌지 파악
-- 아이디, 이름, 중성화여부 (O, X) (아이디순)
SELECT ANIMAL_ID, NAME,
CASE 
    WHEN SEX_UPON_INTAKE LIKE 'Neutered%' THEN 'O'
    WHEN SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O'
    ELSE 'X'
END AS '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;
