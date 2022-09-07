/*
fs : File System I/O -> 예외처리
    - 필요하다면 require 가져와서 사용
    - directory 생성/삭제, file 쓰기/삭제/이어붙이기
    - file 동기화, 비동기화
        - 동기화(sync): 1(글자만 출력), 2(파일업로드), 3(글자만 출력)
                        1, 2, 3: 2번 작업이 끝날 때까지 3번 작업
        - 비동기화(async): 
                        1, 2, 3 동시 작업
*/
/*
const fs = require("fs"); // nodejs 설치할 때 같이 설치되는 모듈
// fs.mkdir("만들이름", 콜백함수()); // 디렉토리 만들기 -> 콜백함수를 이용해서 예외처리 무조건 해야함
// fs.writeFile("만들파일이름", 콜백함수()); // 파일 만들기 -> 콜백함수를 이용해서 예외처리 무조건 해야함

fs.mkdir("_test_Files", function (err) {
    if (err) {
        throw err;
    } else {
        console.log("폴더가 생성되었습니다");
    }
});
fs.rmdir("_test_Files", (err) => {
    if (err) throw err;
});

fs.mkdir("./json", (err) => {
    if (err) throw err;
    else console.log("Make Directory Completed...");
});
fs.rmdir("./json", (err) => {
    if (err) throw err;
});
*/

/* 
    상대경로 : 위에 작업했던 내용은 ./file, ./json
    절대경로 : 실무 또는 프로젝트 path
    path -> 현재 위치, 현재 파일이름, 현재 파일이름의 확장자를 관리하는 모듈
*/

console.log(__dirname);
console.log(__filename);

const path = require("path"); // 파일을 상세하게 관리할 때
console.log(path.parse(__filename));
console.log(path.extname(__filename));

/* path.join() 경로 + 파일을 연결해서 절대경로로 표시할 때 */
const curDir = __dirname;
const filename = "index.html";

/* 디렉토리 + 파일 연결 : 절대경로 */
const result = path.join(curDir, filename);
console.log(result);
