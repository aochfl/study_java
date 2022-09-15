/*
1. map : 재가공(다른 형태로 변형해서 출력)
*/

// 배열의 값을 곱한 후 출력하시오
const numbers = [1,2,3,4,5,6,7,8,9];
const result = numbers.map(num =>num*num);
console.log(result);

// 숫자 3개를 더해서 새로운 배여렝 저장하시오
// [], [], map, push

const news = [];
const result2 = numbers.map ((num)=>{
    return news.push(num+num+num);
});
console.log(result2);
console.log(news);


const members =[
    {id:1, nation:"Korea", auth: 3},
    {id:2, nation:"U.S.A", auth: 1},
    {id:3, nation:"Japan", auth: 1},
];
const user =[];
members.map((m)=>{
    if(m.id%2 == 1){
        user.push(m);
    }
})
console.log(user)