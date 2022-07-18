class BMI{
	void calc(String str, double h, int w ) {
		double bmi = w / ((h*h)/10000);
		System.out.println(str+"의 bmi 지수는 "+bmi+"입니다");
		System.out.printf("%s의 bmi 지수는 %.2f입니다", str,bmi );
	}
}

public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.calc("홍길동",176,80); // 홍길동의 bmi 지수는 xxx 입니다.
	}
	 
}
