const express = require("express");
const fs = require("path");

const app = express();
const PORT = 3000;

app.use("/board", require("./routes/board"));

app.listen(PORT, () => console.log(`server is running http://localhost:${PORT}`));
