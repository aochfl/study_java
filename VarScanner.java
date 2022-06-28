import java.util.Scanner; // 스캐너를 쓰기 위한 준비

class VarScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("첫번째 숫자를 입력하세요 : ");
		//int i = sc.nextInt(); // 키보드로부터 정수를 받음
		//System.out.print("두번째 숫자를 입력하세요 : ");
		//int j = sc.nextInt(); 
		//sc.nextDouble() 	// 키보드로부터 실수를 받음
		//sc.next() 		// 또는 sc.nextLine()  문자열 받기
		//sc.nextBoolean() 	// true false 받기
		//System.out.println("입력받은 숫자의 합은 " + (i+j) + " 입니다.");
		
		System.out.println("BMI 계산기");
		System.out.println("~18.5 저체중 / 18.5 ~ 22.9 정상 / 23.0 ~ 24.9 과체중 / 25.0 ~ 비만");
		
		System.out.print("당신의 키를 입력해주세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("당신의 몸무게를 입력해주세요(kg) : ");
		double weight = sc.nextDouble();
		
		String fat;
		double BMI = weight / ((height*height)/10000);
		
		//System.out.println("당신의 BMI지수는 " + BMI + "입니다.");
		System.out.printf("당신의 BMI지수는 %.1f 입니다.\n",BMI);
		
		/*
		if(BMI <= 18.5)
			fat = "저체중";
		else if ( 18.5 < BMI&& BMI <= 22.9)
			fat = "정상";
		else if (22.9 < BMI && BMI<= 24.9)
			fat = "과체중";
		else
			fat = "비만";
		System.out.printf("당신의 BMI지수는 %.1f 이며 \"%s\" 입니다.\n",BMI,fat);
		*/
	}
}