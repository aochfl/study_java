let userid = document.getElementById("userid");
let email = document.getElementById("email");
let passwd = document.getElementById("passwd");
let passwd2 = document.getElementById("passwd2");

function checkInputs() {
    let useridValue = userid.value.trim();
    let emailValue = email.value.trim();
    let passwdValue = passwd.value.trim();
    let passwd2Value = passwd2.value.trim();

    if (useridValue === null || useridValue == "") {
        errorCheck(userid, "아이디를 입력해주세요.");
    } else if (useridValue.length < 8) {
        errorCheck(userid, "아이디는 8자리 이상 입력해야합니다");
    } else {
        successCheck(userid);
    }

    if (emailValue === null || emailValue == "") {
        errorCheck(email, "이메일을 입력해주세요.");
    }
    // 이메일 정규식 체크
    // Boolean : name(true) -> name, name(false) -> !name
    else if (!isEmailCheck(emailValue)) {
        errorCheck(email, "유효하지 않은 이메일 주소입니다.");
    } else {
        successCheck(email);
    }

    if (passwdValue === null || passwdValue == "") {
        errorCheck(passwd, "패스워드를 입력해주세요.");
    } else {
        successCheck(passwd);
    }

    if (passwd2Value === null || passwd2Value == "") {
        errorCheck(passwd2, "패스워드를 입력해주세요.");
    } else if (passwdValue !== passwd2Value) {
        errorCheck(passwd2, "기존 패스워드와 다릅니다.");
        passwd2.value = "";
    } else {
        successCheck(passwd2);
    }
}

// RegExp : 정규식
// 시작과 끝은 : /정규식/
//return : true, false
// isEmailCheck() -> boolean
function isEmailCheck(email) {
    let exp = /[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]/;
    return exp.test(email);
}

function errorCheck(input, msg) {
    // 객체에 아래 클래스를 부여한다
    const formControl = input.parentElement;
    formControl.className = "form-control error";
    formControl.querySelector("small").innerHTML = msg;
}

function successCheck(input) {
    const formControl = input.parentElement;
    formControl.className = "form-control success";
}

document.getElementById("form").addEventListener("submit", (e) => {
    e.preventDefault();
    checkInputs();
});
