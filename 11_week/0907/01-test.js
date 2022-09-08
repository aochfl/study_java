const fs = require("fs");
const path = require("path");

const folderName = "20220907";
const fileName = "20220907.txt";
const contentStr = "Welcome Busan it Academy\n";

// 1. 오늘날짜 폴더 생성
if (!fs.existsSync(path.join(__dirname, folderName))) {
    fs.mkdir(folderName, function (err) {
        if (err) throw err;
        else console.log(`${folderName}폴더가 생성되었습니다`);
    });
}

// 2. 파일생성
const filePath = path.join(path.join(__dirname, folderName), fileName);
if (!fs.existsSync(filePath)) {
    fs.writeFile(filePath, contentStr, (err) => {
        if (err) throw err;
        else console.log(`${fileName}이 생성되었습니다`);
    });
}

// 3. 파일 내용 이어 붙이기
const appendStr = "Hello NodeJS";
if (!fs.existsSync(filePath)) {
    fs.appendFile(filePath, appendStr, (err) => {
        if (err) throw err;
        else console.log(`${appendStr}가 추가되었습니다`);
    });
}

// 4. 파일 삭제
if (fs.existsSync(filePath)) {
    fs.unlink(filePath, (err) => {
        if (err) throw err;
        else console.log(`${filePath} 가 삭제되었습니다`);
    });
}

// 4. 디렉토리 삭제
if (fs.existsSync(path.parse(filePath).dir)) {
    fs.rmdir(path.parse(filePath).dir, (err) => {
        if (err) throw err;
        else console.log(`${path.parse(filePath).dir} 가 삭제되었습니다`);
    });
}
