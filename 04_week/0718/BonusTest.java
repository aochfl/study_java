import java.util.Scanner;

class Bonus{
	private int bonus;
	private int money;
	void setBonus(int b) {
		this.bonus = b;
		// System.out.println("보너스가 "+this.bonus+"% 로 설정되었습니다");
	}
	void setMoney(int money) {
		this.money = money;
		// System.out.println("연봉이 "+this.money+"으로 설정되었습니다");
	}
	void print() {
		double total = money+ money * (bonus*0.01);
		System.out.println("연봉이 "+this.money+" 보너스가 "+this.bonus);
		System.out.println("지급금액은 총 "+(int)total+"입니다");
	}
}


public class BonusTest {
	public static void main(String[] args) {
		// 2개
		// 보너스가 몇프로인지 입력(10) <= 10%를 의미
		// 보너스 세팅하는 메서드 1개
		
		// 연봉 세팅하는 메서드
		
		// 연봉, 연봉기준 보너스 출력하는 메서드
		
		Bonus bonusCalc = new Bonus(); 
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.print("보너스가 몇프로인지 입력하세요:");
		num = sc.nextInt();
		bonusCalc.setBonus(num);

		System.out.print("연봉이 얼마인지 입력하세요:");
		num = sc.nextInt();
		bonusCalc.setMoney(num);
		
		bonusCalc.print();
	}
}
