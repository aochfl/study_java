class Tire{
	public Tire() {
		System.out.println("�Ϲ� Ÿ�̾�");
	}
	public void run() { 
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�");
	}
	public void trun() {
		System.out.println("Ÿ�̾ �������ϴ�");
	}
}
class SnowTire extends Tire{ 
	// SnowTire �������� Tire �����ڰ� ���� ȣ��ȴ�
	public SnowTire() {
		System.out.println("����� Ÿ�̾�");
	}
	
	@Override
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�");
	}
	
	public void srun() {
		super.run();
	}
}
public class SnowTireExample {
	public static void main(String[] args) {
//		SnowTire snowTire = new SnowTire();
//		Tire tire = snowTire;
//		
//		snowTire.run();
//		tire.run();
//		
//		Tire t = (Tire) new SnowTire();
//		t.run();
		
		Tire tire = new Tire();
		//SnowTire snowTire = (SnowTire) tire;
		//snowTire.run();
		
		Tire tire2 = new SnowTire();
	}
}
