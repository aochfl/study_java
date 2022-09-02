/* 1. 회원이 여러 명일 때 [{},{}] */

const users = [
    { id: 1, userid: "busanit", passwd: "12345", username: "KIM", gender: "M" },
    { id: 2, userid: "seoulit", passwd: "12345", username: "LEE", gender: "F" },
    { id: 3, userid: "daegeonit", passwd: "12345", username: "PARK", gender: "F" },
];
console.log(users[1].id);
console.log(users[2].gender);

for (let i = 0; i < users.length; i++) {
    console.log(users[i].userid);
}

users.forEach((user) => console.log(user.userid));

/* 2. push - 배열에 삽입 */
users.push({ id: 4, userid: "changwonit", passwd: "12345", username: "JEUNG", gender: "M" });
console.log(users);
console.log(`${users.length}명 입니다`);
