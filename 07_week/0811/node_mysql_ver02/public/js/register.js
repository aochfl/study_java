const id = document.getElementById("id");
const duplicateBtn = document.getElementById("duplicateBtn");
const pw = document.getElementById("pw");
const pw2 = document.getElementById("pw2");
const email = document.getElementById("email");

// 최종 회원가입시 입력값 검증 함수
function validateAuth() {
    if (!inputValidate(id, id.value.length >= 8)) {
        alert("아이디를 확인해주세요");
        id.focus();
        return false;
    }
    if (!inputValidate(pw, pw.value.length >= 12)) {
        alert("패스워드를 확인해주세요");
        pw.focus();
        return false;
    }
    if (!inputValidate(pw2, pw2.value == pw.value)) {
        alert("패스워드를 확인해주세요");
        pw.value = "";
        pw2.value = "";
        pw.focus();
        return false;
    }
    if (!inputValidate(email, emailRegCheck(email.value))) {
        alert("이메일을 확인해주세요");
        email.focus();
        return false;
    }
    if (!genderCheck()) {
        alert("성별을 체크해주세요");
        return false;
    }

    location.href = "./login";
    return true;
}

// input 박스 강조
function inputBoxHighlight(obj, bool) {
    const formControl = obj.parentElement;
    if (bool) {
        obj.style.border = "1px solid green";
        obj.style.backgroundColor = "rgba(0,255,0,0.1)";
        formControl.querySelector("small").style.display = "none";
    } else {
        obj.style.border = "1px solid red";
        obj.style.backgroundColor = "rgba(255,0,0,0.1)";
        formControl.querySelector("small").style.display = "block";
    }
}
// input 박스 값 검증
function inputValidate(obj, bool) {
    inputBoxHighlight(obj, bool);
    return bool;
}

// 아이디 중복체크시 팝업
function duplicateIDCheck() {
    if (inputValidate(id, id.value.length >= 8)) {
        let width = 500;
        let height = 400;
        let left = (screen.availWidth - width) / 2;
        let top = (screen.availHeight - height) / 2;
        let screenVal = "left=" + left + ", top=" + top + ", width=" + width + ", height=" + height;
        window.open("./duplicate.html", "", screenVal);
    } else {
        alert("아이디를 확인해주세요");
    }
}
duplicateBtn.addEventListener("click", duplicateIDCheck);

// 이메일 정규식
function emailRegCheck(str) {
    let exp = /[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]/;
    return exp.test(str);
}

// 성별 체크
function genderCheck() {
    let checked = document.querySelector("input[name='gender[]']:checked");
    if (checked != null) {
        return true;
    } else {
        return false;
    }
}

// 아이디 체크의 경우, 중복체크 확인을 위해 추가로 함수를 호출
id.addEventListener("keyup", () => {
    if (inputValidate(id, id.value.length >= 8)) {
        duplicateBtn.disabled = false;
    } else {
        duplicateBtn.disabled = true;
    }
});
pw.addEventListener("keyup", () => inputValidate(pw, pw.value.length >= 12));
pw2.addEventListener("keyup", () => inputValidate(pw2, pw2.value == pw.value));
email.addEventListener("keyup", () => inputValidate(email, emailRegCheck(email.value)));

document.getElementById("auth-form").addEventListener("submit", (e) => {
    e.preventDefault();
    validateAuth();
});
