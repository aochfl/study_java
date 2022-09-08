/* 
    1. Json 파일 :
    2. 절대경로 : 
    3. 디렉토리 생성 : 
    4. jsObject -> JsonObject -> fs.writeFile();
*/
const fs = require("fs");
const path = require("path");

function errChk(err) {
    if (err) throw err;
}
/* JS -> JSON */
const users = [
    { id: 1, userid: "busanit", passwd: "12345", gender: "M", regdate: "2022-09-01" },
    { id: 2, userid: "seoulit", passwd: "67890", gender: "F", regdate: "2021-09-01" },
    { id: 3, userid: "daeguit", passwd: "13579", gender: "M", regdate: "2021-12-25" },
];
const user = {
    id: 4,
    userid: "incheonit",
    passwd: "24680",
    gender: "F",
    regdate: "2022-01-10",
};

const dirPath = path.join(__dirname, "db");
if (!fs.existsSync(dirPath)) fs.mkdir(dirPath, errChk);

const filePath = path.join(dirPath, "users.json");
const result = JSON.stringify(users, null, 2);
if (!fs.existsSync(filePath)) fs.writeFile(filePath, result, errChk);

fs.readFile(filePath, "utf8", (err, readData) => {
    if (err) throw err;

    const obj = JSON.parse(readData);
    obj.push({ ...user });

    fs.writeFile(filePath, JSON.stringify(obj), errChk);
});
