/*
    1. Web
     - Server : 서비스 제공자 - naver, 게임서버 - 여러 사람이 사용
        - URI : domain, localhost 시작하고
        - PORT : 통로
        - 정보를 요청(request-req), Server가 요청한 정보를 처리

     - Client : 서비스 사용자 - 사용자

    2. url 주소
        - localhost, domain, c:\, d:\ -> 절대경로
        - /, ./ -> 상대경로

    * 객체, 배열 -> 하나씩 번거로우니까 뭉쳐서 보낼때 사용
    3. json? : Javascript Object(객체) Notation
        - {회원 한명}
        - {key:value}
           "별명": 값
           "변수": 값
           ex) const user = {
             "username" : "홍길동",
             "password" : "12345"
           };

        - 회원이 여러명일때
          - [{회원 1}, {회원 2}]
           ex) const users = [
                    {
                        "userid": "busanit",
                        "age": 30
                    },
                    {
                        "userid": "seoulit",
                        "age": 20
                    },
                    {
                        "userid": "deaguit",
                        "age": 25
                    }
                ];
    4. json 사용하는 이유 : 인터넷으로 데이터를 전송하고 받을때 json
        - 통신할 때 규칙(프로그래밍이 x)
     - 사용자 -> 데이터 전송 -> (json변환) -> 서버
                                Header 값에 json을 성정해서 보냄
                                JSON.stringify();
     - 사용자 -> 데이터 전송 -> (json변환) -> 서버
                                JSON.parse();
    
    -------------------------------------------------------------
    *** Nodejs ; Server Javascript
    사용자 javascript 프로그래밍 -> (json파일로 변환) -> 서버로 전송
                users.js             users.json

    5. 연결정보 : html(웹페이지)는 기본적으로 페이지가 바뀌면 기존 정보가 사라짐
      - session : 연결정보가 서버제 저장
        - 보안을 요하는 정보
        - 속도가 느릴수 있음
      - cookie : 연결정보가 client에 저장(보안x)
        - 아이디 저장, 오늘 하루 이창 띄우지 않음
        - 속도가 session보다 빠름
*/
