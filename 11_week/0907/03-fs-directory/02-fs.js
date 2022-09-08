const fs = require("fs");

/* // 빈 디렉토리를 삭제할 때
if (fs.existsSync("./_test_data")) {
    console.log("이미 폴더가 존재합니다");
} else {
    fs.mkdir("./_test_data", function (err) {
        if (err) throw err;
        else console.log("data폴더가 생성되었습니다.");
    });
}

if (fs.existsSync("./_test_data")) {
    fs.rmdir("./_test_data", (err) => {
        if (err) throw err;
        else console.log("data 폴더가 삭제되었습니다");
    });
} else {
    console.log("삭제할 디렉토리가 존재하지 않습니다");
}
*/

// 디렉토리 안에 파일이 존재하면 강제로 지워야함
if (fs.existsSync("./_test_data")) {
    console.log("이미 폴더가 존재합니다");
} else {
    fs.mkdir("./_test_data", function (err) {
        if (err) throw err;
        else console.log("data폴더가 생성되었습니다.");
    });
}

if (fs.existsSync("./_test_data")) {
    // {강제로 삭제할 옵션}
    fs.rmdir("./_test_data", { recursive: true, force: true }, (err) => {
        if (err) throw err;
        else console.log("data 폴더가 삭제되었습니다");
    });
} else {
    console.log("삭제할 디렉토리가 존재하지 않습니다");
}
