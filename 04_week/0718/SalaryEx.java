class Salary{
	int money;
	double tax;
	int insurance;
	
	void insertSalary(int m) {
		money = m;
	}
	void calTax(int t) {
		tax = t * 0.01;
	}
	void calInsurance(int i) {
		insurance = i;
	}
	void showRealSalary() {
		System.out.println("���� "+money+"����, ����"+ (tax*100)+ "%, ����� " +insurance+"����");
		System.out.println("�Ǽ��ɾ� "+(int)((money- money*tax)-insurance)+ "����");
	}
}


public class SalaryEx {

	
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// ���� 1000����, ���� 5%, ����� 50����
	// �� ���ɾ� xxx ����
	}
}
