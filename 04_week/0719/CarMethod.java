
public class CarMethod {
	Engine makeEngine() { // Engine 이 반환형 int, String 과 같은개념
						 	// 반드시 return 이 있어야 하고 return 뒤에는 생성된 Engine이 있어야 한다
		Engine e = new Engine();
		return e;
	}
	public static void main(String[] args) {
		CarMethod cm = new CarMethod();
		
		Car c = new Car(cm.makeEngine(),"스포츠카");
		c.printInfo();
	}
}
