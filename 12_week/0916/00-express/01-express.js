/*
Node 서버
0. npm init -y : 모듈 관리 파일
1. 필요한 모듈 설치 : npmjs.com > 검색 > 설치
2. Server URI : http://localhost:3000/임의로 작업 - 브라우저로 접속하는 방법
    - protocol : http://, https://
    - domain : 도메인 구입 후 설정
    - port number : 나만이 유일하게 사용할 수 있는 통로 (3000 nodejs, 5000 reactjs, spring 8080, mysql 3306)
    - url : get(주소로 접근), post(숨겨서 전송해야 하는 것)
        - method="post" 제외하면 전부 get
*/

// 모듈설정
const express = require("express");
const app = express();

// 포트설정
app.listen(3000, () => console.log("3000번 포트로 대기중입니다"));

// 서버를 실행시키고
// 주소설정(html 설정)
// 서버는 기본적으로 요청(req), 응답(res) 기본 콜백
// app.get("/busanit", function (req, res) {
//     console.log("server is running");
//     res.send("Hello World");
// });

app.get("/users", function (req, res) {
    res.json({
        id: 1,
        userid: "busan",
        passwd: "1234",
    });
});
app.get("/getUsers", function (req, res) {
    const sql = "SELECT * FROM users ORDER BY id DESC";
    res.send("All Users Query => " + sql);
});
app.get("/setUser", function (req, res) {
    const sql = "INSERT INTO users VALEUS()";
    res.send("User Query => " + sql);
});
app.get("/deleteUser", function (req, res) {
    const sql = "DELETE FROM users WHERE id = 1";
});
app.get("/updateUser", function (req, res) {
    const sql = "UPDATE users SET username=? WHERE id = 3";
});
