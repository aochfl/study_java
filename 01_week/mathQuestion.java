import java.util.Scanner;

class mathQuestion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// cm로 입력 받은 키를 피트와 인치로 변환하는 프로그램을 만드시오
		// 1피트는 12인치 이고 1인치는 2.54cm 입니다.
		// 키 입력 : 163 <=입력
		// 163 cm는 "5피트 4.1732283 인치" 입니다.		
		System.out.print("키 입력(cm) : ");
		int height = sc.nextInt();
		double height_inch = height *(100f/254f);
		System.out.printf("%d cm는 \"%d피트 %f 인치\" 입니다.\n", height, (int)height_inch/12 ,height_inch%12);

		// 저금통에 있는 돈의 금액을 계산하는 프로그램을 작성하시오.
		// 500원 : 5
		// 100원 : 3
		// 50원 : 2
		// 10원 0
		// 총 2900원 입니다.		
		System.out.println("저금통에 있는 동전의 갯수를 입력하시오");
		System.out.print("500원 : ");
		int coin500 = sc.nextInt();
		System.out.print("100원 : ");
		int coin100 = sc.nextInt();
		System.out.print("50원 : ");
		int coin50 = sc.nextInt();
		System.out.print("10원 : ");
		int coin10 = sc.nextInt();
		System.out.printf("총 %d원 입니다.\n", (coin500*500+coin100*100+coin50*50+coin10*10));

		// 압력의 세기를 가리켜 압력이라 말하기도 한다. 
		// 앞의 정의와 같이 압력의 세기는 (힘)÷(면적)의 단위로 표시된다. 
		// 국제단위계에서는 1에 1N의 힘이 일정하게 미칠 때의 압력의 세기가 단위이다. 
		// 이것을 파스칼이라 부르며 Pa라고 표기한다. 힘과 면적을 입력받아 Pa를 출력하시오
		System.out.print("주어지는 힘을 입력해주세요(N) : ");
		double power = sc.nextDouble();
		System.out.print("힘이 주어지는 면적을 입력해주세요(㎡) : ");
		double area = sc.nextDouble();
		System.out.printf("주어지는 압력은 %.2f Pa 입니다.\n", power/area);
	}
}
