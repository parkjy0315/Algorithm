-- 자동차 종류가 'SUV'인 자동차들 평균 일일 대여 요금 출력
SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE LIKE 'SUV';