function getYymmdd(today) {
    const yy = today.getFullYear();
    const mm = today.getMonth() < 9 ? 
            `0${today.getMonth() + 1}` 
            : `${today.getMonth() + 1}`;
    const dd = today.getDate();

    return `${yy}-${mm}-${dd}`;
}

console.log(getYymmdd(new Date()));

//.getTime() : 날짜를 초로 변환해서 사용할 때 - Log file, attachment(첨부파일)
const log_name = "Log";
const attach_name = "image";
//console.log(new Date().getTime());

console.log(`Log file을 생성합니다 : ${log_name}_${new Date().getTime()}.txt`);

//.jpg .jpeg : 사진 배경이 흰색 : photo.jpg
//.png 뒷 배경이 투명 사진이나 이미지 
console.log("업로드 된 첨부파일 : " + attach_name + "_" 
                                   + new Date().getTime() 
                                   + "_photo" + ".jpg");