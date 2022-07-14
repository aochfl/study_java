// function showBox1() {
//     //document.getElementById("box1").classList.remove("onOff");
//     document.querySelector("#box1").classList.remove("onOff");
// }

// function closeBox1() {
//     document.getElementById("box1").classList.add("onOff");
// }
// const closeBox1 = () => {
//     document.getElementById("box1").classList.add("onOff");
// };
// document.getElementById("box1Open").addEventListener("click", () => {
//     document.querySelector("#box1").classList.remove("onOff");
// });

// let boxTwo = document.getElementById("box2");
// let boxTwoBtn = document.getElementById("box2Toggle");

// const toggleFn = () => {
//     boxTwo.classList.toggle("onOff");
// };
// boxTwoBtn.addEventListener("click", toggleFn);

let IDBtn = document.getElementById("idBtn");
let UID = document.getElementById("userid");
let DomText = document.getElementById("text");

const chkID = () => {
    if (UID.value == "asdf") {
        alert("일치");
        location.href = "https://www.naver.com";
    } else if (UID.value == "") {
        DomText.innerHTML = "<b>아이디를 입력하세요</b>";
        UID.value = "";
        UID.focus();
    } else {
        //alert("불일치");
        UID.value = "";
        UID.focus();
        DomText.innerHTML = "<b>아이디 확인필요</b>";
    }
};

IDBtn.addEventListener("click", chkID);
