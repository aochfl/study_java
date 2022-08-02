interface Tire{
	void printInfo();
}

class Kumho implements Tire{
	int i = 0;
	public Kumho() {	}
	public Kumho(int i ) {this.i = i;}
	@Override
	public void printInfo() {
		System.out.println("금호");
	}
	public void setKumho() {	}
	public void printKumho() {System.out.println(i);}
}

class Hankook implements Tire{

	@Override
	public void printInfo() {
		System.out.println("한국");
	}
	public void setHankook() {}
}

class Michelin extends Hankook{
	public void setMichelin() {
		
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Hankook h = new Hankook();
		Kumho k = new Kumho();
		
		Tire t1 = new Hankook();
		Tire t2 = new Kumho(5);
		t1.printInfo();
		t2.printInfo();
		Kumho k2 = (Kumho) t2;
		k2.printKumho(); // k2를 따라가보면 제일 처음에 만들어진것이 Kumho 이므로
						// 실제로 k2는 new Kumho() 이다
		
		
		
		Hankook m = new Michelin();
		//m.setMichelin();
	}
}
