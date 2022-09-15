/*
1. 필요한 문자를 추출해서 재가공(형태 변경)
2. str.subString(시작인덱스, 전체인덱스 + 1);
*/
const str = "Nodejs"; //Node   JS => 대문자로 변경
const result = str.substring(4, 6); //length
console.log(result.toUpperCase());

const str01 = "Hello?";
console.log(str01.substring(str01.length-1, str01.length));

//slice : 확장자 잘라내기 
//        => 전송할 때 html => html 방식으로 전송
//        => jpg, png => 이미지 방식으로 전송
//        => json => json 전송
const ext = "images.jpg";
//왼쪽부터 자르거나
//오른쪽부터 자르거나
//ext.slice(시작번호, 끝번호)
const result01 = ext.slice(6, 10); //중간 단어를 추출할 때
console.log(result01);

//ext.slice(시작번호)
const result02 = ext.slice(6); //6부터 뒤로 전부
console.log(result02);

//ext.slice(-개수)
const result03 = ext.slice(-4);
console.log(result03);