const express = require('express');
const app = express();

app.set("view engine", "ejs");
app.use(express.json());

app.get("/", (req, res) => {
    res.render("ajax01");
});

app.post("/checkID", (req, res) => {
    //db(json)에 busanit 저장되어 있다고 가정
    const users = {
        userid: "busanit",
        passwd: "12345",
        username: "busan"
    }

    let msg = "";
    if( users.userid == req.body.userid ) {
        msg = "No";
    }

    res.send(msg); // server -> ajax => 결과값을 전송

});

app.listen(3000, () => console.log("Server Running : 3000"));