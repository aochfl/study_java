const checkTotalBtn = document.getElementById("checktotal");
const addUserBtn = document.getElementById("addUserBtn");
const deleteUserBtn = document.getElementById("delUserBtn");
const searchUserBtn = document.getElementById("searchBtn");

function checkTotalFuntion() {
    let checkboxes = document.querySelectorAll("input[name='check[]']");
    checkboxes.forEach((checkbox) => (checkbox.checked = checkTotalBtn.checked));
}
// 일괄 체크박스
checkTotalBtn.addEventListener("click", checkTotalFuntion);

// 유저 추가 기능
function addUserFunction() {
    // 0 체크박스
    // 1 회원번호
    // 2 아이디
    // 3 패스워드
    // 4 이메일
    // 5 성별
    // 6 거주지역
    // 7 취미
    // 8 자기소개
    // 9 정보수정
    const table = document.getElementById("member-list-table");
    let tr = document.createElement("tr");

    let tdList = new Array(10);

    for (let i = 0; i < tdList.length; i++) {
        tdList[i] = document.createElement("td");
        tr.appendChild(tdList[i]);
    }

    let number = 1;
    if (document.querySelectorAll("tr").length > 1) {
        number = Number(document.querySelector("tr:last-child td:nth-child(2)").innerHTML) + 1;
    }
    tdList[0].innerHTML = `<input type="checkbox" name="check[]" id="" />`;
    tdList[1].innerHTML = number;
    tdList[2].innerHTML = `아이디`;
    tdList[3].innerHTML = `패스워드`;
    tdList[4].innerHTML = `이메일`;
    tdList[5].innerHTML = `성별`;
    tdList[6].innerHTML = `거주지역`;
    tdList[7].innerHTML = `취미`;
    tdList[8].innerHTML = `자기소개`;
    tdList[9].innerHTML = `수정`;

    table.appendChild(tr);
}
// 추가버튼
addUserBtn.addEventListener("click", addUserFunction);

// 삭제기능
function deleteUserFunction() {
    let checkboxes = document.querySelectorAll("input[name='check[]']:checked");
    let count = checkboxes.length;
    if (count > 0) {
        if (confirm(`${count}명의 회원을 삭제하시겠습니까?`)) {
            const table = document.getElementById("member-list-table");
            let rows = table.querySelectorAll("tr");

            // 삭제하기 위한 알고리즘 개선 필요
            let rowBtns = table.querySelectorAll("input[name='check[]']");
            for (let index = rowBtns.length - 1; index >= 0; index--) {
                if (rowBtns[index].checked) rows[index + 1].remove();
            }
        }
    } else {
        alert("선택된 회원이 없습니다");
    }

    checkTotalBtn.checked = false;
}
// 삭제버튼
deleteUserBtn.addEventListener("click", deleteUserFunction);

// 검색버튼
document.getElementById("searchFrm").addEventListener("submit", (e) => {
    e.preventDefault();
    alert("검색기능은 현재 지원되지 않습니다");
});
