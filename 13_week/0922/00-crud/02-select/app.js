const express = require("express");
const path = require("path");
const mysql = require("mysql");
const alert = require("alert");

const app = express();
const PORT = 3000;

const db = mysql.createConnection({
    host: "localhost",
    user: "login",
    password: "1234",
    database: "login",
    dateStrings: "date",
});

db.connect((err) => {
    if (!err) {
        console.log("Mysql Success");
    } else {
        console.log(err);
    }
});

app.set("view engine", "ejs");
app.use(express.urlencoded({ extended: false })); // app.post로 데이터를 받기 위한 middleware
app.use(express.static(path.join(__dirname, "/assets/css"))); // css폴더를 사용하기위함

app.get("/", (req, res) => {
    res.render("index");
});

app.get("/userList", (req, res) => {
    let sql = "SELECT regID,username FROM register ORDER BY regID DESC;";
    db.query(sql, (err, result) => {
        if (err) throw err;

        res.render("userList", { result });
    });
});

app.get("/addUser", (req, res) => {
    res.render("addUser", {});
});

app.post("/addUser", (req, res) => {
    let sql = "INSERT INTO register VALUES(NULL,?,?,now());";
    db.query(sql, [req.body.username, req.body.password], (err) => {
        if (err) throw err;
    });
    alert("사용자가 추가되었습니다");
    res.redirect("/userList");
});

app.get("/delUser/:id", (req, res) => {
    let sql = "DELETE FROM register WHERE regID=?;";
    db.query(sql, [req.params.id], (err, result) => {
        // db pk -> req.params.id
        if (err) throw err;

        console.log(req.params.id + "번 회원이 삭제되었습니다.");
        res.redirect("/userList");
    });
});

app.get("/upUser/:id", (req, res) => {
    let sql = "SELECT * FROM register WHERE regID=?;";
    db.query(sql, [req.params.id], (err, result) => {
        if (err) throw err;

        console.log(result[0].regID);
        res.render("upUser", { result });
    });
});

app.post("/upUser", (req, res) => {
    console.log(req.body.regID);
    console.log(req.body.username);
    console.log(req.body.passwd);
    let sql = "UPDATE register SET username=?, passwd=?, regdate=now() WHERE regID=?";
    const user = {
        id: req.body.regID,
        username: req.body.username,
        passwd: req.body.passwd,
    };
    db.query(sql, [user.username, user.passwd, user.id], (err, result) => {
        if (err) throw err;
    });
    res.redirect("/userList");
});

app.get("/userView/:id", (req, res) => {
    let sql = "SELECT * FROM register WHERE regID=?;";
    db.query(sql, [req.params.id], (err, result) => {
        // db pk -> req.params.id
        if (err) throw err;
        // console.log(result);
        res.render("userView", { result });
    });
});

app.listen(PORT, () => console.log(`server is running http://localhost:${PORT}`));
