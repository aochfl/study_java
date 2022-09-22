const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
    res.send("게시물 전체보기");
});
router.get("/insert", (req, res) => {
    res.send("게시물 저장하기");
});
router.get("/update/5", (req, res) => {
    res.send("5번 게시물 수정하기");
});
router.get("/getBoardOne/5", (req, res) => {
    res.send("5번 게시물 상세보기");
});
router.get("/search/busanit", (req, res) => {
    res.send("busanit 검색 후 결과보기");
});

module.exports = router;
