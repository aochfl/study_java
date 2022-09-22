const express = require("express");
const app = express();
const PORT = 3000;

app.get("/getUser/5", function (req, res) {
    const user = {
        id: 5,
        userid: "busanit",
        passwd: "12345",
    };
    res.json(user);
});

app.get("/getHome", (req, res) => {
    res.sendFile(__dirname + "/views/index.html");
});

app.listen(PORT, () => console.log(`http://localhost:${PORT}`));
