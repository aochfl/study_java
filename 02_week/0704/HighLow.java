import java.util.Scanner;

class HighLow{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		double ran = Math.random();
		int answer = (int)(ran*100)+1;
		System.out.println(answer);
		
		System.out.println("== 하이 로우 게임 ==");
		System.out.println("랜덤 숫자가 생성되었습니다");
		
		int user = 0;
		int count = 0;
		while(true)
		{
			count++;
			System.out.print("숫자를 입력해 주세요");
			user = sc.nextInt();
			
			if(user > answer)
			{
				System.out.println("숫자가 너무 높습니다");
			}
			else if(user < answer)
			{
				System.out.println("숫자가 너무 낮습니다");
			}
			else
			{
				System.out.println("정답! "+count+"회 만에 맞추셨습니다");
				break;
			}
		}
	}
}
