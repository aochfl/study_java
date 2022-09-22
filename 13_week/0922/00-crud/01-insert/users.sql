-- 데이터베이스 선택
USE login; 
CREATE TABLE register (
    regID int not null auto_increment primary key,
    username varchar(10) not null,
    passwd varchar(20) not null,
    regdate date
);