
public class Car {
	Engine engine;
	String type;
	int speed;
	
	public Car() {
		this(new Engine(),"세단",250);
	}
	public Car(Engine engine, String type) {
		this(engine, type, 250);
	}
	public Car(Engine engine, String type, int speed) {
		this.engine = engine;
		this.type = type;
		this.speed = speed;
	}
	public void printCom() {
		System.out.println("현대");
	}
	public void printInfo() {
		printCom();
		engine.printInfo();
		System.out.println("차종은 "+type+"이고, 최대속도는 "+speed);
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.printInfo();
		
		Car c2 = new Car(new Engine(),"트럭",200);
		c2.printInfo();
		
		Car c3 = new Car(new Engine(3000,"디젤"),"버스",230);
		c3.printInfo();
	}
}
