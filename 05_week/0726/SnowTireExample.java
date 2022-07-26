class Tire{
	public Tire() {
		System.out.println("일반 타이어");
	}
	public void run() { 
		System.out.println("일반 타이어가 굴러갑니다");
	}
	public void trun() {
		System.out.println("타이어가 굴러갑니다");
	}
}
class SnowTire extends Tire{ 
	// SnowTire 생성전에 Tire 생성자가 먼저 호출된다
	public SnowTire() {
		System.out.println("스노우 타이어");
	}
	
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다");
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
