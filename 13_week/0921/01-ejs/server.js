// npm -y init
// npm i express
// npm i ejs
const express = require("express");
const app = express();
const path = require("path");
const PORT = 3000;

// ejs 사용을 위한 middleware
// ejs 기본 폴더 위치는 views 이므로 views 폴더 생성 후 html 파일은 여기에
app.set("view engine", "ejs"); // ejs 사용하기 위한 설정(set)
//html form vlaue 값을 server req.body로 불러올 때 필요한 middleware
app.use(express.urlencoded({ extended: false }));
// app.use(express.static("경로")); // 경로 보안해제
app.use(express.static(path.join(__dirname, "/views/css")));

let title = "Busan it Academy";

//url
// Busan it Academy > Main
// Busan it Academy > UserList
// Busan it Academy > Contact
app.get("/", (req, res) => {
    res.render("index", { title, sub: " > Home" }); //key:value 이름이 같으면 한번만 사용
});

app.get("/addUser", (req, res) => {
    res.render("users", { title, sub: " > AddUser" });
}); //form을 통한 사용자 저장하기

app.post("/addUser", (req, res) => {
    console.log(req.body.userid);
    console.log(req.body.passwd);

    res.send({
        userid: req.body.userid,
        passwd: req.body.passwd,
    });
});

//내가 만든 url 제외한 전부
//url 부분 제일 마지막
app.get("*", (req, res) => {
    res.render("404", { title, sub: " > AddUser" });
});
app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
