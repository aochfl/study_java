설치해야할 프로그램
===
Notepad++ 설치   
vscode 설치   
https://nodejs.org/ko/

nodejs 설치   
https://nodejs.org/ko/



Notepad++ 설정
=======
1. 플러그인 메뉴탭 - Plugins Admin
2. NppExec를 찾아서 상단의 Install로 설치
3. Notepad 재시작
4. 플러그인 메뉴의 NppExec - Execute 실행
5. 아래 항목 입력후 save
```
cd $(CURRENT_DIRECTORY)
javac $(FILE_NAME) -encoding UTF-8
```
6. Script name 항목에 Compile 입력후 save
7. 플러그인 메뉴의 NppExec - Execute 한번더 실행
8. 아래 항목 입력후 save
```
cd $(CURRENT_DIRECTORY)
java $(NAME_PART)
```
9. Script name 항목에 Run 입력후 save
10. 플러그인 메뉴 - NppExec - Advanced Option 실행
11. 상단에 "Place to the Macro submenu" 체크
12. 하단에 "Item name"에 Compile 작성 후, Associated script에서 Compile 선택 후, Add
13. Run 항목도 마찬가지로 Add
14. Notepad 재시작
15. 설정 메뉴탭 - 단축키 설정
16. 약 140번째 항목쯤에 Ctrl+1, Ctrl+2로 등록된 단축키를삭제 (단축키는 원하는 대로 설정)
17. 상단의 Plugin commands 탭에서 Compile과 Run을 찾아서 Ctrl+1,2로 설정(단축키는 원하는 대로 설정)

* * *   
vsCode
======
확장 프로그램 live server 
