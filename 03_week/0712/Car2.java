
public class Car2 {
	Engine e;
	String name;
	
	public Car2(Engine e, String name) {
		this.e = e;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Engine ee = new Engine(5000);
		Car2 c = new Car2(ee,"∏”Ω∫≈ ");
		
		System.out.println(c.e.cc);
		System.out.println(c.name);
	}
}
