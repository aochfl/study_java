/*
1. fs.readFile("읽어올파일", "utf8", 콜백(err, 결과변수))
2. txt, json
*/
const fs = require("fs");
const path = require("path");

/*
if( fs.existsSync("./files/file.txt") ) {
    fs.readFile(path.join(__dirname, "files", "file.txt"), "utf8", (err, result) => {
        if(err)
            throw err;
        
        console.log(result);
    });
}else{
    console.log("File Not Found.");
}
*/

/*
if( fs.existsSync("./json/jsObj.json") ) {
    fs.readFile("./json/jsObj.json", "utf8", (err, result) => {
        if(err)
            throw err;

        const jsObj = JSON.parse(result);
        console.log(jsObj);
    });
}else{
    console.log("File Not Found.");
}
*/

const addUsers = [
    {id:4, username: "U.S.A"},
    {id:5, username: "Spain"},
];

const addUsers2 = {
    id:4, username: "Spain"
};

//json 파일에 추가 : [...기존자료 + ...새로운자료] = 기존자료 -> spread operator
//writeFile()로 다시 덮어 쓰기

fs.readFile("./json/jsObj.json", "utf8", (err, result) => {
    if(err)
            throw err;
    
    const jsObj = JSON.parse(result);
    //console.log(jsObj);
    //console.log(addUsers);

    //json 파일에 추가 : [...기존자료 + ...새로운자료] = 기존자료 -> spread operator
    //fs.appendFile() 이어쓰기 메소드 => x => 텍스트 파일 연결할 때
    //const addResult = [...jsObj, ...addUsers];
    const addResult = [...jsObj, {...addUsers2}];
    
    /* json 예외처리 */
    const count = Object.keys(jsObj);
    if( count.length <= 3 ) {
        fs.writeFile("./json/jsObj.json", JSON.stringify(addResult, null, 2), (err) => {
            if(err)
                throw err;

            console.log("json file added...");
        });
    }else{
        console.log("Data Added Fail...");
    }

    /* json 예외처리 */

});