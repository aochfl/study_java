/*
1. npm init -y
2. express module
3. require();
4. port number 3000
5. 주소 설정
*/
const fs = require("fs");
const path = require("path");

// 모듈설정
const express = require("express");
const app = express();
const PORT = 3000;
// 포트설정
app.listen(PORT, () => console.log(`${PORT}번 포트로 대기중입니다`));

app.get("/", (req, res) => {
    res.send("<h1>Welcom Busan it Website</h1>");
});

app.get("/getBoardList", (req, res) => {
    res.sendFile(path.join(__dirname, "getBoardList.html"));
});
