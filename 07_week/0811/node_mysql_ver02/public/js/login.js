const id = document.getElementById("id");
const pw = document.getElementById("pw");

function validateLogin() {
    if (!inputValidate(id, id.value.length >= 8)) {
        alert("아이디를 확인해주세요");
        id.focus();
        return false;
    }
    if (!inputValidate(pw, pw.value.length >= 12)) {
        alert("패스워드를 확인해주세요");
        pw.value = "";
        pw.focus();
        return false;
    }
    return true;
}

// input 박스 강조
function inputBoxHighlight(obj, bool) {
    const formControl = obj.parentElement;
    if (bool) {
        formControl.classList.remove("red-border");
    } else {
        formControl.classList.add("red-border");
    }
}
// input 박스 값 검증
function inputValidate(obj, bool) {
    inputBoxHighlight(obj, bool);
    return bool;
}
