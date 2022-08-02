class Driver{
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
interface Vehicle{
	public void run();
}
class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�");
	}
}

class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�");
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
