const fs = require("fs");
const path = require("path");

const name = "_test_file.txt";
/* 파일 쓰기 */
// 폴더 : mkdir(), rmdir()
// 파일 : writeFile(), unlink(), appendFile()

/* 파일 만들기 */
// fs.writeFile(파일이름, 내요이 ,콜백);
// 연속해서 실행 시키면 기존 내용을 덮어 씀
// appendFile 이어붙이기

let str = "HTML, CSS, NODEJS, REACTJS"; // 파일에 쓸 내용
if (!fs.existsSync(name)) {
    fs.writeFile(name, str, (err) => {
        if (err) throw err;
        else console.log("파일이 생성되었습니다");
    });
}

// 추가 내용 적기(이어적기)
let appendStr = "Java, Spring, Framework, Mysql";
if (fs.existsSync(name)) {
    fs.appendFile(name, appendStr, (err) => {
        if (err) throw err;
        else console.log("파일이 수정되었습니다");
    });
}

// 파일삭제
if (fs.existsSync(name)) {
    fs.unlink(name, (err) => {
        if (err) throw err;
        else console.log("파일이 삭제되었습니다");
    });
}
