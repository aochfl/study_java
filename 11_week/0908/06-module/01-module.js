/* 1번 방법
const u = require("./users");
console.log(u.person);
console.log(u.color);
*/

// 2번 방법
// const { person, color } = require("./users");
// console.log(person);
// console.log(color);

// const u = require("./users");
// console.log(u.p1);
// console.log(u.c1);

const { p1, c1 } = require("./users");
console.log(u.p1);
console.log(u.c1);
