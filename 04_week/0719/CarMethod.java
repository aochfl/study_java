
public class CarMethod {
	Engine makeEngine() { // Engine �� ��ȯ�� int, String �� ��������
						 	// �ݵ�� return �� �־�� �ϰ� return �ڿ��� ������ Engine�� �־�� �Ѵ�
		Engine e = new Engine();
		return e;
	}
	public static void main(String[] args) {
		CarMethod cm = new CarMethod();
		
		Car c = new Car(cm.makeEngine(),"������ī");
		c.printInfo();
	}
}
