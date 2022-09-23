use login;

create table si(
id int not null auto_increment primary key,
si varchar(50) not null
);

INSERT INTO si VALUES(NULL, "서울특별시");
INSERT INTO si VALUES(NULL, "부산광역시");
INSERT INTO si VALUES(NULL, "대구광역시");
INSERT INTO si VALUES(NULL, "대전광역시");
INSERT INTO si VALUES(NULL, "인천광역시");
INSERT INTO si VALUES(NULL, "광주광역시");
INSERT INTO si VALUES(NULL, "울산광역시");

CREATE TABLE gu(
    id int not null auto_increment primary key,
    gu varchar(50) not null,
    si varchar(50) not null
);

INSERT INTO gu VALUES(NULL, "강남구", "서울특별시");
INSERT INTO gu VALUES(NULL, "종로구", "서울특별시");
INSERT INTO gu VALUES(NULL, "강서구", "서울특별시");
INSERT INTO gu VALUES(NULL, "구로구", "서울특별시");
INSERT INTO gu VALUES(NULL, "부산진구", "부산광역시");
INSERT INTO gu VALUES(NULL, "사상구", "부산광역시");
INSERT INTO gu VALUES(NULL, "수영구", "부산광역시");
INSERT INTO gu VALUES(NULL, "수성구", "대구광역시");
INSERT INTO gu VALUES(NULL, "중구", "대구광역시");
INSERT INTO gu VALUES(NULL, "동구", "대구광역시");
INSERT INTO gu VALUES(NULL, "서구", "대전광역시");
INSERT INTO gu VALUES(NULL, "유성구", "대전광역시");
INSERT INTO gu VALUES(NULL, "동구", "광주광역시");
INSERT INTO gu VALUES(NULL, "광산구", "광주광역시");
INSERT INTO gu VALUES(NULL, "부평구", "인천광역시");
INSERT INTO gu VALUES(NULL, "서구", "인천광역시");

CREATE TABLE members(
    id int not null auto_increment primary key,
    userid varchar(20) not null,
    passwd varchar(20) not null,
    username varchar(20) not null,
    post varchar(5),
    addr varchar(255),
    hp varchar(15),
    grade varchar(10), -- 관리자, 사원, 일반(기본설정)
    regdate date
);