interface USBA{
	String TYPE ="A";
	void speed();
	void printType();
}
interface Samsung extends USBA{ //인터페이스는 인터페이스를 상속할 수 있다
	void warranty();		// 그냥 두개의 인터페이스라고 생각하면된다.
}
public class USBEx implements Samsung{
// 상속은 반드시 1개만 가능하지만 구현(implements)는 여러 개가 가능함
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("2.0 스피드 입니다");
	}

	@Override
	public void printType() {
		// TODO Auto-generated method stub
		System.out.println("A타입, 브랜드 삼성");
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		
		
	}

	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
	}
}
