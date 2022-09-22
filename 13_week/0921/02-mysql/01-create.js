/*
show databases;
사용자 계정 : login 1234
use mysql;
select user from user; 
계정생성
create user 'login'@'localhost' identified by '1234';
grant all on *.* to 'login'@'localhost' with grant option;
alter user 'login'@'localhost' identified with mysql_native_password by '1234';
설정반영
flush privileges;
데이터베이스 생성
show databases;
create database login;
use login;

CREATE TABLE login(id int not null auto_increment primary key, userid varchar(30),  passwd varchar(20),  regdate datetime);


express + mysql + ejs
npm -y init
npm i express
npm i ejs
npm i mysql
*/
const express = require("express");
const mysql = require("mysql");
const app = express();

// mysql db connect : mysql.createConnection(host, port, user,pwd,database);
const db = mysql.createConnection({
    host: "localhost",
    user: "login",
    password: "1234",
    database: "login",
});

db.connect((err) => {
    if (!err) {
        console.log(`Database connection Success`);
    } else {
        console.log(err);
    }
});

// mysql db connect

app.set("view engine", "ejs");
app.get("/", (req, res) => {
    res.render("create");
});

app.get("/createTB", (req, res) => {
    let sql =
        "CREATE TABLE login(id int not null auto_increment primary key, userid varchar(30),  passwd varchar(20),  regdate datetime);";
    // 실행시키는 방법 : db.query(변수명, 콜백)
    db.query(sql, (err) => {
        if (err) throw err;
        console.log("create sql success");
        res.redirect("/");
    });
});
app.get("/dropTB", (req, res) => {
    let sql = "DROP TABLE login;";
    db.query(sql, (err) => {
        if (err) throw err;
        console.log("drop sql success");
        res.redirect("/");
    });
});

app.get("/selectAll", (req, res) => {
    let sql = "SELECT * FROM login ORDER BY id;";
    db.query(sql, (err, result) => {
        if (err) throw err;
        res.render("list", { result });
        //console.log(result);
    });
});

app.listen(3000, () => console.log("server is running.."));
