1. mysql 접속
   mysql -uroot -p

2. 데이터베이스(폴더) > 테이블(파일)

    데이터베이스 보기
    show databases;

    데이터베이스를 선택하는 명령어
    use databse;

    데이터베이스 안에 있는 테이블 확인
    show tables;

    테이블(파일) 내용 확인
    SELECT \* FROM 테이블명;

    서버는 절대 관리자 계정으로 작업하면 안됨
    -> 사용자 계정을 만들어서 사용

DDL : CREATE, ALTER, DROP

DML : SELECT, INSERT, UPDATE, DELETE
자료검색 SELECT * FROM 테이블명;
자료입력 INSERT INTO 테이블명 VALUES();
자료삭제 DELETE FROM 테이블명 WHERE ~
자료수정 UPDATE 테이블명 SET 바꿀컬럼 = 바꿀값 WHERE ~

-------------------------
0. 관리자 계정으로 접속
1. 계정생성
CREATE user busanit@'%' identified by '1234';
    - ALTER user busanit@'%' identified by '1234';
    - DROP user busanit;
3. 계정에 권한 부여
    grant all privileges on busanit.* to busanit@'%' with grant option;
    flush privileges;
4. 데이터베이스 생성
    CREATE database busanit;
5. 데이터베이스 확인
    show databases;
6. 데이터베이스 교체
    use busanit;
7. 테이블 생성
    CREATE TABLE Register(
    uid varchar(20) NOT NULL,
    pwd varchar(20) NOT NULL,
    email varchar(50),
    uname varchar(10) NOT NULL,
    gender CHAR(1) NOT NULL,
    regdate date
    );
8. 테이블 구조 확인
    desc Register;
9. 테이블 제거
    drop table Register;
10. 데이터 입력(변수)
    INSERT into Register VALUES('busanit','12345','email@email.com','부산','M',NOW());
11. 입력한 데이터 확인
    SELECT * from Register;
    SELECT uid,email,uname,regdate FROM Register;
    SELECT count(*) as 전체회원수 from Register;
12. 데이터 백업
    mysqldump -ubusanit -p busanit > 20220810.sql
13. 데이터 삭제
    DELETE FROM register WHERE uid = 'busanit';
14. 데이터 정렬 출력
    SELECT height, name FROM usertbl ORDER BY height DESC limit 5;
15. 유사어 검색 출력
    select * from users where userid like '%s%';
16. 데이터 수정
    UPDATE 테이블명 set 컬럼=바꿀값, 컬럼2=바꿀값 WHERE id=?;



CREATE TABLE users(
num int not null primary key auto_increment,  
username varchar(10) not null,
userid varchar(12) not null,
passwd varchar(100) not null,
email varchar(50) not null,
born char(10),
phone char(13) not null,
gender char(1),
userDate date
);
insert into users values(NULL,'busanit','bs','1111','busanit@busan.it','2022-08-10','010-1234-5678','M',now());
UPDATE users SET passwd='', email='', userDate=now() where num=3;
