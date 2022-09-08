const fs = require("fs");
const path = require("path");

const folderName = "_test_files";

// 상대경로
fs.mkdir(folderName, (err) => {
    if (err) throw err;
    else console.log("폴더생성완료");
});

// 절대경로
fs.mkdir(path.join(__dirname, folderName + "2"), (err) => {
    if (err) throw err;
    else console.log("폴더생성완료");
});

fs.rmdir(folderName, (err) => {
    if (err) throw err;
    console.log("폴더가 삭제되었습니다");
});
fs.rmdir(path.join(__dirname, folderName + "2"), (err) => {
    if (err) throw err;
    console.log("폴더가 삭제되었습니다");
});
