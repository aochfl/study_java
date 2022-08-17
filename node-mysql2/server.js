// npm install

const { json } = require("express");
const express = require("express");
const mysql = require("mysql");
const app = express();

const PORT = 5000;

const conn = mysql.createConnection({
    host: "localhost",
    port: 3306,
    user: "busanit",
    password: "1234",
    database: "busanit",
    dateStrings: "date",
    multipleStatements: true,
});

conn.connect((err) => {
    if (!err) {
        console.log("Mysql Database Connected...");
        //console.log("Mysql Database 연결 완료");
    } else {
        console.log(err);
    }
});

app.set("view engine", "ejs");
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.get("/", (req, res) => {
    const sql = "SELECT COUNT(*) FROM information_schema.tables WHERE table_name = 'big_category'";

    conn.query(sql, (error, results) => {
        if (error) return console.log(error);
        else
            results.forEach((v) => {
                const tblExists = Object.values(v)[0];
                res.render("index", { title: "Admin Pages", tblExists });
            });
    });
});

app.get("/main", (req, res) => {
    let sql1 = "SELECT B.bcName, S.*, COUNT(S.bcCode) as total from big_category as B, small_category as S ";
    sql1 += "WHERE B.bcCode = S.bcCode ";
    sql1 += "GROUP BY S.bcCode ORDER BY B.bcCode";

    conn.query(sql1, (error, results) => {
        if (error) return console.log(error);
        else res.render("main", { title: "Welcome Pages", company: results });
    });
});

app.get("/dbCreate", (req, res) => {
    let sql1 = "CREATE TABLE big_category(";
    sql1 += "bcCode varchar(3) not null,";
    sql1 += "bcName varchar(20) not null);";

    let insData1 = "INSERT INTO big_category VALUES('100', '현대차');";
    insData1 += "INSERT INTO big_category VALUES('200', '기아차');";
    insData1 += "INSERT INTO big_category VALUES('300', '쌍용차');";

    let sql2 = "CREATE TABLE small_category(";
    sql2 += "scCode varchar(3) not null,";
    sql2 += "scName varchar(20) not null,";
    sql2 += "bcCode varchar(3) not null);";

    let insData2 = "INSERT INTO small_category VALUES('100', '아반떼', 100);";
    insData2 += "INSERT INTO small_category VALUES('200', '소나타', 100);";
    insData2 += "INSERT INTO small_category VALUES('300', '제네시스', 100);";
    insData2 += "INSERT INTO small_category VALUES('100', '모닝', 200);";
    insData2 += "INSERT INTO small_category VALUES('200', 'K3', 200);";
    insData2 += "INSERT INTO small_category VALUES('300', 'K5', 200);";
    insData2 += "INSERT INTO small_category VALUES('400', 'K7', 200);";
    insData2 += "INSERT INTO small_category VALUES('100', '티볼리', 300);";
    insData2 += "INSERT INTO small_category VALUES('200', '코란도', 300);";
    insData2 += "INSERT INTO small_category VALUES('300', '렉스턴', 300);";

    let sql3 = "CREATE TABLE products(";
    sql3 += "pid int not null primary key auto_increment,";
    sql3 += "productCode varchar(20),";
    sql3 += "productName varchar(100),";
    (sql3 += "productAmount int default 0,"), (sql3 += "productPrice int default 0,");
    sql3 += "productReg date);";

    let insData3 = "INSERT INTO products VALUES(NULL, '1001001', '현대자동차 아반떼 오토', 20, 2000, now());";

    conn.query(sql1 + insData1 + sql2 + insData2 + sql3 + insData3, (error, results) => {
        if (error) return console.log(error);
        else console.log("생성되었습니다.");
        res.redirect("/main");
    });
});

app.get("/dbDrop", (req, res) => {
    let sql1 = "DROP TABLE products;";
    let sql2 = "DROP TABLE small_category;";
    let sql3 = "DROP TABLE big_category";

    conn.query(sql1 + sql2 + sql3, (error, results) => {
        if (error) return console.log(error);
        else console.log("데이터베이스 > 테이블이 삭제되었습니다.");
        res.redirect("/");
    });
});

app.get("/smallCategory", (req, res) => {
    let sql = "SELECT scCode, scName, bcCode FROM small_category WHERE bcCode = ?";

    conn.query(sql, [req.query.bcCode], (error, results) => {
        if (error) return console.log(error);
        else res.render("smallCategory", { title: "Products Small Category", smallCategory: results });
    });
});

app.get("/productList", (req, res) => {
    let sql =
        "SELECT * FROM products WHERE substring(productCode, 1,3) = ? AND substring(productCode, 4,3) = ?;";
    conn.query(sql, [req.query.bcCode, req.query.scCode], (error, results) => {
        if (error) return console.log(error);
        else res.render("productList", { title: "Home > 상품목록보기", productList: results });
    });
});

app.get("/productAdd", (req, res) => {
    res.render("productAdd", { title: "Home > 상품등록하기" });
});

app.post("/productAdd", (req, res) => {
    let seq = "SELECT MAX(pid) + 1 FROM products;";
    conn.query(seq, (error, maxPid) => {
        let key = "";
        const pid = maxPid.forEach((v) => {
            key = Object.values(v)[0];
        });
        const pCode = req.body.big + req.body.small + key;

        let sql = "INSERT INTO products VALUES(NULL, ?, ?, ?, ?, now());";
        conn.query(
            sql,
            [pCode, req.body.productName, req.body.productAmount, req.body.productPrice],
            (err, results) => {
                if (error) return console.log(error);
                else res.render("index", { title: "Admin Pages", tblExists: 1 });
            }
        );
    });
});

app.post("/ajaxBig", (req, res) => {
    let sql = "SELECT * FROM big_category ORDER BY bcCode ASC";
    conn.query(sql, (error, results) => {
        if (error) {
            return console.log(error);
        } else {
            let opt = `<option>선택하세요</option>`;
            results.forEach((v) => {
                let key = Object.values(v)[0];
                let val = Object.values(v)[1];
                opt += `<option value=${key}>${val}</option>`;
            });

            res.send({ opt: opt });
        }
    });
});

app.post("/ajaxSmall", (req, res) => {
    let sql = "SELECT * FROM small_category WHERE bcCode = ?";
    conn.query(sql, [req.body.bigCateCode], (error, results) => {
        if (error) {
            return console.log(error);
        } else {
            let opt = `<option>선택하세요</option>`;
            results.forEach((v) => {
                let key = Object.values(v)[0];
                let val = Object.values(v)[1];
                opt += `<option value=${key}>${val}</option>`;
            });

            res.send({ opt: opt });
        }
    });
});

app.listen(5000, () => console.log(`Server is running ${PORT}`));
