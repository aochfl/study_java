import java.util.Scanner; // 스캐너를 쓰기 위한 준비

class VarScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
					
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

	}
}
