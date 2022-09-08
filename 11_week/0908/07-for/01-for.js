/*
    1. for - of : java 향상된 for
    2. forEach : 빈도
*/

const colors = ["RED", "GREEN", "BLUE"];

for (let element of colors) {
    console.log(element);
}
colors.forEach((value) => {
    console.log(value);
});

console.log("-------------------------------------");
const str = "KOREA";
for (let s of str) {
    console.log(s);
}
console.log("-------------------------------------");
const jsObj = [
    { id: 1, username: "KOREA" },
    { id: 2, username: "U.S.A" },
    { id: 3, username: "U.K " },
];
for (let obj of jsObj) {
    console.log(obj);
}
jsObj.forEach((o) => {
    console.log(o);
});
