import java.util.Scanner;

class CheckBMI{ 
/*
06.27
cm로 입력 받은 키를 피트와 인치로 변환하는 프로그램을 만드시오
1피트는 12인치 이고 1인치는 2.54cm 입니다.
키 입력 : 163 <=입력
163 cm는 "5피트 4.1732283 인치" 입니다.		

06.28
추가로 점수에 따른 고도비만/비만/과체중/표준체중/저체중 으로 BMI 수치와 함께 결과 출력
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
					
		System.out.println("BMI 계산기");
		System.out.println("~18.5 저체중 / 18.5 ~ 22.9 정상 / 23.0 ~ 24.9 과체중 / 25.0 ~ 29.9 비만 / 30 ~ 고도비만");
		
		System.out.print("당신의 키를 입력해주세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("당신의 몸무게를 입력해주세요(kg) : ");
		double weight = sc.nextDouble();
		
		String fat;
		double BMI = weight / ((height*height)/10000);
		
		
		if(BMI <= 18.5)
			fat = "저체중";
		else if ( 18.5 < BMI&& BMI <= 22.9)
			fat = "정상";
		else if (22.9 < BMI && BMI<= 24.9)
			fat = "과체중";
		else if (24.9 < BMI && BMI<= 29.9)
			fat = "비만";
		else
			fat = "고도비만";
		System.out.printf("당신의 BMI지수는 %.1f 이며 \"%s\" 입니다.\n",BMI,fat);
	}
}
