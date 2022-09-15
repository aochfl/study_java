const employees = [
    {id:1, username: "Kim", salary: 200000},
    {id:2, username: "Park", salary: 500000},
    {id:3, username: "Choi", salary: 1000000},
];

// 인덱스 번호로 찾기 : findIndex()
const result3 = employees.findIndex((em) => em.id==1);
console.log(result3);

// id 2번 사람의 정보를 삭제
const result = employees.find(emp =>emp.id==2)
console.log(result)

const result1 = employees.filter(emp=>emp.id == 3)
console.log(result1)

const result2 = employees.find((emp)=>{
    if( emp.username == "Park"){
        return true;
    }
})
console.log(result2)