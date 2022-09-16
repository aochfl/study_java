/*
unlink : file delete
rmdir() : directory
*/

// files 폴더를 강제 지우기
//처음은 옵션 없이 삭제
//옵션으로 강제 삭제
const fs = require("fs");

/* 파일 삭제 후 폴더 비어지면 폴더 삭제*/
if(fs.existsSync("./json/jsObj.json")) {
    fs.unlink("./json/jsObj.json", (err) => {
        if(err) {
            throw err;
        
        }else{
            console.log("jsObj.json 파일이 삭제 되었습니다.");
            if( fs.existsSync("./json") ) {
                fs.rmdir("./json", (err) => {
                    if(err)
                        throw err;
            
                    console.log("폴더가 삭제 되었습니다.");
                });
            }else{
                console.log("삭제할 폴더가 없습니다.");
            }
        }
    });
}

