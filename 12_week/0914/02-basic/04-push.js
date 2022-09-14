/* 객체(배열) = Object(json) - 자료를 묶음 처리(대량의 데이터 처리)
/* 인덱스(i, idx) : 변수명은 하나로 사용하면 자료를 구분할 수 있어야 함 */
/* 반복문 같이 사용 forEach */

/* jsObj( key : "value")  - 데이터 전송할 때는 -> jsonObj( "key" : "value")
   -> 데이터를 받았을 때(수신했을 때) -> jsObject
   ex) jsObject -> JSON.stringify() => JSON.parse() 사용

/*
1. push : 배열이나 객체 마지막에 요소 추가

2. pop : 배열이나 객체의 마지막 요소를 제거
3. shift : 배열이나 객체의 맨 앞의 요소 제거
4. unshift : 배열이나 객체의 맨 앞에 요소 추가

5. splice : 배열이나 객체의 임의 내용을 제거
6. sort : 정렬
*/

/* 1. pop : 자바스크립트 타입에 크게 신경 쓰지 않아도 됨*/
const jsObj1 =[1, 2, 3, "NodeJS", false]; //숫자, 문자열, boolean
console.log("객체의 개수 : " + jsObj1.length + "개 입니다.");
console.log(`객체의 개수 : ${jsObj1.length}개 입니다.`);
console.log("");

//마지막 요소 제거
jsObj1.pop();
console.log("객체의 마지막 요소 제거 : " + jsObj1);

//2. push() + spread operator(... : 전개연산자 - 기존자료와 최신자료를 연결)
//객체명.push({...old, ...new}) = concat
jsObj1.push("ReactJS");
console.log("객체의 마지막 요소 추가 : " + jsObj1);

jsObj1.push("HTML", 12345, true);
console.log("객체의 마지막 요소 추가 : " + jsObj1);
console.log("");
console.log("------------------------------------------------------");

/* 3.------------------------------------------------------- */
jsObj1.shift();
console.log("객체의 첫번째 요소 제거 : "+jsObj1);

jsObj1.unshift(true);
console.log("객체의 첫번째 요소 추가 : "+jsObj1);

/* 객체. splice(배열번호, 개수) : 임의의 내용 제거 */
/* 객체명.sort() : 정렬 */
const jsObj2 = [5,1,4,2,3];
jsObj2.splice(2,2);
console.log(jsObj2.sort());
