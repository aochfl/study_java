/*
1.정규식(reExp) : Regular Expression
  - 필요한 내용이나 단어를 검색해서 수정/삭제 처리
*/

 /* 정규식 사용 방법 */
 const str = "This is NodeJS"; //이메일, 전화번호, 우편번호 : 형식에 맞는지 체크
  //검색어 설정
 const regEx01 = /nodejs/;
 //검색 : 검색어.test(str); - console.log() : return true, false : 영어 대소문자 구분
 console.log(regEx01.test(str));

 /* g 옵션 : 문장 전체, i 대소문자 구분 없이 */
 const regEx02 = /nodejs/gi;
 console.log(regEx02.test(str));

/*
    Server Node
    - Mysql에 INSERT INTO 테이블명  VALUES();  자료등록
    - 웹주소를 이용해서 삭제해야 되는 경우
    - id int not null
      http://localhost:5000/delete/6

      SELECT * FROM 테이블명 WHERE id = pk;
      http://localhost:5000/user/1
*/
 const str01 = "NodeJS";
 //const regEx03 = /[0-9]/; //숫자 아닌지 확인
 const regEx03 = /[^0-9]/; // 글자입니까 : ^ 반전  or ^ 시작
 console.log(regEx03.test(str01));

 /* white space(공백) 체크 */
 const str02 = "1 ";
 const regEx04 = /\s/; /* 공백체크 : \s */
 console.log(regEx04.test(str02));

 // 시작을 체크하는 ^, 마지막 내용을 체크하는 $
 const str03 = "01012345678";
 //0-9 숫자로 시작하고 숫자로 끝나는 검색어 체크
 const regEx05 = /^[0-9]+$/; /* +$ 여러개의 숫자로 끝납니다. */
 console.log(regEx05.test(str03));

 //전화번호 : 집전화(02.. 051), 휴대전화(010)
 //숫자로 되어 있는지 확인 방법은 
 //지역번호(통신사) : 2,3 => /^\d{2,3}/
 //3,4 => /\d{3,4}/
 // 4 => /\d{4}$/
 console.log("");
 console.log("");
 const str04 = "010-1234-5678";
 const regEx06 = /^\d{2,3}-\d{3,4}-\d{4}$/;
 console.log(regEx06.test(str04));


/* 주민번호 */
// 자릿수 6-7
// 8번째 자리 : 1,2,3,4 중 하나
const str05 = "000101-1818181";
const regEx07 = /\d{6}-[1-4]\d{6}/;
console.log(regEx07.test(str05));

/* 우편번호 : 3-2 */
// 
const str06 = "123-54";
const regEx08 = /\d{3}-\d{2}/;
console.log(regEx08.test(str06));

/* 이메일 : 기본타입 @ 체크*/
const str07 = "email123@busanit.co.kr";
const regEx09 = /@/g;
console.log(regEx09.test(str07));

/* 이메일 실제 정규식*/
const regEx10 = /^[0-9a-zA-Z]+@[09a-zA-Z]([-_\.]?[0-9a-zA-Z])+\.[a-zA-Z]{2,3}$/;
console.log(regEx10.test(str07));

/*
정규식(체크) -> 다시 입력, 불필요한 내용 바꾸거나 삭제
            - trim, replace
*/