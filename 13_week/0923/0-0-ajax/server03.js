const express = require("express");
const app = express();
const mysql = require("mysql");

const db = mysql.createConnection({
    host: "localhost",
    user: "login",
    password: "1234",
    database: "login",
    dateStrings: "date",
});

db.connect((err) => {
    if (!err) {
        console.log("Mysql Success!");
    } else {
        console.log(err);
    }
});

app.set("view engine", "ejs");
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

app.get("/", (req, res) => {
    sql = "SELECT * FROM members ORDER BY id ASC;";
    db.query(sql, (err, result) => {
        if (err) throw err;
        res.render("list", { result });
    });
});

app.post("/updateGrade", (req, res) => {
    sql = "UPDATE members SET grade =? WHERE id=?;";
    db.query(sql, [req.body.gradeValue, req.body.idValue], (err, result) => {
        if (err) throw err;

        res.send({ status: "success", grade: req.body.gradeValue });
    });
});

app.get("/addUser", (req, res) => {
    res.render("addUser");
});

app.post("/addUser", (req, res) => {
    const user = {
        userid: req.body.userid,
        passwd: req.body.passwd,
        username: req.body.username,
        post: req.body.post,
        addr: req.body.addr,
        hp: req.body.hp,
    };
    let sql = "INSERT INTO members VALUES(NULL,?,?,?,?,?,?,'일반',now());";
    db.query(sql, [user.userid, user.passwd, user.username, user.post, user.addr, user.hp], (err) => {
        if (err) throw err;

        console.log("삽입성공");
        res.redirect("/addUser");
    });
});

app.listen(3000, () => console.log("Server Running : 3000"));
