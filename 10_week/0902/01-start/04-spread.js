const olds = [1, 2, 3, 4, 5];
const news = [5, 6, 7, 8, 9, 10];

/* 기존 자료를 출력 */
console.log(olds);
console.log(news);

/* concat 이어 붙이기 */
const concatResult = olds.concat(news);
console.log(concatResult);

/* spread operator 이어 붙이기 */
const soResult = [...olds, ...news];
const soResult2 = [...olds, ...news, 11];
console.log(soResult);
console.log(soResult2);
