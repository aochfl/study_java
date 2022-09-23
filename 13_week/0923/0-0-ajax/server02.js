const express = require("express");
const app = express();
const mysql = require("mysql");

const db = mysql.createConnection({
    host: "localhost",
    user: "login",
    password: "1234",
    database: "login",
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

app.get("/", (req, res) => {
    res.render("ajax02");
});

app.post("/getSi", (req, res) => {
    let sql = "SELECT si FROM si ORDER BY id ASC;";
    db.query(sql, (err, result) => {
        if (err) throw err;

        res.send(result);
    });
});

app.post("/getGu", (req, res) => {
    let sql = "SELECT gu FROM gu WHERE si=? ORDER BY id ASC;";
    db.query(sql, [req.body.si], (err, result) => {
        if (err) throw err;

        res.send(result);
    });
});

app.listen(3000, () => console.log("Server Running : 3000"));
