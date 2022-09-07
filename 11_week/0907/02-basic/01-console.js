/* 
    command = console = terminal : 브라우저 실행x
    res.send() : 브라우저에서 실행
*/

console.log("hello");

/**
    let 값의 변경이 있을 때 (변수 재할당)
    - for(let i = 0; ....)
    그 외에는 모두 const

 */

console.log("\n1 console---------------------------------------------");
const num = 10;
const str = "Busan It Academy";

console.log(num);
console.log("숫자는 %d", num);
console.log("숫자는 %i", num);

console.log(str);
console.log("글자는 %s", str);

/* 텍스트 + 변수 */
console.log("출력되는 숫자 : " + num);
console.log(`출력되는 글자 : ${str}`);

console.log("\n2 function---------------------------------------------");
/* 
    function() -> this 사용
    () => this x, 중괄호를 쓰지않으면 return도 없음
*/
function sum() {
    console.log("두 수의 합을 구합니다");
}
sum();

const add = () => console.log("두 수의 합을 구합니다");
add();

console.log("\n3 function---------------------------------------------");
function sum2(a, b) {
    return a + b;
}
console.log(sum2(1, 2));

const add2 = (a, b) => a + b;
console.log(add2(1, 2));

const add3 = (a, b) => {
    return a + b;
};
console.log(add3(1, 2));

function close() {
    console.log("프로그램을 종료합니다");
}

const print_open = (title) => console.log(title);
const print_close = (close) => console.log(close);
const div = (a, b) => a / b;

print_open("Welcome Calculator!!");
console.log(div(100, 2));
print_close("프로그램을 종료합니다.");
