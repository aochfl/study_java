/*
1. for(let 별명 of 객체명) {출력코드}
2. 객체명.forEach((별명) => {출력코드}) *****
3. for
*/
const colors = ["#fff", "#f00", "#0f0", "#00f", "ivory"];
for(let c of colors) {
    console.log(`<table color=${c}></table>`);
}

const str = "Busanit"; //문자열은 배열(객체)
for(let s of "Busanit") {
    console.log(s);
}

const users = [
    {username: "KIM"},
    {username: "PARK"}
];

//index가 필요없이 값을 출력하는 곳에서
for(let user of users) {
    //console.log(user);
    console.log(user.username);
}
console.log("");
console.log("-------------------------------------------------");
//2. 객체명.forEach((별명) => {출력코드}) *****
const arr = ["Spring", "Summer", "Fall", "Winter"];

//1줄로 표현할 때
arr.forEach( a => console.log(a) );

//2줄 이상으로 표현할 때
arr.forEach( (a) => {
    console.log("사계절을 출력하시오.");
    console.log(a);
}); //제목 + 내용 : 2줄 처리

//index 번호도 출력
arr.forEach( (a, i) => { //value, index
    console.log(`${i} : ${a}`);
});

const numbers = [222, 45, 78, 9, 2, 5];
const evens = []; //짝수만 저장하는 배열

numbers.forEach( (num) => {
    if( num % 2 == 0 ) {
        evens.push(num);
    }
});
console.log(evens);