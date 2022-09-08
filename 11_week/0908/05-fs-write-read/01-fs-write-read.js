/* 
    1. 텍스트 파일 : fs.writeFile();
    2. 절대경로 : path.join();
    3. 디렉토리 생성 : fs.mkdir();
*/

const fs = require("fs");
const path = require("path");

/* directory 생성 -> 존재하면 건너뜀 */
if (!fs.existsSync("json")) {
    fs.mkdir(path.join(__dirname, "json"), (err) => {
        if (err) throw err;

        console.log("디렉토리 생성");
    });
}

let message = "2022-09-08 Login을 기록합니다...";
fs.writeFile(path.join(__dirname, "json", "file.txt"), message, (err) => {
    if (err) throw err;
});

/* readFile() : 글자를 정상적으로 출력하기 위해 toString(), utf8 */
fs.readFile(path.join(__dirname, "json", "file.txt"), "utf8", (err, readData) => {
    if (err) throw err;
});

fs.unlink(path.join(__dirname, "json", "file.txt"), (err) => {
    if (err) throw err;
});
