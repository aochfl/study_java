
public class ConstE1 {
	public static void main(String[] args) {
		// 자바에서 String 은 특이한 케이스입니다
		// 분명 클래스이지만 new를 하지않고도 생성되는 특이한 케이스
		// 원래는 클래스가 맞기 때문에 new로도 생성된다.
		
		String str= "안녕하세요;";
		String st2 = new String(); // 값없이 초기화하
		str = "안녕하세요"; // 값이 없으므로 이후에 값을 넣어야한다
		
		String str3 = new String("반갑습니다"); // 값을 주면서 초기화하기
	}
}
