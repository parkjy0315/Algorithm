-- 경기도에 위치한 창고의 아이디, 이름, 주소, 냉동시설 여부 조회
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
    CASE 
        WHEN FREEZER_YN is NULL THEN 'N'
        ELSE FREEZER_YN
    END
    AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE "경기도%"
ORDER BY WAREHOUSE_ID;