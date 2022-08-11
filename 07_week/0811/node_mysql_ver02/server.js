/* 1. ------------------------------------------------------------------- */
/* 사용해야 할 프로그램을 설치 후 사용하기 위한 require 처리 부분 */
/* npmjs.com에 사용 방법은 간략하게 나옴 */
const ejs = require("ejs");
const mysql = require("mysql");
const express = require("express");
const app = express();
/* 1. end --------------------------------------------------------------- */

let PORT = 3000;
/* 2. ------------------------------------------------------------------- */
/*   서버에서 사용할 포트 번호를 설정 : 3000, 4000, 5000 */
app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
/* 2. end --------------------------------------------------------------- */

/* 3. ------------------------------------------------------------------- */
/* 사용할 데이터베이스 정보(url, userid, password, database 설정) 및 데이터베이스 연결정보 등록 */
const dbconnect = mysql.createConnection({
    host: "localhost",
    port: 3306,
    user: "busanit",
    password: "1234",
    database: "busanit",
});
dbconnect.connect((err) => {
    if (!err) {
        console.log("데이터베이스 연결에 성공했습니다");
    } else {
        console.log("에러발생\n" + err);
    }
});
/* 3. end --------------------------------------------------------------- */

/* 4. ------------------------------------------------------------------- */
/*  어떤 html 구현 방식을 사용할 건지 : ejs 설정 : app.set(); */
app.set("view engine", "ejs"); // html -> views 폴더 확장자는 .ejs
/* 4. end --------------------------------------------------------------- */

/* 5. ------------------------------------------------------------------- */
/* 사용할 middleware 설정 : json 처리 - app.use();
    : Server와 Client 사이에서 데이터를 전송할 때 필요한 작업 */
app.use(express.urlencoded({ extended: false }));
app.use(express.static("public"));
app.use(express.json());
/* 5. end --------------------------------------------------------------- */

/* 6. ------------------------------------------------------------------- */
/*  주소관리 : rest api
    - get : 입력화면, 수정화면을 가지고 오거나 삭제할 때  ex) get : /register
	  - 정확하게는 get 방식 : url(주소)를 보여 주면서 처리해야 할 때
    - post : 저장, 수정할 때 ex) post : /register
      - 정확하게는 post 방식 : url(주소)를 보여주지 않고 처리해야 할 때*/
app.get("/", (req, res) => {
    // console.log("콘솔에 보이는 글자");
    // res.send("브라우저에서 글자가 보임");
    res.render("index", { title: "Home" }); //파일 이름 적어주면 됨 - 확장자x
});
app.get("/register", (req, res) => {
    res.render("register", { title: "Home > Register" }); //파일 이름 적어주면 됨 - 확장자x
});
app.get("/memberList", (req, res) => {
    res.render("memberList", { title: "Home > MemberList" });
});
app.get("/login", (req, res) => {
    res.render("login", { title: "Home > Login" });
});
/* 6. end --------------------------------------------------------------- */

/* 디렉토리
   - views 폴더 : html 파일을 저장 -> index.ejs, login.ejs
     - views/js
     - views/css
*/

/* 서버 실행
   - vscode Ctrl + 백틱 열고 dir(목록보기)로 파일 확인
     - 윈도우 보안상 안되는 경우가 생길 수 있는데 윈도우 + r -> cmd 
	 - 아래와 같이 실행하면 됨
   - node 서버 작업한 파일 이름 입력 후 엔터
   - 서버가 실행되는 텍스트가 콘솔에 보이면 정상적으로 서버가 실행된 것임
*/
