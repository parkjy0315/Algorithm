-- 진료과가 흉부외과거나 일반외과인
-- 의사의 이름, 아이디, 진료과, 고용일자를 조회
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d')
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;