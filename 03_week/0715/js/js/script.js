/*
console.log("Hello world.");

let year = "2022";
let month = "07";
let day = "15";

let today = year + "/" + month + "/" + day;
console.log(today);

let date = `${year}-${month}-${day}`;
console.log(date);

// console.log(date.length);
// for (let i = 0; i < date.length; i++) {
//     console.log(date[i]);
// }

let myEmail = "aochfl_@naver.com";
let result = myEmail.indexOf("@");
if (result < 0) {
    console.log("이메일 형식이 틀립니다.");
} else {
    console.log("사용o");
}

let yourEmail = "aochfl_?naver.com";
let result1 = yourEmail.replace("?", "@");
console.log(result1);

// 거듭제곱
const pi = 3.14;
let radius = 10;
console.log(pi * radius * radius);
console.log(pi * radius ** 2);
console.log(radius ** 2 * pi);

// /, %
console.log(10 / 3); // 몫이 실수형태로 나와버린다.......
console.log(10 % 3);
*/
// 증감연산자 ++,--
let likes = 10;
console.log(likes++); // 10
console.log(likes); // 11
likes += 1;
console.log(likes); // 12

console.log(10 / "한글");

// html 화면에 출력 -:변수를 사용할 때는 백탭(`)
let title = "busan IT";
let content = "Busan Metropolitam";
let html = `
    <h2>${title}</h2>
    <p> </p>
`;
console.log(html);

let array = ["one", "two", "three", 4, false];
// for (let i = 0; i < array.length; i++) {
//     console.log(array[i]);
// }
// 배열이름.forEach(별명 => 출력)
//array.forEach((arr) => console.log(arr));
array.forEach((arr) => {
    console.log(arr);
});

console.log(array.join(","));
// let arrResult = array.concat(["six", "seven"]);
// console.log(arrResult);
/*
let pushResult = array.push("four");
console.log(array);

let popResult = array.pop();
console.log(array);

let board = "1번 게시물입니다.";
let res = board.includes("1");
console.log(res);

let arrays = ["java", "python", "react", "vue", "angular"];
console.log(arrays.includes("react"));
*/

// 비교연산자 ===
let num1, num2;
num1 = 10;
num2 = "10";

console.log(typeof num1, typeof num2);
if (num1 == -num2) {
    console.log("같음");
} else {
    console.log("다름");
}

console.log(Boolean(-1));

let names = ["kim", "lee", "park", "choi", "jeung"];
console.log(`가입된 총 회원은 ${names.length}명 입니다`);
names.forEach((name) => {
    console.log(`${name}`);
});

let passwd = "asdfasd@asdf";
if (passwd.length >= 12 && passwd.includes("@")) {
    console.log("very Strong");
} else if (passwd.length >= 8) {
    console.log("Normal");
} else {
    console.log("It is too shorts");
}
