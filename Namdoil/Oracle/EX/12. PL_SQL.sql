-- 1. PL/SQL(Procedual Language Extension to SQL): 오라클에서 제공하는 절차적 언어를 만들기 위한 기능
--												   쿼리문에 변수를 선언하고 조건문이나 반복문을 사용할 수 있다.
-- PL/SQL에서는 결과를 출력하기 위해서 DBMS_OUTPUT.PUT_LINE 함수를 이용한다.

-- 1-1. 기본적인 PL/SQL
DECLARE
	-- 변수의 선언은 변수명 데이터타입
	-- 선언부에서 변수의 값을 할당해도 되고 안해도 된다.
	-- 선언부에서 변수의 값을 할당하지 않으면 실행부에서 변수의 값을 할당해도 된다.
	NUM NUMBER;
BEGIN
	NUM := 10;
	DBMS_OUTPUT.PUT_LINE(NUM);
END;

-- 1-2. 예외처리가 포함된 PL/SQL
DECLARE
	NUM1 NUMBER := 10;
	NUM2 NUMBER := 0;
BEGIN
	DBMS_OUTPUT.PUT_LINE(NUM1 / NUM2);
EXCEPTION
	WHEN ZERO_DIVIDE THEN
		DBMS_OUTPUT.PUT_LINE('0으로 나눌 수 없습니다.');
		DBMS_OUTPUT.PUT_LINE(NUM1 / 1);
END;

-- 1-3. 참조형 변수 선언(테이블의 컬럼 타입 참조)
DECLARE
	-- STUDENT 테이블의 SNO 컬럼 타입과 동일한 타입으로 지정된다.
	STUDENT_NO STUDENT.SNO%TYPE;
	-- STUDENT 테이블의 SNAME 컬럼의 타입과 동일한 타입으로 지정된다.
	STUDENT_NAME STUDENT.SNAME%TYPE;
BEGIN
	STUDENT_NO := '11111111';
	STUDENT_NAME := '고기천';

	DBMS_OUTPUT.PUT_LINE(STUDENT_NO);
	DBMS_OUTPUT.PUT_LINE(STUDENT_NAME);
END;

-- 1-4. 테이블의 행을 참조한 행 참조변수 선언
DECLARE
	-- STUDENT 테이블에 존재하는 컬럼을 모두 가지고 있는 변수 선언
	-- STUDENT_ROW 변수에는 SNO, SNAME, SEX, SYEAR, MAJOR, AVR 포함되어 있다.
	STUDENT_ROW STUDENT%ROWTYPE;
BEGIN
	-- 각각의 컬럼의 데이터 타입은 참조한 테이블의 컬럼의 데이터 타입과 동일하다.
	STUDENT_ROW.SNO := '22222222';
	STUDENT_ROW.SNAME := '홍길동';
	STUDENT_ROW.SEX := '남';
	STUDENT_ROW.SYEAR := 1;
	STUDENT_ROW.MAJOR := '컴공';
	STUDENT_ROW.AVR := 3.56;

	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SEX);
	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SYEAR);
	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.MAJOR);
	DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.AVR);
END;

-- 1-5. SELECT 구문을 이용한 변수의 값 할당
-- SELECT 구문을 이용해서 변수 값을 할당할 때는 BEGIN부 안에서 할당한다.
DECLARE
	STUDENT_NO STUDENT.SNO%TYPE;
BEGIN
	-- SELECT INTO 구문
	-- SELECT 조회할 값 INTO 저장할 변수
	-- FROM
	SELECT SNO INTO STUDENT_NO
		FROM STUDENT
		WHERE SNAME = '고기천';
	DBMS_OUTPUT.PUT_LINE(STUDENT_NO);
END;

-- EMP 테이블의 컬럼을 모두 참조하는 변수를 선언하고
-- ENO이 0001인이 사원의 데이터를 모두 출력하세요.
DECLARE
	EMP_ROW EMP%ROWTYPE;
BEGIN 
	SELECT * INTO EMP_ROW
		FROM EMP
		WHERE ENO = '0001';
	
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.ENO);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.ENAME);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.JOB);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.MGR);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.HDATE);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.SAL);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.COMM);
	DBMS_OUTPUT.PUT_LINE(EMP_ROW.DNO);
END;

-- 2. 조건문(IF/CASE)
-- 2-1. IF
/*
 * IF 조건1 THEN 실행문1
 * ELSIF 조건2 THEN 실행문2
 * ELSIF 조건3 THEN 실행문3
 * ...
 * ELSIF 조건N THEN 실행문N
 * ELSE 실행문
 * END IF;
 * 
 * */
DECLARE
	NUM1 NUMBER := 12345;
	NUM2 NUMBER := 113;
BEGIN
	IF MOD(NUM1, NUM2) = 0 THEN
		DBMS_OUTPUT.PUT_LINE(NUM2 || '는 ' || NUM1 || '의 약수입니다.');
	ELSE
		DBMS_OUTPUT.PUT_LINE(NUM2 || '는 ' || NUM1 || '의 약수가 아닙니다.');
	END IF;
END;

DECLARE
	DEPT_ROW DEPT%ROWTYPE;
BEGIN
	SELECT * INTO DEPT_ROW
		FROM DEPT
		WHERE DNO = '30';
	
	IF DEPT_ROW.LOC = '서울' THEN
		DBMS_OUTPUT.PUT_LINE(DEPT_ROW.DNAME || '부서의 지역은 서울입니다.');
	ELSIF DEPT_ROW.LOC = '대전' THEN
		DBMS_OUTPUT.PUT_LINE(DEPT_ROW.DNAME || '부서의 지역은 대전입니다.');
	ELSIF DEPT_ROW.LOC = '부산' THEN
		DBMS_OUTPUT.PUT_LINE(DEPT_ROW.DNAME || '부서의 지역은 부산입니다.');
	ELSE
		DBMS_OUTPUT.PUT_LINE(DEPT_ROW.DNAME || '부서의 지역은 서울, 대전, 부산 외의 지역입니다.');
	END IF;
END;

-- PROFESSOR 테이블의 모든 컬럼을 참조하는 변수를 선언하고
-- 교수가 정교수인지 부교수인지 출력하는 PL/SQL을 작성하세요.
-- 정교수, 부교수가 아닌 교수는 시간강사입니다.를 출력하세요.
-- PNO가 1032인 교수의 데이터 참조
DECLARE
	PROFESSOR_ROW PROFESSOR%ROWTYPE;
BEGIN
	SELECT * INTO PROFESSOR_ROW
		FROM PROFESSOR
		WHERE PNO = '1032';
	
	IF PROFESSOR_ROW.ORDERS = '정교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 정교수입니다.');
	ELSIF PROFESSOR_ROW.ORDERS = '부교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 부교수입니다.');
	ELSE
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 시간강사입니다.');
	END IF;
END;

-- 2-2. CASE 구문
DECLARE
	PROFESSOR_ROW PROFESSOR%ROWTYPE;
BEGIN
	SELECT * INTO PROFESSOR_ROW
		FROM PROFESSOR
		WHERE PNO = '1032';
	
	-- CASE1: CASE 뒤에 변수를 지정해서 값으로만 조건 비교
	CASE PROFESSOR_ROW.ORDERS
	WHEN '정교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 정교수입니다.');
	WHEN '부교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 부교수입니다.');
	ELSE
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 시간강사입니다.');
	END CASE;

	-- CASE2: CASE 뒤에 변수를 지정하지 않고 WHEN절에서 조건식으로 비교
	CASE 
	WHEN PROFESSOR_ROW.ORDERS = '정교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 정교수입니다.');
	WHEN PROFESSOR_ROW.ORDERS = '부교수' THEN
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 부교수입니다.');
	ELSE
		DBMS_OUTPUT.PUT_LINE(PROFESSOR_ROW.PNAME || '은 시간강사입니다.');
	END CASE;
END;

-- 3. 반복문(기본 LOOP, WHILE LOOP, FOR LOOP)
-- 3-1. 기본 LOOP
DECLARE
	NUM1 NUMBER := 0;
BEGIN
	LOOP
		NUM1 := NUM1 + 1;
		-- 특정 조건일 때 이번 실행을 건너뜀
		CONTINUE WHEN MOD(NUM1, 2) != 0;
		DBMS_OUTPUT.PUT_LINE(NUM1);
		-- 특정 조건일 때 LOOP 종료
		EXIT WHEN NUM1 >= 10;
	END LOOP;
END;

-- 3-2. WHILE LOOP
-- 특정 조건이 충족되는 동안 계속 반복 실행
DECLARE
	NUM NUMBER := 1;
BEGIN
	WHILE NUM <= 10 LOOP
		DBMS_OUTPUT.PUT_LINE(NUM);
		NUM := NUM + 1;
	END LOOP;
END;

-- 3-3. FOR LOOP
-- 시작값과 종료값을 지정해서 사작 값부터 종료 값까지 계속 반복
DECLARE 
	NUM NUMBER;
BEGIN
	FOR NUM IN REVERSE 1..10 LOOP
		DBMS_OUTPUT.PUT_LINE(NUM);
	END LOOP;
END;

-- 기본 LOOP 문을 이용해서 학생의 학생번호, 학생이름 10개 출력
DECLARE
	STUDENT_ROW STUDENT%ROWTYPE;
	CNT NUMBER := 0;
BEGIN
	LOOP
		-- 조회하는 데이터의 행의 개수가 0개면 NO_DATA_FOUND 예외가 발생한다.
		SELECT * INTO STUDENT_ROW
			FROM STUDENT
			WHERE SNO = TO_CHAR(TO_NUMBER('915301') + CNT);
		
		CNT := CNT + 1;
	
		EXIT WHEN CNT > 10;
	
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
	END LOOP;
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('해당 데이터를 찾지 못했습니다.');
END;

DECLARE
	STUDENT_ROW STUDENT%ROWTYPE;
	CNT NUMBER := 0;
	ROWCNT NUMBER := 0;
BEGIN
	LOOP
		-- 조회하는 데이터의 행의 개수가 0개면 NO_DATA_FOUND 예외가 발생한다.
		SELECT * INTO STUDENT_ROW
			FROM STUDENT
			WHERE SNO = TO_CHAR(TO_NUMBER('915301') + CNT);
		
		SELECT COUNT(*) INTO ROWCNT
			FROM STUDENT
			WHERE SNO = TO_CHAR(TO_NUMBER('915301') + CNT);
		
		CNT := CNT + 1;
	
		EXIT WHEN CNT > 10;
	
		IF ROWCNT = 0 THEN
			DBMS_OUTPUT.PUT_LINE('데이터가 존재하지 않습니다.');
		ELSE
			DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
			DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
		END IF;
	END LOOP;
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('해당 데이터를 찾지 못했습니다.');
END;

-- WHILE LOOP로 변경
DECLARE
	STUDENT_ROW STUDENT%ROWTYPE;
	CNT NUMBER := 0;
BEGIN
	WHILE CNT <= 10 LOOP
		SELECT * INTO STUDENT_ROW
			FROM STUDENT
			WHERE SNO = TO_CHAR(TO_NUMBER('915301') + CNT);
		
		CNT := CNT + 1;
	
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
	END LOOP;
EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('해당 데이터를 찾을 수 없습니다.');
END;

-- FOR LOOP로 변경
DECLARE
	STUDENT_ROW STUDENT%ROWTYPE;
	CNT NUMBER;
BEGIN
	FOR CNT IN 0..10 LOOP
		SELECT * INTO STUDENT_ROW
			FROM STUDENT
			WHERE SNO = TO_CHAR(TO_NUMBER('915301') + CNT);
	
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
	END LOOP;
EXCEPTION 
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('해당 데이터를 찾을 수 없습니다.');
END;

-- 4. 레코드: 다양한 타입의 변수들을 모아놓은 자료형.
DECLARE
	-- 레코드의 선언
	TYPE STUDENT_REC IS RECORD(
		-- 기본 데이터 타입과 참조형 데이터 타입들을 모두 사용할 수 있다.
		SNO VARCHAR2(8) NOT NULL := '11111111',
		SNAME STUDENT.SNAME%TYPE,
		SEX STUDENT.SEX%TYPE,
		SYEAR NUMBER(1) NOT NULL DEFAULT 1,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE,
		JOIN_DATE DATE DEFAULT SYSDATE,
		SCORE_ROW SCORE%ROWTYPE
	);

	-- 위에 선언한 레코드 자료형으로 변수를 하나 선언해야 실행부에서 레코드를 사용할 수 있다.
	-- 레코드 자료형의 변수 선언
	STUDENTREC STUDENT_REC;
BEGIN
	STUDENTREC.SNO := '22222222';
	STUDENTREC.SNAME := '이순신';

--	STUDENTREC.SCORE.SNO := '915301';
--	STUDENTREC.SCORE.CNO := '1211';
--	STUDENTREC.SCORE.RESULT := '100';

	SELECT * INTO STUDENTREC.SCORE_ROW
		FROM SCORE
		WHERE SNO = '915301'
		  AND CNO = '1211';
		 
	DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNO);
	DBMS_OUTPUT.PUT_LINE(STUDENTREC.SNAME);
	DBMS_OUTPUT.PUT_LINE(STUDENTREC.SCORE_ROW.CNO);
	DBMS_OUTPUT.PUT_LINE(STUDENTREC.SCORE_ROW.RESULT);
END;

-- 4-1. 레코드를 통한 데이터 저장
CREATE TABLE STUDENT_RECORD
AS SELECT * FROM STUDENT;

DECLARE
	TYPE STUDENT_REC IS RECORD(
		SNO STUDENT.SNO%TYPE,
		SNAME STUDENT.SNAME%TYPE,
		SEX STUDENT.SEX%TYPE,
		SYEAR STUDENT.SYEAR%TYPE,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE
	);

	STUDENTREC STUDENT_REC;
BEGIN
	STUDENTREC.SNO := '33333333';
	STUDENTREC.SNAME := '이순신';
	STUDENTREC.SEX := '남';
	STUDENTREC.SYEAR := 1;
	STUDENTREC.MAJOR := '컴공';
	STUDENTREC.AVR := 4.0;
	
	-- 데이터 저장
	INSERT INTO STUDENT_RECORD
	VALUES STUDENTREC;
	COMMIT;
END;

SELECT *
	FROM STUDENT_RECORD
	WHERE SNO = '33333333';

-- 4-2. 레코드를 통한 데이터 수정
DECLARE
	TYPE STUDENT_RECORD IS RECORD(
		SNO STUDENT.SNO%TYPE,
		SNAME STUDENT.SNAME%TYPE,
		SEX STUDENT.SEX%TYPE,
		SYEAR STUDENT.SYEAR%TYPE,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE
	);

	STUDENTREC STUDENT_RECORD;
BEGIN
	STUDENTREC.SNO := '33333333';
	STUDENTREC.SNAME := '이순신';
	STUDENTREC.SEX := '남';
	STUDENTREC.SYEAR := 4;
	STUDENTREC.MAJOR := '소프트웨어';
	STUDENTREC.AVR := 3.56;

	-- 데이터 수정
	UPDATE STUDENT_RECORD
		SET
--			MAJOR = STUDENTREC.MAJOR,
--			AVR = STUDENTREC.AVR
			ROW = STUDENTREC
		WHERE
			SNO = STUDENTREC.SNO;
	COMMIT;
END;

DELETE FROM STUDENT_RECORD
WHERE SNO = '33333333';
COMMIT;

-- 4-3. 레코드안에 레코드 선언
DECLARE
	TYPE SCO_REC IS RECORD(
		SNO SCORE.SNO%TYPE,
		CNO SCORE.CNO%TYPE,
		RESULT SCORE.RESULT%TYPE
	);

	TYPE STU_REC IS RECORD(
		STU_ROW STUDENT%ROWTYPE,
		-- 레코드안에 레코드 변수 선언
		SCOREC SCO_REC
	);

	STUREC STU_REC;
BEGIN
	SELECT ST.SNO
		 , ST.SNAME
		 , ST.SEX
		 , ST.SYEAR
		 , ST.MAJOR
		 , ST.AVR
		 , SC.CNO
		 , SC.RESULT
		INTO 
			STUREC.STU_ROW.SNO
		  , STUREC.STU_ROW.SNAME
		  , STUREC.STU_ROW.SEX
		  , STUREC.STU_ROW.SYEAR
		  , STUREC.STU_ROW.MAJOR
		  , STUREC.STU_ROW.AVR
		  , STUREC.SCOREC.CNO
		  , STUREC.SCOREC.RESULT
		FROM STUDENT ST
		JOIN SCORE SC
		  ON ST.SNO = SC.SNO
		WHERE ST.SNO = '915301'
		  AND SC.CNO = '1211';
		 
	DBMS_OUTPUT.PUT_LINE(STUREC.STU_ROW.SNO);
	DBMS_OUTPUT.PUT_LINE(STUREC.STU_ROW.SNAME);
	DBMS_OUTPUT.PUT_LINE(STUREC.SCOREC.CNO);
	DBMS_OUTPUT.PUT_LINE(STUREC.SCOREC.RESULT);
END;

-- 5. 연관 배열: 동일한 데이터 타입의 데이터들을 모아놓은 객체
DECLARE
	-- 연관 배열 자료형 선언
	TYPE NUM_ARR IS TABLE OF NUMBER
	INDEX BY PLS_INTEGER;

	-- 연관 배열 변수 선언
	NUMARR NUM_ARR;

	-- 연관 배열에 저장할 변수 선언
	NUM NUMBER := 0;
BEGIN
	LOOP
		NUM := NUM + 1;
		NUMARR(NUM) := NUM;
		EXIT WHEN NUM > 5;
	END LOOP;
	
	DBMS_OUTPUT.PUT_LINE(NUMARR(1));
	DBMS_OUTPUT.PUT_LINE(NUMARR(2));
	DBMS_OUTPUT.PUT_LINE(NUMARR(3));
	DBMS_OUTPUT.PUT_LINE(NUMARR(4));
	DBMS_OUTPUT.PUT_LINE(NUMARR(5));
END;

-- 5-1. 레코드 연관 배열
DECLARE
	TYPE STU_REC IS RECORD(
		SNO STUDENT.SNO%TYPE,
		SNAME STUDENT.SNAME%TYPE,
		SEX STUDENT.SEX%TYPE,
		SYEAR STUDENT.SYEAR%TYPE,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE
	);

	-- 위에서 선언한 레코드 타입의 연관 배열 선언
	TYPE STU_REC_ARR IS TABLE OF STU_REC
	INDEX BY PLS_INTEGER;
	
	-- 연관 배열 변수 선언
	STURECARR STU_REC_ARR;

	IDX NUMBER := 1;
BEGIN
	LOOP
		SELECT DECODE(MOD(IDX, 2), 0, '남', '여') INTO STURECARR(IDX).SEX
			FROM DUAL;
		
		STURECARR(IDX).SNO := TO_CHAR(10000 + IDX);
		STURECARR(IDX).SNAME := '학생' || (10000 + IDX);
		STURECARR(IDX).SYEAR := MOD(IDX, 4) + 1;
		STURECARR(IDX).MAJOR := '컴공';
		STURECARR(IDX).AVR := MOD(IDX, 4) + 0.24;
	
		-- 데이터 저장
		INSERT INTO STUDENT_RECORD
		VALUES STURECARR(IDX);
		COMMIT;
	
		IDX := IDX + 1;
		EXIT WHEN IDX >= 10;
	END LOOP;
	
END;

SELECT *
	FROM STUDENT_RECORD
	WHERE SNO LIKE '1000%';

-- 7-2. 연관 배열을 ROWTYPE으로 생성해서
-- STUDENT_RECORD 테이블에 SNO 20001~20009번까지 학생을 저장하세요.
-- SNO, SNAME, SEX, SYEAR, MAJOR, AVR은 위의 내용 참고
DECLARE
	-- STU_ROW_ARR(1) => SNO, SNAME, SEX, SYEAR, MAJOR, AVR
	-- STU_ROW_ARR(2) => SNO, SNAME, SEX, SYEAR, MAJOR, AVR	
	-- STU_ROW_ARR(3) => SNO, SNAME, SEX, SYEAR, MAJOR, AVR
	TYPE STU_ROW_ARR IS TABLE OF STUDENT_RECORD%ROWTYPE
	INDEX BY PLS_INTEGER;

	STUROWARR STU_ROW_ARR;

	IDX NUMBER := 1;
BEGIN
	LOOP
		SELECT DECODE(MOD(IDX, 2), 0, '남', '여') INTO STUROWARR(IDX).SEX
			FROM DUAL;
		
		STUROWARR(IDX).SNO := TO_CHAR(20000 + IDX);
		STUROWARR(IDX).SNAME := '학생' || (20000 + IDX);
		STUROWARR(IDX).SYEAR := MOD(IDX, 4) + 1;
		STUROWARR(IDX).MAJOR := '소프트웨어';
		STUROWARR(IDX).AVR := MOD(IDX, 4) + 0.33;
	
		INSERT INTO STUDENT_RECORD
		VALUES STUROWARR(IDX);
		COMMIT;
	
		IDX := IDX + 1;
		EXIT WHEN IDX >= 10;
	END LOOP;
	
END;

SELECT *
	FROM STUDENT_RECORD
	WHERE SNO LIKE '2000%';

-- 5-3. 연관 배열의 함수
DECLARE
	TYPE STU_ROW_ARR IS TABLE OF STUDENT_RECORD%ROWTYPE
	INDEX BY PLS_INTEGER;

	STUROWARR STU_ROW_ARR;
BEGIN
	STUROWARR(1).SNO := '30001';
	STUROWARR(1).SNAME := '학생30001';
	STUROWARR(1).SEX := '남';
	STUROWARR(1).SYEAR := 1;
	STUROWARR(1).MAJOR := '정보통신';
	STUROWARR(1).AVR := 1.67;

	STUROWARR(2).SNO := '30002';
	STUROWARR(2).SNAME := '학생30002';
	STUROWARR(2).SEX := '여';
	STUROWARR(2).SYEAR := 2;
	STUROWARR(2).MAJOR := '정보통신';
	STUROWARR(2).AVR := 3.67;

	STUROWARR(3).SNO := '30003';
	STUROWARR(3).SNAME := '학생30003';
	STUROWARR(3).SEX := '남';
	STUROWARR(3).SYEAR := 3;
	STUROWARR(3).MAJOR := '정보통신';
	STUROWARR(3).AVR := 2.67;

	STUROWARR(10).SNO := '30010';
	STUROWARR(10).SNAME := '학생30010';
	STUROWARR(10).SEX := '남';
	STUROWARR(10).SYEAR := 1;
	STUROWARR(10).MAJOR := '정보통신';
	STUROWARR(10).AVR := 0.67;

	-- COUNT: 연관 배열에 저장되어있는 데이터의 개수
	DBMS_OUTPUT.PUT_LINE(STUROWARR.COUNT);
	-- FIRST: 연관 배열에 첫 번째 데이터의 인덱스 리턴
	DBMS_OUTPUT.PUT_LINE(STUROWARR.FIRST);
	-- LAST: 연관배열에 마지막 데이터의 인덱스 리턴
	DBMS_OUTPUT.PUT_LINE(STUROWARR.LAST);
	-- PRIOR(인덱스): 지정한 인덱스 이전의 인덱스 리턴
	DBMS_OUTPUT.PUT_LINE(STUROWARR.PRIOR(10));
	-- NEXT(인덱스): 지정한 인덱스 다음의 인덱스 리턴
	DBMS_OUTPUT.PUT_LINE(STUROWARR.NEXT(1));

	-- EXISTS(인덱스): 지정한 인덱스에 데이터가 존재하는 지 TRUE, FALSE로 리턴
	-- TRUE, FALSE로 리턴되기 때문에 출력할 수 없다.(오라클에 BOOLEAN 타입 없기 때문에)
	-- EXISTS 함수는 조건문에서 사용한다.
	IF STUROWARR.EXISTS(3) THEN
		DBMS_OUTPUT.PUT_LINE('INDEX 3의 값: ' || STUROWARR(3).SNO);
	ELSE
		DBMS_OUTPUT.PUT_LINE('INDEX 3에 값이 없습니다.');
	END IF;
END;

-- 6. 커서(CURSOR): CURSOR는 쿼리(SELECT)의 결과를 저장해두는 메모리 공간
--				  PL/SQL에서는 CURSOR를 이용해서 데이터를 조작할 수 있다.
-- 6-1. 한 행만 조회하는 CURSOR
DECLARE
	-- 커서의 선언
	CURSOR STU_CUR IS
		SELECT SNO
			 , SNAME
			 , SEX
			 , SYEAR
			 , MAJOR
			 , AVR
			FROM STUDENT
			WHERE SNO = '915301';
		
	-- 커서의 조회 쿼리 결과의 값들을 담아줄 변수 선언
	-- 변수의 형태는 일반 변수, 레코드, 참조타입 변수여도 상관없다.
	-- 커서가 여러 컬럼을 조회할 때는 레코드나 ROWTYPE으로만 값을 받아서 사용할 수 있다.
	TYPE STU_REC IS RECORD(
		SNO VARCHAR2(8),
		SNAME STUDENT.SNAME%TYPE,
		SEX STUDENT.SEX%TYPE,
		SYEAR STUDENT.SYEAR%TYPE,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE
	);
	
	STUREC STU_REC;
BEGIN
	-- 커서 오픈
	OPEN STU_CUR;

	-- FETCH 커서에 저장되어 있는 데이터들을 변수로 옮겨주는 작업
	FETCH STU_CUR INTO STUREC;
	  	
	DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
	DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
	DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);
	DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);

	-- 커서 닫기
	CLOSE STU_CUR;
END;

-- 6-2. 여러 개 행을 저장하고 있는 커서
DECLARE 
	CURSOR STU_CUR IS
		SELECT SNO
			 , SNAME
			 , SEX
			 , SYEAR
			 , MAJOR
			 , AVR
			FROM STUDENT;
		
	STUDENT_ROW STUDENT%ROWTYPE;
BEGIN
	OPEN STU_CUR;

	LOOP 
		-- FECTH: 한 행에 대한 데이터만 꺼내온다.
		FETCH STU_CUR INTO STUDENT_ROW;
	
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
		DBMS_OUTPUT.PUT_LINE('--------------------');
	
		-- 커서명%NOTFOUND: 더 이상 꺼내올 데이터가 없으면 TRUE, 데이터가 있으면 FALSE
		EXIT WHEN STU_CUR%NOTFOUND;
	END LOOP;
	
	CLOSE STU_CUR;
	
END;

-- FOR LOOP에서는 CURSOR의 OPEN, FETCH, CLOSE가 자동으로 이뤄진다.
DECLARE 
	CURSOR STU_CUR IS
		SELECT SNO
			 , SNAME
			 , SEX
			 , SYEAR
			 , MAJOR
			 , AVR
			FROM STUDENT;
-- FOR LOOP에서는 선언하지 않은 변수를 사용할 수 있다.
--	STUDENT_ROW STUDENT%ROWTYPE;
BEGIN
	FOR STUDENT_ROW IN STU_CUR LOOP 
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNO);
		DBMS_OUTPUT.PUT_LINE(STUDENT_ROW.SNAME);
		DBMS_OUTPUT.PUT_LINE('--------------------');
	END LOOP;
END;

-- 6-3. 커서 파라미터: 커서를 선언할 때 파라미터도 함께 선언해서 고정적인 쿼리의 결과가 아닌
--				   유동적인 쿼리의 결과를 커서에 저장하는 기능
--  			   커서를 오픈할 때 파라미터로 지정한 데이터 타입의 값을 함께 넘겨준다.
DECLARE
	-- 파라미터가 있는 커서의 선언
	-- 파라미터들은 조회 쿼리의 조건절(WHERE 절)에서 사용해서 유동적인 쿼리를 실행할 수 있게 해준다.
	CURSOR STU_CUR(PARAM_SYEAR NUMBER, PARAM_AVR NUMBER) IS 
		SELECT SNO
			 , SNAME
			 , SYEAR
			 , MAJOR
			 , AVR
			FROM STUDENT
			WHERE SYEAR = PARAM_SYEAR
			  AND AVR >= PARAM_AVR;
			 
	TYPE STU_REC IS RECORD(
		SNO STUDENT.SNO%TYPE,
		SNAME STUDENT.SNAME%TYPE,
		SYEAR STUDENT.SYEAR%TYPE,
		MAJOR STUDENT.MAJOR%TYPE,
		AVR STUDENT.AVR%TYPE
	);

	STUREC STU_REC;
BEGIN
	-- 커서를 오픈할 때 지정된 파라미터 데이터타입의 값들을 전달한다.
	OPEN STU_CUR(1, 2.7);

	LOOP
		FETCH STU_CUR INTO STUREC;
	
		EXIT WHEN STU_CUR%NOTFOUND;
	
		DBMS_OUTPUT.PUT_LINE('1학년 학생 중 평점이 2.7 이상인 학생목록');
		DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
		DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
		DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);
		DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);
		DBMS_OUTPUT.PUT_LINE(STUREC.AVR);
		DBMS_OUTPUT.PUT_LINE('-------------------');
	END LOOP;
	
	CLOSE STU_CUR;
	
	-- CLOSE된 커서는 OPEN으로 다시 열어서 사용할 수 있다.
	OPEN STU_CUR(3, 1.5);

	LOOP
		FETCH STU_CUR INTO STUREC;
	
		EXIT WHEN STU_CUR%NOTFOUND;
	
		DBMS_OUTPUT.PUT_LINE('3학년 학생 중 평점이 1.5 이상인 학생목록');
		DBMS_OUTPUT.PUT_LINE(STUREC.SNO);
		DBMS_OUTPUT.PUT_LINE(STUREC.SNAME);
		DBMS_OUTPUT.PUT_LINE(STUREC.SYEAR);
		DBMS_OUTPUT.PUT_LINE(STUREC.MAJOR);
		DBMS_OUTPUT.PUT_LINE(STUREC.AVR);
		DBMS_OUTPUT.PUT_LINE('-------------------');
	END LOOP;
	
	CLOSE STU_CUR;
END;

-- 부서번호와 급여를 파라미터로 받는 커서를 선언하고
-- 파라미터로 전달된 부서번호와 부서번호가 같고 파라미터로 전달된 급여이상되는 급여를 받는 사원 목록을 조회
-- EMP 테이블의 모든 컬럼을 조회
-- 커서의 데이터를 받는 변수는 EMP ROWTPYE 변수
DECLARE
	CURSOR EMP_CUR(PARAM_DNO VARCHAR2, PARAM_SAL NUMBER) IS
		SELECT *
			FROM EMP
			WHERE DNO = PARAM_DNO
			  AND SAL >= PARAM_SAL;
			 
	EMP_ROW EMP%ROWTYPE;
BEGIN
	OPEN EMP_CUR('01', 3000);

	LOOP
		FETCH EMP_CUR INTO EMP_ROW;
	
		EXIT WHEN EMP_CUR%NOTFOUND;
		
		DBMS_OUTPUT.PUT_LINE('01부서에서 급여가 3000이상인 사원 목록');
		DBMS_OUTPUT.PUT_LINE(EMP_ROW.ENO);
		DBMS_OUTPUT.PUT_LINE(EMP_ROW.ENAME);
		DBMS_OUTPUT.PUT_LINE(EMP_ROW.SAL);
		DBMS_OUTPUT.PUT_LINE(EMP_ROW.DNO);
		DBMS_OUTPUT.PUT_LINE('-----------------------');
	END LOOP;
	
	CLOSE EMP_CUR;
END;





