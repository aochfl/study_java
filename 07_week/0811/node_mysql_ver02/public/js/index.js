document.addEventListener("DOMContentLoaded", () => {
    const categoryTotal = document.getElementById("category-total-list");
    document
        .getElementById("category-total-btn")
        .addEventListener("click", (e) => categoryTotal.classList.toggle("hide"));

    const categoryList = document.querySelectorAll(".category-item");
    categoryList.forEach((category) => {
        let ul = document.createElement("ul");
        let li = document.createElement("li");
        // 카테고리 항목 추가
        li.innerHTML = category.querySelector("span:first-child").innerHTML;
        console.log(category.querySelector("a:first-child"));
        ul.appendChild(li);

        // 카테고리 서브항목 주제 추가
        const subjectList = category.querySelectorAll(".category-sub > div");
        subjectList.forEach((subject) => {
            let li_subject = document.createElement("li");
            li_subject.innerHTML = subject.querySelector("h4:first-child").innerHTML;
            ul.appendChild(li_subject);

            let itemList = subject.querySelectorAll("li");
            itemList.forEach((item) => {
                let li = document.createElement("li");
                li.innerHTML = item.innerHTML;
                ul.appendChild(li);
            });
        });

        categoryTotal.appendChild(ul);
    });
});

function categoryClose(e) {
    const category = e.currentTarget.querySelector(".category-sub");
    if (category !== null) category.className = "category-sub hide";
}
function categoryOpen(e) {
    const category = e.currentTarget.querySelector(".category-sub");
    if (category != null) {
        category.className = "category-sub show";
        category.addEventListener("mouseleave", categoryClose);
    }
}
document.querySelectorAll(".category-item").forEach((category) => {
    category.addEventListener("mouseover", categoryOpen);
    category.addEventListener("mouseleave", categoryClose);
});
