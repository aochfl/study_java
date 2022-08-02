interface Tire{
	void printInfo();
}

class Kumho implements Tire{
	int i = 0;
	public Kumho() {	}
	public Kumho(int i ) {this.i = i;}
	@Override
	public void printInfo() {
		System.out.println("��ȣ");
	}
	public void setKumho() {	}
	public void printKumho() {System.out.println(i);}
}

class Hankook implements Tire{

	@Override
	public void printInfo() {
		System.out.println("�ѱ�");
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
		k2.printKumho(); // k2�� ���󰡺��� ���� ó���� ����������� Kumho �̹Ƿ�
						// ������ k2�� new Kumho() �̴�
		
		
		
		Hankook m = new Michelin();
		//m.setMichelin();
	}
}
