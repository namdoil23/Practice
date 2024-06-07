-- 1. DDL(DATA DEFINITION LANGUAGE): 데이터 정의어
-- 데이터를 관리하기 위한 객체들을 조직하기 위한 명령어
-- 1-1. CREATE: 객체를 생성하기 위한 명령어
-- CREATE 객체명(TABLE, USER, INDEX, SEQUENCE...) 객체의 별칭(테이블명, 유저명, 인덱스명, 시퀀스명....)
-- 다른 테이블을 참조하여 테이블 생성
CREATE TABLE STUDENT_COPY2
	AS SELECT * FROM STUDENT;
	
SELECT * 
	FROM STUDENT_COPY2;
	
-- 원하는대로 컬럼명과 개수를 지정할 수도 있다.
-- 컬럼의 타입은 SELECT 구문에서 조회해오는 데이터의 타입과 맞춰지기 때문에 바꿀 수 없다.
-- 과목의 과목번호, 과목이름, 담당교수번호, 담당교수이름, 과목별 기말고사 성적의 평균이 저장된 테이블 생성
CREATE TABLE COURSE_PROFESSOR_AVGES(COURSE_NO, COURSE_NAME, PRO_NO, PRO_NAME, AVG_RESULT)
	AS SELECT SC.CNO
		 	, C.CNAME
		 	, C.PNO
		 	, P.PNAME
		 	, ROUND(AVG(SC.RESULT), 2)
		 	FROM COURSE C
		 	JOIN SCORE SC
		 	  ON C.CNO = SC.CNO
		 	JOIN PROFESSOR P
		 	  ON C.PNO = P.PNO
		 	GROUP BY SC.CNO,C.CNAME, C.PNO, P.PNAME;
		 	
SELECT *
	FROM COURSE_PROFESSOR_AVGES;
	
-- 학생번호, 학생이름, 학생별 기말고사 성적의 평균점수(소수점 둘쨰자리), 학생별 기말고사의 평균점수의 등급을 가지는
-- 테이블 ST_AVGES_GRADE를 생성하세요.
CREATE TABLE ST_AVGES_GRADE(STUDENT_NO, STUDENT_NAME, AVG_RESULT, SCGRADE_GRADE)
	AS SELECT SC.SNO
			, S.SNAME
			FROM SCORE SC
			JOIN STUDENT S
			  ON SC.SNO = S.SNO
			  WHERE SNO IN (
							SELECT SG.GRADE 
								FROM SCGRADE SG
								GROUP BY SNO
								HAVING ROUND(AVG(SC.RESULT), 2)
								ON SSC_RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
			  				)
			  

CREATE TABLE ST_AVGES_GRADE AS
SELECT
    S.SNO AS STUDENT_NO,
    S.SNAME AS STUDENT_NAME,
    ROUND(AVG(SC.RESULT), 2) AS AVG_RESULT,
    SG.GRADE AS SCGRADE_GRADE
FROM STUDENT S
JOIN SCORE SC ON S.SNO = SC.SNO
JOIN (
    SELECT
        SNO,
        ROUND(AVG(RESULT), 2) AS AVG_RESULT
    FROM SCORE
    GROUP BY SNO
	) AVG_SC 
	ON S.SNO = AVG_SC.SNO
JOIN SCGRADE SG 
ON AVG_SC.AVG_RESULT BETWEEN SG.LOSCORE AND SG.HISCORE
GROUP BY S.SNO, S.SNAME, SG.GRADE;

SELECT *
	FROM ST_AVGES_GRADE;

-- 1-2. ALTER: 객체를 변경하거나 수정할 때 사용하는 명령어
-- ALTER 객체명(TABLE, USER, INDEX, SEQUENCE...) 객체의 별칭(테이블명, 유저명, 인덱스명, 시퀀스명....)
--  작업내용(SET, ADD, MODIFY, DROP,...)
-- ADD: 테이블에 컬럼추가
-- ADD '추가할 컬럼의 이름' '컬럼의 데이터 타입'
ALTER TABLE EMP_DNO30 ADD ADDR VARCHAR2(1000);

-- RENAME: 테이블 컬럼의 이름의 변경
-- RENAME COLUMN '현재 사용중인 컬럼명' TO '변경할 컬럼명'
ALTER TABLE EMP_DNO30 RENAME COLUMN ADDR TO ADDRESS;

-- MODIFY: 테이블 컬럼의 데이터타입을 변경
-- MODIFY '데이터 타입을 변경할 컬럼' '변경할 테이터 타입'
-- 데이터타입을 변결할 컬럼은 데이터가 비어있어야한다.
ALTER TABLE EMP_DNO30 MODIFY COMM VARCHAR2(10);

ALTER TABLE EMP_DNO30 MODIFY ADDRESS VARCHAR2(10);

-- DROP: 테이블 컬럼을 삭제
-- DROP COLUMN '삭제할 컬럼명'
-- 컬럼에 저장되어 있는 데이터들도 함께 삭제된다.
ALTER TABLE EMP_DNO30 DROP COLUMN ADDRESS;

-- 1-3. DROP: 데이터베이스의 객체를 삭제하는 명령어
-- DROP 객체명(TABLE, USER, INDEX, SEQUENCE...) 객체의 별칭(테이블명, 유저명, 인덱스명, 시퀀스명....)
DROP TABLE COURSE_PROFESSOR; 

-- DROP TABLE 명령어로 삭제된 테이블은 TIMESTAMP를 이용해서 살릴수 없다.
-- ENTERPRISE 버젼에서 FLASHBACK이라는 기능을 제공해서 DROP 테이블도 살릴 수가 없다.
SELECT *
	FROM COURSE_PROFESSOR
	AS OF TIMESTAMP(SYSTIMESTAMP - INTERVAL '10' MINUTE);

-- TIMESTAMP로 DELETE 구문으로 삭제된 데이터 복구
DELETE FROM EMP_DNO30;
COMMIT;

SELECT * FROM EMP_DNO30;

INSERT INTO EMP_DNO30
SELECT *
	  FROM EMP_DNO30
	  AS OF TIMESTAMP(SYSTIMESTAMP - INTERVAL '50' SECOND);
COMMIT;	 

SELECT *
	FROM EMP_DNO30;

-- 1-4. RENAME: 객체의 이름을 변경
-- RENAME '현재 객체의 별칭' TO '변경할 객체의 별칭'
RENAME EMP_DNO30 TO EMP_DNO;

SELECT *
	FROM EMP_DNO
	
-- 1-5. TRUNCATE: 테이블의 데이터를 삭제
-- TRUNCATE TABLE '테이블명'
-- WHERE 절을 사용할 수 없어서 모든 데이터를 삭제한다.
-- TRUNCATE는 DDL이기 때문에 트랙잭션이 바로 종료돼서 ROLLBACK으로 작업을 취소할 수 없다.
TRUNCATE TABLE EMP_DNO;




