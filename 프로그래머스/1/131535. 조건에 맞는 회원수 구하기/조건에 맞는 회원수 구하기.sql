-- 2021년 가입한 회원 중 나이가 20세이상 29세 이하인 회원 몇명인지 출력
SELECT COUNT(*)
FROM USER_INFO
WHERE 
    JOINED LIKE '2021%' AND
    AGE >= 20 AND AGE <= 29
;