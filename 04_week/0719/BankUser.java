
public class BankUser {
	String number;
	String name;
	int money;
	
	public BankUser(String number,String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	Boolean depositMoney(int money) {
		this.money += money;
		return true;
	}
	Boolean withDrawMoney(int money) {
		if(money > this.money) {
			return false;
		}
		else {
			this.money -= money;			
		}
		return true;
	}
	int showMoney() {
		return money;
	}
	String getInfo() {
		return ("°èÁÂ¹øÈ£:"+number+" / ÀÌ¸§:"+name+" / ÀÜ¾×:"+money);
	}
}
