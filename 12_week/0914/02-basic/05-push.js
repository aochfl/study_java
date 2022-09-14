/*
1. 사용자 객체
    - [{배열1},{배열2},{배열3}]
2. 권한 있는 사람만 따로 객체에 저장 : 권한 Y 표시된 사람만 따로 저장
*/

const users =[
    {id:1, userid:"busan",auth:"Y"},
    {id:2, userid:"seoul",auth:"N"},
    {id:3, userid:"deagu",auth:"Y"},
]
const auth = [];

for(let i = 0 ; i < users.length ; i++){
    if(users[i].auth == "Y"){
        auth.push(users[i]);
    }
}
// 전송한다면 stringify();
console.log(JSON.stringify(auth));
console.log(auth);

if(auth[0].auth == 'Y'){
    console.log("관리자 페이지에 접속합니다.");
}

console.log(auth[0]["userid"]);

const user = {id:4, userid:"daejeon",auth:"Y"};
console.log(auth);
console.log(user);

console.log({...auth, ...user})