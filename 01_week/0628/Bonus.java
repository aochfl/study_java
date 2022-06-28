import java.util.Scanner;

class Bonus{ 
/* 

기본연봉 입력 : <== 입력
연차 입력: <== 입력

연차에 따라서 기본 연봉 5%를 추가 합니다.최고 4년차까지만
기본연봉 * 1.05 : 2년차
(기본연봉 * 1.05)*1.05 : 3년차
((기본연봉 * 1.05)*1.05)1.05 : 4년차

4년차 이상은 전부 3년차랑 동일
연차가 10년이 넘으면 +연봉의 10%
*/

	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기본연봉 입력: ");
		int moneyInput = sc.nextInt();
		System.out.print("연차 입력: ");
		int year = sc.nextInt();
		
		System.out.printf("입력된 연봉 : %d \n입력된 연차 : %d\n",moneyInput, year);
		
		double money = 0;
		
		// 첫번째
		//if(year>=1)
		//{
		//	money = moneyInput;
		//}
		//if(year>=2)
		//{
		//	money *=1.05;
		//}
		//if(year>=3)
		//{
		//	money *=1.05;
		//}
		//if(year>=4)
		//{
		//	money *=1.05;
		//}
		//if(year >=10)
		//{
		//	money *=1.1;
		//}
		
		
		// 두번째
		if(year >= 10) // 10년차
		{
			money = (((moneyInput*1.05)*1.05)*1.05)*1.1; 
		}
		else if(year >= 4) // 4년차
		{
			money = ((moneyInput*1.05)*1.05)*1.05;
		}
		else if(year >= 3) // 3년차
		{
			money = (moneyInput*1.05)*1.05;
		}
		else if(year >= 2) // 2년차
		{
			money = moneyInput*1.05;
		}
		else // 그외
		{
			money = moneyInput;
		}
		
		System.out.printf("당신의 연봉은 %.0f 입니다\n",money);
	}
}
