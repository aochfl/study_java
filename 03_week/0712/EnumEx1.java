class Aircon{
	int power;
}

public class EnumEx1 {

	public static void main(String[] args) {
		// 상수 = 변하지 않는 수 - 변수의 반대말 - 변수는 값을 넣을수 있는 공간
		// 100 <- 상수, "안녕" <- 상수
		// 상수는 항상 고정되어 있는 값
		Aircon a = new Aircon();
		final int ON = 1;
		final int OFF = 0;
		
		a.power=ON;
		if(a.power==ON) {
			System.out.println("전원켜짐");
		}
		else if(a.power==OFF) {
			System.out.println("전원꺼짐");
		}
	}

}
