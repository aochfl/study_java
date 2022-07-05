import java.util.Scanner;

class HighLow2{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		// 강사님 코드
		// int count = 0;
		// while(true){// 메뉴 선택 반복문
			// System.out.print("1.새게임 2.점수확인 3.게임종료");
			// int menu = sc.nextInt();// 메뉴 입력
			// if(menu==1){// 메뉴중에서 고르기
				// System.out.println("새게임을 시작합니다.");
				// int ranNum = (int)(Math.random()*100)+1;
				// count= 0;
				// while(true){// 게임용 반복문     
					// count++;
					// System.out.println("숫자를 입력해 주세요(강제종료(0)):");
					// int input = sc.nextInt();// 게임 숫자 입력
					// if(input>ranNum){
						// System.out.println("더 작은수를 입력하세요");
					// }else if(input<ranNum){
						// System.out.println("더 큰수를 입력하세요");
					// }else if(input==0){
						// System.out.println("강제 종료합니다.");
						// break;
					// }else{
						// System.out.println("빙고");
						// break;
					// }
				// }
			// }else if(menu==2){
				// System.out.println("점수를 확인합니다.");
				// System.out.println("최근 점수는 "+count+"점 입니다");
			// }else if(menu==3){
				// System.out.println("프로그램을 종료합니다.");
				// break;
			// }
		// }
		
		boolean isRun = true;
		int count = 0;
		while(isRun){// 메뉴 선택 반복문
			System.out.print("1.새게임 2.점수확인 3.게임종료");
			int menu = sc.nextInt();// 메뉴 입력
			switch(menu)
			{
				case 1:
					int ranNum = (int)(Math.random()*100)+1;
					System.out.println("새게임을 시작합니다."+ranNum);
					count= 0;
					while(true){// 게임용 반복문     
						count++;
						System.out.println("숫자를 입력해 주세요(강제종료(0)):");
						int input = sc.nextInt();// 게임 숫자 입력
						if(input>ranNum){
							System.out.println("더 작은수를 입력하세요");
						}else if(input<ranNum){
							System.out.println("더 큰수를 입력하세요");
						}else if(input==0){
							System.out.println("강제 종료합니다.");
							break;
						}else{
							System.out.println("빙고");
							break;
						}
					}
					break;
				
				case 2:
					System.out.println("점수를 확인합니다.");
					System.out.println("최근 점수는 "+count+"점 입니다");
					break;
					
					
				case 3:
					System.out.println("프로그램을 종료합니다.");
					isRun = false;
					break;
				default:
					System.out.println("입력이 잘못되었습니다..");
					break;
					
			}
		}

		
		
		
		
		
		
		
		
		
		
		// 직접 짠 코드
		// System.out.println("== 하이 로우 게임==\n");
		// boolean isRun = true;
		// int input = 0;
		// int count = 0;
		// int answer = 0;
		// int user = 0;
		// while(isRun) {
			// if(input == 0) {
				// System.out.print("\n1.새게임  2.점수확인  3.게임종료 :");
				// input = sc.nextInt();
				// if(input == 1) {
					// System.out.println("\n새 게임을 시작합니다.");
					// count = 0;
					// answer = (int)(Math.random()*100)+1;
					// System.out.println("랜덤 숫자가 생성되었습니다"+answer);
				// }
				// else if(input == 2)	{
					// System.out.println("최근 점수를 확인합니다.");
					// System.out.println("최근 득점 점수는 "+count+"점 입니다");
					// input = 0;
				// }
				// else if(input == 3)	{
					// System.out.println("게임을 종료합니다.");
					// isRun = false;
				// }
				// else {
					// System.out.println("입력이 잘못되었습니다.");
					// input = 0;
				// }
			// }
			// else if(input == 1)	{
				// count++;
				// System.out.print("숫자를 입력해 주세요");
				// user = sc.nextInt();
				
				// if(user > answer) {
					// System.out.println("숫자가 너무 높습니다");
				// }
				// else if(user < answer) {
					// System.out.println("숫자가 너무 낮습니다");
				// }
				// else {
					// System.out.println("정답! "+count+"회 만에 맞추셨습니다");
					// input = 0;
				// }
			// }
		// }
	}
}
