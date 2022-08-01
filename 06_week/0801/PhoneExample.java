
public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}

// 추상클래스 - 일반 클래스에 추상 메서드를 포함하고 있는것.
// 일반클래스 + 완성되지 않은 메서드를 1개라도 포함하고 있는것.
// 완성되지 않은 클래스는 body 가 없는것
// void pluc(); // <==추상 메서드
// 공통된 특성을 추출해서 메서드를 뽑아놓은것
// 사용할때 반드시 오버라이드 해줘야함.
// 이 클래스를 상속 받으려면 반드시 완성해서 사용할수 있도록 강제함
