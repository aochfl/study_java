import java.util.Scanner;

class MoneyCalculator{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		/*
			=======
			알바비 계산기
			일한 날짜 : <==입력
			하루당 일한 시간 : <==입력
			시급 : <==입력
			
			주휴수당은 일당으로 계산되는데, 통상 1일 '소정근로시간×시간급' 으로 계산한다.
			보통 주5일근무제로 하루 8시간씩 주40시간 이상 근무하면 8시간×시급의 주휴수당을 받는다.

			주휴수당을 포함한 이번달 원급여는 xxx 입니다
		*/
		//int day = 0;
		//int time = 0;
		//int wage = 0;
		//
		//System.out.println("알바비 계산기");
		//System.out.print("일한 날짜 : ");
		//day = sc.nextInt();
		//System.out.print("하루당 일한 시간 : ");
		//time = sc.nextInt();
		//System.out.print("시급 : ");
		//wage = sc.nextInt();
		//
		//int total = day*time*wage;
		//System.out.printf("이번달 원급여는 %d 입니다\n",total);
		//total = (day*time>=15)?total+time*wage:total;
		//System.out.printf("주휴수당을 포함한 이번달 원급여는 %d 입니다\n",total);
		
		/*
			보너스 계산기
			월급 : <== 입력
			판매량 : <== 입력
			판매량이 10이상이면 월급의 10%를 보너스로
			
			이번달 월급은 xxx입니다(XXX는 월급+보너스 결과)
		*/
		int wage = 0;
		int sell = 0;
		
		System.out.println("보너스 계산기");
		System.out.print("월급 : ");
		wage = sc.nextInt();
		System.out.print("판매량 : ");
		sell = sc.nextInt();
		
		System.out.printf("보너스를 포함한 이번달 월급은 %.0f 입니다",sell>=10?wage*1.1:wage);
	}
}
