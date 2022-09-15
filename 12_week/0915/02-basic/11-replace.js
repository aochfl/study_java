// str.replace(정규식, "바꿀단어");
const str = "This is NodeJS";
const regExp = /Nodejs/gi; // 정규식
const result = str.replace(regExp, "ReactJS");
console.log(result);

const str01 = "2022-09-15";
const regEx02 = /-/g;
const regEx03 = /-/g;
const result02 = str01.replace(regEx02, "");
const result03 = str01.replace(regEx03, "/");
console.log(result02);
console.log(result03);

const str02 = "This9is1Javascript";
const regEx04 = /[0-9]/g;
const result04 = str02.replace(regEx04, " ");
console.log(result04);

//다중 변경 : /검색어1|검색어2|검색어3/gi
//바꾼 후 대문자로 변경 : toUpperCase();
const str03 = "red house and green house and blue house";
const regEx05 = /red|green|blue/gi;
const result05 = str03.replace(regEx05, "colors");
console.log(result05);
console.log(result05.toUpperCase());