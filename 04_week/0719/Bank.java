
public class Bank {
	
	public static void main(String[] args) {
		BankManager bm = new BankManager();
		
		BankUser user = bm.createUser("±è¾¾");
		bm.withDrawMoney(user, 100);
		bm.withDrawMoney(user, 900);
		bm.withDrawMoney(user, 100);
		bm.depositMoney(user,100000);
		BankUser user2 = bm.createUser("¹Ú¾¾");
	}
}
