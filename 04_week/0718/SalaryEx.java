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
		System.out.println("월급 "+money+"만원, 세금"+ (tax*100)+ "%, 보험료 " +insurance+"만원");
		System.out.println("실수령액 "+(int)((money- money*tax)-insurance)+ "만원");
	}
}


public class SalaryEx {

	
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// 월급 1000만원, 세금 5%, 보험료 50만원
	// 실 수령액 xxx 만원
	}
}
