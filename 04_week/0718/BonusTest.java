import java.util.Scanner;

class Bonus{
	private int bonus;
	private int money;
	void setBonus(int b) {
		this.bonus = b;
		// System.out.println("���ʽ��� "+this.bonus+"% �� �����Ǿ����ϴ�");
	}
	void setMoney(int money) {
		this.money = money;
		// System.out.println("������ "+this.money+"���� �����Ǿ����ϴ�");
	}
	void print() {
		double total = money+ money * (bonus*0.01);
		System.out.println("������ "+this.money+" ���ʽ��� "+this.bonus);
		System.out.println("���ޱݾ��� �� "+(int)total+"�Դϴ�");
	}
}


public class BonusTest {
	public static void main(String[] args) {
		// 2��
		// ���ʽ��� ���������� �Է�(10) <= 10%�� �ǹ�
		// ���ʽ� �����ϴ� �޼��� 1��
		
		// ���� �����ϴ� �޼���
		
		// ����, �������� ���ʽ� ����ϴ� �޼���
		
		Bonus bonusCalc = new Bonus(); 
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.print("���ʽ��� ���������� �Է��ϼ���:");
		num = sc.nextInt();
		bonusCalc.setBonus(num);

		System.out.print("������ ������ �Է��ϼ���:");
		num = sc.nextInt();
		bonusCalc.setMoney(num);
		
		bonusCalc.print();
	}
}
