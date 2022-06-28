import java.util.Scanner;

class IfTest2{ 
	public static void main(String args[]){ 		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이는 몇세 입니까?");
		int age = sc.nextInt();
		System.out.println("경력이 있습니까? O:1 X:0");
		int career = sc.nextInt();
		System.out.println("자격증이 있습니까? O:1 X:0");
		int certi = sc.nextInt();
		
		if(age>30)
		{
			if(career== 1)
			{
				if(certi== 1)
				{
					System.out.println("당신의 연봉은 7000 부터 시작됩니다.");
				}
				else
				{
					System.out.println("당신의 연봉은 5000 부터 시작됩니다.");
				}
			}
			else
			{
				System.out.println("당신의 연봉은 3500 부터 시작됩니다.");
			}
		}
		else
		{
			if(certi== 1)
			{
				System.out.println("당신의 연봉은 4000 부터 시작됩니다.");
			}
			else
			{
				System.out.println("당신의 연봉은 3500 부터 시작됩니다.");
			}

		}
	}
}
