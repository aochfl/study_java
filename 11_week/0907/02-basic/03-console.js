/*
    다중 객체
        - for
        - spread operator ... = concat
        (회원1, 회원2) -> (회원1, 회원2, 회원3, 회원4...)
*/
const users = [
    {
        id: 1,
        userid: "busanit",
        gender: "M",
    },
    {
        id: 2,
        userid: "seoulit",
        gender: "M",
    },
    {
        id: 3,
        userid: "daeguit",
        gender: "F",
    },
];

for (let i = 0; i < users.length; i++) {
    console.log(
        "ID : " + users[i].id + "  아이디 : " + users[i].userid + "  성별:" + users[i].gender
    );
}

const user = [
    {
        id: 4,
        userid: "gwangjiit",
        gender: "F",
    },
    {
        id: 5,
        userid: "changwonit",
        gender: "F",
    },
];

const user2 = {
    id: 6,
    userid: "incheonit",
    gender: "M",
};
const arr = [];

console.log("--------------------------------------------");
// 객체 또는 배열명 .push 배열이나 객체안에 삽입(맨끝)
// 객체 도는 배열명 .pop 배열이나 객체 밖으로 빼낼 때(맨끝)
arr.push(...users, ...user, { ...user2 });

console.log(arr);
