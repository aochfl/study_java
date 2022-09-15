const numbers = [1,2,3,4,5,6,7,8,9,10]; //합계
/*
객체명.reduce((이전값, 이후값) => {
    return 이전값 + 이후값
}, 초기값);
*/

const result = numbers.reduce( (prev, next) => {
    return prev + next;
}, 0);
console.log(result);

//사원급여의 합을 출력하시오.
const employees = [
    {username: "Kim", salary: 200000},
    {username: "Park", salary: 500000},
    {username: "Choi", salary: 1000000},
];

const result2 = employees.reduce((total, empSalary) => {
    return total + empSalary.salary;
}, 0);
console.log(result2);