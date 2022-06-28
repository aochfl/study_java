import java.util.Scanner;

class CalcDiscounter{ 
/*
디스카운터 계산기
물건가격: <== 입력
개수 : <== 입력
// 물건가격이 10,000원 이하 할인율 0%
// 50,000원 이하 5% 할인
// 100,000원 이하 10% 할인
결과 : // 할인된 계산할 총 금액 출력
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("디스카운터 계산기");
		System.out.print("물건가격 : ");
		double price = sc.nextDouble();
		System.out.print("개수 : ");
		int count = sc.nextInt();
		double money =0;
		
		if(price <= 10000)
		{
			money = price * count;
		}
		else if(price <= 50000)
		{
			money = (price*0.95)*count;
		}
		else 
		{
			money = (price*0.9)*count;
		}
		System.out.printf("결과 : %.0f 원 입니다",money);
	}
}
