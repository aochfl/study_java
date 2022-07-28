const http = require("http"); // server ready
const PORT = 5000;

const server = http.createServer((req, res) => {
    if (req.url === "/login") {
        res.write("<h1>Busan It Academy</h1>");
        res.end();
    } else {
        res.write("페이지를 찾을 수 없습니다");
        res.end();
    }
});
server.listen(PORT, () => console.log(`서버를 실행합니다. 포트번호는 ${PORT}`));
