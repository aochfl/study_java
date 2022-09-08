const x = () => console.log("X를 실행중입니다");
const y = () => console.log("Y를 실행중입니다");

function sum(a, b) {
    return a + b;
}

module.exports = {
    x,
    y,
    sum,
};
