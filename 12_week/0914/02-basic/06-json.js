/* jsObject */
const user = {
    id:1, 
    userid:"KIM",
    location: "Busan",
    hobby: {
        reading: true,
        sports: "Baseball"
    },
    lecture:["HTML","CSS","NodeJS"]
};

console.log(user.id);
console.log(user.lecture[2]);
console.log(user["location"]);

/* 전송한다 가정하고 stringify() */
const jsonObj = JSON.stringify(user,null,2);
console.log(jsonObj);

/* 수신했다 가정하고 parse() */
const jsObj = JSON.parse(jsonObj);
console.log(jsObj);

const jsonObjOne = JSON.stringify(user, ["userid"]);
console.log(jsonObjOne);
console.log("---------------------------------------------");

// json 타입으로 변환한 후에
// 사용자의 지역(location)이 Busan이면 값을 출력하고 아니면 "Not Found"
// 콘솔에 출력하시오
// ?(=if)을 사용하시오
// JSON.stringify(객체명, 콜백() => {});
// json 변환한 후 -> 객체를 key, value 로 분리

// 통신할 때는 stringify -> 사용할 때는 parse()로 변환해서 사용
const result = JSON.stringify(user, (key,value)=>{
    return user.location == "Busan"? value : "Not Found";
});
console.log(result);

const result2 = JSON.stringify(user);
if( JSON.parse(result2).location == "Busan"){
    console.log(result);
} else {
    console.log("Not Found");
}

// 삼항연산자 - 짧은 if
const num1 = 10;
const num2 = 5;
const arr = [1,2,3,4,5];

// num1이 num2 보다 크면 "num1이 더 큽니다" 라는 메세지 출력
// 결과를 담는 변수 생성
const result3 = (num1>num2) ? "num1이 더 큽니다" :"num2가 더 큽니다";
console.log(result3);