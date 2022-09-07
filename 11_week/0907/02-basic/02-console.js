/*  
    1. Object(Javascript: 화면에 출력할 때, Json: 통신할 때) 출력
                key : "value"                 "key": "value"

    2. const 객체명 ={};
    3. const 객체들명 = [{},{}];
*/

/* 
    객체 사용하는 이유
        - 처리해야 할 데이터가 많을때 데이터를 다루기 쉽게 하기 위해서
*/
const person = {
    userid: "KIM",
    passwd: "1234",
    username: "부산광역시",
}; // 객체 1명 생성
console.log(person);
// if (person.passwd.length <= 8) {
//     console.log("비밀번호가 짧습니다");
// }

const persons = [
    {
        userid: "RED",
        regdate: "2022-01-01",
    },
    {
        userid: "BLUE",
        regdate: "2021-08-15",
    },
    {
        userid: "GREEN",
        regdate: "2022-09-07",
    },
]; // 객체 3명 생성
console.log(persons);

console.log();
console.log();
console.log();

const jsObjUser = {
    userid: "busanit",
    passwd: "12345",
};
console.log(jsObjUser);

// 웹 전송 : 문자열로 전송
// 숫자로 전송 : 문자로 -> 숫자로 변환해서 사용
const jsonObjUser = JSON.stringify(jsObjUser, null, 2);
console.log(jsonObjUser);

//서버에서 내 컴퓨터에서 받으려면 js 객체로 바꿔야함 - JSON,parse
const jsObjParse = JSON.parse(jsonObjUser);
console.log(jsObjParse);
