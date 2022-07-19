
public class BankManager {
	static int basic_number;
	BankUser userList[];
	
	BankManager(){
		basic_number = 0;
		userList = new BankUser[10];
	}
	
	void depositMoney(BankUser u, int money) {
		System.out.println( "입금에 "+ ((u.depositMoney(money)) ?"성공":"실패")+" 하였습니다");
		showMoney(u);
	}
	void withDrawMoney(BankUser u, int money) {
		System.out.println( "출금에 "+ ((u.withDrawMoney(money)) ?"성공":"실패")+" 하였습니다");
		showMoney(u);
	}
	void showMoney(BankUser u) {
		System.out.println("현재 통장잔고는 "+u.showMoney()+"원 입니다");
	}
	
	BankUser createUser(String name) {
		String number = Integer.toString(basic_number);
		BankUser temp = new BankUser(number,name,0);
		userList[basic_number++] =temp;
		System.out.println("계좌생성 완료! \n"+temp.getInfo());
		return temp;
	}
}
