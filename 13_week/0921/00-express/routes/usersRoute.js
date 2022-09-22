const express = require("express");
const router = express.Router();

// users : 전체보기, 상세보기, 수정, 삭제, 검색
router.get("/", (req, res) => {
    res.send("사용자 전체 보기");
});
router.get("/getOne/5", (req, res) => {
    res.send("5번 사용자 상세 보기");
});

router.get("/insert", (req, res) => {
    res.send("사용자 등록하기");
});

router.get("/update/5", (req, res) => {
    res.send("5번 사용자 수정하기");
});

router.get("/delete/5", (req, res) => {
    res.send("5번 사용자 삭제하기");
});

router.get("/search/busanit", (req, res) => {
    res.send("검색단어 busanit 검색하기");
});

// 분리시킨 파일을 내보낼 수 있게 설정 module.exprots
module.exports = router;
