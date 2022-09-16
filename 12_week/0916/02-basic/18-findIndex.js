/*
1. findIndex() : 검색된 내용의 인덱스를 리턴 : []
2. Object.keys(객체명) : 객체배열 인덱스번호 또는 전체 개수 출력 [{},{},{}]
사용방법 : forEach() = filter() = find() = findIndex()
*/
const names = ["KIM", "LEE", "PARK"];
const idx = names.findIndex( n => n == "PARK");
console.log(idx);

//객체 안에 데이터 몇 개 있는지???
//객체 배열 번호도 출력
const users = [
    {id:1, userid: "busan"},
    {id:2, userid: "seoul"},
    {id:3, userid: "daegu"}
];

//
console.log(Object.keys(users)); //인덱스
console.log(Object.keys(users[0]));
console.log(Object.keys(users[1]));
console.log(Object.keys(users[2]));

console.log(users.length);