
public class BankManager {
	static int basic_number;
	BankUser userList[];
	
	BankManager(){
		basic_number = 0;
		userList = new BankUser[10];
	}
	
	void depositMoney(BankUser u, int money) {
		System.out.println( "�Աݿ� "+ ((u.depositMoney(money)) ?"����":"����")+" �Ͽ����ϴ�");
		showMoney(u);
	}
	void withDrawMoney(BankUser u, int money) {
		System.out.println( "��ݿ� "+ ((u.withDrawMoney(money)) ?"����":"����")+" �Ͽ����ϴ�");
		showMoney(u);
	}
	void showMoney(BankUser u) {
		System.out.println("���� �����ܰ�� "+u.showMoney()+"�� �Դϴ�");
	}
	
	BankUser createUser(String name) {
		String number = Integer.toString(basic_number);
		BankUser temp = new BankUser(number,name,0);
		userList[basic_number++] =temp;
		System.out.println("���»��� �Ϸ�! \n"+temp.getInfo());
		return temp;
	}
}
