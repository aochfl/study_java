class BMI{
	void calc(String str, double h, int w ) {
		double bmi = w / ((h*h)/10000);
		System.out.println(str+"�� bmi ������ "+bmi+"�Դϴ�");
		System.out.printf("%s�� bmi ������ %.2f�Դϴ�", str,bmi );
	}
}

public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.calc("ȫ�浿",176,80); // ȫ�浿�� bmi ������ xxx �Դϴ�.
	}
	 
}
