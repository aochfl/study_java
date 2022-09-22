const express = require("express");
const fs = require("path");
const mysql = require("mysql");
const alert = require("alert");

const app = express();
const PORT = 3000;

const db = mysql.createConnection({
    host: "localhost",
    user: "login",
    password: "1234",
    database: "login",
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

let title = "Member Management System";
app.get("/addUser", (req, res) => {
    res.render("insert", {
        title,
        subTitle: " > Insert",
    });
});

app.post("/addUser", (req, res) => {
    let sql = "INSERT INTO register VALUES(NULL,?,?,now());";
    db.query(sql, [req.body.username, req.body.password], (err) => {
        if (err) throw err;
    });
    alert("사용자가 추가되었습니다");
    res.redirect("/list");
});

app.listen(PORT, () => console.log(`server is running http://localhost:${PORT}`));
