const express = require("express");
const app = express();
const PORT = 3000;

// shopping : users, items
// users : 전체보기, 상세보기, 수정, 삭제, 검색

// app.use("공통경로, require변수명)
const uesrsRoute = require("./routes/usersRoute");
app.use("/users", uesrsRoute);

// items : 전체보기, 상세보기, 입력, 수정, 삭제, 검색
const itemsRoute = require("./routes/itemsRoute");
app.use("/items", itemsRoute);

app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
